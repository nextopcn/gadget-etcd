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
import cn.nextop.gadget.etcd.support.future.CompletableFutureEx;

/**
 * @author Baoyi Chen
 */
public class LockImpl extends ClientStub implements Lock {
	//
	private final LockGrpc.LockFutureStub stub;
	
	/**
	 * 
	 */
	public LockImpl(ClientImpl client) {
		super("lock", client); this.stub = create(LockGrpc::newFutureStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<LockResponse> lock(LockRequest request) {
		return new CompletableFutureEx<>(this.stub.lock(request));
	}
	
	@Override
	public CompletableFuture<UnlockResponse> unlock(UnlockRequest request) {
		return new CompletableFutureEx<>(this.stub.unlock(request));
	}
}
