package cn.nextop.gadget.etcd.support.watcher;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface WatchListener<T> {
	
	void onWatched(CompletableFuture<T> future);
}
