// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAnimatorParameterNotify.proto

package emu.grasscutter.net.proto;

public final class EvtAnimatorParameterNotifyOuterClass {
  private EvtAnimatorParameterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAnimatorParameterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAnimatorParameterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    boolean hasAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     * @return The animatorParamInfo.
     */
    emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     */
    emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder();

    /**
     * <code>.ForwardType forwardType = 4;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forwardType = 4;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   *enum AHLNEJMIKCK {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 355;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code EvtAnimatorParameterNotify}
   */
  public static final class EvtAnimatorParameterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAnimatorParameterNotify)
      EvtAnimatorParameterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAnimatorParameterNotify.newBuilder() to construct.
    private EvtAnimatorParameterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAnimatorParameterNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAnimatorParameterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtAnimatorParameterNotify(
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
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder subBuilder = null;
              if (animatorParamInfo_ != null) {
                subBuilder = animatorParamInfo_.toBuilder();
              }
              animatorParamInfo_ = input.readMessage(emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(animatorParamInfo_);
                animatorParamInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
    }

    public static final int ANIMATORPARAMINFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    @java.lang.Override
    public boolean hasAnimatorParamInfo() {
      return animatorParamInfo_ != null;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     * @return The animatorParamInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
      return animatorParamInfo_ == null ? emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
      return getAnimatorParamInfo();
    }

    public static final int FORWARDTYPE_FIELD_NUMBER = 4;
    private int forwardType_;
    /**
     * <code>.ForwardType forwardType = 4;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forwardType = 4;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(4, forwardType_);
      }
      if (animatorParamInfo_ != null) {
        output.writeMessage(10, getAnimatorParamInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, forwardType_);
      }
      if (animatorParamInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getAnimatorParamInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other = (emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) obj;

      if (hasAnimatorParamInfo() != other.hasAnimatorParamInfo()) return false;
      if (hasAnimatorParamInfo()) {
        if (!getAnimatorParamInfo()
            .equals(other.getAnimatorParamInfo())) return false;
      }
      if (forwardType_ != other.forwardType_) return false;
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
      if (hasAnimatorParamInfo()) {
        hash = (37 * hash) + ANIMATORPARAMINFO_FIELD_NUMBER;
        hash = (53 * hash) + getAnimatorParamInfo().hashCode();
      }
      hash = (37 * hash) + FORWARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify prototype) {
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
     *enum AHLNEJMIKCK {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 355;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code EvtAnimatorParameterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAnimatorParameterNotify)
        emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.newBuilder()
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
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = null;
        } else {
          animatorParamInfo_ = null;
          animatorParamInfoBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify build() {
        emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify buildPartial() {
        emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = new emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify(this);
        if (animatorParamInfoBuilder_ == null) {
          result.animatorParamInfo_ = animatorParamInfo_;
        } else {
          result.animatorParamInfo_ = animatorParamInfoBuilder_.build();
        }
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other) {
        if (other == emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance()) return this;
        if (other.hasAnimatorParamInfo()) {
          mergeAnimatorParamInfo(other.getAnimatorParamInfo());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
        emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> animatorParamInfoBuilder_;
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       * @return Whether the animatorParamInfo field is set.
       */
      public boolean hasAnimatorParamInfo() {
        return animatorParamInfoBuilder_ != null || animatorParamInfo_ != null;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       * @return The animatorParamInfo.
       */
      public emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
        if (animatorParamInfoBuilder_ == null) {
          return animatorParamInfo_ == null ? emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        } else {
          return animatorParamInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public Builder setAnimatorParamInfo(emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          animatorParamInfo_ = value;
          onChanged();
        } else {
          animatorParamInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public Builder setAnimatorParamInfo(
          emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder builderForValue) {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = builderForValue.build();
          onChanged();
        } else {
          animatorParamInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public Builder mergeAnimatorParamInfo(emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (animatorParamInfo_ != null) {
            animatorParamInfo_ =
              emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.newBuilder(animatorParamInfo_).mergeFrom(value).buildPartial();
          } else {
            animatorParamInfo_ = value;
          }
          onChanged();
        } else {
          animatorParamInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public Builder clearAnimatorParamInfo() {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = null;
          onChanged();
        } else {
          animatorParamInfo_ = null;
          animatorParamInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder getAnimatorParamInfoBuilder() {
        
        onChanged();
        return getAnimatorParamInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      public emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
        if (animatorParamInfoBuilder_ != null) {
          return animatorParamInfoBuilder_.getMessageOrBuilder();
        } else {
          return animatorParamInfo_ == null ?
              emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animatorParamInfo = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> 
          getAnimatorParamInfoFieldBuilder() {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder>(
                  getAnimatorParamInfo(),
                  getParentForChildren(),
                  isClean());
          animatorParamInfo_ = null;
        }
        return animatorParamInfoBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forwardType = 4;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forwardType = 4;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 4;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forwardType = 4;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtAnimatorParameterNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAnimatorParameterNotify)
    private static final emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify();
    }

    public static emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAnimatorParameterNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAnimatorParameterNotify>() {
      @java.lang.Override
      public EvtAnimatorParameterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtAnimatorParameterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtAnimatorParameterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAnimatorParameterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAnimatorParameterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAnimatorParameterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAnimatorParameterNotify.proto\032\036EvtA" +
      "nimatorParameterInfo.proto\032\021ForwardType." +
      "proto\"u\n\032EvtAnimatorParameterNotify\0224\n\021a" +
      "nimatorParamInfo\030\n \001(\0132\031.EvtAnimatorPara" +
      "meterInfo\022!\n\013forwardType\030\004 \001(\0162\014.Forward" +
      "TypeB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtAnimatorParameterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAnimatorParameterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAnimatorParameterNotify_descriptor,
        new java.lang.String[] { "AnimatorParamInfo", "ForwardType", });
    emu.grasscutter.net.proto.EvtAnimatorParameterInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
