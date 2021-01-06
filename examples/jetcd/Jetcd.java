package jetcd;

import static jetcd.Requests.toDeleteRangeRequest;
import static jetcd.Requests.toLeaseGrantRequest;
import static jetcd.Requests.toLeaseKeepAliveRequest;
import static jetcd.Requests.toLeaseRevokeRequest;
import static jetcd.Requests.toPutRequest;
import static jetcd.Requests.toRangeRequest;
import static jetcd.Requests.toTryLockRequest;
import static jetcd.Requests.toUnlockRequest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import cn.nextop.gadget.etcd.Client;
import cn.nextop.gadget.etcd.KV;
import cn.nextop.gadget.etcd.Lease;
import cn.nextop.gadget.etcd.Lock;
import cn.nextop.gadget.etcd.grpc.DeleteRangeResponse;
import cn.nextop.gadget.etcd.grpc.LeaseGrantRequest;
import cn.nextop.gadget.etcd.grpc.LeaseGrantResponse;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveResponse;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeRequest;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeResponse;
import cn.nextop.gadget.etcd.grpc.PutResponse;
import cn.nextop.gadget.etcd.grpc.RangeResponse;
import cn.nextop.gadget.etcd.grpc.TxnResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.support.resolver.NameResolverFactory;
import cn.nextop.gadget.etcd.support.util.Strings;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.DefaultThreadFactory;

/**
 * @author Baoyi Chen
 */
public class Jetcd implements AutoCloseable {
	//
	protected KV kv;
	protected Lock lock;
	protected Lease lease;
	protected String peers;
	protected Client client;
	protected int threads = 2;
	protected final String name;
	protected EventLoopGroup group;
	
	//
	public void setThreads(int v) {
		this.threads = v;
	}
	
	/**
	 *
	 */
	public Jetcd(String peers) {
		this.peers = peers;
		this.name = "system.jetcd";
		this.client = this.create();
		this.lease = this.client.getLease();
		this.lock = this.client.getLock();
		this.kv = this.client.getKV();
	}
	
	@Override
	public void close() throws Exception {
		if (this.client != null) this.client.close();
		if (group != null) group.shutdownGracefully();
	}
	
	/**
	 * Lock
	 */
	public CompletableFuture<TxnResponse> unlock(String key, String value) {
		return kv.txn(toUnlockRequest(key, value));
	}
	
	public CompletableFuture<TxnResponse> tryLock(String k, String v, long leaseId) {
		return kv.txn(toTryLockRequest(k, v, leaseId));
	}
	
	/**
	 * Lease
	 */
	public CompletableFuture<LeaseGrantResponse> lease(long ttl) {
		final long seconds = TimeUnit.MILLISECONDS.toSeconds(ttl);
		final LeaseGrantRequest request = toLeaseGrantRequest(seconds);
		return this.lease.grant(request);
	}
	
	public CompletableFuture<LeaseRevokeResponse> revoke(long leaseId) {
		final LeaseRevokeRequest request = toLeaseRevokeRequest(leaseId);
		return this.lease.revoke(request);
	}
	
	public CompletableFuture<LeaseKeepAliveResponse> renewal(long leaseId) {
		LeaseKeepAliveRequest request = toLeaseKeepAliveRequest(leaseId);
		return this.lease.renewal(request);
	}
	
	/**
	 * KV
	 */
	public CompletableFuture<RangeResponse> get(String key) {
		return this.kv.range(toRangeRequest(key));
	}
	
	public CompletableFuture<DeleteRangeResponse> del(String key) {
		return this.kv.delete(toDeleteRangeRequest(key, true));
	}
	
	public CompletableFuture<PutResponse> put(String key, byte[] value) {
		return this.kv.put(toPutRequest(key, value, null, true));
	}
	
	/**
	 *
	 */
	protected Client create() {
		final ClientImpl.Builder builder = ClientImpl.builder();
		final String[] uris = Strings.trimToEmpty(this.peers).split(",");
		NameResolverFactory factory = new NameResolverFactory(uris);
		this.group = new NioEventLoopGroup(this.threads, new DefaultThreadFactory(this.name + ".executor"));
		builder.setNameResolverFactory(factory).setChannelType(NioSocketChannel.class).setGroup(this.group);
		return builder.build(this.name);
	}
}
