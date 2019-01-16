package cn.nextop.gadget.etcd;

import cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse;
import cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse;
import cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse;
import cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse;
import cn.nextop.gadget.etcd.grpc.AuthRoleListRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleListResponse;
import cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest;
import cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse;

import java.util.concurrent.CompletableFuture;

/**
 * @author Baoyi Chen
 */
public interface Role extends Client.Stub {
	
	CompletableFuture<AuthRoleAddResponse> add(AuthRoleAddRequest request);
	
	CompletableFuture<AuthRoleGetResponse> get(AuthRoleGetRequest request);
	
	CompletableFuture<AuthRoleListResponse> list(AuthRoleListRequest request);
	
	CompletableFuture<AuthRoleDeleteResponse> delete(AuthRoleDeleteRequest request);
	
	CompletableFuture<AuthRoleGrantPermissionResponse> grantPermission(AuthRoleGrantPermissionRequest request);
	
	CompletableFuture<AuthRoleRevokePermissionResponse> revokePermission(AuthRoleRevokePermissionRequest request);
}
