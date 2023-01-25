// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneWeatherForcastRsp.proto

package emu.grasscutter.net.proto;

public final class SceneWeatherForcastRspOuterClass {
  private SceneWeatherForcastRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneWeatherForcastRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneWeatherForcastRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @return A list containing the oefhbiaidaa.
     */
    java.util.List<java.lang.Integer> getOefhbiaidaaList();
    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @return The count of oefhbiaidaa.
     */
    int getOefhbiaidaaCount();
    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @param index The index of the element to return.
     * @return The oefhbiaidaa at the given index.
     */
    int getOefhbiaidaa(int index);

    /**
     * <code>uint64 kcclfhokmpp = 10;</code>
     * @return The kcclfhokmpp.
     */
    long getKcclfhokmpp();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum EACGICPLMMH {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 3500;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code SceneWeatherForcastRsp}
   */
  public static final class SceneWeatherForcastRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneWeatherForcastRsp)
      SceneWeatherForcastRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneWeatherForcastRsp.newBuilder() to construct.
    private SceneWeatherForcastRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneWeatherForcastRsp() {
      oefhbiaidaa_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneWeatherForcastRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneWeatherForcastRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              kcclfhokmpp_ = input.readUInt64();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oefhbiaidaa_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              oefhbiaidaa_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                oefhbiaidaa_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                oefhbiaidaa_.addInt(input.readUInt32());
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
          oefhbiaidaa_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.class, emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.Builder.class);
    }

    public static final int OEFHBIAIDAA_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList oefhbiaidaa_;
    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @return A list containing the oefhbiaidaa.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOefhbiaidaaList() {
      return oefhbiaidaa_;
    }
    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @return The count of oefhbiaidaa.
     */
    public int getOefhbiaidaaCount() {
      return oefhbiaidaa_.size();
    }
    /**
     * <code>repeated uint32 oefhbiaidaa = 13;</code>
     * @param index The index of the element to return.
     * @return The oefhbiaidaa at the given index.
     */
    public int getOefhbiaidaa(int index) {
      return oefhbiaidaa_.getInt(index);
    }
    private int oefhbiaidaaMemoizedSerializedSize = -1;

    public static final int KCCLFHOKMPP_FIELD_NUMBER = 10;
    private long kcclfhokmpp_;
    /**
     * <code>uint64 kcclfhokmpp = 10;</code>
     * @return The kcclfhokmpp.
     */
    @java.lang.Override
    public long getKcclfhokmpp() {
      return kcclfhokmpp_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (kcclfhokmpp_ != 0L) {
        output.writeUInt64(10, kcclfhokmpp_);
      }
      if (getOefhbiaidaaList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(oefhbiaidaaMemoizedSerializedSize);
      }
      for (int i = 0; i < oefhbiaidaa_.size(); i++) {
        output.writeUInt32NoTag(oefhbiaidaa_.getInt(i));
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
          .computeInt32Size(4, retcode_);
      }
      if (kcclfhokmpp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, kcclfhokmpp_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < oefhbiaidaa_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(oefhbiaidaa_.getInt(i));
        }
        size += dataSize;
        if (!getOefhbiaidaaList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        oefhbiaidaaMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp other = (emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) obj;

      if (!getOefhbiaidaaList()
          .equals(other.getOefhbiaidaaList())) return false;
      if (getKcclfhokmpp()
          != other.getKcclfhokmpp()) return false;
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
      if (getOefhbiaidaaCount() > 0) {
        hash = (37 * hash) + OEFHBIAIDAA_FIELD_NUMBER;
        hash = (53 * hash) + getOefhbiaidaaList().hashCode();
      }
      hash = (37 * hash) + KCCLFHOKMPP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getKcclfhokmpp());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp prototype) {
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
     *enum EACGICPLMMH {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 3500;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code SceneWeatherForcastRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneWeatherForcastRsp)
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.class, emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.newBuilder()
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
        oefhbiaidaa_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        kcclfhokmpp_ = 0L;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.internal_static_SceneWeatherForcastRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp build() {
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp buildPartial() {
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp result = new emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          oefhbiaidaa_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oefhbiaidaa_ = oefhbiaidaa_;
        result.kcclfhokmpp_ = kcclfhokmpp_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp other) {
        if (other == emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp.getDefaultInstance()) return this;
        if (!other.oefhbiaidaa_.isEmpty()) {
          if (oefhbiaidaa_.isEmpty()) {
            oefhbiaidaa_ = other.oefhbiaidaa_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOefhbiaidaaIsMutable();
            oefhbiaidaa_.addAll(other.oefhbiaidaa_);
          }
          onChanged();
        }
        if (other.getKcclfhokmpp() != 0L) {
          setKcclfhokmpp(other.getKcclfhokmpp());
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
        emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList oefhbiaidaa_ = emptyIntList();
      private void ensureOefhbiaidaaIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oefhbiaidaa_ = mutableCopy(oefhbiaidaa_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @return A list containing the oefhbiaidaa.
       */
      public java.util.List<java.lang.Integer>
          getOefhbiaidaaList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(oefhbiaidaa_) : oefhbiaidaa_;
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @return The count of oefhbiaidaa.
       */
      public int getOefhbiaidaaCount() {
        return oefhbiaidaa_.size();
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @param index The index of the element to return.
       * @return The oefhbiaidaa at the given index.
       */
      public int getOefhbiaidaa(int index) {
        return oefhbiaidaa_.getInt(index);
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @param index The index to set the value at.
       * @param value The oefhbiaidaa to set.
       * @return This builder for chaining.
       */
      public Builder setOefhbiaidaa(
          int index, int value) {
        ensureOefhbiaidaaIsMutable();
        oefhbiaidaa_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @param value The oefhbiaidaa to add.
       * @return This builder for chaining.
       */
      public Builder addOefhbiaidaa(int value) {
        ensureOefhbiaidaaIsMutable();
        oefhbiaidaa_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @param values The oefhbiaidaa to add.
       * @return This builder for chaining.
       */
      public Builder addAllOefhbiaidaa(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOefhbiaidaaIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oefhbiaidaa_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 oefhbiaidaa = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOefhbiaidaa() {
        oefhbiaidaa_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long kcclfhokmpp_ ;
      /**
       * <code>uint64 kcclfhokmpp = 10;</code>
       * @return The kcclfhokmpp.
       */
      @java.lang.Override
      public long getKcclfhokmpp() {
        return kcclfhokmpp_;
      }
      /**
       * <code>uint64 kcclfhokmpp = 10;</code>
       * @param value The kcclfhokmpp to set.
       * @return This builder for chaining.
       */
      public Builder setKcclfhokmpp(long value) {
        
        kcclfhokmpp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 kcclfhokmpp = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearKcclfhokmpp() {
        
        kcclfhokmpp_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:SceneWeatherForcastRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneWeatherForcastRsp)
    private static final emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp();
    }

    public static emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneWeatherForcastRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneWeatherForcastRsp>() {
      @java.lang.Override
      public SceneWeatherForcastRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneWeatherForcastRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneWeatherForcastRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneWeatherForcastRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneWeatherForcastRspOuterClass.SceneWeatherForcastRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneWeatherForcastRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneWeatherForcastRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneWeatherForcastRsp.proto\"S\n\026SceneW" +
      "eatherForcastRsp\022\023\n\013oefhbiaidaa\030\r \003(\r\022\023\n" +
      "\013kcclfhokmpp\030\n \001(\004\022\017\n\007retcode\030\004 \001(\005B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneWeatherForcastRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneWeatherForcastRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneWeatherForcastRsp_descriptor,
        new java.lang.String[] { "Oefhbiaidaa", "Kcclfhokmpp", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}