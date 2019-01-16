package cn.nextop.gadget.etcd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: rpc.proto")
public final class WatchGrpc {

  private WatchGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Watch";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.WatchRequest,
      cn.nextop.gadget.etcd.grpc.WatchResponse> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = cn.nextop.gadget.etcd.grpc.WatchRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.WatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.WatchRequest,
      cn.nextop.gadget.etcd.grpc.WatchResponse> getWatchMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.WatchRequest, cn.nextop.gadget.etcd.grpc.WatchResponse> getWatchMethod;
    if ((getWatchMethod = WatchGrpc.getWatchMethod) == null) {
      synchronized (WatchGrpc.class) {
        if ((getWatchMethod = WatchGrpc.getWatchMethod) == null) {
          WatchGrpc.getWatchMethod = getWatchMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.WatchRequest, cn.nextop.gadget.etcd.grpc.WatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.Watch", "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.WatchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WatchMethodDescriptorSupplier("Watch"))
                  .build();
          }
        }
     }
     return getWatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WatchStub newStub(io.grpc.Channel channel) {
    return new WatchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WatchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WatchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WatchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WatchFutureStub(channel);
  }

  /**
   */
  public static abstract class WatchImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Watch watches for events happening or that have happened. Both input and output
     * are streams; the input stream is for creating and canceling watchers and the output
     * stream sends events. One watch RPC can watch on multiple key ranges, streaming events
     * for several watches at once. The entire event history can be watched starting from the
     * last compaction revision.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.WatchRequest> watch(
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.WatchResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getWatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWatchMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.WatchRequest,
                cn.nextop.gadget.etcd.grpc.WatchResponse>(
                  this, METHODID_WATCH)))
          .build();
    }
  }

  /**
   */
  public static final class WatchStub extends io.grpc.stub.AbstractStub<WatchStub> {
    private WatchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchStub(channel, callOptions);
    }

    /**
     * <pre>
     * Watch watches for events happening or that have happened. Both input and output
     * are streams; the input stream is for creating and canceling watchers and the output
     * stream sends events. One watch RPC can watch on multiple key ranges, streaming events
     * for several watches at once. The entire event history can be watched starting from the
     * last compaction revision.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.WatchRequest> watch(
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.WatchResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WatchBlockingStub extends io.grpc.stub.AbstractStub<WatchBlockingStub> {
    private WatchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class WatchFutureStub extends io.grpc.stub.AbstractStub<WatchFutureStub> {
    private WatchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WatchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WatchFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WATCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WatchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WatchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.watch(
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.WatchResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WatchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WatchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Watch");
    }
  }

  private static final class WatchFileDescriptorSupplier
      extends WatchBaseDescriptorSupplier {
    WatchFileDescriptorSupplier() {}
  }

  private static final class WatchMethodDescriptorSupplier
      extends WatchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WatchMethodDescriptorSupplier(String methodName) {
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
      synchronized (WatchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WatchFileDescriptorSupplier())
              .addMethod(getWatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
