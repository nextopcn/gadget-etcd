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

/**
 * @author Baoyi Chen
 */
public class AuthImpl extends ClientStub implements Auth {
	//
	private final AuthGrpc.AuthStub stub;
	
	/**
	 * 
	 */
	public AuthImpl(ClientImpl client) {
		super("auth", client); this.stub = create(AuthGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<AuthEnableResponse> enable(AuthEnableRequest request) {
		return invoke(() -> single(request), observer -> this.stub.authEnable(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthDisableResponse> disable(AuthDisableRequest request) {
		return invoke(() -> single(request), observer -> this.stub.authDisable(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthenticateResponse> authenticate(AuthenticateRequest request) {
		return invoke(() -> single(request), observer -> this.stub.authenticate(request, observer));
	}
}
