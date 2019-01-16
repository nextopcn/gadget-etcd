package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.AlarmRequest;
import cn.nextop.gadget.etcd.grpc.AlarmResponse;
import cn.nextop.gadget.etcd.grpc.DefragmentRequest;
import cn.nextop.gadget.etcd.grpc.DefragmentResponse;
import cn.nextop.gadget.etcd.grpc.HashKVRequest;
import cn.nextop.gadget.etcd.grpc.HashKVResponse;
import cn.nextop.gadget.etcd.grpc.HashRequest;
import cn.nextop.gadget.etcd.grpc.HashResponse;
import cn.nextop.gadget.etcd.grpc.MoveLeaderRequest;
import cn.nextop.gadget.etcd.grpc.MoveLeaderResponse;
import cn.nextop.gadget.etcd.grpc.SnapshotRequest;
import cn.nextop.gadget.etcd.grpc.SnapshotResponse;
import cn.nextop.gadget.etcd.grpc.StatusRequest;
import cn.nextop.gadget.etcd.grpc.StatusResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface Maintenance extends Client.Stub {
	
	CompletableFuture<HashResponse> hash(HashRequest request);
	
	CompletableFuture<AlarmResponse> alarm(AlarmRequest request);
	
	CompletableFuture<StatusResponse> status(StatusRequest request);
	
	CompletableFuture<HashKVResponse> hashKV(HashKVRequest request);
	
	CompletableFuture<SnapshotResponse> snapshot(SnapshotRequest request);
	
	CompletableFuture<MoveLeaderResponse> moveLeader(MoveLeaderRequest request);
	
	CompletableFuture<DefragmentResponse> defragment(DefragmentRequest request);
}
