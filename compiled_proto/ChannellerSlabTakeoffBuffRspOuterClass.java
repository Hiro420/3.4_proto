// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabTakeoffBuffRsp.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabTakeoffBuffRspOuterClass {
  private ChannellerSlabTakeoffBuffRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabTakeoffBuffRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabTakeoffBuffRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 slotId = 2;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>bool fhableimdgl = 6;</code>
     * @return The fhableimdgl.
     */
    boolean getFhableimdgl();

    /**
     * <code>uint32 buffId = 14;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum IPFMOHKHPPK {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8646;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabTakeoffBuffRsp}
   */
  public static final class ChannellerSlabTakeoffBuffRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannellerSlabTakeoffBuffRsp)
      ChannellerSlabTakeoffBuffRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabTakeoffBuffRsp.newBuilder() to construct.
    private ChannellerSlabTakeoffBuffRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabTakeoffBuffRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabTakeoffBuffRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannellerSlabTakeoffBuffRsp(
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
            case 16: {

              slotId_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              fhableimdgl_ = input.readBool();
              break;
            }
            case 112: {

              buffId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.internal_static_ChannellerSlabTakeoffBuffRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.internal_static_ChannellerSlabTakeoffBuffRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.class, emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.Builder.class);
    }

    public static final int SLOTID_FIELD_NUMBER = 2;
    private int slotId_;
    /**
     * <code>uint32 slotId = 2;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int FHABLEIMDGL_FIELD_NUMBER = 6;
    private boolean fhableimdgl_;
    /**
     * <code>bool fhableimdgl = 6;</code>
     * @return The fhableimdgl.
     */
    @java.lang.Override
    public boolean getFhableimdgl() {
      return fhableimdgl_;
    }

    public static final int BUFFID_FIELD_NUMBER = 14;
    private int buffId_;
    /**
     * <code>uint32 buffId = 14;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
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
      if (slotId_ != 0) {
        output.writeUInt32(2, slotId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (fhableimdgl_ != false) {
        output.writeBool(6, fhableimdgl_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(14, buffId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, slotId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (fhableimdgl_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, fhableimdgl_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, buffId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp other = (emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp) obj;

      if (getSlotId()
          != other.getSlotId()) return false;
      if (getFhableimdgl()
          != other.getFhableimdgl()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
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
      hash = (37 * hash) + SLOTID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + FHABLEIMDGL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFhableimdgl());
      hash = (37 * hash) + BUFFID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp prototype) {
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
     *enum IPFMOHKHPPK {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8646;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabTakeoffBuffRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabTakeoffBuffRsp)
        emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.internal_static_ChannellerSlabTakeoffBuffRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.internal_static_ChannellerSlabTakeoffBuffRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.class, emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.newBuilder()
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
        slotId_ = 0;

        fhableimdgl_ = false;

        buffId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.internal_static_ChannellerSlabTakeoffBuffRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp build() {
        emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp result = new emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp(this);
        result.slotId_ = slotId_;
        result.fhableimdgl_ = fhableimdgl_;
        result.buffId_ = buffId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp.getDefaultInstance()) return this;
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (other.getFhableimdgl() != false) {
          setFhableimdgl(other.getFhableimdgl());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
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
        emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slotId = 2;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slotId = 2;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slotId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private boolean fhableimdgl_ ;
      /**
       * <code>bool fhableimdgl = 6;</code>
       * @return The fhableimdgl.
       */
      @java.lang.Override
      public boolean getFhableimdgl() {
        return fhableimdgl_;
      }
      /**
       * <code>bool fhableimdgl = 6;</code>
       * @param value The fhableimdgl to set.
       * @return This builder for chaining.
       */
      public Builder setFhableimdgl(boolean value) {
        
        fhableimdgl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool fhableimdgl = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFhableimdgl() {
        
        fhableimdgl_ = false;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buffId = 14;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buffId = 14;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buffId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:ChannellerSlabTakeoffBuffRsp)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabTakeoffBuffRsp)
    private static final emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabTakeoffBuffRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabTakeoffBuffRsp>() {
      @java.lang.Override
      public ChannellerSlabTakeoffBuffRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannellerSlabTakeoffBuffRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannellerSlabTakeoffBuffRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabTakeoffBuffRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannellerSlabTakeoffBuffRspOuterClass.ChannellerSlabTakeoffBuffRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabTakeoffBuffRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabTakeoffBuffRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ChannellerSlabTakeoffBuffRsp.proto\"d\n\034" +
      "ChannellerSlabTakeoffBuffRsp\022\016\n\006slotId\030\002" +
      " \001(\r\022\023\n\013fhableimdgl\030\006 \001(\010\022\016\n\006buffId\030\016 \001(" +
      "\r\022\017\n\007retcode\030\003 \001(\005B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannellerSlabTakeoffBuffRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabTakeoffBuffRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabTakeoffBuffRsp_descriptor,
        new java.lang.String[] { "SlotId", "Fhableimdgl", "BuffId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
