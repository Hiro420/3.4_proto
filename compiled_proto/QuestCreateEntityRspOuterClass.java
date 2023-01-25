// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestCreateEntityRsp.proto

package emu.grasscutter.net.proto;

public final class QuestCreateEntityRspOuterClass {
  private QuestCreateEntityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestCreateEntityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestCreateEntityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isRewind = 14;</code>
     * @return The isRewind.
     */
    boolean getIsRewind();

    /**
     * <code>uint32 parentQuestId = 7;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     * @return The entity.
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();

    /**
     * <code>uint32 entityId = 6;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 questId = 3;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum LKNGENJJKNO {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 424;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code QuestCreateEntityRsp}
   */
  public static final class QuestCreateEntityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestCreateEntityRsp)
      QuestCreateEntityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestCreateEntityRsp.newBuilder() to construct.
    private QuestCreateEntityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestCreateEntityRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestCreateEntityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestCreateEntityRsp(
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

              questId_ = input.readUInt32();
              break;
            }
            case 48: {

              entityId_ = input.readUInt32();
              break;
            }
            case 56: {

              parentQuestId_ = input.readUInt32();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ = input.readMessage(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              isRewind_ = input.readBool();
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
      return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.internal_static_QuestCreateEntityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.internal_static_QuestCreateEntityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.class, emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.Builder.class);
    }

    public static final int ISREWIND_FIELD_NUMBER = 14;
    private boolean isRewind_;
    /**
     * <code>bool isRewind = 14;</code>
     * @return The isRewind.
     */
    @java.lang.Override
    public boolean getIsRewind() {
      return isRewind_;
    }

    public static final int PARENTQUESTID_FIELD_NUMBER = 7;
    private int parentQuestId_;
    /**
     * <code>uint32 parentQuestId = 7;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int ENTITY_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     * @return The entity.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return getEntity();
    }

    public static final int ENTITYID_FIELD_NUMBER = 6;
    private int entityId_;
    /**
     * <code>uint32 entityId = 6;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
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
      if (questId_ != 0) {
        output.writeUInt32(3, questId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(6, entityId_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(7, parentQuestId_);
      }
      if (entity_ != null) {
        output.writeMessage(12, getEntity());
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      if (isRewind_ != false) {
        output.writeBool(14, isRewind_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, questId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, entityId_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, parentQuestId_);
      }
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getEntity());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
      }
      if (isRewind_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isRewind_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp other = (emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp) obj;

      if (getIsRewind()
          != other.getIsRewind()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + ISREWIND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRewind());
      hash = (37 * hash) + PARENTQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + QUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp prototype) {
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
     *enum LKNGENJJKNO {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 424;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code QuestCreateEntityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestCreateEntityRsp)
        emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.internal_static_QuestCreateEntityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.internal_static_QuestCreateEntityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.class, emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.newBuilder()
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
        isRewind_ = false;

        parentQuestId_ = 0;

        if (entityBuilder_ == null) {
          entity_ = null;
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }
        entityId_ = 0;

        questId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.internal_static_QuestCreateEntityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp build() {
        emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp buildPartial() {
        emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp result = new emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp(this);
        result.isRewind_ = isRewind_;
        result.parentQuestId_ = parentQuestId_;
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.questId_ = questId_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp other) {
        if (other == emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp.getDefaultInstance()) return this;
        if (other.getIsRewind() != false) {
          setIsRewind(other.getIsRewind());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
        emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isRewind_ ;
      /**
       * <code>bool isRewind = 14;</code>
       * @return The isRewind.
       */
      @java.lang.Override
      public boolean getIsRewind() {
        return isRewind_;
      }
      /**
       * <code>bool isRewind = 14;</code>
       * @param value The isRewind to set.
       * @return This builder for chaining.
       */
      public Builder setIsRewind(boolean value) {
        
        isRewind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isRewind = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRewind() {
        
        isRewind_ = false;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parentQuestId = 7;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parentQuestId = 7;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parentQuestId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return entityBuilder_ != null || entity_ != null;
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       * @return The entity.
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public Builder setEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
          onChanged();
        } else {
          entityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public Builder setEntity(
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
          onChanged();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public Builder mergeEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (entity_ != null) {
            entity_ =
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.newBuilder(entity_).mergeFrom(value).buildPartial();
          } else {
            entity_ = value;
          }
          onChanged();
        } else {
          entityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = null;
          onChanged();
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 6;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 6;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:QuestCreateEntityRsp)
    }

    // @@protoc_insertion_point(class_scope:QuestCreateEntityRsp)
    private static final emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp();
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestCreateEntityRsp>
        PARSER = new com.google.protobuf.AbstractParser<QuestCreateEntityRsp>() {
      @java.lang.Override
      public QuestCreateEntityRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestCreateEntityRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestCreateEntityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestCreateEntityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestCreateEntityRspOuterClass.QuestCreateEntityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestCreateEntityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestCreateEntityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestCreateEntityRsp.proto\032\026CreateEnti" +
      "tyInfo.proto\"\226\001\n\024QuestCreateEntityRsp\022\020\n" +
      "\010isRewind\030\016 \001(\010\022\025\n\rparentQuestId\030\007 \001(\r\022!" +
      "\n\006entity\030\014 \001(\0132\021.CreateEntityInfo\022\020\n\010ent" +
      "ityId\030\006 \001(\r\022\017\n\007questId\030\003 \001(\r\022\017\n\007retcode\030" +
      "\r \001(\005B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_QuestCreateEntityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestCreateEntityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestCreateEntityRsp_descriptor,
        new java.lang.String[] { "IsRewind", "ParentQuestId", "Entity", "EntityId", "QuestId", "Retcode", });
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
