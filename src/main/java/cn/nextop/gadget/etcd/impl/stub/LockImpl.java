package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Lock;
import cn.nextop.gadget.etcd.grpc.lock.LockGrpc;
import cn.nextop.gadget.etcd.grpc.lock.LockRequest;
import cn.nextop.gadget.etcd.grpc.lock.LockResponse;
import cn.nextop.gadget.etcd.grpc.lock.UnlockRequest;
import cn.nextop.gadget.etcd.grpc.lock.UnlockResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;

/**
 * @author Baoyi Chen
 */
public class LockImpl extends ClientStub implements Lock {
	//
	private final LockGrpc.LockStub stub;
	
	/**
	 * 
	 */
	public LockImpl(ClientImpl client) {
		super("lock", client); this.stub = create(LockGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<LockResponse> lock(LockRequest request) {
		return invoke(() -> single(request), observer -> this.stub.lock(request, observer));
	}
	
	@Override
	public CompletableFuture<UnlockResponse> unlock(UnlockRequest request) {
		return invoke(() -> single(request), observer -> this.stub.unlock(request, observer));
	}
}
