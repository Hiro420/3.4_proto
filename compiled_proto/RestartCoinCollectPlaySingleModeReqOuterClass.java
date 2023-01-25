// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RestartCoinCollectPlaySingleModeReq.proto

package emu.grasscutter.net.proto;

public final class RestartCoinCollectPlaySingleModeReqOuterClass {
  private RestartCoinCollectPlaySingleModeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RestartCoinCollectPlaySingleModeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RestartCoinCollectPlaySingleModeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 levelId = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 multistagePlayIndex = 4;</code>
     * @return The multistagePlayIndex.
     */
    int getMultistagePlayIndex();
  }
  /**
   * <pre>
   *enum HMOLHOLNNMC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 22217;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code RestartCoinCollectPlaySingleModeReq}
   */
  public static final class RestartCoinCollectPlaySingleModeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RestartCoinCollectPlaySingleModeReq)
      RestartCoinCollectPlaySingleModeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RestartCoinCollectPlaySingleModeReq.newBuilder() to construct.
    private RestartCoinCollectPlaySingleModeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RestartCoinCollectPlaySingleModeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RestartCoinCollectPlaySingleModeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RestartCoinCollectPlaySingleModeReq(
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
            case 32: {

              multistagePlayIndex_ = input.readUInt32();
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.class, emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.Builder.class);
    }

    public static final int LEVELID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 levelId = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MULTISTAGEPLAYINDEX_FIELD_NUMBER = 4;
    private int multistagePlayIndex_;
    /**
     * <code>uint32 multistagePlayIndex = 4;</code>
     * @return The multistagePlayIndex.
     */
    @java.lang.Override
    public int getMultistagePlayIndex() {
      return multistagePlayIndex_;
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
      if (multistagePlayIndex_ != 0) {
        output.writeUInt32(4, multistagePlayIndex_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (multistagePlayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, multistagePlayIndex_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq other = (emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMultistagePlayIndex()
          != other.getMultistagePlayIndex()) return false;
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
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MULTISTAGEPLAYINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getMultistagePlayIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq prototype) {
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
     *enum HMOLHOLNNMC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 22217;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code RestartCoinCollectPlaySingleModeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RestartCoinCollectPlaySingleModeReq)
        emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.class, emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.newBuilder()
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
        levelId_ = 0;

        multistagePlayIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq build() {
        emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq buildPartial() {
        emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq result = new emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq(this);
        result.levelId_ = levelId_;
        result.multistagePlayIndex_ = multistagePlayIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq) {
          return mergeFrom((emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq other) {
        if (other == emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMultistagePlayIndex() != 0) {
          setMultistagePlayIndex(other.getMultistagePlayIndex());
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
        emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int multistagePlayIndex_ ;
      /**
       * <code>uint32 multistagePlayIndex = 4;</code>
       * @return The multistagePlayIndex.
       */
      @java.lang.Override
      public int getMultistagePlayIndex() {
        return multistagePlayIndex_;
      }
      /**
       * <code>uint32 multistagePlayIndex = 4;</code>
       * @param value The multistagePlayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setMultistagePlayIndex(int value) {
        
        multistagePlayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 multistagePlayIndex = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMultistagePlayIndex() {
        
        multistagePlayIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RestartCoinCollectPlaySingleModeReq)
    }

    // @@protoc_insertion_point(class_scope:RestartCoinCollectPlaySingleModeReq)
    private static final emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq();
    }

    public static emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq>
        PARSER = new com.google.protobuf.AbstractParser<RestartCoinCollectPlaySingleModeReq>() {
      @java.lang.Override
      public RestartCoinCollectPlaySingleModeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RestartCoinCollectPlaySingleModeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)RestartCoinCollectPlaySingleModeReq.pr" +
      "oto\"S\n#RestartCoinCollectPlaySingleModeR" +
      "eq\022\017\n\007levelId\030\r \001(\r\022\033\n\023multistagePlayInd" +
      "ex\030\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RestartCoinCollectPlaySingleModeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RestartCoinCollectPlaySingleModeReq_descriptor,
        new java.lang.String[] { "LevelId", "MultistagePlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
