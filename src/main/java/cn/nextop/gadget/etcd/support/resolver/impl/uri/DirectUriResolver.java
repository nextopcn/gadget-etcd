package cn.nextop.gadget.etcd.support.resolver.impl.uri;


import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.nextop.gadget.etcd.EtcdException;
import cn.nextop.gadget.etcd.support.resolver.URIResolver;
import cn.nextop.gadget.etcd.support.util.Lists;

import static cn.nextop.gadget.etcd.support.util.Lists.toList;

/**
 * @author Baoyi Chen
 */
public final class DirectUriResolver implements URIResolver {
	//
	private static final List<String> SCHEMES = Lists.toList("http", "https");
	
	//
	private final Map<URI, List<SocketAddress>> cache = new ConcurrentHashMap<>();
	
	/**
	 * 
	 */
	@Override
	public boolean supports(URI uri) {
		return SCHEMES.contains(uri.getScheme());
	}
	
	@Override
	public List<SocketAddress> resolve(URI uri) {
		if (!this.supports(uri)) { throw new EtcdException(String.valueOf(uri)); }
		return cache.computeIfAbsent(uri, u -> toList(new InetSocketAddress(u.getHost(), u.getPort())));
	}
}
