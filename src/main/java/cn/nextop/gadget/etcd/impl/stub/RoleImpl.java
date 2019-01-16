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

/**
 * @author Baoyi Chen
 */
public class RoleImpl extends ClientStub implements Role {
	//
	private final AuthGrpc.AuthStub stub;
	
	/**
	 * 
	 */
	public RoleImpl(ClientImpl client) {
		super("role", client); this.stub = create(AuthGrpc::newStub);
	}
	
	/**
	 *
	 */
	@Override
	public CompletableFuture<AuthRoleAddResponse> add(AuthRoleAddRequest request) {
		return invoke(() -> single(request), observer -> this.stub.roleAdd(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthRoleGetResponse> get(AuthRoleGetRequest request) {
		return invoke(() -> single(request), observer -> this.stub.roleGet(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthRoleListResponse> list(AuthRoleListRequest request) {
		return invoke(() -> single(request), observer -> this.stub.roleList(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthRoleDeleteResponse> delete(AuthRoleDeleteRequest request) {
		return invoke(() -> single(request), observer -> this.stub.roleDelete(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthRoleGrantPermissionResponse> grantPermission(AuthRoleGrantPermissionRequest request) {
		return invoke(() -> { return single(request); }, (observer) -> this.stub.roleGrantPermission(request, observer));
	}
	
	@Override
	public CompletableFuture<AuthRoleRevokePermissionResponse> revokePermission(AuthRoleRevokePermissionRequest request) {
		return invoke(() -> { return single(request); }, (observer) -> this.stub.roleRevokePermission(request, observer));
	}
}
