// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonAddObstacleRsp.proto

package emu.grasscutter.net.proto;

public final class ToTheMoonAddObstacleRspOuterClass {
  private ToTheMoonAddObstacleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonAddObstacleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonAddObstacleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>int32 queryId = 8;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     * @return Whether the dynamicNodes field is set.
     */
    boolean hasDynamicNodes();
    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     * @return The dynamicNodes.
     */
    emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes();
    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     */
    emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder();
  }
  /**
   * <pre>
   *enum FAJPJAOONHC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 6180;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ToTheMoonAddObstacleRsp}
   */
  public static final class ToTheMoonAddObstacleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonAddObstacleRsp)
      ToTheMoonAddObstacleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonAddObstacleRsp.newBuilder() to construct.
    private ToTheMoonAddObstacleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonAddObstacleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonAddObstacleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonAddObstacleRsp(
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
            case 34: {
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder subBuilder = null;
              if (dynamicNodes_ != null) {
                subBuilder = dynamicNodes_.toBuilder();
              }
              dynamicNodes_ = input.readMessage(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dynamicNodes_);
                dynamicNodes_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              queryId_ = input.readInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.internal_static_ToTheMoonAddObstacleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.internal_static_ToTheMoonAddObstacleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.class, emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int QUERYID_FIELD_NUMBER = 8;
    private int queryId_;
    /**
     * <code>int32 queryId = 8;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int DYNAMICNODES_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes dynamicNodes_;
    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     * @return Whether the dynamicNodes field is set.
     */
    @java.lang.Override
    public boolean hasDynamicNodes() {
      return dynamicNodes_ != null;
    }
    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     * @return The dynamicNodes.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes() {
      return dynamicNodes_ == null ? emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
    }
    /**
     * <code>.DynamicNodes dynamicNodes = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder() {
      return getDynamicNodes();
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
      if (dynamicNodes_ != null) {
        output.writeMessage(4, getDynamicNodes());
      }
      if (queryId_ != 0) {
        output.writeInt32(8, queryId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dynamicNodes_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getDynamicNodes());
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, queryId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp other = (emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
      if (hasDynamicNodes() != other.hasDynamicNodes()) return false;
      if (hasDynamicNodes()) {
        if (!getDynamicNodes()
            .equals(other.getDynamicNodes())) return false;
      }
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
      hash = (37 * hash) + QUERYID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      if (hasDynamicNodes()) {
        hash = (37 * hash) + DYNAMICNODES_FIELD_NUMBER;
        hash = (53 * hash) + getDynamicNodes().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp prototype) {
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
     *enum FAJPJAOONHC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 6180;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ToTheMoonAddObstacleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonAddObstacleRsp)
        emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.internal_static_ToTheMoonAddObstacleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.internal_static_ToTheMoonAddObstacleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.class, emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.newBuilder()
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

        queryId_ = 0;

        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = null;
        } else {
          dynamicNodes_ = null;
          dynamicNodesBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.internal_static_ToTheMoonAddObstacleRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp build() {
        emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp buildPartial() {
        emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp result = new emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp(this);
        result.retcode_ = retcode_;
        result.queryId_ = queryId_;
        if (dynamicNodesBuilder_ == null) {
          result.dynamicNodes_ = dynamicNodes_;
        } else {
          result.dynamicNodes_ = dynamicNodesBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp other) {
        if (other == emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.hasDynamicNodes()) {
          mergeDynamicNodes(other.getDynamicNodes());
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
        emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 queryId = 8;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 queryId = 8;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 queryId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes dynamicNodes_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder> dynamicNodesBuilder_;
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       * @return Whether the dynamicNodes field is set.
       */
      public boolean hasDynamicNodes() {
        return dynamicNodesBuilder_ != null || dynamicNodes_ != null;
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       * @return The dynamicNodes.
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes getDynamicNodes() {
        if (dynamicNodesBuilder_ == null) {
          return dynamicNodes_ == null ? emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
        } else {
          return dynamicNodesBuilder_.getMessage();
        }
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public Builder setDynamicNodes(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes value) {
        if (dynamicNodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dynamicNodes_ = value;
          onChanged();
        } else {
          dynamicNodesBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public Builder setDynamicNodes(
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder builderForValue) {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = builderForValue.build();
          onChanged();
        } else {
          dynamicNodesBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public Builder mergeDynamicNodes(emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes value) {
        if (dynamicNodesBuilder_ == null) {
          if (dynamicNodes_ != null) {
            dynamicNodes_ =
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.newBuilder(dynamicNodes_).mergeFrom(value).buildPartial();
          } else {
            dynamicNodes_ = value;
          }
          onChanged();
        } else {
          dynamicNodesBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public Builder clearDynamicNodes() {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodes_ = null;
          onChanged();
        } else {
          dynamicNodes_ = null;
          dynamicNodesBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder getDynamicNodesBuilder() {
        
        onChanged();
        return getDynamicNodesFieldBuilder().getBuilder();
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      public emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder getDynamicNodesOrBuilder() {
        if (dynamicNodesBuilder_ != null) {
          return dynamicNodesBuilder_.getMessageOrBuilder();
        } else {
          return dynamicNodes_ == null ?
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.getDefaultInstance() : dynamicNodes_;
        }
      }
      /**
       * <code>.DynamicNodes dynamicNodes = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder> 
          getDynamicNodesFieldBuilder() {
        if (dynamicNodesBuilder_ == null) {
          dynamicNodesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodes.Builder, emu.grasscutter.net.proto.DynamicNodesOuterClass.DynamicNodesOrBuilder>(
                  getDynamicNodes(),
                  getParentForChildren(),
                  isClean());
          dynamicNodes_ = null;
        }
        return dynamicNodesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonAddObstacleRsp)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonAddObstacleRsp)
    private static final emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp();
    }

    public static emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonAddObstacleRsp>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonAddObstacleRsp>() {
      @java.lang.Override
      public ToTheMoonAddObstacleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonAddObstacleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonAddObstacleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonAddObstacleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonAddObstacleRspOuterClass.ToTheMoonAddObstacleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonAddObstacleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonAddObstacleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ToTheMoonAddObstacleRsp.proto\032\022Dynamic" +
      "Nodes.proto\"`\n\027ToTheMoonAddObstacleRsp\022\017" +
      "\n\007retcode\030\013 \001(\005\022\017\n\007queryId\030\010 \001(\005\022#\n\014dyna" +
      "micNodes\030\004 \001(\0132\r.DynamicNodesB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DynamicNodesOuterClass.getDescriptor(),
        });
    internal_static_ToTheMoonAddObstacleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonAddObstacleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonAddObstacleRsp_descriptor,
        new java.lang.String[] { "Retcode", "QueryId", "DynamicNodes", });
    emu.grasscutter.net.proto.DynamicNodesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
