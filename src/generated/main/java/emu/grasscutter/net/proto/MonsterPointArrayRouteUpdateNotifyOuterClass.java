// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterPointArrayRouteUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class MonsterPointArrayRouteUpdateNotifyOuterClass {
  private MonsterPointArrayRouteUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterPointArrayRouteUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterPointArrayRouteUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     * @return Whether the monsterRoute field is set.
     */
    boolean hasMonsterRoute();
    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     * @return The monsterRoute.
     */
    emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute getMonsterRoute();
    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     */
    emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 3307
   * Name: LCONNAKDFLI
   * </pre>
   *
   * Protobuf type {@code MonsterPointArrayRouteUpdateNotify}
   */
  public static final class MonsterPointArrayRouteUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterPointArrayRouteUpdateNotify)
      MonsterPointArrayRouteUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterPointArrayRouteUpdateNotify.newBuilder() to construct.
    private MonsterPointArrayRouteUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterPointArrayRouteUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterPointArrayRouteUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterPointArrayRouteUpdateNotify(
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
            case 48: {

              entityId_ = input.readUInt32();
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder subBuilder = null;
              if (monsterRoute_ != null) {
                subBuilder = monsterRoute_.toBuilder();
              }
              monsterRoute_ = input.readMessage(emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(monsterRoute_);
                monsterRoute_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.class, emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 6;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int MONSTER_ROUTE_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute monsterRoute_;
    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     * @return Whether the monsterRoute field is set.
     */
    @java.lang.Override
    public boolean hasMonsterRoute() {
      return monsterRoute_ != null;
    }
    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     * @return The monsterRoute.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
      return monsterRoute_ == null ? emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
    }
    /**
     * <code>.MonsterRoute monster_route = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
      return getMonsterRoute();
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
      if (entityId_ != 0) {
        output.writeUInt32(6, entityId_);
      }
      if (monsterRoute_ != null) {
        output.writeMessage(10, getMonsterRoute());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, entityId_);
      }
      if (monsterRoute_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getMonsterRoute());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify other = (emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasMonsterRoute() != other.hasMonsterRoute()) return false;
      if (hasMonsterRoute()) {
        if (!getMonsterRoute()
            .equals(other.getMonsterRoute())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasMonsterRoute()) {
        hash = (37 * hash) + MONSTER_ROUTE_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterRoute().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify prototype) {
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
     * CmdId: 3307
     * Name: LCONNAKDFLI
     * </pre>
     *
     * Protobuf type {@code MonsterPointArrayRouteUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterPointArrayRouteUpdateNotify)
        emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.class, emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.newBuilder()
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
        entityId_ = 0;

        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = null;
        } else {
          monsterRoute_ = null;
          monsterRouteBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify build() {
        emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify result = new emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify(this);
        result.entityId_ = entityId_;
        if (monsterRouteBuilder_ == null) {
          result.monsterRoute_ = monsterRoute_;
        } else {
          result.monsterRoute_ = monsterRouteBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasMonsterRoute()) {
          mergeMonsterRoute(other.getMonsterRoute());
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
        emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute monsterRoute_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder> monsterRouteBuilder_;
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       * @return Whether the monsterRoute field is set.
       */
      public boolean hasMonsterRoute() {
        return monsterRouteBuilder_ != null || monsterRoute_ != null;
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       * @return The monsterRoute.
       */
      public emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute getMonsterRoute() {
        if (monsterRouteBuilder_ == null) {
          return monsterRoute_ == null ? emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
        } else {
          return monsterRouteBuilder_.getMessage();
        }
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public Builder setMonsterRoute(emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute value) {
        if (monsterRouteBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          monsterRoute_ = value;
          onChanged();
        } else {
          monsterRouteBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public Builder setMonsterRoute(
          emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder builderForValue) {
        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = builderForValue.build();
          onChanged();
        } else {
          monsterRouteBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public Builder mergeMonsterRoute(emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute value) {
        if (monsterRouteBuilder_ == null) {
          if (monsterRoute_ != null) {
            monsterRoute_ =
              emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.newBuilder(monsterRoute_).mergeFrom(value).buildPartial();
          } else {
            monsterRoute_ = value;
          }
          onChanged();
        } else {
          monsterRouteBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public Builder clearMonsterRoute() {
        if (monsterRouteBuilder_ == null) {
          monsterRoute_ = null;
          onChanged();
        } else {
          monsterRoute_ = null;
          monsterRouteBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder getMonsterRouteBuilder() {
        
        onChanged();
        return getMonsterRouteFieldBuilder().getBuilder();
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      public emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder getMonsterRouteOrBuilder() {
        if (monsterRouteBuilder_ != null) {
          return monsterRouteBuilder_.getMessageOrBuilder();
        } else {
          return monsterRoute_ == null ?
              emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.getDefaultInstance() : monsterRoute_;
        }
      }
      /**
       * <code>.MonsterRoute monster_route = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder> 
          getMonsterRouteFieldBuilder() {
        if (monsterRouteBuilder_ == null) {
          monsterRouteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRoute.Builder, emu.grasscutter.net.proto.MonsterRouteOuterClass.MonsterRouteOrBuilder>(
                  getMonsterRoute(),
                  getParentForChildren(),
                  isClean());
          monsterRoute_ = null;
        }
        return monsterRouteBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MonsterPointArrayRouteUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:MonsterPointArrayRouteUpdateNotify)
    private static final emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify();
    }

    public static emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<MonsterPointArrayRouteUpdateNotify>() {
      @java.lang.Override
      public MonsterPointArrayRouteUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterPointArrayRouteUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterPointArrayRouteUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterPointArrayRouteUpdateNotifyOuterClass.MonsterPointArrayRouteUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterPointArrayRouteUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(MonsterPointArrayRouteUpdateNotify.pro" +
      "to\032\022MonsterRoute.proto\"]\n\"MonsterPointAr" +
      "rayRouteUpdateNotify\022\021\n\tentity_id\030\006 \001(\r\022" +
      "$\n\rmonster_route\030\n \001(\0132\r.MonsterRouteB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MonsterRouteOuterClass.getDescriptor(),
        });
    internal_static_MonsterPointArrayRouteUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterPointArrayRouteUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterPointArrayRouteUpdateNotify_descriptor,
        new java.lang.String[] { "EntityId", "MonsterRoute", });
    emu.grasscutter.net.proto.MonsterRouteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
