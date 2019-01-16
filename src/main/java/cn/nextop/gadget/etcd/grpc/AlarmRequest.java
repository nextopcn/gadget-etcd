// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

/**
 * Protobuf type {@code etcdserverpb.AlarmRequest}
 */
@SuppressWarnings("all") public final class AlarmRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AlarmRequest)
    AlarmRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmRequest.newBuilder() to construct.
  private AlarmRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmRequest() {
    action_ = 0;
    memberID_ = 0L;
    alarm_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            action_ = rawValue;
            break;
          }
          case 16: {

            memberID_ = input.readUInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            alarm_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AlarmRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.nextop.gadget.etcd.grpc.AlarmRequest.class, cn.nextop.gadget.etcd.grpc.AlarmRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code etcdserverpb.AlarmRequest.AlarmAction}
   */
  public enum AlarmAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GET = 0;</code>
     */
    GET(0),
    /**
     * <code>ACTIVATE = 1;</code>
     */
    ACTIVATE(1),
    /**
     * <code>DEACTIVATE = 2;</code>
     */
    DEACTIVATE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GET = 0;</code>
     */
    public static final int GET_VALUE = 0;
    /**
     * <code>ACTIVATE = 1;</code>
     */
    public static final int ACTIVATE_VALUE = 1;
    /**
     * <code>DEACTIVATE = 2;</code>
     */
    public static final int DEACTIVATE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AlarmAction valueOf(int value) {
      return forNumber(value);
    }

    public static AlarmAction forNumber(int value) {
      switch (value) {
        case 0: return GET;
        case 1: return ACTIVATE;
        case 2: return DEACTIVATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AlarmAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AlarmAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AlarmAction>() {
            public AlarmAction findValueByNumber(int number) {
              return AlarmAction.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.AlarmRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final AlarmAction[] VALUES = values();

    public static AlarmAction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AlarmAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:etcdserverpb.AlarmRequest.AlarmAction)
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_;
  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * action is the kind of alarm request to issue. The action
   * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
   * raised alarm.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
   */
  public cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction getAction() {
    cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction result = cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.valueOf(action_);
    return result == null ? cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.UNRECOGNIZED : result;
  }

  public static final int MEMBERID_FIELD_NUMBER = 2;
  private long memberID_;
  /**
   * <pre>
   * memberID is the ID of the member associated with the alarm. If memberID is 0, the
   * alarm request covers all members.
   * </pre>
   *
   * <code>uint64 memberID = 2;</code>
   */
  public long getMemberID() {
    return memberID_;
  }

  public static final int ALARM_FIELD_NUMBER = 3;
  private int alarm_;
  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  public int getAlarmValue() {
    return alarm_;
  }
  /**
   * <pre>
   * alarm is the type of alarm to consider for this request.
   * </pre>
   *
   * <code>.etcdserverpb.AlarmType alarm = 3;</code>
   */
  public cn.nextop.gadget.etcd.grpc.AlarmType getAlarm() {
    cn.nextop.gadget.etcd.grpc.AlarmType result = cn.nextop.gadget.etcd.grpc.AlarmType.valueOf(alarm_);
    return result == null ? cn.nextop.gadget.etcd.grpc.AlarmType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (action_ != cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.GET.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (memberID_ != 0L) {
      output.writeUInt64(2, memberID_);
    }
    if (alarm_ != cn.nextop.gadget.etcd.grpc.AlarmType.NONE.getNumber()) {
      output.writeEnum(3, alarm_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.GET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (memberID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, memberID_);
    }
    if (alarm_ != cn.nextop.gadget.etcd.grpc.AlarmType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, alarm_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.nextop.gadget.etcd.grpc.AlarmRequest)) {
      return super.equals(obj);
    }
    cn.nextop.gadget.etcd.grpc.AlarmRequest other = (cn.nextop.gadget.etcd.grpc.AlarmRequest) obj;

    boolean result = true;
    result = result && action_ == other.action_;
    result = result && (getMemberID()
        == other.getMemberID());
    result = result && alarm_ == other.alarm_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + MEMBERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMemberID());
    hash = (37 * hash) + ALARM_FIELD_NUMBER;
    hash = (53 * hash) + alarm_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AlarmRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.nextop.gadget.etcd.grpc.AlarmRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.AlarmRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AlarmRequest)
      cn.nextop.gadget.etcd.grpc.AlarmRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AlarmRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.nextop.gadget.etcd.grpc.AlarmRequest.class, cn.nextop.gadget.etcd.grpc.AlarmRequest.Builder.class);
    }

    // Construct using cn.nextop.gadget.etcd.grpc.AlarmRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      action_ = 0;

      memberID_ = 0L;

      alarm_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AlarmRequest_descriptor;
    }

    public cn.nextop.gadget.etcd.grpc.AlarmRequest getDefaultInstanceForType() {
      return cn.nextop.gadget.etcd.grpc.AlarmRequest.getDefaultInstance();
    }

    public cn.nextop.gadget.etcd.grpc.AlarmRequest build() {
      cn.nextop.gadget.etcd.grpc.AlarmRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.nextop.gadget.etcd.grpc.AlarmRequest buildPartial() {
      cn.nextop.gadget.etcd.grpc.AlarmRequest result = new cn.nextop.gadget.etcd.grpc.AlarmRequest(this);
      result.action_ = action_;
      result.memberID_ = memberID_;
      result.alarm_ = alarm_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.nextop.gadget.etcd.grpc.AlarmRequest) {
        return mergeFrom((cn.nextop.gadget.etcd.grpc.AlarmRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.nextop.gadget.etcd.grpc.AlarmRequest other) {
      if (other == cn.nextop.gadget.etcd.grpc.AlarmRequest.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (other.getMemberID() != 0L) {
        setMemberID(other.getMemberID());
      }
      if (other.alarm_ != 0) {
        setAlarmValue(other.getAlarmValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.nextop.gadget.etcd.grpc.AlarmRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.nextop.gadget.etcd.grpc.AlarmRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int action_ = 0;
    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder setActionValue(int value) {
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction getAction() {
      cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction result = cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.valueOf(action_);
      return result == null ? cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder setAction(cn.nextop.gadget.etcd.grpc.AlarmRequest.AlarmAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * action is the kind of alarm request to issue. The action
     * may GET alarm statuses, ACTIVATE an alarm, or DEACTIVATE a
     * raised alarm.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmRequest.AlarmAction action = 1;</code>
     */
    public Builder clearAction() {
      
      action_ = 0;
      onChanged();
      return this;
    }

    private long memberID_ ;
    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public long getMemberID() {
      return memberID_;
    }
    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public Builder setMemberID(long value) {
      
      memberID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * memberID is the ID of the member associated with the alarm. If memberID is 0, the
     * alarm request covers all members.
     * </pre>
     *
     * <code>uint64 memberID = 2;</code>
     */
    public Builder clearMemberID() {
      
      memberID_ = 0L;
      onChanged();
      return this;
    }

    private int alarm_ = 0;
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public int getAlarmValue() {
      return alarm_;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public Builder setAlarmValue(int value) {
      alarm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public cn.nextop.gadget.etcd.grpc.AlarmType getAlarm() {
      cn.nextop.gadget.etcd.grpc.AlarmType result = cn.nextop.gadget.etcd.grpc.AlarmType.valueOf(alarm_);
      return result == null ? cn.nextop.gadget.etcd.grpc.AlarmType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public Builder setAlarm(cn.nextop.gadget.etcd.grpc.AlarmType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      alarm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * alarm is the type of alarm to consider for this request.
     * </pre>
     *
     * <code>.etcdserverpb.AlarmType alarm = 3;</code>
     */
    public Builder clearAlarm() {
      
      alarm_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AlarmRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AlarmRequest)
  private static final cn.nextop.gadget.etcd.grpc.AlarmRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.nextop.gadget.etcd.grpc.AlarmRequest();
  }

  public static cn.nextop.gadget.etcd.grpc.AlarmRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmRequest>
      PARSER = new com.google.protobuf.AbstractParser<AlarmRequest>() {
    public AlarmRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmRequest> getParserForType() {
    return PARSER;
  }

  public cn.nextop.gadget.etcd.grpc.AlarmRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

