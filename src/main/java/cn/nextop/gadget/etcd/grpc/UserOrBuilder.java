// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package cn.nextop.gadget.etcd.grpc;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authpb.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes name = 1;</code>
   */
  com.google.protobuf.ByteString getName();

  /**
   * <code>bytes password = 2;</code>
   */
  com.google.protobuf.ByteString getPassword();

  /**
   * <code>repeated string roles = 3;</code>
   */
  java.util.List<java.lang.String>
      getRolesList();
  /**
   * <code>repeated string roles = 3;</code>
   */
  int getRolesCount();
  /**
   * <code>repeated string roles = 3;</code>
   */
  java.lang.String getRoles(int index);
  /**
   * <code>repeated string roles = 3;</code>
   */
  com.google.protobuf.ByteString
      getRolesBytes(int index);
}
