// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetFriendShowAvatarInfoReq.proto

package emu.grasscutter.net.proto;

public final class GetFriendShowAvatarInfoReqOuterClass {
  private GetFriendShowAvatarInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFriendShowAvatarInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFriendShowAvatarInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 4015
   * Name: CFPHGJPKKHP
   * </pre>
   *
   * Protobuf type {@code GetFriendShowAvatarInfoReq}
   */
  public static final class GetFriendShowAvatarInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFriendShowAvatarInfoReq)
      GetFriendShowAvatarInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFriendShowAvatarInfoReq.newBuilder() to construct.
    private GetFriendShowAvatarInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFriendShowAvatarInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetFriendShowAvatarInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetFriendShowAvatarInfoReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 104: {

              uid_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.internal_static_GetFriendShowAvatarInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.internal_static_GetFriendShowAvatarInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.class, emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 13;
    private int uid_;
    /**
     * <code>uint32 uid = 13;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (uid_ != 0) {
        output.writeUInt32(13, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq other = (emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 4015
     * Name: CFPHGJPKKHP
     * </pre>
     *
     * Protobuf type {@code GetFriendShowAvatarInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFriendShowAvatarInfoReq)
        emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.internal_static_GetFriendShowAvatarInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.internal_static_GetFriendShowAvatarInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.class, emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.internal_static_GetFriendShowAvatarInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq build() {
        emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq buildPartial() {
        emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq result = new emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq(this);
        result.uid_ = uid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq other) {
        if (other == emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 13;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetFriendShowAvatarInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetFriendShowAvatarInfoReq)
    private static final emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq();
    }

    public static emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFriendShowAvatarInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetFriendShowAvatarInfoReq>() {
      @java.lang.Override
      public GetFriendShowAvatarInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFriendShowAvatarInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetFriendShowAvatarInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFriendShowAvatarInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFriendShowAvatarInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFriendShowAvatarInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetFriendShowAvatarInfoReq.proto\")\n\032Ge" +
      "tFriendShowAvatarInfoReq\022\013\n\003uid\030\r \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetFriendShowAvatarInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFriendShowAvatarInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFriendShowAvatarInfoReq_descriptor,
        new java.lang.String[] { "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
