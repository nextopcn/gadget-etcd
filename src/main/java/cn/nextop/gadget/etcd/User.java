package cn.nextop.gadget.etcd;

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

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface User extends Client.Stub {
	
	CompletableFuture<AuthUserAddResponse> add(AuthUserAddRequest request);
	
	CompletableFuture<AuthUserGetResponse> get(AuthUserGetRequest request);
	
	CompletableFuture<AuthUserListResponse> list(AuthUserListRequest request);
	
	CompletableFuture<AuthUserDeleteResponse> delete(AuthUserDeleteRequest request);
	
	CompletableFuture<AuthUserGrantRoleResponse> grantRole(AuthUserGrantRoleRequest request);
	
	CompletableFuture<AuthUserRevokeRoleResponse> revokeRole(AuthUserRevokeRoleRequest request);
	
	CompletableFuture<AuthUserChangePasswordResponse> changePassword(AuthUserChangePasswordRequest request);
}
