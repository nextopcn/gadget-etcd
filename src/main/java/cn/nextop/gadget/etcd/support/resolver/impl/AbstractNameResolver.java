package cn.nextop.gadget.etcd.support.resolver.impl;

import static io.grpc.internal.GrpcUtil.SHARED_CHANNEL_EXECUTOR;
import static io.grpc.internal.SharedResourceHolder.get;
import static io.grpc.internal.SharedResourceHolder.release;

import java.net.URI;
import java.util.Collection;
import java.util.concurrent.Executor;

import cn.nextop.gadget.etcd.support.resolver.NameResolverListeners;
import io.grpc.NameResolver;

/**
 * @author Baoyi Chen
 */
public abstract class AbstractNameResolver extends NameResolver {
	//
	protected Executor executor;
	protected Listener listener;
	protected final String authority;
	protected volatile boolean shutdown;
	protected volatile boolean resolving;
	protected final Collection<URI> uris;
	protected NameResolverListeners listeners;
	
	/**
	 * 
	 */
	protected abstract void doResolve(Listener listener);
	
	/**
	 * 
	 */
	public AbstractNameResolver(String a, Collection<URI> u) {
		authority = a; uris = u; listeners = new NameResolverListeners();
	}
	
	/**
	 * 
	 */
	@Override
	public String getServiceAuthority() {
		return this.authority;
	}
	
	@Override
	public synchronized void refresh () {
		resolve(); /*resolve*/
	}
	
	public boolean addListener(NameResolver.Listener listener) {
		return this.listeners.addListener(listener);
	}
	
	public boolean delListener(NameResolver.Listener listener) {
		return this.listeners.delListener(listener);
	}
	
	/**
	 * 
	 */
	@Override
	public synchronized void start(Listener r) {
		this.executor = get(SHARED_CHANNEL_EXECUTOR); this.listener = r; resolve();
	}
	
	@Override
	public synchronized void shutdown() {
		if(shutdown) return; shutdown = true;
		if(executor != null) executor = release(SHARED_CHANNEL_EXECUTOR, executor);
	}
	
	/**
	 * 
	 */
	protected void resolve() {
		if((resolving || shutdown)) return; this.executor.execute(new XRunnable());
	}
	
	/**
	 * 
	 */
	protected class XRunnable implements Runnable {
		@Override public void run() {
			if((shutdown || resolving)) return; resolving = true; Listener r = listener;
			try { doResolve(r); } finally { resolving = false; } //reset resolving state
		}
	}
}
