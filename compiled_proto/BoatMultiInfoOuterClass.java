// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BoatMultiInfo.proto

package emu.grasscutter.net.proto;

public final class BoatMultiInfoOuterClass {
  private BoatMultiInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BoatMultiInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BoatMultiInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> 
        getPlayerDataList();
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD getPlayerData(int index);
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    int getPlayerDataCount();
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder> 
        getPlayerDataOrBuilderList();
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder getPlayerDataOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BoatMultiInfo}
   */
  public static final class BoatMultiInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BoatMultiInfo)
      BoatMultiInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BoatMultiInfo.newBuilder() to construct.
    private BoatMultiInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BoatMultiInfo() {
      playerData_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BoatMultiInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BoatMultiInfo(
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
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerData_ = new java.util.ArrayList<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerData_.add(
                  input.readMessage(emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.parser(), extensionRegistry));
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
          playerData_ = java.util.Collections.unmodifiableList(playerData_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.internal_static_BoatMultiInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.internal_static_BoatMultiInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.class, emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.Builder.class);
    }

    public static final int PLAYERDATA_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> playerData_;
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> getPlayerDataList() {
      return playerData_;
    }
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder> 
        getPlayerDataOrBuilderList() {
      return playerData_;
    }
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    @java.lang.Override
    public int getPlayerDataCount() {
      return playerData_.size();
    }
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD getPlayerData(int index) {
      return playerData_.get(index);
    }
    /**
     * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder getPlayerDataOrBuilder(
        int index) {
      return playerData_.get(index);
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
      for (int i = 0; i < playerData_.size(); i++) {
        output.writeMessage(14, playerData_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerData_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, playerData_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo other = (emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo) obj;

      if (!getPlayerDataList()
          .equals(other.getPlayerDataList())) return false;
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
      if (getPlayerDataCount() > 0) {
        hash = (37 * hash) + PLAYERDATA_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerDataList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo prototype) {
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
     * Protobuf type {@code BoatMultiInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BoatMultiInfo)
        emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.internal_static_BoatMultiInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.internal_static_BoatMultiInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.class, emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.newBuilder()
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
          getPlayerDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerDataBuilder_ == null) {
          playerData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerDataBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.internal_static_BoatMultiInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo build() {
        emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo buildPartial() {
        emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo result = new emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo(this);
        int from_bitField0_ = bitField0_;
        if (playerDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerData_ = java.util.Collections.unmodifiableList(playerData_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerData_ = playerData_;
        } else {
          result.playerData_ = playerDataBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo other) {
        if (other == emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo.getDefaultInstance()) return this;
        if (playerDataBuilder_ == null) {
          if (!other.playerData_.isEmpty()) {
            if (playerData_.isEmpty()) {
              playerData_ = other.playerData_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerDataIsMutable();
              playerData_.addAll(other.playerData_);
            }
            onChanged();
          }
        } else {
          if (!other.playerData_.isEmpty()) {
            if (playerDataBuilder_.isEmpty()) {
              playerDataBuilder_.dispose();
              playerDataBuilder_ = null;
              playerData_ = other.playerData_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerDataBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerDataFieldBuilder() : null;
            } else {
              playerDataBuilder_.addAllMessages(other.playerData_);
            }
          }
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
        emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> playerData_ =
        java.util.Collections.emptyList();
      private void ensurePlayerDataIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerData_ = new java.util.ArrayList<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD>(playerData_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder> playerDataBuilder_;

      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> getPlayerDataList() {
        if (playerDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerData_);
        } else {
          return playerDataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public int getPlayerDataCount() {
        if (playerDataBuilder_ == null) {
          return playerData_.size();
        } else {
          return playerDataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD getPlayerData(int index) {
        if (playerDataBuilder_ == null) {
          return playerData_.get(index);
        } else {
          return playerDataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder setPlayerData(
          int index, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD value) {
        if (playerDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerDataIsMutable();
          playerData_.set(index, value);
          onChanged();
        } else {
          playerDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder setPlayerData(
          int index, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder builderForValue) {
        if (playerDataBuilder_ == null) {
          ensurePlayerDataIsMutable();
          playerData_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder addPlayerData(emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD value) {
        if (playerDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerDataIsMutable();
          playerData_.add(value);
          onChanged();
        } else {
          playerDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder addPlayerData(
          int index, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD value) {
        if (playerDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerDataIsMutable();
          playerData_.add(index, value);
          onChanged();
        } else {
          playerDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder addPlayerData(
          emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder builderForValue) {
        if (playerDataBuilder_ == null) {
          ensurePlayerDataIsMutable();
          playerData_.add(builderForValue.build());
          onChanged();
        } else {
          playerDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder addPlayerData(
          int index, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder builderForValue) {
        if (playerDataBuilder_ == null) {
          ensurePlayerDataIsMutable();
          playerData_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder addAllPlayerData(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD> values) {
        if (playerDataBuilder_ == null) {
          ensurePlayerDataIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerData_);
          onChanged();
        } else {
          playerDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder clearPlayerData() {
        if (playerDataBuilder_ == null) {
          playerData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public Builder removePlayerData(int index) {
        if (playerDataBuilder_ == null) {
          ensurePlayerDataIsMutable();
          playerData_.remove(index);
          onChanged();
        } else {
          playerDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder getPlayerDataBuilder(
          int index) {
        return getPlayerDataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder getPlayerDataOrBuilder(
          int index) {
        if (playerDataBuilder_ == null) {
          return playerData_.get(index);  } else {
          return playerDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder> 
           getPlayerDataOrBuilderList() {
        if (playerDataBuilder_ != null) {
          return playerDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerData_);
        }
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder addPlayerDataBuilder() {
        return getPlayerDataFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.getDefaultInstance());
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder addPlayerDataBuilder(
          int index) {
        return getPlayerDataFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.getDefaultInstance());
      }
      /**
       * <code>repeated .IPLHKNLPPHD playerData = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder> 
           getPlayerDataBuilderList() {
        return getPlayerDataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder> 
          getPlayerDataFieldBuilder() {
        if (playerDataBuilder_ == null) {
          playerDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHD.Builder, emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.IPLHKNLPPHDOrBuilder>(
                  playerData_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerData_ = null;
        }
        return playerDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BoatMultiInfo)
    }

    // @@protoc_insertion_point(class_scope:BoatMultiInfo)
    private static final emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo();
    }

    public static emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BoatMultiInfo>
        PARSER = new com.google.protobuf.AbstractParser<BoatMultiInfo>() {
      @java.lang.Override
      public BoatMultiInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BoatMultiInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BoatMultiInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BoatMultiInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BoatMultiInfoOuterClass.BoatMultiInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BoatMultiInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BoatMultiInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BoatMultiInfo.proto\032\021IPLHKNLPPHD.proto" +
      "\"1\n\rBoatMultiInfo\022 \n\nplayerData\030\016 \003(\0132\014." +
      "IPLHKNLPPHDB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.getDescriptor(),
        });
    internal_static_BoatMultiInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BoatMultiInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BoatMultiInfo_descriptor,
        new java.lang.String[] { "PlayerData", });
    emu.grasscutter.net.proto.IPLHKNLPPHDOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
