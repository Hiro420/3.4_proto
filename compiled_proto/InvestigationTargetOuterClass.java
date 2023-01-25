// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvestigationTarget.proto

package emu.grasscutter.net.proto;

public final class InvestigationTargetOuterClass {
  private InvestigationTargetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationTargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InvestigationTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 investigationId = 13;</code>
     * @return The investigationId.
     */
    int getInvestigationId();

    /**
     * <code>.State state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.State state = 7;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.StateOuterClass.State getState();

    /**
     * <code>uint32 totalProgress = 1;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 questId = 3;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * Protobuf type {@code InvestigationTarget}
   */
  public static final class InvestigationTarget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InvestigationTarget)
      InvestigationTargetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InvestigationTarget.newBuilder() to construct.
    private InvestigationTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InvestigationTarget() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InvestigationTarget();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InvestigationTarget(
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
            case 8: {

              totalProgress_ = input.readUInt32();
              break;
            }
            case 24: {

              questId_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 104: {

              investigationId_ = input.readUInt32();
              break;
            }
            case 120: {

              progress_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
    }

    public static final int INVESTIGATIONID_FIELD_NUMBER = 13;
    private int investigationId_;
    /**
     * <code>uint32 investigationId = 13;</code>
     * @return The investigationId.
     */
    @java.lang.Override
    public int getInvestigationId() {
      return investigationId_;
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_;
    /**
     * <code>.State state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.State state = 7;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.StateOuterClass.State getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.StateOuterClass.State result = emu.grasscutter.net.proto.StateOuterClass.State.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.StateOuterClass.State.UNRECOGNIZED : result;
    }

    public static final int TOTALPROGRESS_FIELD_NUMBER = 1;
    private int totalProgress_;
    /**
     * <code>uint32 totalProgress = 1;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int QUESTID_FIELD_NUMBER = 3;
    private int questId_;
    /**
     * <code>uint32 questId = 3;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 15;
    private int progress_;
    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (totalProgress_ != 0) {
        output.writeUInt32(1, totalProgress_);
      }
      if (questId_ != 0) {
        output.writeUInt32(3, questId_);
      }
      if (state_ != emu.grasscutter.net.proto.StateOuterClass.State.STATE_INVALID.getNumber()) {
        output.writeEnum(7, state_);
      }
      if (investigationId_ != 0) {
        output.writeUInt32(13, investigationId_);
      }
      if (progress_ != 0) {
        output.writeUInt32(15, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, totalProgress_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, questId_);
      }
      if (state_ != emu.grasscutter.net.proto.StateOuterClass.State.STATE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, state_);
      }
      if (investigationId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, investigationId_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, progress_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget other = (emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget) obj;

      if (getInvestigationId()
          != other.getInvestigationId()) return false;
      if (state_ != other.state_) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + INVESTIGATIONID_FIELD_NUMBER;
      hash = (53 * hash) + getInvestigationId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + TOTALPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + QUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget prototype) {
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
     * Protobuf type {@code InvestigationTarget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InvestigationTarget)
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.newBuilder()
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
        investigationId_ = 0;

        state_ = 0;

        totalProgress_ = 0;

        questId_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget build() {
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget buildPartial() {
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget result = new emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget(this);
        result.investigationId_ = investigationId_;
        result.state_ = state_;
        result.totalProgress_ = totalProgress_;
        result.questId_ = questId_;
        result.progress_ = progress_;
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
        if (other instanceof emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget) {
          return mergeFrom((emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget other) {
        if (other == emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance()) return this;
        if (other.getInvestigationId() != 0) {
          setInvestigationId(other.getInvestigationId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int investigationId_ ;
      /**
       * <code>uint32 investigationId = 13;</code>
       * @return The investigationId.
       */
      @java.lang.Override
      public int getInvestigationId() {
        return investigationId_;
      }
      /**
       * <code>uint32 investigationId = 13;</code>
       * @param value The investigationId to set.
       * @return This builder for chaining.
       */
      public Builder setInvestigationId(int value) {
        
        investigationId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 investigationId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvestigationId() {
        
        investigationId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.State state = 7;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.State state = 7;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.State state = 7;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.StateOuterClass.State getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.StateOuterClass.State result = emu.grasscutter.net.proto.StateOuterClass.State.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.StateOuterClass.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.State state = 7;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.StateOuterClass.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.State state = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 totalProgress = 1;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 totalProgress = 1;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalProgress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 questId = 3;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 questId = 3;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 questId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 15;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InvestigationTarget)
    }

    // @@protoc_insertion_point(class_scope:InvestigationTarget)
    private static final emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget();
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InvestigationTarget>
        PARSER = new com.google.protobuf.AbstractParser<InvestigationTarget>() {
      @java.lang.Override
      public InvestigationTarget parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InvestigationTarget(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InvestigationTarget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InvestigationTarget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvestigationTarget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvestigationTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031InvestigationTarget.proto\032\013State.proto" +
      "\"\177\n\023InvestigationTarget\022\027\n\017investigation" +
      "Id\030\r \001(\r\022\025\n\005state\030\007 \001(\0162\006.State\022\025\n\rtotal" +
      "Progress\030\001 \001(\r\022\017\n\007questId\030\003 \001(\r\022\020\n\010progr" +
      "ess\030\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.StateOuterClass.getDescriptor(),
        });
    internal_static_InvestigationTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InvestigationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvestigationTarget_descriptor,
        new java.lang.String[] { "InvestigationId", "State", "TotalProgress", "QuestId", "Progress", });
    emu.grasscutter.net.proto.StateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
