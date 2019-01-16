package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.CompactionRequest;
import cn.nextop.gadget.etcd.grpc.CompactionResponse;
import cn.nextop.gadget.etcd.grpc.DeleteRangeRequest;
import cn.nextop.gadget.etcd.grpc.DeleteRangeResponse;
import cn.nextop.gadget.etcd.grpc.PutRequest;
import cn.nextop.gadget.etcd.grpc.PutResponse;
import cn.nextop.gadget.etcd.grpc.RangeRequest;
import cn.nextop.gadget.etcd.grpc.RangeResponse;
import cn.nextop.gadget.etcd.grpc.TxnRequest;
import cn.nextop.gadget.etcd.grpc.TxnResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface KV extends Client.Stub {
	
	CompletableFuture<TxnResponse> txn(TxnRequest request);
	
	CompletableFuture<PutResponse> put(PutRequest request);
	
	CompletableFuture<RangeResponse> range(RangeRequest request);
	
	CompletableFuture<CompactionResponse> compact(CompactionRequest request);
	
	CompletableFuture<DeleteRangeResponse> delete(DeleteRangeRequest request);
}
