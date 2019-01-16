package cn.nextop.gadget.etcd.support.resolver;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;
import io.grpc.Status;

/**
 * 
 * @author Jingqqi Xu
 */
public final class NameResolverListeners implements NameResolver.Listener {
	//
	private List<NameResolver.Listener> listeners = new CopyOnWriteArrayList<>();
	
	/**
	 * 
	 */
	public boolean addListener(NameResolver.Listener listener) {
		return this.listeners.add(listener);
	}
	
	public boolean delListener(NameResolver.Listener listener) {
		return this.listeners.remove(listener);
	}
	
	/**
	 * 
	 */
	@Override
	public void onError(Status error) {
		for(final NameResolver.Listener listener : this.listeners) listener.onError(error);
	}
	
	@Override
	public void onAddresses (List<EquivalentAddressGroup> servers, Attributes attributes) {
		for (final NameResolver.Listener v : listeners) v.onAddresses(servers, attributes);
	}
}
