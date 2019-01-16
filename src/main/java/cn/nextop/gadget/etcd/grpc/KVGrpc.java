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
public final class KVGrpc {

  private KVGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.KV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.RangeRequest,
      cn.nextop.gadget.etcd.grpc.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = cn.nextop.gadget.etcd.grpc.RangeRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.RangeRequest,
      cn.nextop.gadget.etcd.grpc.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.RangeRequest, cn.nextop.gadget.etcd.grpc.RangeResponse> getRangeMethod;
    if ((getRangeMethod = KVGrpc.getRangeMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getRangeMethod = KVGrpc.getRangeMethod) == null) {
          KVGrpc.getRangeMethod = getRangeMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.RangeRequest, cn.nextop.gadget.etcd.grpc.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.KV", "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.RangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVMethodDescriptorSupplier("Range"))
                  .build();
          }
        }
     }
     return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.PutRequest,
      cn.nextop.gadget.etcd.grpc.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = cn.nextop.gadget.etcd.grpc.PutRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.PutRequest,
      cn.nextop.gadget.etcd.grpc.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.PutRequest, cn.nextop.gadget.etcd.grpc.PutResponse> getPutMethod;
    if ((getPutMethod = KVGrpc.getPutMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getPutMethod = KVGrpc.getPutMethod) == null) {
          KVGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.PutRequest, cn.nextop.gadget.etcd.grpc.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.KV", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.DeleteRangeRequest,
      cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> getDeleteRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRange",
      requestType = cn.nextop.gadget.etcd.grpc.DeleteRangeRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.DeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.DeleteRangeRequest,
      cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> getDeleteRangeMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.DeleteRangeRequest, cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> getDeleteRangeMethod;
    if ((getDeleteRangeMethod = KVGrpc.getDeleteRangeMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getDeleteRangeMethod = KVGrpc.getDeleteRangeMethod) == null) {
          KVGrpc.getDeleteRangeMethod = getDeleteRangeMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.DeleteRangeRequest, cn.nextop.gadget.etcd.grpc.DeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.KV", "DeleteRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.DeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.DeleteRangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVMethodDescriptorSupplier("DeleteRange"))
                  .build();
          }
        }
     }
     return getDeleteRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.TxnRequest,
      cn.nextop.gadget.etcd.grpc.TxnResponse> getTxnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Txn",
      requestType = cn.nextop.gadget.etcd.grpc.TxnRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.TxnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.TxnRequest,
      cn.nextop.gadget.etcd.grpc.TxnResponse> getTxnMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.TxnRequest, cn.nextop.gadget.etcd.grpc.TxnResponse> getTxnMethod;
    if ((getTxnMethod = KVGrpc.getTxnMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getTxnMethod = KVGrpc.getTxnMethod) == null) {
          KVGrpc.getTxnMethod = getTxnMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.TxnRequest, cn.nextop.gadget.etcd.grpc.TxnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.KV", "Txn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.TxnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.TxnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVMethodDescriptorSupplier("Txn"))
                  .build();
          }
        }
     }
     return getTxnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.CompactionRequest,
      cn.nextop.gadget.etcd.grpc.CompactionResponse> getCompactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compact",
      requestType = cn.nextop.gadget.etcd.grpc.CompactionRequest.class,
      responseType = cn.nextop.gadget.etcd.grpc.CompactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.CompactionRequest,
      cn.nextop.gadget.etcd.grpc.CompactionResponse> getCompactMethod() {
    io.grpc.MethodDescriptor<cn.nextop.gadget.etcd.grpc.CompactionRequest, cn.nextop.gadget.etcd.grpc.CompactionResponse> getCompactMethod;
    if ((getCompactMethod = KVGrpc.getCompactMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getCompactMethod = KVGrpc.getCompactMethod) == null) {
          KVGrpc.getCompactMethod = getCompactMethod = 
              io.grpc.MethodDescriptor.<cn.nextop.gadget.etcd.grpc.CompactionRequest, cn.nextop.gadget.etcd.grpc.CompactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "etcdserverpb.KV", "Compact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.CompactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.nextop.gadget.etcd.grpc.CompactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KVMethodDescriptorSupplier("Compact"))
                  .build();
          }
        }
     }
     return getCompactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVStub newStub(io.grpc.Channel channel) {
    return new KVStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KVBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KVFutureStub(channel);
  }

  /**
   */
  public static abstract class KVImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public void range(cn.nextop.gadget.etcd.grpc.RangeRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.RangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(cn.nextop.gadget.etcd.grpc.PutRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void deleteRange(cn.nextop.gadget.etcd.grpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(cn.nextop.gadget.etcd.grpc.TxnRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.TxnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTxnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public void compact(cn.nextop.gadget.etcd.grpc.CompactionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.CompactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCompactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.RangeRequest,
                cn.nextop.gadget.etcd.grpc.RangeResponse>(
                  this, METHODID_RANGE)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.PutRequest,
                cn.nextop.gadget.etcd.grpc.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.DeleteRangeRequest,
                cn.nextop.gadget.etcd.grpc.DeleteRangeResponse>(
                  this, METHODID_DELETE_RANGE)))
          .addMethod(
            getTxnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.TxnRequest,
                cn.nextop.gadget.etcd.grpc.TxnResponse>(
                  this, METHODID_TXN)))
          .addMethod(
            getCompactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.nextop.gadget.etcd.grpc.CompactionRequest,
                cn.nextop.gadget.etcd.grpc.CompactionResponse>(
                  this, METHODID_COMPACT)))
          .build();
    }
  }

  /**
   */
  public static final class KVStub extends io.grpc.stub.AbstractStub<KVStub> {
    private KVStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public void range(cn.nextop.gadget.etcd.grpc.RangeRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.RangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(cn.nextop.gadget.etcd.grpc.PutRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void deleteRange(cn.nextop.gadget.etcd.grpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(cn.nextop.gadget.etcd.grpc.TxnRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.TxnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public void compact(cn.nextop.gadget.etcd.grpc.CompactionRequest request,
        io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.CompactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KVBlockingStub extends io.grpc.stub.AbstractStub<KVBlockingStub> {
    private KVBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.RangeResponse range(cn.nextop.gadget.etcd.grpc.RangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.PutResponse put(cn.nextop.gadget.etcd.grpc.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.DeleteRangeResponse deleteRange(cn.nextop.gadget.etcd.grpc.DeleteRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.TxnResponse txn(cn.nextop.gadget.etcd.grpc.TxnRequest request) {
      return blockingUnaryCall(
          getChannel(), getTxnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public cn.nextop.gadget.etcd.grpc.CompactionResponse compact(cn.nextop.gadget.etcd.grpc.CompactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KVFutureStub extends io.grpc.stub.AbstractStub<KVFutureStub> {
    private KVFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KVFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KVFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.RangeResponse> range(
        cn.nextop.gadget.etcd.grpc.RangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.PutResponse> put(
        cn.nextop.gadget.etcd.grpc.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.DeleteRangeResponse> deleteRange(
        cn.nextop.gadget.etcd.grpc.DeleteRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.TxnResponse> txn(
        cn.nextop.gadget.etcd.grpc.TxnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.nextop.gadget.etcd.grpc.CompactionResponse> compact(
        cn.nextop.gadget.etcd.grpc.CompactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANGE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_DELETE_RANGE = 2;
  private static final int METHODID_TXN = 3;
  private static final int METHODID_COMPACT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KVImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KVImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANGE:
          serviceImpl.range((cn.nextop.gadget.etcd.grpc.RangeRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.RangeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((cn.nextop.gadget.etcd.grpc.PutRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE_RANGE:
          serviceImpl.deleteRange((cn.nextop.gadget.etcd.grpc.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_TXN:
          serviceImpl.txn((cn.nextop.gadget.etcd.grpc.TxnRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.TxnResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((cn.nextop.gadget.etcd.grpc.CompactionRequest) request,
              (io.grpc.stub.StreamObserver<cn.nextop.gadget.etcd.grpc.CompactionResponse>) responseObserver);
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

  private static abstract class KVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KV");
    }
  }

  private static final class KVFileDescriptorSupplier
      extends KVBaseDescriptorSupplier {
    KVFileDescriptorSupplier() {}
  }

  private static final class KVMethodDescriptorSupplier
      extends KVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVMethodDescriptorSupplier(String methodName) {
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
      synchronized (KVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVFileDescriptorSupplier())
              .addMethod(getRangeMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteRangeMethod())
              .addMethod(getTxnMethod())
              .addMethod(getCompactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
