// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomChestCreateNotify.proto

package emu.grasscutter.net.proto;

public final class BlossomChestCreateNotifyOuterClass {
  private BlossomChestCreateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomChestCreateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomChestCreateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 circleCampId = 9;</code>
     * @return The circleCampId.
     */
    int getCircleCampId();

    /**
     * <code>uint32 refreshId = 1;</code>
     * @return The refreshId.
     */
    int getRefreshId();
  }
  /**
   * <pre>
   *enum EMNMLFHOMFG {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 2774;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code BlossomChestCreateNotify}
   */
  public static final class BlossomChestCreateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomChestCreateNotify)
      BlossomChestCreateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomChestCreateNotify.newBuilder() to construct.
    private BlossomChestCreateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomChestCreateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomChestCreateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlossomChestCreateNotify(
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
            case 8: {

              refreshId_ = input.readUInt32();
              break;
            }
            case 72: {

              circleCampId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.class, emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.Builder.class);
    }

    public static final int CIRCLECAMPID_FIELD_NUMBER = 9;
    private int circleCampId_;
    /**
     * <code>uint32 circleCampId = 9;</code>
     * @return The circleCampId.
     */
    @java.lang.Override
    public int getCircleCampId() {
      return circleCampId_;
    }

    public static final int REFRESHID_FIELD_NUMBER = 1;
    private int refreshId_;
    /**
     * <code>uint32 refreshId = 1;</code>
     * @return The refreshId.
     */
    @java.lang.Override
    public int getRefreshId() {
      return refreshId_;
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
      if (refreshId_ != 0) {
        output.writeUInt32(1, refreshId_);
      }
      if (circleCampId_ != 0) {
        output.writeUInt32(9, circleCampId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, refreshId_);
      }
      if (circleCampId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, circleCampId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify other = (emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify) obj;

      if (getCircleCampId()
          != other.getCircleCampId()) return false;
      if (getRefreshId()
          != other.getRefreshId()) return false;
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
      hash = (37 * hash) + CIRCLECAMPID_FIELD_NUMBER;
      hash = (53 * hash) + getCircleCampId();
      hash = (37 * hash) + REFRESHID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify prototype) {
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
     *enum EMNMLFHOMFG {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 2774;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code BlossomChestCreateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomChestCreateNotify)
        emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.class, emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.newBuilder()
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
        circleCampId_ = 0;

        refreshId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify build() {
        emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify buildPartial() {
        emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify result = new emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify(this);
        result.circleCampId_ = circleCampId_;
        result.refreshId_ = refreshId_;
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
        if (other instanceof emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify other) {
        if (other == emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.getDefaultInstance()) return this;
        if (other.getCircleCampId() != 0) {
          setCircleCampId(other.getCircleCampId());
        }
        if (other.getRefreshId() != 0) {
          setRefreshId(other.getRefreshId());
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
        emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int circleCampId_ ;
      /**
       * <code>uint32 circleCampId = 9;</code>
       * @return The circleCampId.
       */
      @java.lang.Override
      public int getCircleCampId() {
        return circleCampId_;
      }
      /**
       * <code>uint32 circleCampId = 9;</code>
       * @param value The circleCampId to set.
       * @return This builder for chaining.
       */
      public Builder setCircleCampId(int value) {
        
        circleCampId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 circleCampId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCircleCampId() {
        
        circleCampId_ = 0;
        onChanged();
        return this;
      }

      private int refreshId_ ;
      /**
       * <code>uint32 refreshId = 1;</code>
       * @return The refreshId.
       */
      @java.lang.Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refreshId = 1;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {
        
        refreshId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refreshId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshId() {
        
        refreshId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlossomChestCreateNotify)
    }

    // @@protoc_insertion_point(class_scope:BlossomChestCreateNotify)
    private static final emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify();
    }

    public static emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomChestCreateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BlossomChestCreateNotify>() {
      @java.lang.Override
      public BlossomChestCreateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlossomChestCreateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlossomChestCreateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomChestCreateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomChestCreateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomChestCreateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BlossomChestCreateNotify.proto\"C\n\030Blos" +
      "somChestCreateNotify\022\024\n\014circleCampId\030\t \001" +
      "(\r\022\021\n\trefreshId\030\001 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlossomChestCreateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomChestCreateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomChestCreateNotify_descriptor,
        new java.lang.String[] { "CircleCampId", "RefreshId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
