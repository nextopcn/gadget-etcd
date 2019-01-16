package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Maintenance;
import cn.nextop.gadget.etcd.grpc.AlarmRequest;
import cn.nextop.gadget.etcd.grpc.AlarmResponse;
import cn.nextop.gadget.etcd.grpc.DefragmentRequest;
import cn.nextop.gadget.etcd.grpc.DefragmentResponse;
import cn.nextop.gadget.etcd.grpc.HashKVRequest;
import cn.nextop.gadget.etcd.grpc.HashKVResponse;
import cn.nextop.gadget.etcd.grpc.HashRequest;
import cn.nextop.gadget.etcd.grpc.HashResponse;
import cn.nextop.gadget.etcd.grpc.MaintenanceGrpc;
import cn.nextop.gadget.etcd.grpc.MoveLeaderRequest;
import cn.nextop.gadget.etcd.grpc.MoveLeaderResponse;
import cn.nextop.gadget.etcd.grpc.SnapshotRequest;
import cn.nextop.gadget.etcd.grpc.SnapshotResponse;
import cn.nextop.gadget.etcd.grpc.StatusRequest;
import cn.nextop.gadget.etcd.grpc.StatusResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;

/**
 * @author Baoyi Chen
 */
public class MaintenanceImpl extends ClientStub implements Maintenance {
	//
	private final MaintenanceGrpc.MaintenanceStub stub;
	
	/**
	 * 
	 */
	public MaintenanceImpl(ClientImpl client) {
		super("maintenance", client); this.stub = create(MaintenanceGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<HashResponse> hash(HashRequest request) {
		return invoke(() -> single(request), observer -> this.stub.hash(request, observer));
	}
	
	@Override
	public CompletableFuture<AlarmResponse> alarm(AlarmRequest request) {
		return invoke(() -> single(request), observer -> this.stub.alarm(request, observer));
	}
	
	@Override
	public CompletableFuture<StatusResponse> status(StatusRequest request) {
		return invoke(() -> single(request), observer -> this.stub.status(request, observer));
	}
	
	@Override
	public CompletableFuture<HashKVResponse> hashKV(HashKVRequest request) {
		return invoke(() -> single(request), observer -> this.stub.hashKV(request, observer));
	}
	
	@Override
	public CompletableFuture<SnapshotResponse> snapshot(SnapshotRequest request) {
		return invoke(() -> single(request), observer -> this.stub.snapshot(request, observer));
	}
	
	@Override
	public CompletableFuture<MoveLeaderResponse> moveLeader(MoveLeaderRequest request) {
		return invoke(() -> single(request), observer -> this.stub.moveLeader(request, observer));
	}
	
	@Override
	public CompletableFuture<DefragmentResponse> defragment(DefragmentRequest request) {
		return invoke(() -> single(request), observer -> this.stub.defragment(request, observer));
	}
}
