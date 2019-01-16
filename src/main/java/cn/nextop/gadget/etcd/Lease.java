package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.LeaseGrantRequest;
import cn.nextop.gadget.etcd.grpc.LeaseGrantResponse;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveResponse;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeRequest;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeResponse;
import cn.nextop.gadget.etcd.grpc.LeaseTimeToLiveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseTimeToLiveResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface Lease extends Client.Stub {
	
	CompletableFuture<LeaseGrantResponse> grant(LeaseGrantRequest request);
	
	CompletableFuture<LeaseRevokeResponse> revoke(LeaseRevokeRequest request);
	
	CompletableFuture<LeaseTimeToLiveResponse> ttl(LeaseTimeToLiveRequest request);
	
	CompletableFuture<LeaseKeepAliveResponse> renewal(LeaseKeepAliveRequest request);
}
