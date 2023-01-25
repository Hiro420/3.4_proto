// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgSelectOnStage.proto

package emu.grasscutter.net.proto;

public final class GCGMsgSelectOnStageOuterClass {
  private GCGMsgSelectOnStageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgSelectOnStageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgSelectOnStage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGReason reason = 13;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 13;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>uint32 cardGuid = 5;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 controllerId = 2;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * Protobuf type {@code GCGMsgSelectOnStage}
   */
  public static final class GCGMsgSelectOnStage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgSelectOnStage)
      GCGMsgSelectOnStageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgSelectOnStage.newBuilder() to construct.
    private GCGMsgSelectOnStage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgSelectOnStage() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgSelectOnStage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgSelectOnStage(
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

              controllerId_ = input.readUInt32();
              break;
            }
            case 40: {

              cardGuid_ = input.readUInt32();
              break;
            }
            case 104: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.internal_static_GCGMsgSelectOnStage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.internal_static_GCGMsgSelectOnStage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.class, emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 13;
    private int reason_;
    /**
     * <code>.GCGReason reason = 13;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 13;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int CARDGUID_FIELD_NUMBER = 5;
    private int cardGuid_;
    /**
     * <code>uint32 cardGuid = 5;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 2;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 2;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      if (controllerId_ != 0) {
        output.writeUInt32(2, controllerId_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(5, cardGuid_);
      }
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(13, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, controllerId_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cardGuid_);
      }
      if (reason_ != emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage other = (emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage) obj;

      if (reason_ != other.reason_) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + CARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage prototype) {
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
     * Protobuf type {@code GCGMsgSelectOnStage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgSelectOnStage)
        emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.internal_static_GCGMsgSelectOnStage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.internal_static_GCGMsgSelectOnStage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.class, emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.newBuilder()
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
        reason_ = 0;

        cardGuid_ = 0;

        controllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.internal_static_GCGMsgSelectOnStage_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage build() {
        emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage buildPartial() {
        emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage result = new emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage(this);
        result.reason_ = reason_;
        result.cardGuid_ = cardGuid_;
        result.controllerId_ = controllerId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage other) {
        if (other == emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
        emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 13;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 13;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 13;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 13;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 cardGuid = 5;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 cardGuid = 5;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardGuid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 2;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 2;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgSelectOnStage)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgSelectOnStage)
    private static final emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage();
    }

    public static emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgSelectOnStage>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgSelectOnStage>() {
      @java.lang.Override
      public GCGMsgSelectOnStage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgSelectOnStage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgSelectOnStage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgSelectOnStage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgSelectOnStageOuterClass.GCGMsgSelectOnStage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgSelectOnStage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgSelectOnStage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGMsgSelectOnStage.proto\032\017GCGReason.p" +
      "roto\"Y\n\023GCGMsgSelectOnStage\022\032\n\006reason\030\r " +
      "\001(\0162\n.GCGReason\022\020\n\010cardGuid\030\005 \001(\r\022\024\n\014con" +
      "trollerId\030\002 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgSelectOnStage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgSelectOnStage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgSelectOnStage_descriptor,
        new java.lang.String[] { "Reason", "CardGuid", "ControllerId", });
    emu.grasscutter.net.proto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
