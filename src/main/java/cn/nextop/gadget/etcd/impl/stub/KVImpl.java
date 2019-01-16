package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.KV;
import cn.nextop.gadget.etcd.grpc.CompactionRequest;
import cn.nextop.gadget.etcd.grpc.CompactionResponse;
import cn.nextop.gadget.etcd.grpc.DeleteRangeRequest;
import cn.nextop.gadget.etcd.grpc.DeleteRangeResponse;
import cn.nextop.gadget.etcd.grpc.KVGrpc;
import cn.nextop.gadget.etcd.grpc.PutRequest;
import cn.nextop.gadget.etcd.grpc.PutResponse;
import cn.nextop.gadget.etcd.grpc.RangeRequest;
import cn.nextop.gadget.etcd.grpc.RangeResponse;
import cn.nextop.gadget.etcd.grpc.TxnRequest;
import cn.nextop.gadget.etcd.grpc.TxnResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;

/**
 * @author Baoyi Chen
 */
public class KVImpl extends ClientStub implements KV {
	//
	private final KVGrpc.KVStub stub;
	
	/**
	 * 
	 */
	public KVImpl(ClientImpl client) {
		super("kv", client); this.stub = create(KVGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<TxnResponse> txn(TxnRequest request) {
		return invoke(() -> single(request), observer -> this.stub.txn(request, observer));
	}
	
	@Override
	public CompletableFuture<PutResponse> put(PutRequest request) {
		return invoke(() -> single(request), observer -> this.stub.put(request, observer));
	}
	
	@Override
	public CompletableFuture<RangeResponse> range(RangeRequest request) {
		return invoke(() -> single(request), observer -> this.stub.range(request, observer));
	}
	
	@Override
	public CompletableFuture<CompactionResponse> compact(CompactionRequest request) {
		return invoke(() -> single(request), observer -> this.stub.compact(request, observer));
	}
	
	@Override
	public CompletableFuture<DeleteRangeResponse> delete(DeleteRangeRequest request) {
		return invoke(() -> single(request), observer -> this.stub.deleteRange(request, observer));
	}
}
