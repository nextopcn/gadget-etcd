package cn.nextop.gadget.etcd.support.future;

import static com.google.common.util.concurrent.Futures.addCallback;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * @author Baoyi Chen
 */
public class CompletableFutureEx<T> extends CompletableFuture<T> {
	//
	private final ListenableFuture<T> future;
	
	/**
	 * 
	 */
	public CompletableFutureEx(ListenableFuture<T> future) {
		this.future = future;
		addCallback((this.future), new CallbackEx(), new ExecutorEx());
	}
	
	/**
	 * 
	 */
	@Override
	public boolean cancel(boolean v) {
		boolean r = this.future.cancel(v) && super.cancel(v); return r;
	}
	
	/**
	 * 
	 */
	private class ExecutorEx implements Executor {
		@Override public void execute(Runnable v) { v.run(); }
	}
	
	private class CallbackEx implements FutureCallback<T> {
		@Override public void onSuccess(T v) { complete(v); }
		@Override public void onFailure(Throwable t) { completeExceptionally(t); }
	}
}
