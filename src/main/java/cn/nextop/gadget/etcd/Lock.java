package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.lock.LockRequest;
import cn.nextop.gadget.etcd.grpc.lock.LockResponse;
import cn.nextop.gadget.etcd.grpc.lock.UnlockRequest;
import cn.nextop.gadget.etcd.grpc.lock.UnlockResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface Lock extends Client.Stub {
	
	CompletableFuture<LockResponse> lock(LockRequest request);
	
	CompletableFuture<UnlockResponse> unlock(UnlockRequest request);
}
