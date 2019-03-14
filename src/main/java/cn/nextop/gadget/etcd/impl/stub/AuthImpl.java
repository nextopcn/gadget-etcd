package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Auth;
import cn.nextop.gadget.etcd.grpc.AuthDisableRequest;
import cn.nextop.gadget.etcd.grpc.AuthDisableResponse;
import cn.nextop.gadget.etcd.grpc.AuthEnableRequest;
import cn.nextop.gadget.etcd.grpc.AuthEnableResponse;
import cn.nextop.gadget.etcd.grpc.AuthGrpc;
import cn.nextop.gadget.etcd.grpc.AuthenticateRequest;
import cn.nextop.gadget.etcd.grpc.AuthenticateResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.future.CompletableFutureEx;

/**
 * @author Baoyi Chen
 */
public class AuthImpl extends ClientStub implements Auth {
	//
	private final AuthGrpc.AuthFutureStub stub;
	
	/**
	 * 
	 */
	public AuthImpl(ClientImpl client) {
		super("auth", client); this.stub = create(AuthGrpc::newFutureStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<AuthEnableResponse> enable(AuthEnableRequest request) {
		return new CompletableFutureEx<>(this.stub.authEnable(request));
	}
	
	@Override
	public CompletableFuture<AuthDisableResponse> disable(AuthDisableRequest request) {
		return new CompletableFutureEx<>(this.stub.authDisable(request));
	}
	
	@Override
	public CompletableFuture<AuthenticateResponse> authenticate(AuthenticateRequest request) {
		return new CompletableFutureEx<>(this.stub.authenticate(request));
	}
}
