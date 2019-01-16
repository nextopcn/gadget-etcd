package cn.nextop.gadget.etcd.support.observer;

import java.util.concurrent.CompletableFuture;

import io.grpc.stub.StreamObserver;

/**
 * @author Baoyi Chen
 */
public abstract class AbstractObserver<T, R> implements StreamObserver<T> {
	//
	public final CompletableFuture<R> future() { return this.future; }
	
	//
	protected final CompletableFuture<R> future = new CompletableFuture<>();
}
