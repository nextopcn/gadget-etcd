// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

public interface AuthenticateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthenticateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * token is an authorized token that can be used in succeeding RPCs
   * </pre>
   *
   * <code>string token = 2;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   * token is an authorized token that can be used in succeeding RPCs
   * </pre>
   *
   * <code>string token = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
