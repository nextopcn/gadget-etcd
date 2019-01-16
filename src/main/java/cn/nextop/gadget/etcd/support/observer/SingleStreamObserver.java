package cn.nextop.gadget.etcd.support.observer;

/**
 * @author Baoyi Chen
 */
public class SingleStreamObserver<T> extends AbstractObserver<T, T> {
	
	@Override public void onCompleted() {}
	
	@Override public void onNext(T t) { future.complete(t); }
	
	@Override public void onError(Throwable t) { future.completeExceptionally(t); }
}
