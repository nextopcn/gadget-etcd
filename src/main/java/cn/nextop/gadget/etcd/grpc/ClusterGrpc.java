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
public final class ClusterGrpc {

  private ClusterGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Cluster";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberAddRequest,
      cn.nextop.gadget.etcd.grpc.MemberAddResponse> getMemberAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberAdd",
      requestType = cn.nextop.gadget.etcd.grpc.MemberAddRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.MemberAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberAddRequest,
      cn.nextop.gadget.etcd.grpc.MemberAddResponse> getMemberAddMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberAddRequest, cn.nextop.gadget.etcd.grpc.MemberAddResponse> getMemberAddMethod;
    if ((getMemberAddMethod = ClusterGrpc.getMemberAddMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberAddMethod = ClusterGrpc.getMemberAddMethod) == null) {
          ClusterGrpc.getMemberAddMethod = getMemberAddMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.MemberAddRequest, cn.nextop.gadget.etcd.grpc.MemberAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Cluster", "MemberAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberAddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberAdd"))
                  .build();
          }
        }
     }
     return getMemberAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberRemoveRequest,
      cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> getMemberRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberRemove",
      requestType = cn.nextop.gadget.etcd.grpc.MemberRemoveRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.MemberRemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberRemoveRequest,
      cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> getMemberRemoveMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberRemoveRequest, cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> getMemberRemoveMethod;
    if ((getMemberRemoveMethod = ClusterGrpc.getMemberRemoveMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberRemoveMethod = ClusterGrpc.getMemberRemoveMethod) == null) {
          ClusterGrpc.getMemberRemoveMethod = getMemberRemoveMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.MemberRemoveRequest, cn.nextop.gadget.etcd.grpc.MemberRemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Cluster", "MemberRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberRemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberRemoveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberRemove"))
                  .build();
          }
        }
     }
     return getMemberRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberUpdateRequest,
      cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> getMemberUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberUpdate",
      requestType = cn.nextop.gadget.etcd.grpc.MemberUpdateRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.MemberUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberUpdateRequest,
      cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> getMemberUpdateMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberUpdateRequest, cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> getMemberUpdateMethod;
    if ((getMemberUpdateMethod = ClusterGrpc.getMemberUpdateMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberUpdateMethod = ClusterGrpc.getMemberUpdateMethod) == null) {
          ClusterGrpc.getMemberUpdateMethod = getMemberUpdateMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.MemberUpdateRequest, cn.nextop.gadget.etcd.grpc.MemberUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Cluster", "MemberUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberUpdate"))
                  .build();
          }
        }
     }
     return getMemberUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberListRequest,
      cn.nextop.gadget.etcd.grpc.MemberListResponse> getMemberListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberList",
      requestType = cn.nextop.gadget.etcd.grpc.MemberListRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.MemberListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberListRequest,
      cn.nextop.gadget.etcd.grpc.MemberListResponse> getMemberListMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.MemberListRequest, cn.nextop.gadget.etcd.grpc.MemberListResponse> getMemberListMethod;
    if ((getMemberListMethod = ClusterGrpc.getMemberListMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberListMethod = ClusterGrpc.getMemberListMethod) == null) {
          ClusterGrpc.getMemberListMethod = getMemberListMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.MemberListRequest, cn.nextop.gadget.etcd.grpc.MemberListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Cluster", "MemberList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.MemberListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberList"))
                  .build();
          }
        }
     }
     return getMemberListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterStub newStub(io.grpc.Channel channel) {
    return new ClusterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterFutureStub(channel);
  }

  /**
   */
  public static abstract class ClusterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public void memberAdd(cn.nextop.gadget.etcd.grpc.MemberAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMemberAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public void memberRemove(cn.nextop.gadget.etcd.grpc.MemberRemoveRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMemberRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public void memberUpdate(cn.nextop.gadget.etcd.grpc.MemberUpdateRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMemberUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public void memberList(cn.nextop.gadget.etcd.grpc.MemberListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMemberListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMemberAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.MemberAddRequest,
                cn.nextop.gadget.etcd.grpc.MemberAddResponse>(
                  this, METHODID_MEMBER_ADD)))
          .addMethod(
            getMemberRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.MemberRemoveRequest,
                cn.nextop.gadget.etcd.grpc.MemberRemoveResponse>(
                  this, METHODID_MEMBER_REMOVE)))
          .addMethod(
            getMemberUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.MemberUpdateRequest,
                cn.nextop.gadget.etcd.grpc.MemberUpdateResponse>(
                  this, METHODID_MEMBER_UPDATE)))
          .addMethod(
            getMemberListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.MemberListRequest,
                cn.nextop.gadget.etcd.grpc.MemberListResponse>(
                  this, METHODID_MEMBER_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ClusterStub extends io.grpc.stub.AbstractStub<ClusterStub> {
    private ClusterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public void memberAdd(cn.nextop.gadget.etcd.grpc.MemberAddRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMemberAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public void memberRemove(cn.nextop.gadget.etcd.grpc.MemberRemoveRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMemberRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public void memberUpdate(cn.nextop.gadget.etcd.grpc.MemberUpdateRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMemberUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public void memberList(cn.nextop.gadget.etcd.grpc.MemberListRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClusterBlockingStub extends io.grpc.stub.AbstractStub<ClusterBlockingStub> {
    private ClusterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.MemberAddResponse memberAdd(cn.nextop.gadget.etcd.grpc.MemberAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getMemberAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.MemberRemoveResponse memberRemove(cn.nextop.gadget.etcd.grpc.MemberRemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getMemberRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.MemberUpdateResponse memberUpdate(cn.nextop.gadget.etcd.grpc.MemberUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getMemberUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.MemberListResponse memberList(cn.nextop.gadget.etcd.grpc.MemberListRequest request) {
      return blockingUnaryCall(
          getChannel(), getMemberListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClusterFutureStub extends io.grpc.stub.AbstractStub<ClusterFutureStub> {
    private ClusterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.MemberAddResponse> memberAdd(
        cn.nextop.gadget.etcd.grpc.MemberAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMemberAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.MemberRemoveResponse> memberRemove(
        cn.nextop.gadget.etcd.grpc.MemberRemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMemberRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.MemberUpdateResponse> memberUpdate(
        cn.nextop.gadget.etcd.grpc.MemberUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMemberUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.MemberListResponse> memberList(
        cn.nextop.gadget.etcd.grpc.MemberListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MEMBER_ADD = 0;
  private static final int METHODID_MEMBER_REMOVE = 1;
  private static final int METHODID_MEMBER_UPDATE = 2;
  private static final int METHODID_MEMBER_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MEMBER_ADD:
          serviceImpl.memberAdd((cn.nextop.gadget.etcd.grpc.MemberAddRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberAddResponse>) responseObserver);
          break;
        case METHODID_MEMBER_REMOVE:
          serviceImpl.memberRemove((cn.nextop.gadget.etcd.grpc.MemberRemoveRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberRemoveResponse>) responseObserver);
          break;
        case METHODID_MEMBER_UPDATE:
          serviceImpl.memberUpdate((cn.nextop.gadget.etcd.grpc.MemberUpdateRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberUpdateResponse>) responseObserver);
          break;
        case METHODID_MEMBER_LIST:
          serviceImpl.memberList((cn.nextop.gadget.etcd.grpc.MemberListRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.MemberListResponse>) responseObserver);
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

  private static abstract class ClusterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cluster");
    }
  }

  private static final class ClusterFileDescriptorSupplier
      extends ClusterBaseDescriptorSupplier {
    ClusterFileDescriptorSupplier() {}
  }

  private static final class ClusterMethodDescriptorSupplier
      extends ClusterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterFileDescriptorSupplier())
              .addMethod(getMemberAddMethod())
              .addMethod(getMemberRemoveMethod())
              .addMethod(getMemberUpdateMethod())
              .addMethod(getMemberListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
