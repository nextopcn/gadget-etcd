package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.User;
import cn.nextop.gadget.etcd.grpc.AuthGrpc;
import cn.nextop.gadget.etcd.grpc.AuthUserAddRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserAddResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserGetRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserGetResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserListRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserListResponse;
import cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest;
import cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse;
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.future.CompletableFutureEx;

/**
 * @author Baoyi Chen
 */
public class UserImpl extends ClientStub implements User {
	//
	private final AuthGrpc.AuthFutureStub stub;
	
	/**
	 * 
	 */
	public UserImpl(ClientImpl client) {
		super("user", client); this.stub = create(AuthGrpc::newFutureStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<AuthUserAddResponse> add(AuthUserAddRequest request) {
		return new CompletableFutureEx<>(this.stub.userAdd(request));
	}
	
	@Override
	public CompletableFuture<AuthUserGetResponse> get(AuthUserGetRequest request) {
		return new CompletableFutureEx<>(this.stub.userGet(request));
	}
	
	@Override
	public CompletableFuture<AuthUserListResponse> list(AuthUserListRequest request) {
		return new CompletableFutureEx<>(this.stub.userList(request));
	}
	
	@Override
	public CompletableFuture<AuthUserDeleteResponse> delete(AuthUserDeleteRequest request) {
		return new CompletableFutureEx<>(this.stub.userDelete(request));
	}
	
	@Override
	public CompletableFuture<AuthUserGrantRoleResponse> grantRole(AuthUserGrantRoleRequest request) {
		return new CompletableFutureEx<>(this.stub.userGrantRole(request));
	}
	
	@Override
	public CompletableFuture<AuthUserRevokeRoleResponse> revokeRole(AuthUserRevokeRoleRequest request) {
		return new CompletableFutureEx<>(this.stub.userRevokeRole(request));
	}
	
	@Override
	public CompletableFuture<AuthUserChangePasswordResponse> changePassword(AuthUserChangePasswordRequest request) {
		return new CompletableFutureEx<>(this.stub.userChangePassword(request));
	}
}
