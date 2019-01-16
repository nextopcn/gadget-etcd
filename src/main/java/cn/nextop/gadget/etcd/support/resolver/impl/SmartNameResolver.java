package cn.nextop.gadget.etcd.support.resolver.impl;

import static io.grpc.Attributes.EMPTY;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import cn.nextop.gadget.etcd.EtcdException;
import cn.nextop.gadget.etcd.support.resolver.URIResolver;
import cn.nextop.gadget.etcd.support.resolver.impl.uri.DirectUriResolver;
import cn.nextop.gadget.etcd.support.resolver.impl.uri.DnsSrvUriResolver;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;
import io.grpc.Status;

/**
 * @author Baoyi Chen
 */
public class SmartNameResolver extends AbstractNameResolver {
	//
	private final List<URIResolver> resolvers;
	
	/**
	 *
	 */
	public SmartNameResolver(String a, Collection<URI> u) {
		super(a, u);
		resolvers = new CopyOnWriteArrayList<>();
		resolvers.add(new DirectUriResolver());
		resolvers.add(new DnsSrvUriResolver());
	}

	public void addResolvers(List<URIResolver> resolvers) {
		this.resolvers.addAll(resolvers);
	}

	public void delResolvers(List<URIResolver> resolvers) {
		this.resolvers.removeAll(resolvers);
	}
	
	/**
	 * 
	 */
	@Override
	protected void doResolve(NameResolver.Listener listener) {
		try {
			//
			List<EquivalentAddressGroup> list = new ArrayList<>();
			for (URI uri : this.uris) this.doResolve((uri), list);
			if(list.isEmpty()) throw new EtcdException("resolve");
			
			//
			listener.onAddresses (list, EMPTY); // resolve success
			listeners.onAddresses(list, EMPTY); // resolve success
		} catch (Throwable e) {
			//
			listener.onError (Status.NOT_FOUND); // resolve failed
			listeners.onError(Status.NOT_FOUND); // resolve failed
		}
	}
	
	/**
	 * 
	 */
	protected void doResolve(URI u, List<EquivalentAddressGroup> list) {
		for (URIResolver r : resolvers) {
			if(r.supports(u)) list.add(new EquivalentAddressGroup(r.resolve(u)));
		}
	}
}
