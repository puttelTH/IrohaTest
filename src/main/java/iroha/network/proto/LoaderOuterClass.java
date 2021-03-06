// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loader.proto

package iroha.network.proto;

public final class LoaderOuterClass {
  private LoaderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlocksRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:iroha.network.proto.BlocksRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 height = 1;</code>
     */
    long getHeight();
  }
  /**
   * Protobuf type {@code iroha.network.proto.BlocksRequest}
   */
  public  static final class BlocksRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:iroha.network.proto.BlocksRequest)
      BlocksRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlocksRequest.newBuilder() to construct.
    private BlocksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlocksRequest() {
      height_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlocksRequest(
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

              height_ = input.readUInt64();
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
      return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlocksRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlocksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              iroha.network.proto.LoaderOuterClass.BlocksRequest.class, iroha.network.proto.LoaderOuterClass.BlocksRequest.Builder.class);
    }

    public static final int HEIGHT_FIELD_NUMBER = 1;
    private long height_;
    /**
     * <code>uint64 height = 1;</code>
     */
    public long getHeight() {
      return height_;
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
      if (height_ != 0L) {
        output.writeUInt64(1, height_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (height_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, height_);
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
      if (!(obj instanceof iroha.network.proto.LoaderOuterClass.BlocksRequest)) {
        return super.equals(obj);
      }
      iroha.network.proto.LoaderOuterClass.BlocksRequest other = (iroha.network.proto.LoaderOuterClass.BlocksRequest) obj;

      boolean result = true;
      result = result && (getHeight()
          == other.getHeight());
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
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlocksRequest parseFrom(
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
    public static Builder newBuilder(iroha.network.proto.LoaderOuterClass.BlocksRequest prototype) {
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
     * Protobuf type {@code iroha.network.proto.BlocksRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:iroha.network.proto.BlocksRequest)
        iroha.network.proto.LoaderOuterClass.BlocksRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlocksRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlocksRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                iroha.network.proto.LoaderOuterClass.BlocksRequest.class, iroha.network.proto.LoaderOuterClass.BlocksRequest.Builder.class);
      }

      // Construct using iroha.network.proto.LoaderOuterClass.BlocksRequest.newBuilder()
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
        height_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlocksRequest_descriptor;
      }

      public iroha.network.proto.LoaderOuterClass.BlocksRequest getDefaultInstanceForType() {
        return iroha.network.proto.LoaderOuterClass.BlocksRequest.getDefaultInstance();
      }

      public iroha.network.proto.LoaderOuterClass.BlocksRequest build() {
        iroha.network.proto.LoaderOuterClass.BlocksRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public iroha.network.proto.LoaderOuterClass.BlocksRequest buildPartial() {
        iroha.network.proto.LoaderOuterClass.BlocksRequest result = new iroha.network.proto.LoaderOuterClass.BlocksRequest(this);
        result.height_ = height_;
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
        if (other instanceof iroha.network.proto.LoaderOuterClass.BlocksRequest) {
          return mergeFrom((iroha.network.proto.LoaderOuterClass.BlocksRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(iroha.network.proto.LoaderOuterClass.BlocksRequest other) {
        if (other == iroha.network.proto.LoaderOuterClass.BlocksRequest.getDefaultInstance()) return this;
        if (other.getHeight() != 0L) {
          setHeight(other.getHeight());
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
        iroha.network.proto.LoaderOuterClass.BlocksRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (iroha.network.proto.LoaderOuterClass.BlocksRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long height_ ;
      /**
       * <code>uint64 height = 1;</code>
       */
      public long getHeight() {
        return height_;
      }
      /**
       * <code>uint64 height = 1;</code>
       */
      public Builder setHeight(long value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 height = 1;</code>
       */
      public Builder clearHeight() {
        
        height_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:iroha.network.proto.BlocksRequest)
    }

    // @@protoc_insertion_point(class_scope:iroha.network.proto.BlocksRequest)
    private static final iroha.network.proto.LoaderOuterClass.BlocksRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new iroha.network.proto.LoaderOuterClass.BlocksRequest();
    }

    public static iroha.network.proto.LoaderOuterClass.BlocksRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlocksRequest>
        PARSER = new com.google.protobuf.AbstractParser<BlocksRequest>() {
      public BlocksRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlocksRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlocksRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlocksRequest> getParserForType() {
      return PARSER;
    }

    public iroha.network.proto.LoaderOuterClass.BlocksRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlockRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:iroha.network.proto.BlockRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes hash = 1;</code>
     */
    com.google.protobuf.ByteString getHash();
  }
  /**
   * Protobuf type {@code iroha.network.proto.BlockRequest}
   */
  public  static final class BlockRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:iroha.network.proto.BlockRequest)
      BlockRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockRequest.newBuilder() to construct.
    private BlockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockRequest() {
      hash_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockRequest(
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

              hash_ = input.readBytes();
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
      return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlockRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              iroha.network.proto.LoaderOuterClass.BlockRequest.class, iroha.network.proto.LoaderOuterClass.BlockRequest.Builder.class);
    }

    public static final int HASH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString hash_;
    /**
     * <code>bytes hash = 1;</code>
     */
    public com.google.protobuf.ByteString getHash() {
      return hash_;
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
      if (!hash_.isEmpty()) {
        output.writeBytes(1, hash_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!hash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, hash_);
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
      if (!(obj instanceof iroha.network.proto.LoaderOuterClass.BlockRequest)) {
        return super.equals(obj);
      }
      iroha.network.proto.LoaderOuterClass.BlockRequest other = (iroha.network.proto.LoaderOuterClass.BlockRequest) obj;

      boolean result = true;
      result = result && getHash()
          .equals(other.getHash());
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
      hash = (37 * hash) + HASH_FIELD_NUMBER;
      hash = (53 * hash) + getHash().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static iroha.network.proto.LoaderOuterClass.BlockRequest parseFrom(
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
    public static Builder newBuilder(iroha.network.proto.LoaderOuterClass.BlockRequest prototype) {
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
     * Protobuf type {@code iroha.network.proto.BlockRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:iroha.network.proto.BlockRequest)
        iroha.network.proto.LoaderOuterClass.BlockRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlockRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlockRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                iroha.network.proto.LoaderOuterClass.BlockRequest.class, iroha.network.proto.LoaderOuterClass.BlockRequest.Builder.class);
      }

      // Construct using iroha.network.proto.LoaderOuterClass.BlockRequest.newBuilder()
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
        hash_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return iroha.network.proto.LoaderOuterClass.internal_static_iroha_network_proto_BlockRequest_descriptor;
      }

      public iroha.network.proto.LoaderOuterClass.BlockRequest getDefaultInstanceForType() {
        return iroha.network.proto.LoaderOuterClass.BlockRequest.getDefaultInstance();
      }

      public iroha.network.proto.LoaderOuterClass.BlockRequest build() {
        iroha.network.proto.LoaderOuterClass.BlockRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public iroha.network.proto.LoaderOuterClass.BlockRequest buildPartial() {
        iroha.network.proto.LoaderOuterClass.BlockRequest result = new iroha.network.proto.LoaderOuterClass.BlockRequest(this);
        result.hash_ = hash_;
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
        if (other instanceof iroha.network.proto.LoaderOuterClass.BlockRequest) {
          return mergeFrom((iroha.network.proto.LoaderOuterClass.BlockRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(iroha.network.proto.LoaderOuterClass.BlockRequest other) {
        if (other == iroha.network.proto.LoaderOuterClass.BlockRequest.getDefaultInstance()) return this;
        if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
          setHash(other.getHash());
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
        iroha.network.proto.LoaderOuterClass.BlockRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (iroha.network.proto.LoaderOuterClass.BlockRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes hash = 1;</code>
       */
      public com.google.protobuf.ByteString getHash() {
        return hash_;
      }
      /**
       * <code>bytes hash = 1;</code>
       */
      public Builder setHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes hash = 1;</code>
       */
      public Builder clearHash() {
        
        hash_ = getDefaultInstance().getHash();
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


      // @@protoc_insertion_point(builder_scope:iroha.network.proto.BlockRequest)
    }

    // @@protoc_insertion_point(class_scope:iroha.network.proto.BlockRequest)
    private static final iroha.network.proto.LoaderOuterClass.BlockRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new iroha.network.proto.LoaderOuterClass.BlockRequest();
    }

    public static iroha.network.proto.LoaderOuterClass.BlockRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlockRequest>
        PARSER = new com.google.protobuf.AbstractParser<BlockRequest>() {
      public BlockRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlockRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlockRequest> getParserForType() {
      return PARSER;
    }

    public iroha.network.proto.LoaderOuterClass.BlockRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iroha_network_proto_BlocksRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_iroha_network_proto_BlocksRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iroha_network_proto_BlockRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_iroha_network_proto_BlockRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014loader.proto\022\023iroha.network.proto\032\013blo" +
      "ck.proto\"\037\n\rBlocksRequest\022\016\n\006height\030\001 \001(" +
      "\004\"\034\n\014BlockRequest\022\014\n\004hash\030\001 \001(\0142\242\001\n\006Load" +
      "er\022M\n\016retrieveBlocks\022\".iroha.network.pro" +
      "to.BlocksRequest\032\025.iroha.protocol.Block0" +
      "\001\022I\n\rretrieveBlock\022!.iroha.network.proto" +
      ".BlockRequest\032\025.iroha.protocol.Blockb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          iroha.protocol.BlockOuterClass.getDescriptor(),
        }, assigner);
    internal_static_iroha_network_proto_BlocksRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_iroha_network_proto_BlocksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_iroha_network_proto_BlocksRequest_descriptor,
        new java.lang.String[] { "Height", });
    internal_static_iroha_network_proto_BlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_iroha_network_proto_BlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_iroha_network_proto_BlockRequest_descriptor,
        new java.lang.String[] { "Hash", });
    iroha.protocol.BlockOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
