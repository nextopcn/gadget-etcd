package cn.nextop.gadget.etcd.support.watcher;

import cn.nextop.gadget.etcd.grpc.WatchRequest;
import cn.nextop.gadget.etcd.grpc.WatchResponse;
import io.grpc.stub.StreamObserver;

import java.util.function.Function;

/**
 * @author Baoyi Chen
 */
public interface Watcher<T> extends AutoCloseable {
	
	WatchRequest getRequest();
	
	WatchListener<T> getListener();
	
	Function<WatchResponse, T> getMapper();
	
	StreamObserver<WatchRequest> getObserver();
}
