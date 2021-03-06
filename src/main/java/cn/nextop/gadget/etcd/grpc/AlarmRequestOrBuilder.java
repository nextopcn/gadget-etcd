// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

public interface AlarmRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AlarmRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  int getActionValue();
  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction getAction();

  /**
   * <pre>
   * memberID is the ID of the member associated with the alarm. If memberID is 0, the
   * alarm request covers all members.
   * </pre>
   *
   * <code>uint64 memberID = 2;</code>
   */
  long getMemberID();

  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  int getAlarmValue();
  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  cn.nextop.gadget.etcd.grpc.AlarmType getAlarm();
}
