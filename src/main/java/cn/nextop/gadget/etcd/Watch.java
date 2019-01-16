package cn.nextop.gadget.etcd;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import cn.nextop.gadget.etcd.grpc.WatchRequest;
import cn.nextop.gadget.etcd.grpc.WatchResponse;
import cn.nextop.gadget.etcd.support.watcher.WatchListener;
import cn.nextop.gadget.etcd.support.watcher.Watcher;

/**
 * @author Baoyi Chen
 */
public interface Watch extends Client.Stub {
	
	CompletableFuture<WatchResponse> watch(WatchRequest request);

	<T> Watcher<T> watch(WatchRequest r, WatchListener<T> v, Function<WatchResponse, T> m);
}
