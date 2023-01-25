// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocenceEditCarveCombinationReq.proto

package emu.grasscutter.net.proto;

public final class GravenInnocenceEditCarveCombinationReqOuterClass {
  private GravenInnocenceEditCarveCombinationReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocenceEditCarveCombinationReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocenceEditCarveCombinationReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     * @return Whether the combinationInfo field is set.
     */
    boolean hasCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     * @return The combinationInfo.
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder();

    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   *enum OGPPNOHCCAM {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 23125;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GravenInnocenceEditCarveCombinationReq}
   */
  public static final class GravenInnocenceEditCarveCombinationReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocenceEditCarveCombinationReq)
      GravenInnocenceEditCarveCombinationReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocenceEditCarveCombinationReq.newBuilder() to construct.
    private GravenInnocenceEditCarveCombinationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocenceEditCarveCombinationReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocenceEditCarveCombinationReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocenceEditCarveCombinationReq(
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
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder = null;
              if (combinationInfo_ != null) {
                subBuilder = combinationInfo_.toBuilder();
              }
              combinationInfo_ = input.readMessage(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(combinationInfo_);
                combinationInfo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.internal_static_GravenInnocenceEditCarveCombinationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.internal_static_GravenInnocenceEditCarveCombinationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.class, emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.Builder.class);
    }

    public static final int COMBINATIONINFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     * @return Whether the combinationInfo field is set.
     */
    @java.lang.Override
    public boolean hasCombinationInfo() {
      return combinationInfo_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     * @return The combinationInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
      return combinationInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
    }
    /**
     * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
      return getCombinationInfo();
    }

    public static final int ENTITYID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (combinationInfo_ != null) {
        output.writeMessage(15, getCombinationInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (combinationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getCombinationInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq other = (emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq) obj;

      if (hasCombinationInfo() != other.hasCombinationInfo()) return false;
      if (hasCombinationInfo()) {
        if (!getCombinationInfo()
            .equals(other.getCombinationInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasCombinationInfo()) {
        hash = (37 * hash) + COMBINATIONINFO_FIELD_NUMBER;
        hash = (53 * hash) + getCombinationInfo().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq prototype) {
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
     *enum OGPPNOHCCAM {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 23125;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GravenInnocenceEditCarveCombinationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocenceEditCarveCombinationReq)
        emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.internal_static_GravenInnocenceEditCarveCombinationReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.internal_static_GravenInnocenceEditCarveCombinationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.class, emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.newBuilder()
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
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.internal_static_GravenInnocenceEditCarveCombinationReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq build() {
        emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq buildPartial() {
        emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq result = new emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq(this);
        if (combinationInfoBuilder_ == null) {
          result.combinationInfo_ = combinationInfo_;
        } else {
          result.combinationInfo_ = combinationInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq other) {
        if (other == emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq.getDefaultInstance()) return this;
        if (other.hasCombinationInfo()) {
          mergeCombinationInfo(other.getCombinationInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> combinationInfoBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       * @return Whether the combinationInfo field is set.
       */
      public boolean hasCombinationInfo() {
        return combinationInfoBuilder_ != null || combinationInfo_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       * @return The combinationInfo.
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          return combinationInfo_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        } else {
          return combinationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public Builder setCombinationInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          combinationInfo_ = value;
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public Builder setCombinationInfo(
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = builderForValue.build();
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public Builder mergeCombinationInfo(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (combinationInfo_ != null) {
            combinationInfo_ =
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(combinationInfo_).mergeFrom(value).buildPartial();
          } else {
            combinationInfo_ = value;
          }
          onChanged();
        } else {
          combinationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public Builder clearCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
          onChanged();
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getCombinationInfoBuilder() {
        
        onChanged();
        return getCombinationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
        if (combinationInfoBuilder_ != null) {
          return combinationInfoBuilder_.getMessageOrBuilder();
        } else {
          return combinationInfo_ == null ?
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combinationInfo = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getCombinationInfoFieldBuilder() {
        if (combinationInfoBuilder_ == null) {
          combinationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getCombinationInfo(),
                  getParentForChildren(),
                  isClean());
          combinationInfo_ = null;
        }
        return combinationInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocenceEditCarveCombinationReq)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocenceEditCarveCombinationReq)
    private static final emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq();
    }

    public static emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocenceEditCarveCombinationReq>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocenceEditCarveCombinationReq>() {
      @java.lang.Override
      public GravenInnocenceEditCarveCombinationReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocenceEditCarveCombinationReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocenceEditCarveCombinationReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocenceEditCarveCombinationReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocenceEditCarveCombinationReqOuterClass.GravenInnocenceEditCarveCombinationReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocenceEditCarveCombinationReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocenceEditCarveCombinationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,GravenInnocenceEditCarveCombinationReq" +
      ".proto\032\032CustomGadgetTreeInfo.proto\"j\n&Gr" +
      "avenInnocenceEditCarveCombinationReq\022.\n\017" +
      "combinationInfo\030\017 \001(\0132\025.CustomGadgetTree" +
      "Info\022\020\n\010entityId\030\005 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_GravenInnocenceEditCarveCombinationReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocenceEditCarveCombinationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocenceEditCarveCombinationReq_descriptor,
        new java.lang.String[] { "CombinationInfo", "EntityId", });
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
