package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Cluster;
import cn.nextop.gadget.etcd.grpc.ClusterGrpc;
import cn.nextop.gadget.etcd.grpc.MemberAddRequest;
import cn.nextop.gadget.etcd.grpc.MemberAddResponse;
import cn.nextop.gadget.etcd.grpc.MemberListRequest;
import cn.nextop.gadget.etcd.grpc.MemberListResponse;
import cn.nextop.gadget.etcd.grpc.MemberRemoveRequest;
import cn.nextop.gadget.etcd.grpc.MemberRemoveResponse;
import cn.nextop.gadget.etcd.grpc.MemberUpdateRequest;
import cn.nextop.gadget.etcd.grpc.MemberUpdateResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.future.CompletableFutureEx;

/**
 * @author Baoyi Chen
 */
public class ClusterImpl extends ClientStub implements Cluster {
	//
	private final ClusterGrpc.ClusterFutureStub stub;
	
	/**
	 * 
	 */
	public ClusterImpl(ClientImpl client) {
		super("cluster", client); this.stub = create(ClusterGrpc::newFutureStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<MemberAddResponse> add(MemberAddRequest request) {
		return new CompletableFutureEx<>(this.stub.memberAdd(request));
	}
	
	@Override
	public CompletableFuture<MemberListResponse> list(MemberListRequest request) {
		return new CompletableFutureEx<>(this.stub.memberList(request));
	}
	
	@Override
	public CompletableFuture<MemberUpdateResponse> update(MemberUpdateRequest request) {
		return new CompletableFutureEx<>(this.stub.memberUpdate(request));
	}
	
	@Override
	public CompletableFuture<MemberRemoveResponse> remove(MemberRemoveRequest request) {
		return new CompletableFutureEx<>(this.stub.memberRemove(request));
	}
}
