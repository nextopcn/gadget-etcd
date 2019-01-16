package cn.nextop.gadget.etcd.support.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baoyi Chen
 */
public class PluralStreamObserver<T> extends AbstractObserver<T, List<T>> {
	//
	private final List<T> results = new ArrayList<>();
	
	//
	@Override public void onNext(T t) { results.add(t); }
	
	@Override public void onCompleted() { future.complete(results); }
	
	@Override public void onError(Throwable t) { future.completeExceptionally(t); }
}
