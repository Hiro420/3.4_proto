// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusConfirmCardRsp.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusConfirmCardRspOuterClass {
  private InBattleMechanicusConfirmCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusConfirmCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusConfirmCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 groupId = 12;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 playIndex = 11;</code>
     * @return The playIndex.
     */
    int getPlayIndex();

    /**
     * <code>uint32 cardId = 6;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   *enum FOBENOCMABB {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5329;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusConfirmCardRsp}
   */
  public static final class InBattleMechanicusConfirmCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusConfirmCardRsp)
      InBattleMechanicusConfirmCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusConfirmCardRsp.newBuilder() to construct.
    private InBattleMechanicusConfirmCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusConfirmCardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusConfirmCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusConfirmCardRsp(
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              cardId_ = input.readUInt32();
              break;
            }
            case 88: {

              playIndex_ = input.readUInt32();
              break;
            }
            case 96: {

              groupId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.internal_static_InBattleMechanicusConfirmCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.internal_static_InBattleMechanicusConfirmCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.class, emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.Builder.class);
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

    public static final int GROUPID_FIELD_NUMBER = 12;
    private int groupId_;
    /**
     * <code>uint32 groupId = 12;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAYINDEX_FIELD_NUMBER = 11;
    private int playIndex_;
    /**
     * <code>uint32 playIndex = 11;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    public static final int CARDID_FIELD_NUMBER = 6;
    private int cardId_;
    /**
     * <code>uint32 cardId = 6;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(6, cardId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(11, playIndex_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(12, groupId_);
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
          .computeInt32Size(3, retcode_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cardId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, playIndex_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp other = (emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + GROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + PLAYINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (37 * hash) + CARDID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp prototype) {
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
     *enum FOBENOCMABB {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5329;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusConfirmCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusConfirmCardRsp)
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.internal_static_InBattleMechanicusConfirmCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.internal_static_InBattleMechanicusConfirmCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.class, emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.newBuilder()
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

        groupId_ = 0;

        playIndex_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.internal_static_InBattleMechanicusConfirmCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp build() {
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp result = new emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp(this);
        result.retcode_ = retcode_;
        result.groupId_ = groupId_;
        result.playIndex_ = playIndex_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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

      private int groupId_ ;
      /**
       * <code>uint32 groupId = 12;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 groupId = 12;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 groupId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 playIndex = 11;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 playIndex = 11;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playIndex = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 cardId = 6;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 cardId = 6;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusConfirmCardRsp)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusConfirmCardRsp)
    private static final emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusConfirmCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusConfirmCardRsp>() {
      @java.lang.Override
      public InBattleMechanicusConfirmCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusConfirmCardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusConfirmCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusConfirmCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleMechanicusConfirmCardRspOuterClass.InBattleMechanicusConfirmCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusConfirmCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusConfirmCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&InBattleMechanicusConfirmCardRsp.proto" +
      "\"g\n InBattleMechanicusConfirmCardRsp\022\017\n\007" +
      "retcode\030\003 \001(\005\022\017\n\007groupId\030\014 \001(\r\022\021\n\tplayIn" +
      "dex\030\013 \001(\r\022\016\n\006cardId\030\006 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusConfirmCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusConfirmCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusConfirmCardRsp_descriptor,
        new java.lang.String[] { "Retcode", "GroupId", "PlayIndex", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
