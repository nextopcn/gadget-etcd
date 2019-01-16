package cn.nextop.gadget.etcd.support.resolver;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import cn.nextop.gadget.etcd.EtcdException;
import cn.nextop.gadget.etcd.support.resolver.impl.SmartNameResolver;
import io.grpc.Attributes;
import io.grpc.NameResolver;

/**
 * @author Baoyi Chen
 */
public class NameResolverFactory extends NameResolver.Factory {
	//
	private static final String ETCD = "etcd";
	
	//
	private final String[] uris;
	private NameResolver.Listener listener;
	private final List<URIResolver> resolvers;

	/**
	 * 
	 */
	public NameResolverFactory(String[] uris) {
		this.uris = uris;
		this.resolvers = new CopyOnWriteArrayList<>();
	}
	
	/**
	 * 
	 */
	@Override
	public String getDefaultScheme() {
		return ETCD;
	}

	public void addResolver(URIResolver r) {
		this.resolvers.add(r);
	}

	public void delResolver(URIResolver r) {
		this.resolvers.remove(r);
	}
	
	public NameResolver.Listener getListener() {
		return listener;
	}
	
	public void setListener(NameResolver.Listener listener) {
		this.listener = listener;
	}

	@Override
	public NameResolver newNameResolver(URI uri, Attributes attributes) {
		if (!ETCD.equals(uri.getScheme())) return null;
		final List<URI> list = stream(this.uris).map(this::uri).collect(toList());
		final SmartNameResolver r = new SmartNameResolver(ETCD, list); /* smart */
		if((listener != null)) r.addListener(listener); r.addResolvers(resolvers);
		return r;
	}
	
	/**
	 * 
	 */
	private URI uri(String uri) {
		try { return new URI(uri); } catch (Throwable e) { throw new EtcdException(e); }
	}
}
