package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import cn.nextop.gadget.etcd.Watch;
import cn.nextop.gadget.etcd.grpc.WatchGrpc;
import cn.nextop.gadget.etcd.grpc.WatchRequest;
import cn.nextop.gadget.etcd.grpc.WatchResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.observer.SingleStreamObserver;
import cn.nextop.gadget.etcd.support.watcher.WatchListener;
import cn.nextop.gadget.etcd.support.watcher.Watcher;
import cn.nextop.gadget.etcd.support.watcher.impl.WatcherImpl;
import io.grpc.stub.StreamObserver;

/**
 * @author Baoyi Chen
 */
public class WatchImpl extends ClientStub implements Watch {
	//
	private final WatchGrpc.WatchStub stub;
	
	/**
	 * 
	 */
	public WatchImpl(ClientImpl client) {
		super("watch", client); this.stub = create(WatchGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<WatchResponse> watch(WatchRequest request) {
		final SingleStreamObserver<WatchResponse> observer = single(request);
		final StreamObserver<WatchRequest> r = this.stub.watch(observer); r.onNext(request);
		observer.future().whenComplete((v, w) -> r.onCompleted()); return observer.future();
	}
	
	@Override
	public <T> Watcher<T> watch(WatchRequest r, WatchListener<T> v, Function<WatchResponse, T> m) {
		WatcherImpl<T> w = new WatcherImpl<>(); StreamObserver<WatchRequest> o = this.stub.watch (w);
		w.setRequest(r); w.setObserver(o); w.setListener(v); w.setMapper(m); o.onNext(r); return (w);
	}
}
