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

/**
 * @author Baoyi Chen
 */
public class UserImpl extends ClientStub implements User {
	//
	private final AuthGrpc.AuthStub stub;
	
	/**
	 * 
	 */
	public UserImpl(ClientImpl client) {
		super("user", client); this.stub = create(AuthGrpc::newStub);
	}
	
	/**
	 * 
	 */
	@Override
	public CompletableFuture<AuthUserAddResponse> add(AuthUserAddRequest request) {
		return invoke(() -> single(request), observer -> this.stub.userAdd(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserGetResponse> get(AuthUserGetRequest request) {
		return invoke(() -> single(request), observer -> this.stub.userGet(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserListResponse> list(AuthUserListRequest request) {
		return invoke(() -> single(request), observer -> this.stub.userList(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserDeleteResponse> delete(AuthUserDeleteRequest request) {
		return invoke(() -> single(request), observer -> this.stub.userDelete(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserGrantRoleResponse> grantRole(AuthUserGrantRoleRequest request) {
		return invoke(() -> single(request), observer -> this.stub.userGrantRole(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserRevokeRoleResponse> revokeRole(AuthUserRevokeRoleRequest request) {
		return invoke(() -> { return single(request); }, observer -> this.stub.userRevokeRole(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthUserChangePasswordResponse> changePassword(AuthUserChangePasswordRequest request) {
		return invoke(() -> { return single(request); }, observer -> this.stub.userChangePassword(request, observer));
	}
}
