package cn.nextop.gadget.etcd.support.resolver;

import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/**
 * @author Baoyi Chen
 */
public interface URIResolver {
	
	boolean supports(URI uri);
	
	List<SocketAddress> resolve(URI uri);
}