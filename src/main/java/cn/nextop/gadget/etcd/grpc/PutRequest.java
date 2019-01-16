// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

/**
 * Protobuf type {@code etcdserverpb.PutRequest}
 */
@SuppressWarnings("all") public final class PutRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.PutRequest)
    PutRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PutRequest.newBuilder() to construct.
  private PutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PutRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    lease_ = 0L;
    prevKv_ = false;
    ignoreValue_ = false;
    ignoreLease_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PutRequest(
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
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 18: {

            value_ = input.readBytes();
            break;
          }
          case 24: {

            lease_ = input.readInt64();
            break;
          }
          case 32: {

            prevKv_ = input.readBool();
            break;
          }
          case 40: {

            ignoreValue_ = input.readBool();
            break;
          }
          case 48: {

            ignoreLease_ = input.readBool();
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
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_PutRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_PutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.nextop.gadget.etcd.grpc.PutRequest.class, cn.nextop.gadget.etcd.grpc.PutRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * key is the key, in bytes, to put into the key-value store.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * value is the value, in bytes, to associate with the key in the key-value store.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int LEASE_FIELD_NUMBER = 3;
  private long lease_;
  /**
   * <pre>
   * lease is the lease ID to associate with the key in the key-value store. A lease
   * value of 0 indicates no lease.
   * </pre>
   *
   * <code>int64 lease = 3;</code>
   */
  public long getLease() {
    return lease_;
  }

  public static final int PREV_KV_FIELD_NUMBER = 4;
  private boolean prevKv_;
  /**
   * <pre>
   * If prev_kv is set, etcd gets the previous key-value pair before changing it.
   * The previous key-value pair will be returned in the put response.
   * </pre>
   *
   * <code>bool prev_kv = 4;</code>
   */
  public boolean getPrevKv() {
    return prevKv_;
  }

  public static final int IGNORE_VALUE_FIELD_NUMBER = 5;
  private boolean ignoreValue_;
  /**
   * <pre>
   * If ignore_value is set, etcd updates the key using its current value.
   * Returns an error if the key does not exist.
   * </pre>
   *
   * <code>bool ignore_value = 5;</code>
   */
  public boolean getIgnoreValue() {
    return ignoreValue_;
  }

  public static final int IGNORE_LEASE_FIELD_NUMBER = 6;
  private boolean ignoreLease_;
  /**
   * <pre>
   * If ignore_lease is set, etcd updates the key using its current lease.
   * Returns an error if the key does not exist.
   * </pre>
   *
   * <code>bool ignore_lease = 6;</code>
   */
  public boolean getIgnoreLease() {
    return ignoreLease_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    if (lease_ != 0L) {
      output.writeInt64(3, lease_);
    }
    if (prevKv_ != false) {
      output.writeBool(4, prevKv_);
    }
    if (ignoreValue_ != false) {
      output.writeBool(5, ignoreValue_);
    }
    if (ignoreLease_ != false) {
      output.writeBool(6, ignoreLease_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, value_);
    }
    if (lease_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lease_);
    }
    if (prevKv_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, prevKv_);
    }
    if (ignoreValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ignoreValue_);
    }
    if (ignoreLease_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, ignoreLease_);
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
    if (!(obj instanceof cn.nextop.gadget.etcd.grpc.PutRequest)) {
      return super.equals(obj);
    }
    cn.nextop.gadget.etcd.grpc.PutRequest other = (cn.nextop.gadget.etcd.grpc.PutRequest) obj;

    boolean result = true;
    result = result && getKey()
        .equals(other.getKey());
    result = result && getValue()
        .equals(other.getValue());
    result = result && (getLease()
        == other.getLease());
    result = result && (getPrevKv()
        == other.getPrevKv());
    result = result && (getIgnoreValue()
        == other.getIgnoreValue());
    result = result && (getIgnoreLease()
        == other.getIgnoreLease());
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + LEASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLease());
    hash = (37 * hash) + PREV_KV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrevKv());
    hash = (37 * hash) + IGNORE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreValue());
    hash = (37 * hash) + IGNORE_LEASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreLease());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.PutRequest parseFrom(
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
  public static Builder newBuilder(cn.nextop.gadget.etcd.grpc.PutRequest prototype) {
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
   * Protobuf type {@code etcdserverpb.PutRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.PutRequest)
      cn.nextop.gadget.etcd.grpc.PutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_PutRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_PutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.nextop.gadget.etcd.grpc.PutRequest.class, cn.nextop.gadget.etcd.grpc.PutRequest.Builder.class);
    }

    // Construct using cn.nextop.gadget.etcd.grpc.PutRequest.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;

      value_ = com.google.protobuf.ByteString.EMPTY;

      lease_ = 0L;

      prevKv_ = false;

      ignoreValue_ = false;

      ignoreLease_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_PutRequest_descriptor;
    }

    public cn.nextop.gadget.etcd.grpc.PutRequest getDefaultInstanceForType() {
      return cn.nextop.gadget.etcd.grpc.PutRequest.getDefaultInstance();
    }

    public cn.nextop.gadget.etcd.grpc.PutRequest build() {
      cn.nextop.gadget.etcd.grpc.PutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.nextop.gadget.etcd.grpc.PutRequest buildPartial() {
      cn.nextop.gadget.etcd.grpc.PutRequest result = new cn.nextop.gadget.etcd.grpc.PutRequest(this);
      result.key_ = key_;
      result.value_ = value_;
      result.lease_ = lease_;
      result.prevKv_ = prevKv_;
      result.ignoreValue_ = ignoreValue_;
      result.ignoreLease_ = ignoreLease_;
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
      if (other instanceof cn.nextop.gadget.etcd.grpc.PutRequest) {
        return mergeFrom((cn.nextop.gadget.etcd.grpc.PutRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.nextop.gadget.etcd.grpc.PutRequest other) {
      if (other == cn.nextop.gadget.etcd.grpc.PutRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getLease() != 0L) {
        setLease(other.getLease());
      }
      if (other.getPrevKv() != false) {
        setPrevKv(other.getPrevKv());
      }
      if (other.getIgnoreValue() != false) {
        setIgnoreValue(other.getIgnoreValue());
      }
      if (other.getIgnoreLease() != false) {
        setIgnoreLease(other.getIgnoreLease());
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
      cn.nextop.gadget.etcd.grpc.PutRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.nextop.gadget.etcd.grpc.PutRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is the key, in bytes, to put into the key-value store.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is the key, in bytes, to put into the key-value store.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is the key, in bytes, to put into the key-value store.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * value is the value, in bytes, to associate with the key in the key-value store.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * value is the value, in bytes, to associate with the key in the key-value store.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value is the value, in bytes, to associate with the key in the key-value store.
     * </pre>
     *
     * <code>bytes value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private long lease_ ;
    /**
     * <pre>
     * lease is the lease ID to associate with the key in the key-value store. A lease
     * value of 0 indicates no lease.
     * </pre>
     *
     * <code>int64 lease = 3;</code>
     */
    public long getLease() {
      return lease_;
    }
    /**
     * <pre>
     * lease is the lease ID to associate with the key in the key-value store. A lease
     * value of 0 indicates no lease.
     * </pre>
     *
     * <code>int64 lease = 3;</code>
     */
    public Builder setLease(long value) {
      
      lease_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * lease is the lease ID to associate with the key in the key-value store. A lease
     * value of 0 indicates no lease.
     * </pre>
     *
     * <code>int64 lease = 3;</code>
     */
    public Builder clearLease() {
      
      lease_ = 0L;
      onChanged();
      return this;
    }

    private boolean prevKv_ ;
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pair before changing it.
     * The previous key-value pair will be returned in the put response.
     * </pre>
     *
     * <code>bool prev_kv = 4;</code>
     */
    public boolean getPrevKv() {
      return prevKv_;
    }
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pair before changing it.
     * The previous key-value pair will be returned in the put response.
     * </pre>
     *
     * <code>bool prev_kv = 4;</code>
     */
    public Builder setPrevKv(boolean value) {
      
      prevKv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pair before changing it.
     * The previous key-value pair will be returned in the put response.
     * </pre>
     *
     * <code>bool prev_kv = 4;</code>
     */
    public Builder clearPrevKv() {
      
      prevKv_ = false;
      onChanged();
      return this;
    }

    private boolean ignoreValue_ ;
    /**
     * <pre>
     * If ignore_value is set, etcd updates the key using its current value.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_value = 5;</code>
     */
    public boolean getIgnoreValue() {
      return ignoreValue_;
    }
    /**
     * <pre>
     * If ignore_value is set, etcd updates the key using its current value.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_value = 5;</code>
     */
    public Builder setIgnoreValue(boolean value) {
      
      ignoreValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If ignore_value is set, etcd updates the key using its current value.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_value = 5;</code>
     */
    public Builder clearIgnoreValue() {
      
      ignoreValue_ = false;
      onChanged();
      return this;
    }

    private boolean ignoreLease_ ;
    /**
     * <pre>
     * If ignore_lease is set, etcd updates the key using its current lease.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_lease = 6;</code>
     */
    public boolean getIgnoreLease() {
      return ignoreLease_;
    }
    /**
     * <pre>
     * If ignore_lease is set, etcd updates the key using its current lease.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_lease = 6;</code>
     */
    public Builder setIgnoreLease(boolean value) {
      
      ignoreLease_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If ignore_lease is set, etcd updates the key using its current lease.
     * Returns an error if the key does not exist.
     * </pre>
     *
     * <code>bool ignore_lease = 6;</code>
     */
    public Builder clearIgnoreLease() {
      
      ignoreLease_ = false;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.PutRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.PutRequest)
  private static final cn.nextop.gadget.etcd.grpc.PutRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.nextop.gadget.etcd.grpc.PutRequest();
  }

  public static cn.nextop.gadget.etcd.grpc.PutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutRequest>
      PARSER = new com.google.protobuf.AbstractParser<PutRequest>() {
    public PutRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PutRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutRequest> getParserForType() {
    return PARSER;
  }

  public cn.nextop.gadget.etcd.grpc.PutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

