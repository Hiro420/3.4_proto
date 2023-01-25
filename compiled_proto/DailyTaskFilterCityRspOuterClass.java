// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskFilterCityRsp.proto

package emu.grasscutter.net.proto;

public final class DailyTaskFilterCityRspOuterClass {
  private DailyTaskFilterCityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskFilterCityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskFilterCityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @return A list containing the cikenonelim.
     */
    java.util.List<java.lang.Integer> getCikenonelimList();
    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @return The count of cikenonelim.
     */
    int getCikenonelimCount();
    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @param index The index of the element to return.
     * @return The cikenonelim at the given index.
     */
    int getCikenonelim(int index);
  }
  /**
   * <pre>
   *enum BAECKJPDBMI {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 131;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code DailyTaskFilterCityRsp}
   */
  public static final class DailyTaskFilterCityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskFilterCityRsp)
      DailyTaskFilterCityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskFilterCityRsp.newBuilder() to construct.
    private DailyTaskFilterCityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskFilterCityRsp() {
      cikenonelim_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskFilterCityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskFilterCityRsp(
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
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cikenonelim_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cikenonelim_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cikenonelim_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cikenonelim_.addInt(input.readUInt32());
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
          cikenonelim_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.internal_static_DailyTaskFilterCityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.internal_static_DailyTaskFilterCityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.class, emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.Builder.class);
    }

    public static final int CIKENONELIM_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList cikenonelim_;
    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @return A list containing the cikenonelim.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCikenonelimList() {
      return cikenonelim_;
    }
    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @return The count of cikenonelim.
     */
    public int getCikenonelimCount() {
      return cikenonelim_.size();
    }
    /**
     * <code>repeated uint32 cikenonelim = 15;</code>
     * @param index The index of the element to return.
     * @return The cikenonelim at the given index.
     */
    public int getCikenonelim(int index) {
      return cikenonelim_.getInt(index);
    }
    private int cikenonelimMemoizedSerializedSize = -1;

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
      if (getCikenonelimList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(cikenonelimMemoizedSerializedSize);
      }
      for (int i = 0; i < cikenonelim_.size(); i++) {
        output.writeUInt32NoTag(cikenonelim_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < cikenonelim_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cikenonelim_.getInt(i));
        }
        size += dataSize;
        if (!getCikenonelimList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cikenonelimMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp other = (emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp) obj;

      if (!getCikenonelimList()
          .equals(other.getCikenonelimList())) return false;
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
      if (getCikenonelimCount() > 0) {
        hash = (37 * hash) + CIKENONELIM_FIELD_NUMBER;
        hash = (53 * hash) + getCikenonelimList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp prototype) {
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
     *enum BAECKJPDBMI {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 131;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code DailyTaskFilterCityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskFilterCityRsp)
        emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.internal_static_DailyTaskFilterCityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.internal_static_DailyTaskFilterCityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.class, emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.newBuilder()
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
        cikenonelim_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.internal_static_DailyTaskFilterCityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp build() {
        emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp buildPartial() {
        emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp result = new emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cikenonelim_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cikenonelim_ = cikenonelim_;
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
        if (other instanceof emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp other) {
        if (other == emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp.getDefaultInstance()) return this;
        if (!other.cikenonelim_.isEmpty()) {
          if (cikenonelim_.isEmpty()) {
            cikenonelim_ = other.cikenonelim_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCikenonelimIsMutable();
            cikenonelim_.addAll(other.cikenonelim_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList cikenonelim_ = emptyIntList();
      private void ensureCikenonelimIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cikenonelim_ = mutableCopy(cikenonelim_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @return A list containing the cikenonelim.
       */
      public java.util.List<java.lang.Integer>
          getCikenonelimList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cikenonelim_) : cikenonelim_;
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @return The count of cikenonelim.
       */
      public int getCikenonelimCount() {
        return cikenonelim_.size();
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @param index The index of the element to return.
       * @return The cikenonelim at the given index.
       */
      public int getCikenonelim(int index) {
        return cikenonelim_.getInt(index);
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @param index The index to set the value at.
       * @param value The cikenonelim to set.
       * @return This builder for chaining.
       */
      public Builder setCikenonelim(
          int index, int value) {
        ensureCikenonelimIsMutable();
        cikenonelim_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @param value The cikenonelim to add.
       * @return This builder for chaining.
       */
      public Builder addCikenonelim(int value) {
        ensureCikenonelimIsMutable();
        cikenonelim_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @param values The cikenonelim to add.
       * @return This builder for chaining.
       */
      public Builder addAllCikenonelim(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCikenonelimIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cikenonelim_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cikenonelim = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCikenonelim() {
        cikenonelim_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:DailyTaskFilterCityRsp)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskFilterCityRsp)
    private static final emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp();
    }

    public static emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskFilterCityRsp>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskFilterCityRsp>() {
      @java.lang.Override
      public DailyTaskFilterCityRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskFilterCityRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskFilterCityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskFilterCityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskFilterCityRspOuterClass.DailyTaskFilterCityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskFilterCityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskFilterCityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034DailyTaskFilterCityRsp.proto\"-\n\026DailyT" +
      "askFilterCityRsp\022\023\n\013cikenonelim\030\017 \003(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskFilterCityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskFilterCityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskFilterCityRsp_descriptor,
        new java.lang.String[] { "Cikenonelim", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}