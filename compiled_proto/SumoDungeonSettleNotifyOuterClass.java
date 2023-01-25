// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoDungeonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class SumoDungeonSettleNotifyOuterClass {
  private SumoDungeonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoDungeonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoDungeonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 killEliteMonsterNum = 13;</code>
     * @return The killEliteMonsterNum.
     */
    int getKillEliteMonsterNum();

    /**
     * <code>uint32 stageId = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool isNewRecord = 15;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 killMonsterNum = 4;</code>
     * @return The killMonsterNum.
     */
    int getKillMonsterNum();

    /**
     * <code>uint32 difficultyId = 2;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>uint32 finalScore = 11;</code>
     * @return The finalScore.
     */
    int getFinalScore();
  }
  /**
   * <pre>
   *enum IDELPLOGHAE {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8830;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code SumoDungeonSettleNotify}
   */
  public static final class SumoDungeonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoDungeonSettleNotify)
      SumoDungeonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoDungeonSettleNotify.newBuilder() to construct.
    private SumoDungeonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoDungeonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoDungeonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoDungeonSettleNotify(
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

              difficultyId_ = input.readUInt32();
              break;
            }
            case 24: {

              stageId_ = input.readUInt32();
              break;
            }
            case 32: {

              killMonsterNum_ = input.readUInt32();
              break;
            }
            case 88: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 104: {

              killEliteMonsterNum_ = input.readUInt32();
              break;
            }
            case 120: {

              isNewRecord_ = input.readBool();
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
      return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.class, emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.Builder.class);
    }

    public static final int KILLELITEMONSTERNUM_FIELD_NUMBER = 13;
    private int killEliteMonsterNum_;
    /**
     * <code>uint32 killEliteMonsterNum = 13;</code>
     * @return The killEliteMonsterNum.
     */
    @java.lang.Override
    public int getKillEliteMonsterNum() {
      return killEliteMonsterNum_;
    }

    public static final int STAGEID_FIELD_NUMBER = 3;
    private int stageId_;
    /**
     * <code>uint32 stageId = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ISNEWRECORD_FIELD_NUMBER = 15;
    private boolean isNewRecord_;
    /**
     * <code>bool isNewRecord = 15;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int KILLMONSTERNUM_FIELD_NUMBER = 4;
    private int killMonsterNum_;
    /**
     * <code>uint32 killMonsterNum = 4;</code>
     * @return The killMonsterNum.
     */
    @java.lang.Override
    public int getKillMonsterNum() {
      return killMonsterNum_;
    }

    public static final int DIFFICULTYID_FIELD_NUMBER = 2;
    private int difficultyId_;
    /**
     * <code>uint32 difficultyId = 2;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int FINALSCORE_FIELD_NUMBER = 11;
    private int finalScore_;
    /**
     * <code>uint32 finalScore = 11;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
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
      if (difficultyId_ != 0) {
        output.writeUInt32(2, difficultyId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (killMonsterNum_ != 0) {
        output.writeUInt32(4, killMonsterNum_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(11, finalScore_);
      }
      if (killEliteMonsterNum_ != 0) {
        output.writeUInt32(13, killEliteMonsterNum_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(15, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, difficultyId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, stageId_);
      }
      if (killMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killMonsterNum_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, finalScore_);
      }
      if (killEliteMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, killEliteMonsterNum_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify other = (emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) obj;

      if (getKillEliteMonsterNum()
          != other.getKillEliteMonsterNum()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getKillMonsterNum()
          != other.getKillMonsterNum()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
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
      hash = (37 * hash) + KILLELITEMONSTERNUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillEliteMonsterNum();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + ISNEWRECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + KILLMONSTERNUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterNum();
      hash = (37 * hash) + DIFFICULTYID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (37 * hash) + FINALSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify prototype) {
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
     *enum IDELPLOGHAE {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8830;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code SumoDungeonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoDungeonSettleNotify)
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.class, emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.newBuilder()
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
        killEliteMonsterNum_ = 0;

        stageId_ = 0;

        isNewRecord_ = false;

        killMonsterNum_ = 0;

        difficultyId_ = 0;

        finalScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify build() {
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify result = new emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify(this);
        result.killEliteMonsterNum_ = killEliteMonsterNum_;
        result.stageId_ = stageId_;
        result.isNewRecord_ = isNewRecord_;
        result.killMonsterNum_ = killMonsterNum_;
        result.difficultyId_ = difficultyId_;
        result.finalScore_ = finalScore_;
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
        if (other instanceof emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.getDefaultInstance()) return this;
        if (other.getKillEliteMonsterNum() != 0) {
          setKillEliteMonsterNum(other.getKillEliteMonsterNum());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getKillMonsterNum() != 0) {
          setKillMonsterNum(other.getKillMonsterNum());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
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
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int killEliteMonsterNum_ ;
      /**
       * <code>uint32 killEliteMonsterNum = 13;</code>
       * @return The killEliteMonsterNum.
       */
      @java.lang.Override
      public int getKillEliteMonsterNum() {
        return killEliteMonsterNum_;
      }
      /**
       * <code>uint32 killEliteMonsterNum = 13;</code>
       * @param value The killEliteMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillEliteMonsterNum(int value) {
        
        killEliteMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killEliteMonsterNum = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillEliteMonsterNum() {
        
        killEliteMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool isNewRecord = 15;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool isNewRecord = 15;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isNewRecord = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int killMonsterNum_ ;
      /**
       * <code>uint32 killMonsterNum = 4;</code>
       * @return The killMonsterNum.
       */
      @java.lang.Override
      public int getKillMonsterNum() {
        return killMonsterNum_;
      }
      /**
       * <code>uint32 killMonsterNum = 4;</code>
       * @param value The killMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterNum(int value) {
        
        killMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killMonsterNum = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterNum() {
        
        killMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficultyId = 2;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficultyId = 2;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficultyId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 finalScore = 11;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 finalScore = 11;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finalScore = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoDungeonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:SumoDungeonSettleNotify)
    private static final emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify();
    }

    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoDungeonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<SumoDungeonSettleNotify>() {
      @java.lang.Override
      public SumoDungeonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoDungeonSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoDungeonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoDungeonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoDungeonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoDungeonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SumoDungeonSettleNotify.proto\"\236\001\n\027Sumo" +
      "DungeonSettleNotify\022\033\n\023killEliteMonsterN" +
      "um\030\r \001(\r\022\017\n\007stageId\030\003 \001(\r\022\023\n\013isNewRecord" +
      "\030\017 \001(\010\022\026\n\016killMonsterNum\030\004 \001(\r\022\024\n\014diffic" +
      "ultyId\030\002 \001(\r\022\022\n\nfinalScore\030\013 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SumoDungeonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoDungeonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoDungeonSettleNotify_descriptor,
        new java.lang.String[] { "KillEliteMonsterNum", "StageId", "IsNewRecord", "KillMonsterNum", "DifficultyId", "FinalScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
