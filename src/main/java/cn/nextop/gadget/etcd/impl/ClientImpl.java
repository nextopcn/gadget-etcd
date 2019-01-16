package cn.nextop.gadget.etcd.impl;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import cn.nextop.gadget.etcd.Auth;
import cn.nextop.gadget.etcd.Client;
import cn.nextop.gadget.etcd.Cluster;
import cn.nextop.gadget.etcd.KV;
import cn.nextop.gadget.etcd.Lease;
import cn.nextop.gadget.etcd.Lock;
import cn.nextop.gadget.etcd.Maintenance;
import cn.nextop.gadget.etcd.Role;
import cn.nextop.gadget.etcd.User;
import cn.nextop.gadget.etcd.Watch;
import cn.nextop.gadget.etcd.impl.stub.AuthImpl;
import cn.nextop.gadget.etcd.impl.stub.ClusterImpl;
import cn.nextop.gadget.etcd.impl.stub.KVImpl;
import cn.nextop.gadget.etcd.impl.stub.LeaseImpl;
import cn.nextop.gadget.etcd.impl.stub.LockImpl;
import cn.nextop.gadget.etcd.impl.stub.MaintenanceImpl;
import cn.nextop.gadget.etcd.impl.stub.RoleImpl;
import cn.nextop.gadget.etcd.impl.stub.UserImpl;
import cn.nextop.gadget.etcd.impl.stub.WatchImpl;
import cn.nextop.gadget.etcd.support.util.Strings;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.NameResolver;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;

/**
 * @author Baoyi Chen
 */
public class ClientImpl implements Client {
	//
	private Object id;
	private ManagedChannel channel;
	
	/**
	 * 
	 */
	@Override
	public KV getKV() {
		return new KVImpl(this);
	}
	
	@Override
	public User getUser() {
		return new UserImpl(this);
	}
	
	@Override
	public Role getRole() {
		return new RoleImpl(this);
	}
	
	@Override
	public Auth getAuth() {
		return new AuthImpl(this);
	}
	
	@Override
	public Lock getLock() {
		return new LockImpl(this);
	}
	
	@Override
	public Lease getLease() {
		return new LeaseImpl(this);
	}
	
	@Override
	public Watch getWatch() {
		return new WatchImpl(this);
	}
	
	@Override
	public Cluster getCluster() {
		return new ClusterImpl(this);
	}
	
	@Override
	public Maintenance getMaintenance() {
		return new MaintenanceImpl(this);
	}
	
	/**
	 * 
	 */
	public Object getId() {
		return this.id;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public ManagedChannel getChannel() {
		return channel;
	}
	
	public void setChannel(ManagedChannel channel) {
		this.channel = channel;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return Strings.build(this)
		.append("id", this.id).toString();
	}

	@Override
	public void close() throws Exception {
		if((this.channel == null)) return;
		if(!channel.isShutdown()) this.channel.shutdown();
		this.channel.awaitTermination(6000, MILLISECONDS);
	}
	
	/**
	 * 
	 */
	public static class Builder {
		//
		private SslContext sslContext;
		private NameResolver.Factory nameResolverFactory;
		private LoadBalancer.Factory loadBalancerFactory;
		
		/**
		 * 
		 */
		private Builder() {
			loadBalancerFactory = new PickFirstLoadBalancerProvider();
		}
		
		/**
		 * 
		 */
		public Builder setSslContext(SslContext sslContext) {
			this.sslContext = sslContext; return this;
		}
		
		public Builder setNameResolverFactory(NameResolver.Factory v) {
			this.nameResolverFactory = v; return this;
		}
		
		public Builder setLoadBalancerFactory(LoadBalancer.Factory v) {
			this.loadBalancerFactory = v; return this;
		}
		
		/**
		 * 
		 */
		public ClientImpl build(Object id) {
			final NettyChannelBuilder builder = NettyChannelBuilder.forTarget("etcd");
			if (sslContext != null) builder.sslContext(sslContext); else builder.usePlaintext();
			if ((nameResolverFactory != null)) builder.nameResolverFactory(nameResolverFactory);
			if ((loadBalancerFactory != null)) builder.loadBalancerFactory(loadBalancerFactory);
			ClientImpl r = new ClientImpl(); r.id = id; r.channel = builder.build(); return (r);
		}
	}
}
