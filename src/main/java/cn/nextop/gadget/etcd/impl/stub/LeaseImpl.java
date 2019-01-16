package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Lease;
import cn.nextop.gadget.etcd.grpc.LeaseGrantRequest;
import cn.nextop.gadget.etcd.grpc.LeaseGrantResponse;
import cn.nextop.gadget.etcd.grpc.LeaseGrpc;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveResponse;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeRequest;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeResponse;
import cn.nextop.gadget.etcd.grpc.LeaseTimeToLiveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseTimeToLiveResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.observer.SingleStreamObserver;
import io.grpc.stub.StreamObserver;

/**
 * @author Baoyi Chen
 */
public class LeaseImpl extends ClientStub implements Lease {
	//
	private final LeaseGrpc.LeaseStub stub;
	
	/**
	 * 
	 */
	public LeaseImpl(ClientImpl client) {
		super("lease", client); this.stub = create(LeaseGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<LeaseGrantResponse> grant(LeaseGrantRequest request) {
		return invoke(() -> single(request), observer -> this.stub.leaseGrant(request, observer));
	}
	
	@Override
	public CompletableFuture<LeaseRevokeResponse> revoke(LeaseRevokeRequest request) {
		return invoke(() -> single(request), observer -> this.stub.leaseRevoke(request, observer));
	}
	
	@Override
	public CompletableFuture<LeaseTimeToLiveResponse> ttl(LeaseTimeToLiveRequest request) {
		return invoke(() -> single(request), observer -> this.stub.leaseTimeToLive(request, observer));
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<LeaseKeepAliveResponse> renewal(LeaseKeepAliveRequest request) {
		final SingleStreamObserver<LeaseKeepAliveResponse> observer = single(request);
		final StreamObserver<LeaseKeepAliveRequest> r = stub.leaseKeepAlive(observer); r.onNext(request);
		observer.future().whenComplete((result, throwable) -> r.onCompleted()); return observer.future();
	}
}
