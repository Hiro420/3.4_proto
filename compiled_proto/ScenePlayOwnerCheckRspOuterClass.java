// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayOwnerCheckRsp.proto

package emu.grasscutter.net.proto;

public final class ScenePlayOwnerCheckRspOuterClass {
  private ScenePlayOwnerCheckRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayOwnerCheckRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayOwnerCheckRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);

    /**
     * <code>bool isSkipMatch = 7;</code>
     * @return The isSkipMatch.
     */
    boolean getIsSkipMatch();

    /**
     * <code>uint32 playId = 8;</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>uint32 wrongUid = 6;</code>
     * @return The wrongUid.
     */
    int getWrongUid();
  }
  /**
   * <pre>
   *enum LFJEPKAIKOD {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4437;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ScenePlayOwnerCheckRsp}
   */
  public static final class ScenePlayOwnerCheckRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayOwnerCheckRsp)
      ScenePlayOwnerCheckRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayOwnerCheckRsp.newBuilder() to construct.
    private ScenePlayOwnerCheckRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayOwnerCheckRsp() {
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayOwnerCheckRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayOwnerCheckRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              wrongUid_ = input.readUInt32();
              break;
            }
            case 56: {

              isSkipMatch_ = input.readBool();
              break;
            }
            case 64: {

              playId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.class, emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PARAMLIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 paramList = 14;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int ISSKIPMATCH_FIELD_NUMBER = 7;
    private boolean isSkipMatch_;
    /**
     * <code>bool isSkipMatch = 7;</code>
     * @return The isSkipMatch.
     */
    @java.lang.Override
    public boolean getIsSkipMatch() {
      return isSkipMatch_;
    }

    public static final int PLAYID_FIELD_NUMBER = 8;
    private int playId_;
    /**
     * <code>uint32 playId = 8;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static final int WRONGUID_FIELD_NUMBER = 6;
    private int wrongUid_;
    /**
     * <code>uint32 wrongUid = 6;</code>
     * @return The wrongUid.
     */
    @java.lang.Override
    public int getWrongUid() {
      return wrongUid_;
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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (wrongUid_ != 0) {
        output.writeUInt32(6, wrongUid_);
      }
      if (isSkipMatch_ != false) {
        output.writeBool(7, isSkipMatch_);
      }
      if (playId_ != 0) {
        output.writeUInt32(8, playId_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (wrongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, wrongUid_);
      }
      if (isSkipMatch_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isSkipMatch_);
      }
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, playId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp other = (emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getIsSkipMatch()
          != other.getIsSkipMatch()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
      if (getWrongUid()
          != other.getWrongUid()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAMLIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + ISSKIPMATCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSkipMatch());
      hash = (37 * hash) + PLAYID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (37 * hash) + WRONGUID_FIELD_NUMBER;
      hash = (53 * hash) + getWrongUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp prototype) {
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
     *enum LFJEPKAIKOD {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4437;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ScenePlayOwnerCheckRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayOwnerCheckRsp)
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.class, emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.newBuilder()
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
        retcode_ = 0;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isSkipMatch_ = false;

        playId_ = 0;

        wrongUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.internal_static_ScenePlayOwnerCheckRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp build() {
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp buildPartial() {
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp result = new emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
        result.isSkipMatch_ = isSkipMatch_;
        result.playId_ = playId_;
        result.wrongUid_ = wrongUid_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp other) {
        if (other == emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getIsSkipMatch() != false) {
          setIsSkipMatch(other.getIsSkipMatch());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
        }
        if (other.getWrongUid() != 0) {
          setWrongUid(other.getWrongUid());
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
        emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 paramList = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isSkipMatch_ ;
      /**
       * <code>bool isSkipMatch = 7;</code>
       * @return The isSkipMatch.
       */
      @java.lang.Override
      public boolean getIsSkipMatch() {
        return isSkipMatch_;
      }
      /**
       * <code>bool isSkipMatch = 7;</code>
       * @param value The isSkipMatch to set.
       * @return This builder for chaining.
       */
      public Builder setIsSkipMatch(boolean value) {
        
        isSkipMatch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSkipMatch = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSkipMatch() {
        
        isSkipMatch_ = false;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 playId = 8;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 playId = 8;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
        return this;
      }

      private int wrongUid_ ;
      /**
       * <code>uint32 wrongUid = 6;</code>
       * @return The wrongUid.
       */
      @java.lang.Override
      public int getWrongUid() {
        return wrongUid_;
      }
      /**
       * <code>uint32 wrongUid = 6;</code>
       * @param value The wrongUid to set.
       * @return This builder for chaining.
       */
      public Builder setWrongUid(int value) {
        
        wrongUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wrongUid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearWrongUid() {
        
        wrongUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayOwnerCheckRsp)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayOwnerCheckRsp)
    private static final emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp();
    }

    public static emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayOwnerCheckRsp>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayOwnerCheckRsp>() {
      @java.lang.Override
      public ScenePlayOwnerCheckRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayOwnerCheckRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayOwnerCheckRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayOwnerCheckRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayOwnerCheckRspOuterClass.ScenePlayOwnerCheckRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayOwnerCheckRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ScenePlayOwnerCheckRsp.proto\"s\n\026SceneP" +
      "layOwnerCheckRsp\022\017\n\007retcode\030\005 \001(\005\022\021\n\tpar" +
      "amList\030\016 \003(\r\022\023\n\013isSkipMatch\030\007 \001(\010\022\016\n\006pla" +
      "yId\030\010 \001(\r\022\020\n\010wrongUid\030\006 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayOwnerCheckRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayOwnerCheckRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayOwnerCheckRsp_descriptor,
        new java.lang.String[] { "Retcode", "ParamList", "IsSkipMatch", "PlayId", "WrongUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
