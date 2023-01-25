// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekSelectAvatarRsp.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekSelectAvatarRspOuterClass {
  private HideAndSeekSelectAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekSelectAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekSelectAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatarId = 10;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum KJBOGLIBPCI {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5364;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code HideAndSeekSelectAvatarRsp}
   */
  public static final class HideAndSeekSelectAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekSelectAvatarRsp)
      HideAndSeekSelectAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekSelectAvatarRsp.newBuilder() to construct.
    private HideAndSeekSelectAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekSelectAvatarRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekSelectAvatarRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HideAndSeekSelectAvatarRsp(
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
            case 80: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.internal_static_HideAndSeekSelectAvatarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.internal_static_HideAndSeekSelectAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.class, emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.Builder.class);
    }

    public static final int AVATARID_FIELD_NUMBER = 10;
    private int avatarId_;
    /**
     * <code>uint32 avatarId = 10;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(10, avatarId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, avatarId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp other = (emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp prototype) {
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
     *enum KJBOGLIBPCI {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5364;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code HideAndSeekSelectAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekSelectAvatarRsp)
        emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.internal_static_HideAndSeekSelectAvatarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.internal_static_HideAndSeekSelectAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.class, emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.newBuilder()
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
        avatarId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.internal_static_HideAndSeekSelectAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp build() {
        emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp buildPartial() {
        emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp result = new emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp(this);
        result.avatarId_ = avatarId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp other) {
        if (other == emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 10;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 10;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekSelectAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekSelectAvatarRsp)
    private static final emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp();
    }

    public static emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekSelectAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekSelectAvatarRsp>() {
      @java.lang.Override
      public HideAndSeekSelectAvatarRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekSelectAvatarRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekSelectAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekSelectAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HideAndSeekSelectAvatarRspOuterClass.HideAndSeekSelectAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekSelectAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekSelectAvatarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HideAndSeekSelectAvatarRsp.proto\"?\n\032Hi" +
      "deAndSeekSelectAvatarRsp\022\020\n\010avatarId\030\n \001" +
      "(\r\022\017\n\007retcode\030\016 \001(\005B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekSelectAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekSelectAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekSelectAvatarRsp_descriptor,
        new java.lang.String[] { "AvatarId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
