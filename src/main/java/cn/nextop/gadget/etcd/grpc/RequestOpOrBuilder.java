// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

public interface RequestOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.RequestOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  boolean hasRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.RangeRequest getRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.RangeRequestOrBuilder getRequestRangeOrBuilder();

  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  boolean hasRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  cn.nextop.gadget.etcd.grpc.PutRequest getRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  cn.nextop.gadget.etcd.grpc.PutRequestOrBuilder getRequestPutOrBuilder();

  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  boolean hasRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  cn.nextop.gadget.etcd.grpc.DeleteRangeRequest getRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  cn.nextop.gadget.etcd.grpc.DeleteRangeRequestOrBuilder getRequestDeleteRangeOrBuilder();

  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  boolean hasRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  cn.nextop.gadget.etcd.grpc.TxnRequest getRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  cn.nextop.gadget.etcd.grpc.TxnRequestOrBuilder getRequestTxnOrBuilder();

  public cn.nextop.gadget.etcd.grpc.RequestOp.RequestCase getRequestCase();
}
