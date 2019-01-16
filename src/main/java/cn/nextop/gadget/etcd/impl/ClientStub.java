package cn.nextop.gadget.etcd.impl;

import static cn.nextop.gadget.etcd.support.util.Objects.cast;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import cn.nextop.gadget.etcd.support.util.Strings;
import com.google.protobuf.AbstractMessage;

import cn.nextop.gadget.etcd.Client;
import cn.nextop.gadget.etcd.support.observer.PluralStreamObserver;
import cn.nextop.gadget.etcd.support.observer.SingleStreamObserver;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

/**
 * @author Baoyi Chen
 */
public abstract class ClientStub implements Client.Stub {
	//
	protected final String name;
	protected final ClientImpl client;
	
	/**
	 * 
	 */
	public ClientStub(String name, ClientImpl client) {
		this.name = name; this.client = client;
	}
	
	/**
	 * 
	 */
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public ClientImpl getClient() {
		return this.client;
	}
	
	@Override
	public String toString() {
		return Strings.build(this)
		.append("name", name).toString();
	}
	
	/**
	 * 
	 */
	protected <T> T create(Function<ManagedChannel, T> factory) {
		final T r = factory.apply(client.getChannel()); return r;
	}
	
	/**
	 * 
	 */
	protected final <T> SingleStreamObserver<T> single(AbstractMessage request) {
		StreamObserver<?> r = new SingleStreamObserver<Object>(); return cast(r);
	}
	
	protected final <T> PluralStreamObserver<T> plural(AbstractMessage request) {
		StreamObserver<?> r = new PluralStreamObserver<Object>(); return cast(r);
	}
	
	/**
	 * 
	 */
	protected <T> CompletableFuture<T> invoke (final Supplier<SingleStreamObserver<T>> src, Consumer<SingleStreamObserver<T>> dst) {
		final SingleStreamObserver<T> observer = src.get(); dst.accept(observer); return observer.future();
	}
	
	protected <T> CompletableFuture<List<T>> invokes(Supplier<PluralStreamObserver<T>> src, Consumer<PluralStreamObserver<T>> dst) {
		final PluralStreamObserver<T> observer = src.get(); dst.accept(observer); return observer.future();
	}
}
