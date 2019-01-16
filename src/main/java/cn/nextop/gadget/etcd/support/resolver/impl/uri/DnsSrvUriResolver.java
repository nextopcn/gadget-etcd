package cn.nextop.gadget.etcd.support.resolver.impl.uri;

import static cn.nextop.gadget.etcd.support.util.Lists.add;
import static cn.nextop.gadget.etcd.support.util.Lists.sort;
import static cn.nextop.gadget.etcd.support.util.Strings.trimToEmpty;
import static java.lang.Integer.parseInt;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import cn.nextop.gadget.etcd.EtcdException;
import cn.nextop.gadget.etcd.support.resolver.URIResolver;
import cn.nextop.gadget.etcd.support.util.Exceptions;
import cn.nextop.gadget.etcd.support.util.Lists;
import cn.nextop.gadget.etcd.support.util.Objects;


/**
 * @author Baoyi Chen
 */
public class DnsSrvUriResolver implements URIResolver {
	//
	private static final List<String> SCHEMES = Lists.toList("dns+srv", "dnssrv", "srv");
	
	//
	private Hashtable<String, String> env;
	private Comparator<SocketAddress> comparator;
	private String[] attributes = new String[] { "SRV" };
	
	//
	public void setComparator(final Comparator<SocketAddress> v) { this.comparator = v; }
	
	/**
	 * 
	 */
	public DnsSrvUriResolver() {
		this.env = new Hashtable<>();
		this.env.put("java.naming.provider.url","dns:");
		this.env.put("java.naming.factory.initial","com.sun.jndi.dns.DnsContextFactory");
		this.comparator = (v1, v2) -> { return v1.toString().compareTo(v2.toString()); };
	}
	
	/**
	 * 
	 */
	@Override
	public boolean supports(URI uri) {
		return SCHEMES.contains(uri.getScheme());
	}
	
	@Override
	public List<SocketAddress> resolve(URI uri) {
		//
		if(!supports(uri)) throw new EtcdException(String.valueOf(uri));
		
		//
		try {
			final String authority = uri.getAuthority();
			final List<SocketAddress> list = new ArrayList<>();
			final DirContext context = new InitialDirContext(env);
			final Comparator<SocketAddress> cmp = this.comparator;
			Attributes attributes = context.getAttributes(authority, (this.attributes));
			NamingEnumeration<String> it = Objects.cast(attributes.get("srv").getAll());
			while(it.hasMore()) add(list, resolve(it.next())); return sort(list, (cmp));
		} catch (Throwable tx) {
			EtcdException e = new EtcdException(Exceptions.getRootCause(tx)); throw (e);
		}
	}
	
	/**
	 * 
	 */
	protected static final InetSocketAddress resolve(String address) {
		final String[] ary = address.split(" "); if (ary.length < 4) { return null; }
		return new InetSocketAddress(trimToEmpty(ary[3]), parseInt(trimToEmpty(ary[2])));
	}
}
