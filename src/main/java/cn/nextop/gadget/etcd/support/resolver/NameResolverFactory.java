package cn.nextop.gadget.etcd.support.resolver;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

import java.net.URI;
import java.util.List;

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
	
	/**
	 * 
	 */
	public NameResolverFactory(String[] uris) {
		this.uris = uris;
	}
	
	/**
	 * 
	 */
	@Override
	public String getDefaultScheme() {
		return ETCD;
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
		List<URI> list = stream(this.uris).map(this::uri).collect(toList());
		SmartNameResolver r = new SmartNameResolver(ETCD, list); /* smart */
		if (this.listener != null) r.addListener(this.listener); return (r);
	}
	
	/**
	 * 
	 */
	private URI uri(String uri) {
		try { return new URI(uri); } catch (Throwable e) { throw new EtcdException(e); }
	}
}
