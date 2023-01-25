// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGBasicDataNotify.proto

package emu.grasscutter.net.proto;

public final class GCGBasicDataNotifyOuterClass {
  private GCGBasicDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGBasicDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGBasicDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGTavernNpcInfo option = 13;</code>
     * @return The enum numeric value on the wire for option.
     */
    int getOptionValue();
    /**
     * <code>.GCGTavernNpcInfo option = 13;</code>
     * @return The option.
     */
    emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getOption();
  }
  /**
   * <pre>
   *enum MFOGKBFIDLO {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7511;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGBasicDataNotify}
   */
  public static final class GCGBasicDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGBasicDataNotify)
      GCGBasicDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGBasicDataNotify.newBuilder() to construct.
    private GCGBasicDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGBasicDataNotify() {
      option_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGBasicDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGBasicDataNotify(
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
            case 104: {
              int rawValue = input.readEnum();

              option_ = rawValue;
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
      return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.internal_static_GCGBasicDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.internal_static_GCGBasicDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.class, emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.Builder.class);
    }

    public static final int OPTION_FIELD_NUMBER = 13;
    private int option_;
    /**
     * <code>.GCGTavernNpcInfo option = 13;</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <code>.GCGTavernNpcInfo option = 13;</code>
     * @return The option.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getOption() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo result = emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.valueOf(option_);
      return result == null ? emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.UNRECOGNIZED : result;
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
      if (option_ != emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.GCG_SETTLE_OPTION_OPT_NONE.getNumber()) {
        output.writeEnum(13, option_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (option_ != emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.GCG_SETTLE_OPTION_OPT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, option_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify other = (emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify) obj;

      if (option_ != other.option_) return false;
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
      hash = (37 * hash) + OPTION_FIELD_NUMBER;
      hash = (53 * hash) + option_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify prototype) {
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
     *enum MFOGKBFIDLO {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7511;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGBasicDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGBasicDataNotify)
        emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.internal_static_GCGBasicDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.internal_static_GCGBasicDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.class, emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.newBuilder()
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
        option_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.internal_static_GCGBasicDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify build() {
        emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify buildPartial() {
        emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify result = new emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify(this);
        result.option_ = option_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify other) {
        if (other == emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify.getDefaultInstance()) return this;
        if (other.option_ != 0) {
          setOptionValue(other.getOptionValue());
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
        emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int option_ = 0;
      /**
       * <code>.GCGTavernNpcInfo option = 13;</code>
       * @return The enum numeric value on the wire for option.
       */
      @java.lang.Override public int getOptionValue() {
        return option_;
      }
      /**
       * <code>.GCGTavernNpcInfo option = 13;</code>
       * @param value The enum numeric value on the wire for option to set.
       * @return This builder for chaining.
       */
      public Builder setOptionValue(int value) {
        
        option_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGTavernNpcInfo option = 13;</code>
       * @return The option.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo getOption() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo result = emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.valueOf(option_);
        return result == null ? emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGTavernNpcInfo option = 13;</code>
       * @param value The option to set.
       * @return This builder for chaining.
       */
      public Builder setOption(emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.GCGTavernNpcInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        option_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGTavernNpcInfo option = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOption() {
        
        option_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGBasicDataNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGBasicDataNotify)
    private static final emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify();
    }

    public static emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGBasicDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGBasicDataNotify>() {
      @java.lang.Override
      public GCGBasicDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGBasicDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGBasicDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGBasicDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGBasicDataNotifyOuterClass.GCGBasicDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGBasicDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGBasicDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGBasicDataNotify.proto\032\026GCGTavernNpc" +
      "Info.proto\"7\n\022GCGBasicDataNotify\022!\n\006opti" +
      "on\030\r \001(\0162\021.GCGTavernNpcInfoB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGBasicDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGBasicDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGBasicDataNotify_descriptor,
        new java.lang.String[] { "Option", });
    emu.grasscutter.net.proto.GCGTavernNpcInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}