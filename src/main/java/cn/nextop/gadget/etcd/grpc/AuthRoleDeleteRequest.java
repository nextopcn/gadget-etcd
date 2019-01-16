// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

/**
 * Protobuf type {@code etcdserverpb.AuthRoleDeleteRequest}
 */
@SuppressWarnings("all") public final class AuthRoleDeleteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthRoleDeleteRequest)
    AuthRoleDeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthRoleDeleteRequest.newBuilder() to construct.
  private AuthRoleDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRoleDeleteRequest() {
    role_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthRoleDeleteRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            role_ = s;
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
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthRoleDeleteRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthRoleDeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.class, cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.Builder.class);
  }

  public static final int ROLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object role_;
  /**
   * <code>string role = 1;</code>
   */
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   * <code>string role = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getRoleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, role_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, role_);
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
    if (!(obj instanceof cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest)) {
      return super.equals(obj);
    }
    cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest other = (cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest) obj;

    boolean result = true;
    result = result && getRole()
        .equals(other.getRole());
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
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parseFrom(
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
  public static Builder newBuilder(cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest prototype) {
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
   * Protobuf type {@code etcdserverpb.AuthRoleDeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthRoleDeleteRequest)
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthRoleDeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthRoleDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.class, cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.Builder.class);
    }

    // Construct using cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.newBuilder()
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
      role_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthRoleDeleteRequest_descriptor;
    }

    public cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest getDefaultInstanceForType() {
      return cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.getDefaultInstance();
    }

    public cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest build() {
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest buildPartial() {
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest result = new cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest(this);
      result.role_ = role_;
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
      if (other instanceof cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest) {
        return mergeFrom((cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest other) {
      if (other == cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest.getDefaultInstance()) return this;
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        onChanged();
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
      cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     * <code>string role = 1;</code>
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string role = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string role = 1;</code>
     */
    public Builder setRole(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string role = 1;</code>
     */
    public Builder clearRole() {
      
      role_ = getDefaultInstance().getRole();
      onChanged();
      return this;
    }
    /**
     * <code>string role = 1;</code>
     */
    public Builder setRoleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      role_ = value;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthRoleDeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthRoleDeleteRequest)
  private static final cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest();
  }

  public static cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthRoleDeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthRoleDeleteRequest>() {
    public AuthRoleDeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthRoleDeleteRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthRoleDeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthRoleDeleteRequest> getParserForType() {
    return PARSER;
  }

  public cn.nextop.gadget.etcd.grpc.AuthRoleDeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

