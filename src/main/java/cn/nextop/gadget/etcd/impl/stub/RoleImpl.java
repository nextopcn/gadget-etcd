package cn.nextop.gadget.etcd.impl.stub;

import java.util.concurrent.CompletableFuture;

import cn.nextop.gadget.etcd.Role;
import cn.nextop.gadget.etcd.grpc.AuthGrpc;
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
import cn.nextop.gadget.etcd.impl.ClientImpl;
import cn.nextop.gadget.etcd.impl.ClientStub;
import cn.nextop.gadget.etcd.support.future.CompletableFutureEx;

/**
 * @author Baoyi Chen
 */
public class RoleImpl extends ClientStub implements Role {
	//
	private final AuthGrpc.AuthFutureStub stub;
	
	/**
	 * 
	 */
	public RoleImpl(ClientImpl client) {
		super("role", client); this.stub = create(AuthGrpc::newFutureStub);
	}
	
	/**
	 *
	 */
	@Override
	public CompletableFuture<AuthRoleAddResponse> add(AuthRoleAddRequest request) {
		return new CompletableFutureEx<>(this.stub.roleAdd(request));
	}
	
	@Override
	public CompletableFuture<AuthRoleGetResponse> get(AuthRoleGetRequest request) {
		return new CompletableFutureEx<>(this.stub.roleGet(request));
	}
	
	@Override
	public CompletableFuture<AuthRoleListResponse> list(AuthRoleListRequest request) {
		return new CompletableFutureEx<>(this.stub.roleList(request));
	}
	
	@Override
	public CompletableFuture<AuthRoleDeleteResponse> delete(AuthRoleDeleteRequest request) {
		return new CompletableFutureEx<>(this.stub.roleDelete(request));
	}
	
	@Override
	public CompletableFuture<AuthRoleGrantPermissionResponse> grantPermission(AuthRoleGrantPermissionRequest request) {
		return new CompletableFutureEx<>(this.stub.roleGrantPermission(request));
	}
	
	@Override
	public CompletableFuture<AuthRoleRevokePermissionResponse> revokePermission(AuthRoleRevokePermissionRequest request) {
		return new CompletableFutureEx<>(this.stub.roleRevokePermission(request));
	}
}
