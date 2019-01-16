// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

public interface WatchCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.WatchCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key is the key to register for watching.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * range_end is the end of the range [key, range_end) to watch. If range_end is not given,
   * only the key argument is watched. If range_end is equal to '&#92;0', all keys greater than
   * or equal to the key argument are watched.
   * If the range_end is one bit larger than the given key,
   * then all keys with the prefix (the given key) will be watched.
   * </pre>
   *
   * <code>bytes range_end = 2;</code>
   */
  com.google.protobuf.ByteString getRangeEnd();

  /**
   * <pre>
   * start_revision is an optional revision to watch from (inclusive). No start_revision is "now".
   * </pre>
   *
   * <code>int64 start_revision = 3;</code>
   */
  long getStartRevision();

  /**
   * <pre>
   * progress_notify is set so that the etcd server will periodically send a WatchResponse with
   * no events to the new watcher if there are no recent events. It is useful when clients
   * wish to recover a disconnected watcher starting from a recent known revision.
   * The etcd server may decide how often it will send notifications based on current load.
   * </pre>
   *
   * <code>bool progress_notify = 4;</code>
   */
  boolean getProgressNotify();

  /**
   * <pre>
   * filters filter the events at server side before it sends back to the watcher.
   * </pre>
   *
   * <code>repeated .etcdserverpb.WatchCreateRequest.FilterType filters = 5;</code>
   */
  java.util.List<cn.nextop.gadget.etcd.grpc.WatchCreateRequest.FilterType> getFiltersList();
  /**
   * <pre>
   * filters filter the events at server side before it sends back to the watcher.
   * </pre>
   *
   * <code>repeated .etcdserverpb.WatchCreateRequest.FilterType filters = 5;</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * filters filter the events at server side before it sends back to the watcher.
   * </pre>
   *
   * <code>repeated .etcdserverpb.WatchCreateRequest.FilterType filters = 5;</code>
   */
  cn.nextop.gadget.etcd.grpc.WatchCreateRequest.FilterType getFilters(int index);
  /**
   * <pre>
   * filters filter the events at server side before it sends back to the watcher.
   * </pre>
   *
   * <code>repeated .etcdserverpb.WatchCreateRequest.FilterType filters = 5;</code>
   */
  java.util.List<java.lang.Integer>
  getFiltersValueList();
  /**
   * <pre>
   * filters filter the events at server side before it sends back to the watcher.
   * </pre>
   *
   * <code>repeated .etcdserverpb.WatchCreateRequest.FilterType filters = 5;</code>
   */
  int getFiltersValue(int index);

  /**
   * <pre>
   * If prev_kv is set, created watcher gets the previous KV before the event happens.
   * If the previous KV is already compacted, nothing will be returned.
   * </pre>
   *
   * <code>bool prev_kv = 6;</code>
   */
  boolean getPrevKv();
}
