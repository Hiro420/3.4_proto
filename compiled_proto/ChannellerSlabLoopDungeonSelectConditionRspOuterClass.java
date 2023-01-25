// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabLoopDungeonSelectConditionRsp.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabLoopDungeonSelectConditionRspOuterClass {
  private ChannellerSlabLoopDungeonSelectConditionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabLoopDungeonSelectConditionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabLoopDungeonSelectConditionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @return A list containing the conditionIdList.
     */
    java.util.List<java.lang.Integer> getConditionIdListList();
    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @return The count of conditionIdList.
     */
    int getConditionIdListCount();
    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    int getConditionIdList(int index);

    /**
     * <code>uint32 dungeonIndex = 15;</code>
     * @return The dungeonIndex.
     */
    int getDungeonIndex();

    /**
     * <code>uint32 difficultyId = 6;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   *enum JGJNDJHFDMC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8943;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabLoopDungeonSelectConditionRsp}
   */
  public static final class ChannellerSlabLoopDungeonSelectConditionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannellerSlabLoopDungeonSelectConditionRsp)
      ChannellerSlabLoopDungeonSelectConditionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabLoopDungeonSelectConditionRsp.newBuilder() to construct.
    private ChannellerSlabLoopDungeonSelectConditionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabLoopDungeonSelectConditionRsp() {
      conditionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabLoopDungeonSelectConditionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannellerSlabLoopDungeonSelectConditionRsp(
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

              difficultyId_ = input.readUInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              conditionIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                conditionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              dungeonIndex_ = input.readUInt32();
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
          conditionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.Builder.class);
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

    public static final int CONDITIONIDLIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList conditionIdList_;
    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @return A list containing the conditionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConditionIdListList() {
      return conditionIdList_;
    }
    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @return The count of conditionIdList.
     */
    public int getConditionIdListCount() {
      return conditionIdList_.size();
    }
    /**
     * <code>repeated uint32 conditionIdList = 10;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    public int getConditionIdList(int index) {
      return conditionIdList_.getInt(index);
    }
    private int conditionIdListMemoizedSerializedSize = -1;

    public static final int DUNGEONINDEX_FIELD_NUMBER = 15;
    private int dungeonIndex_;
    /**
     * <code>uint32 dungeonIndex = 15;</code>
     * @return The dungeonIndex.
     */
    @java.lang.Override
    public int getDungeonIndex() {
      return dungeonIndex_;
    }

    public static final int DIFFICULTYID_FIELD_NUMBER = 6;
    private int difficultyId_;
    /**
     * <code>uint32 difficultyId = 6;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (difficultyId_ != 0) {
        output.writeUInt32(6, difficultyId_);
      }
      if (getConditionIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(conditionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < conditionIdList_.size(); i++) {
        output.writeUInt32NoTag(conditionIdList_.getInt(i));
      }
      if (dungeonIndex_ != 0) {
        output.writeUInt32(15, dungeonIndex_);
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
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, difficultyId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < conditionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(conditionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConditionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        conditionIdListMemoizedSerializedSize = dataSize;
      }
      if (dungeonIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, dungeonIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp other = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getConditionIdListList()
          .equals(other.getConditionIdListList())) return false;
      if (getDungeonIndex()
          != other.getDungeonIndex()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      if (getConditionIdListCount() > 0) {
        hash = (37 * hash) + CONDITIONIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getConditionIdListList().hashCode();
      }
      hash = (37 * hash) + DUNGEONINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonIndex();
      hash = (37 * hash) + DIFFICULTYID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp prototype) {
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
     *enum JGJNDJHFDMC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8943;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabLoopDungeonSelectConditionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabLoopDungeonSelectConditionRsp)
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.newBuilder()
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

        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonIndex_ = 0;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp build() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp result = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conditionIdList_ = conditionIdList_;
        result.dungeonIndex_ = dungeonIndex_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.conditionIdList_.isEmpty()) {
          if (conditionIdList_.isEmpty()) {
            conditionIdList_ = other.conditionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConditionIdListIsMutable();
            conditionIdList_.addAll(other.conditionIdList_);
          }
          onChanged();
        }
        if (other.getDungeonIndex() != 0) {
          setDungeonIndex(other.getDungeonIndex());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp) e.getUnfinishedMessage();
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

      private com.google.protobuf.Internal.IntList conditionIdList_ = emptyIntList();
      private void ensureConditionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_ = mutableCopy(conditionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @return A list containing the conditionIdList.
       */
      public java.util.List<java.lang.Integer>
          getConditionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(conditionIdList_) : conditionIdList_;
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @return The count of conditionIdList.
       */
      public int getConditionIdListCount() {
        return conditionIdList_.size();
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @param index The index of the element to return.
       * @return The conditionIdList at the given index.
       */
      public int getConditionIdList(int index) {
        return conditionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @param index The index to set the value at.
       * @param value The conditionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConditionIdList(
          int index, int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @param value The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addConditionIdList(int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @param values The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllConditionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConditionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, conditionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 conditionIdList = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearConditionIdList() {
        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonIndex_ ;
      /**
       * <code>uint32 dungeonIndex = 15;</code>
       * @return The dungeonIndex.
       */
      @java.lang.Override
      public int getDungeonIndex() {
        return dungeonIndex_;
      }
      /**
       * <code>uint32 dungeonIndex = 15;</code>
       * @param value The dungeonIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonIndex(int value) {
        
        dungeonIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonIndex = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonIndex() {
        
        dungeonIndex_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficultyId = 6;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficultyId = 6;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficultyId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannellerSlabLoopDungeonSelectConditionRsp)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabLoopDungeonSelectConditionRsp)
    private static final emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabLoopDungeonSelectConditionRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabLoopDungeonSelectConditionRsp>() {
      @java.lang.Override
      public ChannellerSlabLoopDungeonSelectConditionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannellerSlabLoopDungeonSelectConditionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannellerSlabLoopDungeonSelectConditionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabLoopDungeonSelectConditionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonSelectConditionRspOuterClass.ChannellerSlabLoopDungeonSelectConditionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1ChannellerSlabLoopDungeonSelectConditi" +
      "onRsp.proto\"\203\001\n+ChannellerSlabLoopDungeo" +
      "nSelectConditionRsp\022\017\n\007retcode\030\005 \001(\005\022\027\n\017" +
      "conditionIdList\030\n \003(\r\022\024\n\014dungeonIndex\030\017 " +
      "\001(\r\022\024\n\014difficultyId\030\006 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabLoopDungeonSelectConditionRsp_descriptor,
        new java.lang.String[] { "Retcode", "ConditionIdList", "DungeonIndex", "DifficultyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
