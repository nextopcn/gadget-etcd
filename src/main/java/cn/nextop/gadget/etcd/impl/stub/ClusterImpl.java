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

/**
 * @author Baoyi Chen
 */
public class ClusterImpl extends ClientStub implements Cluster {
	//
	private final ClusterGrpc.ClusterStub stub;
	
	/**
	 * 
	 */
	public ClusterImpl(ClientImpl client) {
		super("cluster", client); this.stub = create(ClusterGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<MemberAddResponse> add(MemberAddRequest request) {
		return invoke(() -> single(request), observer -> this.stub.memberAdd(request, observer));
	}
	
	@Override
	public CompletableFuture<MemberListResponse> list(MemberListRequest request) {
		return invoke(() -> single(request), observer -> this.stub.memberList(request, observer));
	}
	
	@Override
	public CompletableFuture<MemberUpdateResponse> update(MemberUpdateRequest request) {
		return invoke(() -> single(request), observer -> this.stub.memberUpdate(request, observer));
	}
	
	@Override
	public CompletableFuture<MemberRemoveResponse> remove(MemberRemoveRequest request) {
		return invoke(() -> single(request), observer -> this.stub.memberRemove(request, observer));
	}
}
