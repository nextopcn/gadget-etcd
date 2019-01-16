package cn.nextop.gadget.etcd.grpc.lock;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The lock service exposes client-side locking facilities as a gRPC interface.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: lock.proto")
public final class LockGrpc {

  private LockGrpc() {}

  public static final String SERVICE_NAME = "v3lockpb.Lock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.LockRequest,
      cn.nextop.gadget.etcd.grpc.lock.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = cn.nextop.gadget.etcd.grpc.lock.LockRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.lock.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.LockRequest,
      cn.nextop.gadget.etcd.grpc.lock.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.LockRequest, cn.nextop.gadget.etcd.grpc.lock.LockResponse> getLockMethod;
    if ((getLockMethod = LockGrpc.getLockMethod) == null) {
      synchronized (LockGrpc.class) {
        if ((getLockMethod = LockGrpc.getLockMethod) == null) {
          LockGrpc.getLockMethod = getLockMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.lock.LockRequest, cn.nextop.gadget.etcd.grpc.lock.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v3lockpb.Lock", "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.lock.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.lock.LockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LockMethodDescriptorSupplier("Lock"))
                  .build();
          }
        }
     }
     return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.UnlockRequest,
      cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = cn.nextop.gadget.etcd.grpc.lock.UnlockRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.lock.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.UnlockRequest,
      cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.lock.UnlockRequest, cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = LockGrpc.getUnlockMethod) == null) {
      synchronized (LockGrpc.class) {
        if ((getUnlockMethod = LockGrpc.getUnlockMethod) == null) {
          LockGrpc.getUnlockMethod = getUnlockMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.lock.UnlockRequest, cn.nextop.gadget.etcd.grpc.lock.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "v3lockpb.Lock", "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.lock.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.lock.UnlockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LockMethodDescriptorSupplier("Unlock"))
                  .build();
          }
        }
     }
     return getUnlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockStub newStub(io.grpc.Channel channel) {
    return new LockStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LockBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LockFutureStub(channel);
  }

  /**
   * <pre>
   * The lock service exposes client-side locking facilities as a gRPC interface.
   * </pre>
   */
  public static abstract class LockImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lock acquires a distributed shared lock on a given named lock.
     * On success, it will return a unique key that exists so long as the
     * lock is held by the caller. This key can be used in conjunction with
     * transactions to safely ensure updates to etcd only occur while holding
     * lock ownership. The lock is held until Unlock is called on the key or the
     * lease associate with the owner expires.
     * </pre>
     */
    public void lock(cn.nextop.gadget.etcd.grpc.lock.LockRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.LockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unlock takes a key returned by Lock and releases the hold on lock. The
     * next Lock caller waiting for the lock will then be woken up and given
     * ownership of the lock.
     * </pre>
     */
    public void unlock(cn.nextop.gadget.etcd.grpc.lock.UnlockRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.lock.LockRequest,
                cn.nextop.gadget.etcd.grpc.lock.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.lock.UnlockRequest,
                cn.nextop.gadget.etcd.grpc.lock.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .build();
    }
  }

  /**
   * <pre>
   * The lock service exposes client-side locking facilities as a gRPC interface.
   * </pre>
   */
  public static final class LockStub extends io.grpc.stub.AbstractStub<LockStub> {
    private LockStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock acquires a distributed shared lock on a given named lock.
     * On success, it will return a unique key that exists so long as the
     * lock is held by the caller. This key can be used in conjunction with
     * transactions to safely ensure updates to etcd only occur while holding
     * lock ownership. The lock is held until Unlock is called on the key or the
     * lease associate with the owner expires.
     * </pre>
     */
    public void lock(cn.nextop.gadget.etcd.grpc.lock.LockRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.LockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unlock takes a key returned by Lock and releases the hold on lock. The
     * next Lock caller waiting for the lock will then be woken up and given
     * ownership of the lock.
     * </pre>
     */
    public void unlock(cn.nextop.gadget.etcd.grpc.lock.UnlockRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The lock service exposes client-side locking facilities as a gRPC interface.
   * </pre>
   */
  public static final class LockBlockingStub extends io.grpc.stub.AbstractStub<LockBlockingStub> {
    private LockBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock acquires a distributed shared lock on a given named lock.
     * On success, it will return a unique key that exists so long as the
     * lock is held by the caller. This key can be used in conjunction with
     * transactions to safely ensure updates to etcd only occur while holding
     * lock ownership. The lock is held until Unlock is called on the key or the
     * lease associate with the owner expires.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.lock.LockResponse lock(cn.nextop.gadget.etcd.grpc.lock.LockRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unlock takes a key returned by Lock and releases the hold on lock. The
     * next Lock caller waiting for the lock will then be woken up and given
     * ownership of the lock.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.lock.UnlockResponse unlock(cn.nextop.gadget.etcd.grpc.lock.UnlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The lock service exposes client-side locking facilities as a gRPC interface.
   * </pre>
   */
  public static final class LockFutureStub extends io.grpc.stub.AbstractStub<LockFutureStub> {
    private LockFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LockFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LockFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock acquires a distributed shared lock on a given named lock.
     * On success, it will return a unique key that exists so long as the
     * lock is held by the caller. This key can be used in conjunction with
     * transactions to safely ensure updates to etcd only occur while holding
     * lock ownership. The lock is held until Unlock is called on the key or the
     * lease associate with the owner expires.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.lock.LockResponse> lock(
        cn.nextop.gadget.etcd.grpc.lock.LockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unlock takes a key returned by Lock and releases the hold on lock. The
     * next Lock caller waiting for the lock will then be woken up and given
     * ownership of the lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.lock.UnlockResponse> unlock(
        cn.nextop.gadget.etcd.grpc.lock.UnlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOCK = 0;
  private static final int METHODID_UNLOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOCK:
          serviceImpl.lock((cn.nextop.gadget.etcd.grpc.lock.LockRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((cn.nextop.gadget.etcd.grpc.lock.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.lock.UnlockResponse>) responseObserver);
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

  private static abstract class LockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.nextop.gadget.etcd.grpc.lock.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lock");
    }
  }

  private static final class LockFileDescriptorSupplier
      extends LockBaseDescriptorSupplier {
    LockFileDescriptorSupplier() {}
  }

  private static final class LockMethodDescriptorSupplier
      extends LockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockFileDescriptorSupplier())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
