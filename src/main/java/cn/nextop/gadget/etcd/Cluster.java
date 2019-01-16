package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.MemberAddRequest;
import cn.nextop.gadget.etcd.grpc.MemberAddResponse;
import cn.nextop.gadget.etcd.grpc.MemberListRequest;
import cn.nextop.gadget.etcd.grpc.MemberListResponse;
import cn.nextop.gadget.etcd.grpc.MemberRemoveRequest;
import cn.nextop.gadget.etcd.grpc.MemberRemoveResponse;
import cn.nextop.gadget.etcd.grpc.MemberUpdateRequest;
import cn.nextop.gadget.etcd.grpc.MemberUpdateResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface Cluster extends Client.Stub {
	
	CompletableFuture<MemberAddResponse> add(MemberAddRequest request);
	
	CompletableFuture<MemberListResponse> list(MemberListRequest request);
	
	CompletableFuture<MemberUpdateResponse> update(MemberUpdateRequest request);
	
	CompletableFuture<MemberRemoveResponse> remove(MemberRemoveRequest request);
}
