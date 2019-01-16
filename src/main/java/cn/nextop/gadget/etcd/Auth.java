package cn.nextop.gadget.etcd;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.grpc.AuthDisableRequest;
import cn.nextop.gadget.etcd.grpc.AuthDisableResponse;
import cn.nextop.gadget.etcd.grpc.AuthEnableRequest;
import cn.nextop.gadget.etcd.grpc.AuthEnableResponse;
import cn.nextop.gadget.etcd.grpc.AuthenticateRequest;
import cn.nextop.gadget.etcd.grpc.AuthenticateResponse;

/**
 * @author Baoyi Chen
 */
public interface Auth extends Client.Stub {
	
	CompletableFuture<AuthEnableResponse> enable(AuthEnableRequest request);
	
	CompletableFuture<AuthDisableResponse> disable(AuthDisableRequest request);
	
	CompletableFuture<AuthenticateResponse> authenticate(AuthenticateRequest request);
}
