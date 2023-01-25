// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomChest.proto

package emu.grasscutter.net.proto;

public final class BlossomChestOuterClass {
  private BlossomChestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomChestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomChest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    int getResin();

    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @return A list containing the qualifyUidList.
     */
    java.util.List<java.lang.Integer> getQualifyUidListList();
    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @return The count of qualifyUidList.
     */
    int getQualifyUidListCount();
    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    int getQualifyUidList(int index);

    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @return A list containing the remainUidList.
     */
    java.util.List<java.lang.Integer> getRemainUidListList();
    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @return The count of remainUidList.
     */
    int getRemainUidListCount();
    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    int getRemainUidList(int index);

    /**
     * <code>uint32 deadTime = 4;</code>
     * @return The deadTime.
     */
    int getDeadTime();

    /**
     * <code>uint32 blossomRefreshType = 5;</code>
     * @return The blossomRefreshType.
     */
    int getBlossomRefreshType();

    /**
     * <code>uint32 refreshId = 6;</code>
     * @return The refreshId.
     */
    int getRefreshId();
  }
  /**
   * Protobuf type {@code BlossomChest}
   */
  public static final class BlossomChest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomChest)
      BlossomChestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomChest.newBuilder() to construct.
    private BlossomChest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomChest() {
      qualifyUidList_ = emptyIntList();
      remainUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomChest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlossomChest(
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
            case 8: {

              resin_ = input.readUInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              qualifyUidList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                qualifyUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                remainUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              remainUidList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                remainUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                remainUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              deadTime_ = input.readUInt32();
              break;
            }
            case 40: {

              blossomRefreshType_ = input.readUInt32();
              break;
            }
            case 48: {

              refreshId_ = input.readUInt32();
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
          qualifyUidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          remainUidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BlossomChestOuterClass.internal_static_BlossomChest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BlossomChestOuterClass.internal_static_BlossomChest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.class, emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.Builder.class);
    }

    public static final int RESIN_FIELD_NUMBER = 1;
    private int resin_;
    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    @java.lang.Override
    public int getResin() {
      return resin_;
    }

    public static final int QUALIFYUIDLIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList qualifyUidList_;
    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @return A list containing the qualifyUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getQualifyUidListList() {
      return qualifyUidList_;
    }
    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @return The count of qualifyUidList.
     */
    public int getQualifyUidListCount() {
      return qualifyUidList_.size();
    }
    /**
     * <code>repeated uint32 qualifyUidList = 2;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    public int getQualifyUidList(int index) {
      return qualifyUidList_.getInt(index);
    }
    private int qualifyUidListMemoizedSerializedSize = -1;

    public static final int REMAINUIDLIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList remainUidList_;
    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @return A list containing the remainUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRemainUidListList() {
      return remainUidList_;
    }
    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @return The count of remainUidList.
     */
    public int getRemainUidListCount() {
      return remainUidList_.size();
    }
    /**
     * <code>repeated uint32 remainUidList = 3;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    public int getRemainUidList(int index) {
      return remainUidList_.getInt(index);
    }
    private int remainUidListMemoizedSerializedSize = -1;

    public static final int DEADTIME_FIELD_NUMBER = 4;
    private int deadTime_;
    /**
     * <code>uint32 deadTime = 4;</code>
     * @return The deadTime.
     */
    @java.lang.Override
    public int getDeadTime() {
      return deadTime_;
    }

    public static final int BLOSSOMREFRESHTYPE_FIELD_NUMBER = 5;
    private int blossomRefreshType_;
    /**
     * <code>uint32 blossomRefreshType = 5;</code>
     * @return The blossomRefreshType.
     */
    @java.lang.Override
    public int getBlossomRefreshType() {
      return blossomRefreshType_;
    }

    public static final int REFRESHID_FIELD_NUMBER = 6;
    private int refreshId_;
    /**
     * <code>uint32 refreshId = 6;</code>
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
      getSerializedSize();
      if (resin_ != 0) {
        output.writeUInt32(1, resin_);
      }
      if (getQualifyUidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(qualifyUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < qualifyUidList_.size(); i++) {
        output.writeUInt32NoTag(qualifyUidList_.getInt(i));
      }
      if (getRemainUidListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(remainUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < remainUidList_.size(); i++) {
        output.writeUInt32NoTag(remainUidList_.getInt(i));
      }
      if (deadTime_ != 0) {
        output.writeUInt32(4, deadTime_);
      }
      if (blossomRefreshType_ != 0) {
        output.writeUInt32(5, blossomRefreshType_);
      }
      if (refreshId_ != 0) {
        output.writeUInt32(6, refreshId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, resin_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < qualifyUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(qualifyUidList_.getInt(i));
        }
        size += dataSize;
        if (!getQualifyUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        qualifyUidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < remainUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(remainUidList_.getInt(i));
        }
        size += dataSize;
        if (!getRemainUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        remainUidListMemoizedSerializedSize = dataSize;
      }
      if (deadTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, deadTime_);
      }
      if (blossomRefreshType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, blossomRefreshType_);
      }
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, refreshId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest other = (emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest) obj;

      if (getResin()
          != other.getResin()) return false;
      if (!getQualifyUidListList()
          .equals(other.getQualifyUidListList())) return false;
      if (!getRemainUidListList()
          .equals(other.getRemainUidListList())) return false;
      if (getDeadTime()
          != other.getDeadTime()) return false;
      if (getBlossomRefreshType()
          != other.getBlossomRefreshType()) return false;
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
      hash = (37 * hash) + RESIN_FIELD_NUMBER;
      hash = (53 * hash) + getResin();
      if (getQualifyUidListCount() > 0) {
        hash = (37 * hash) + QUALIFYUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getQualifyUidListList().hashCode();
      }
      if (getRemainUidListCount() > 0) {
        hash = (37 * hash) + REMAINUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getRemainUidListList().hashCode();
      }
      hash = (37 * hash) + DEADTIME_FIELD_NUMBER;
      hash = (53 * hash) + getDeadTime();
      hash = (37 * hash) + BLOSSOMREFRESHTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getBlossomRefreshType();
      hash = (37 * hash) + REFRESHID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest prototype) {
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
     * Protobuf type {@code BlossomChest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomChest)
        emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BlossomChestOuterClass.internal_static_BlossomChest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BlossomChestOuterClass.internal_static_BlossomChest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.class, emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.newBuilder()
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
        resin_ = 0;

        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        remainUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        deadTime_ = 0;

        blossomRefreshType_ = 0;

        refreshId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BlossomChestOuterClass.internal_static_BlossomChest_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest build() {
        emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest buildPartial() {
        emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest result = new emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest(this);
        int from_bitField0_ = bitField0_;
        result.resin_ = resin_;
        if (((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.qualifyUidList_ = qualifyUidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          remainUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.remainUidList_ = remainUidList_;
        result.deadTime_ = deadTime_;
        result.blossomRefreshType_ = blossomRefreshType_;
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
        if (other instanceof emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest) {
          return mergeFrom((emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest other) {
        if (other == emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest.getDefaultInstance()) return this;
        if (other.getResin() != 0) {
          setResin(other.getResin());
        }
        if (!other.qualifyUidList_.isEmpty()) {
          if (qualifyUidList_.isEmpty()) {
            qualifyUidList_ = other.qualifyUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQualifyUidListIsMutable();
            qualifyUidList_.addAll(other.qualifyUidList_);
          }
          onChanged();
        }
        if (!other.remainUidList_.isEmpty()) {
          if (remainUidList_.isEmpty()) {
            remainUidList_ = other.remainUidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRemainUidListIsMutable();
            remainUidList_.addAll(other.remainUidList_);
          }
          onChanged();
        }
        if (other.getDeadTime() != 0) {
          setDeadTime(other.getDeadTime());
        }
        if (other.getBlossomRefreshType() != 0) {
          setBlossomRefreshType(other.getBlossomRefreshType());
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
        emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int resin_ ;
      /**
       * <code>uint32 resin = 1;</code>
       * @return The resin.
       */
      @java.lang.Override
      public int getResin() {
        return resin_;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @param value The resin to set.
       * @return This builder for chaining.
       */
      public Builder setResin(int value) {
        
        resin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResin() {
        
        resin_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList qualifyUidList_ = emptyIntList();
      private void ensureQualifyUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_ = mutableCopy(qualifyUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @return A list containing the qualifyUidList.
       */
      public java.util.List<java.lang.Integer>
          getQualifyUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(qualifyUidList_) : qualifyUidList_;
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @return The count of qualifyUidList.
       */
      public int getQualifyUidListCount() {
        return qualifyUidList_.size();
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @param index The index of the element to return.
       * @return The qualifyUidList at the given index.
       */
      public int getQualifyUidList(int index) {
        return qualifyUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @param index The index to set the value at.
       * @param value The qualifyUidList to set.
       * @return This builder for chaining.
       */
      public Builder setQualifyUidList(
          int index, int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @param value The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addQualifyUidList(int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @param values The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllQualifyUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureQualifyUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, qualifyUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualifyUidList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQualifyUidList() {
        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList remainUidList_ = emptyIntList();
      private void ensureRemainUidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          remainUidList_ = mutableCopy(remainUidList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @return A list containing the remainUidList.
       */
      public java.util.List<java.lang.Integer>
          getRemainUidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(remainUidList_) : remainUidList_;
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @return The count of remainUidList.
       */
      public int getRemainUidListCount() {
        return remainUidList_.size();
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @param index The index of the element to return.
       * @return The remainUidList at the given index.
       */
      public int getRemainUidList(int index) {
        return remainUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @param index The index to set the value at.
       * @param value The remainUidList to set.
       * @return This builder for chaining.
       */
      public Builder setRemainUidList(
          int index, int value) {
        ensureRemainUidListIsMutable();
        remainUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @param value The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addRemainUidList(int value) {
        ensureRemainUidListIsMutable();
        remainUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @param values The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRemainUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRemainUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, remainUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remainUidList = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainUidList() {
        remainUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int deadTime_ ;
      /**
       * <code>uint32 deadTime = 4;</code>
       * @return The deadTime.
       */
      @java.lang.Override
      public int getDeadTime() {
        return deadTime_;
      }
      /**
       * <code>uint32 deadTime = 4;</code>
       * @param value The deadTime to set.
       * @return This builder for chaining.
       */
      public Builder setDeadTime(int value) {
        
        deadTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 deadTime = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeadTime() {
        
        deadTime_ = 0;
        onChanged();
        return this;
      }

      private int blossomRefreshType_ ;
      /**
       * <code>uint32 blossomRefreshType = 5;</code>
       * @return The blossomRefreshType.
       */
      @java.lang.Override
      public int getBlossomRefreshType() {
        return blossomRefreshType_;
      }
      /**
       * <code>uint32 blossomRefreshType = 5;</code>
       * @param value The blossomRefreshType to set.
       * @return This builder for chaining.
       */
      public Builder setBlossomRefreshType(int value) {
        
        blossomRefreshType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 blossomRefreshType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlossomRefreshType() {
        
        blossomRefreshType_ = 0;
        onChanged();
        return this;
      }

      private int refreshId_ ;
      /**
       * <code>uint32 refreshId = 6;</code>
       * @return The refreshId.
       */
      @java.lang.Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refreshId = 6;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {
        
        refreshId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refreshId = 6;</code>
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


      // @@protoc_insertion_point(builder_scope:BlossomChest)
    }

    // @@protoc_insertion_point(class_scope:BlossomChest)
    private static final emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest();
    }

    public static emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomChest>
        PARSER = new com.google.protobuf.AbstractParser<BlossomChest>() {
      @java.lang.Override
      public BlossomChest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlossomChest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlossomChest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomChest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomChestOuterClass.BlossomChest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomChest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomChest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BlossomChest.proto\"\215\001\n\014BlossomChest\022\r\n" +
      "\005resin\030\001 \001(\r\022\026\n\016qualifyUidList\030\002 \003(\r\022\025\n\r" +
      "remainUidList\030\003 \003(\r\022\020\n\010deadTime\030\004 \001(\r\022\032\n" +
      "\022blossomRefreshType\030\005 \001(\r\022\021\n\trefreshId\030\006" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlossomChest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomChest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomChest_descriptor,
        new java.lang.String[] { "Resin", "QualifyUidList", "RemainUidList", "DeadTime", "BlossomRefreshType", "RefreshId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
