package cn.nextop.gadget.etcd.support.watcher.impl;

import cn.nextop.gadget.etcd.grpc.WatchRequest;
import cn.nextop.gadget.etcd.grpc.WatchResponse;
import cn.nextop.gadget.etcd.support.watcher.WatchListener;
import cn.nextop.gadget.etcd.support.watcher.Watcher;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * @author Baoyi Chen
 */
public class WatcherImpl<T> implements StreamObserver<WatchResponse>, Watcher<T> {
	//
	private WatchRequest request;
	private WatchListener<T> listener;
	private Function<WatchResponse, T> mapper;
	private StreamObserver<WatchRequest> observer;
	
	/**
	 * 
	 */
	@Override
	public WatchRequest getRequest() {
		return request;
	}
	
	@Override
	public WatchListener<T> getListener() {
		return listener;
	}
	
	@Override
	public Function<WatchResponse, T> getMapper() {
		return mapper;
	}
	
	@Override
	public StreamObserver<WatchRequest> getObserver() {
		return observer;
	}
	
	/**
	 * 
	 */
	public void setRequest(WatchRequest request) {
		this.request = request;
	}
	
	public void setListener(WatchListener<T> listener) {
		this.listener = listener;
	}
	
	public void setMapper(Function<WatchResponse, T> mapper) {
		this.mapper = mapper;
	}
	
	public void setObserver(StreamObserver<WatchRequest> observer) {
		this.observer = observer;
	}
	
	/**
	 * 
	 */
	@Override
	public void onCompleted() {
	}
	
	@Override
	public void close() throws Exception {
		this.observer.onCompleted();
	}
	
	@Override
	public void onNext(WatchResponse wr) {
		final CompletableFuture<T> future = new CompletableFuture<>();
		future.complete(mapper.apply(wr)); listener.onWatched(future);
	}
	
	@Override
	public void onError(Throwable trx) {
		final CompletableFuture<T> future = new CompletableFuture<>();
		future.completeExceptionally(trx); listener.onWatched(future);
	}
}
