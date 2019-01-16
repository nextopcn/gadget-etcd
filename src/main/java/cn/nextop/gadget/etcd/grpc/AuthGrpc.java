package cn.nextop.gadget.etcd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: rpc.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthEnableRequest,
      cn.nextop.gadget.etcd.grpc.AuthEnableResponse> getAuthEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthEnable",
      requestType = cn.nextop.gadget.etcd.grpc.AuthEnableRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthEnableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthEnableRequest,
      cn.nextop.gadget.etcd.grpc.AuthEnableResponse> getAuthEnableMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthEnableRequest, cn.nextop.gadget.etcd.grpc.AuthEnableResponse> getAuthEnableMethod;
    if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
          AuthGrpc.getAuthEnableMethod = getAuthEnableMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthEnableRequest, cn.nextop.gadget.etcd.grpc.AuthEnableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "AuthEnable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthEnableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthEnableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthEnable"))
                  .build();
          }
        }
     }
     return getAuthEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthDisableRequest,
      cn.nextop.gadget.etcd.grpc.AuthDisableResponse> getAuthDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthDisable",
      requestType = cn.nextop.gadget.etcd.grpc.AuthDisableRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthDisableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthDisableRequest,
      cn.nextop.gadget.etcd.grpc.AuthDisableResponse> getAuthDisableMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthDisableRequest, cn.nextop.gadget.etcd.grpc.AuthDisableResponse> getAuthDisableMethod;
    if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
          AuthGrpc.getAuthDisableMethod = getAuthDisableMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthDisableRequest, cn.nextop.gadget.etcd.grpc.AuthDisableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "AuthDisable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthDisableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthDisableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthDisable"))
                  .build();
          }
        }
     }
     return getAuthDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthenticateRequest,
      cn.nextop.gadget.etcd.grpc.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = cn.nextop.gadget.etcd.grpc.AuthenticateRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthenticateRequest,
      cn.nextop.gadget.etcd.grpc.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthenticateRequest, cn.nextop.gadget.etcd.grpc.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
          AuthGrpc.getAuthenticateMethod = getAuthenticateMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthenticateRequest, cn.nextop.gadget.etcd.grpc.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthenticateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Authenticate"))
                  .build();
          }
        }
     }
     return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserAddRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> getUserAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAdd",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserAddRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserAddRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> getUserAddMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserAddRequest, cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> getUserAddMethod;
    if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
          AuthGrpc.getUserAddMethod = getUserAddMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserAddRequest, cn.nextop.gadget.etcd.grpc.AuthUserAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserAddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserAdd"))
                  .build();
          }
        }
     }
     return getUserAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGetRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> getUserGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGet",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserGetRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGetRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> getUserGetMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGetRequest, cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> getUserGetMethod;
    if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
          AuthGrpc.getUserGetMethod = getUserGetMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserGetRequest, cn.nextop.gadget.etcd.grpc.AuthUserGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserGetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGet"))
                  .build();
          }
        }
     }
     return getUserGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserListRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserListResponse> getUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserList",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserListRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserListRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserListResponse> getUserListMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserListRequest, cn.nextop.gadget.etcd.grpc.AuthUserListResponse> getUserListMethod;
    if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
          AuthGrpc.getUserListMethod = getUserListMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserListRequest, cn.nextop.gadget.etcd.grpc.AuthUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserList"))
                  .build();
          }
        }
     }
     return getUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> getUserDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserDelete",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> getUserDeleteMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest, cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> getUserDeleteMethod;
    if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
          AuthGrpc.getUserDeleteMethod = getUserDeleteMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest, cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserDelete"))
                  .build();
          }
        }
     }
     return getUserDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> getUserChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserChangePassword",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> getUserChangePasswordMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest, cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> getUserChangePasswordMethod;
    if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
          AuthGrpc.getUserChangePasswordMethod = getUserChangePasswordMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest, cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserChangePassword"))
                  .build();
          }
        }
     }
     return getUserChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> getUserGrantRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGrantRole",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> getUserGrantRoleMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest, cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> getUserGrantRoleMethod;
    if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
          AuthGrpc.getUserGrantRoleMethod = getUserGrantRoleMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest, cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserGrantRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGrantRole"))
                  .build();
          }
        }
     }
     return getUserGrantRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserRevokeRole",
      requestType = cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest,
      cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest, cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;
    if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
          AuthGrpc.getUserRevokeRoleMethod = getUserRevokeRoleMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest, cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "UserRevokeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserRevokeRole"))
                  .build();
          }
        }
     }
     return getUserRevokeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> getRoleAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleAdd",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> getRoleAddMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest, cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> getRoleAddMethod;
    if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
          AuthGrpc.getRoleAddMethod = getRoleAddMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest, cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleAdd"))
                  .build();
          }
        }
     }
     return getRoleAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> getRoleGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGet",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> getRoleGetMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest, cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> getRoleGetMethod;
    if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
          AuthGrpc.getRoleGetMethod = getRoleGetMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest, cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGet"))
                  .build();
          }
        }
     }
     return getRoleGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleListRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> getRoleListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleList",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleListRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleListRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> getRoleListMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleListRequest, cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> getRoleListMethod;
    if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
          AuthGrpc.getRoleListMethod = getRoleListMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleListRequest, cn.nextop.gadget.etcd.grpc.AuthRoleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleList"))
                  .build();
          }
        }
     }
     return getRoleListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> getRoleDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleDelete",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> getRoleDeleteMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest, cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> getRoleDeleteMethod;
    if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
          AuthGrpc.getRoleDeleteMethod = getRoleDeleteMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest, cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleDelete"))
                  .build();
          }
        }
     }
     return getRoleDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGrantPermission",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest, cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;
    if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
          AuthGrpc.getRoleGrantPermissionMethod = getRoleGrantPermissionMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest, cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleGrantPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGrantPermission"))
                  .build();
          }
        }
     }
     return getRoleGrantPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleRevokePermission",
      requestType = cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest,
      cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest, cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;
    if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
          AuthGrpc.getRoleRevokePermissionMethod = getRoleRevokePermissionMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest, cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Auth", "RoleRevokePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleRevokePermission"))
                  .build();
          }
        }
     }
     return getRoleRevokePermissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    return new AuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(cn.nextop.gadget.etcd.grpc.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthEnableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(cn.nextop.gadget.etcd.grpc.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthDisableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(cn.nextop.gadget.etcd.grpc.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(cn.nextop.gadget.etcd.grpc.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(cn.nextop.gadget.etcd.grpc.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(cn.nextop.gadget.etcd.grpc.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserChangePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGrantRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRevokeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(cn.nextop.gadget.etcd.grpc.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleListMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGrantPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleRevokePermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthEnableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthEnableRequest,
                cn.nextop.gadget.etcd.grpc.AuthEnableResponse>(
                  this, METHODID_AUTH_ENABLE)))
          .addMethod(
            getAuthDisableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthDisableRequest,
                cn.nextop.gadget.etcd.grpc.AuthDisableResponse>(
                  this, METHODID_AUTH_DISABLE)))
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthenticateRequest,
                cn.nextop.gadget.etcd.grpc.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getUserAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserAddRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserAddResponse>(
                  this, METHODID_USER_ADD)))
          .addMethod(
            getUserGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserGetRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserGetResponse>(
                  this, METHODID_USER_GET)))
          .addMethod(
            getUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserListRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserListResponse>(
                  this, METHODID_USER_LIST)))
          .addMethod(
            getUserDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse>(
                  this, METHODID_USER_DELETE)))
          .addMethod(
            getUserChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse>(
                  this, METHODID_USER_CHANGE_PASSWORD)))
          .addMethod(
            getUserGrantRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse>(
                  this, METHODID_USER_GRANT_ROLE)))
          .addMethod(
            getUserRevokeRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest,
                cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse>(
                  this, METHODID_USER_REVOKE_ROLE)))
          .addMethod(
            getRoleAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse>(
                  this, METHODID_ROLE_ADD)))
          .addMethod(
            getRoleGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse>(
                  this, METHODID_ROLE_GET)))
          .addMethod(
            getRoleListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleListRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleListResponse>(
                  this, METHODID_ROLE_LIST)))
          .addMethod(
            getRoleDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse>(
                  this, METHODID_ROLE_DELETE)))
          .addMethod(
            getRoleGrantPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse>(
                  this, METHODID_ROLE_GRANT_PERMISSION)))
          .addMethod(
            getRoleRevokePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest,
                cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse>(
                  this, METHODID_ROLE_REVOKE_PERMISSION)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractStub<AuthStub> {
    private AuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(cn.nextop.gadget.etcd.grpc.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthEnableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(cn.nextop.gadget.etcd.grpc.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthDisableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(cn.nextop.gadget.etcd.grpc.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(cn.nextop.gadget.etcd.grpc.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(cn.nextop.gadget.etcd.grpc.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(cn.nextop.gadget.etcd.grpc.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(cn.nextop.gadget.etcd.grpc.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractStub<AuthBlockingStub> {
    private AuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthEnableResponse authEnable(cn.nextop.gadget.etcd.grpc.AuthEnableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthDisableResponse authDisable(cn.nextop.gadget.etcd.grpc.AuthDisableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthenticateResponse authenticate(cn.nextop.gadget.etcd.grpc.AuthenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserAddResponse userAdd(cn.nextop.gadget.etcd.grpc.AuthUserAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserGetResponse userGet(cn.nextop.gadget.etcd.grpc.AuthUserGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserListResponse userList(cn.nextop.gadget.etcd.grpc.AuthUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse userDelete(cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse userChangePassword(cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse userGrantRole(cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGrantRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse userRevokeRole(cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserRevokeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse roleAdd(cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse roleGet(cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleListResponse roleList(cn.nextop.gadget.etcd.grpc.AuthRoleListRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse roleDelete(cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse roleGrantPermission(cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGrantPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse roleRevokePermission(cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleRevokePermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractStub<AuthFutureStub> {
    private AuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthEnableResponse> authEnable(
        cn.nextop.gadget.etcd.grpc.AuthEnableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthDisableResponse> authDisable(
        cn.nextop.gadget.etcd.grpc.AuthDisableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthenticateResponse> authenticate(
        cn.nextop.gadget.etcd.grpc.AuthenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserAddResponse> userAdd(
        cn.nextop.gadget.etcd.grpc.AuthUserAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserGetResponse> userGet(
        cn.nextop.gadget.etcd.grpc.AuthUserGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserListResponse> userList(
        cn.nextop.gadget.etcd.grpc.AuthUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse> userDelete(
        cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse> userChangePassword(
        cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse> userGrantRole(
        cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse> userRevokeRole(
        cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse> roleAdd(
        cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse> roleGet(
        cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleListResponse> roleList(
        cn.nextop.gadget.etcd.grpc.AuthRoleListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse> roleDelete(
        cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse> roleGrantPermission(
        cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse> roleRevokePermission(
        cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH_ENABLE = 0;
  private static final int METHODID_AUTH_DISABLE = 1;
  private static final int METHODID_AUTHENTICATE = 2;
  private static final int METHODID_USER_ADD = 3;
  private static final int METHODID_USER_GET = 4;
  private static final int METHODID_USER_LIST = 5;
  private static final int METHODID_USER_DELETE = 6;
  private static final int METHODID_USER_CHANGE_PASSWORD = 7;
  private static final int METHODID_USER_GRANT_ROLE = 8;
  private static final int METHODID_USER_REVOKE_ROLE = 9;
  private static final int METHODID_ROLE_ADD = 10;
  private static final int METHODID_ROLE_GET = 11;
  private static final int METHODID_ROLE_LIST = 12;
  private static final int METHODID_ROLE_DELETE = 13;
  private static final int METHODID_ROLE_GRANT_PERMISSION = 14;
  private static final int METHODID_ROLE_REVOKE_PERMISSION = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH_ENABLE:
          serviceImpl.authEnable((cn.nextop.gadget.etcd.grpc.AuthEnableRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthEnableResponse>) responseObserver);
          break;
        case METHODID_AUTH_DISABLE:
          serviceImpl.authDisable((cn.nextop.gadget.etcd.grpc.AuthDisableRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthDisableResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((cn.nextop.gadget.etcd.grpc.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_USER_ADD:
          serviceImpl.userAdd((cn.nextop.gadget.etcd.grpc.AuthUserAddRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserAddResponse>) responseObserver);
          break;
        case METHODID_USER_GET:
          serviceImpl.userGet((cn.nextop.gadget.etcd.grpc.AuthUserGetRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGetResponse>) responseObserver);
          break;
        case METHODID_USER_LIST:
          serviceImpl.userList((cn.nextop.gadget.etcd.grpc.AuthUserListRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserListResponse>) responseObserver);
          break;
        case METHODID_USER_DELETE:
          serviceImpl.userDelete((cn.nextop.gadget.etcd.grpc.AuthUserDeleteRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserDeleteResponse>) responseObserver);
          break;
        case METHODID_USER_CHANGE_PASSWORD:
          serviceImpl.userChangePassword((cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserChangePasswordResponse>) responseObserver);
          break;
        case METHODID_USER_GRANT_ROLE:
          serviceImpl.userGrantRole((cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserGrantRoleResponse>) responseObserver);
          break;
        case METHODID_USER_REVOKE_ROLE:
          serviceImpl.userRevokeRole((cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthUserRevokeRoleResponse>) responseObserver);
          break;
        case METHODID_ROLE_ADD:
          serviceImpl.roleAdd((cn.nextop.gadget.etcd.grpc.AuthRoleAddRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleAddResponse>) responseObserver);
          break;
        case METHODID_ROLE_GET:
          serviceImpl.roleGet((cn.nextop.gadget.etcd.grpc.AuthRoleGetRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGetResponse>) responseObserver);
          break;
        case METHODID_ROLE_LIST:
          serviceImpl.roleList((cn.nextop.gadget.etcd.grpc.AuthRoleListRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleListResponse>) responseObserver);
          break;
        case METHODID_ROLE_DELETE:
          serviceImpl.roleDelete((cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleDeleteResponse>) responseObserver);
          break;
        case METHODID_ROLE_GRANT_PERMISSION:
          serviceImpl.roleGrantPermission((cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleGrantPermissionResponse>) responseObserver);
          break;
        case METHODID_ROLE_REVOKE_PERMISSION:
          serviceImpl.roleRevokePermission((cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.AuthRoleRevokePermissionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getAuthEnableMethod())
              .addMethod(getAuthDisableMethod())
              .addMethod(getAuthenticateMethod())
              .addMethod(getUserAddMethod())
              .addMethod(getUserGetMethod())
              .addMethod(getUserListMethod())
              .addMethod(getUserDeleteMethod())
              .addMethod(getUserChangePasswordMethod())
              .addMethod(getUserGrantRoleMethod())
              .addMethod(getUserRevokeRoleMethod())
              .addMethod(getRoleAddMethod())
              .addMethod(getRoleGetMethod())
              .addMethod(getRoleListMethod())
              .addMethod(getRoleDeleteMethod())
              .addMethod(getRoleGrantPermissionMethod())
              .addMethod(getRoleRevokePermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
