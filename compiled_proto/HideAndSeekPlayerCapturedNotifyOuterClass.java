// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekPlayerCapturedNotify.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekPlayerCapturedNotifyOuterClass {
  private HideAndSeekPlayerCapturedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekPlayerCapturedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekPlayerCapturedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ghostSkillId = 13;</code>
     * @return The ghostSkillId.
     */
    int getGhostSkillId();
  }
  /**
   * <pre>
   *enum AKLNMHDJEAB {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5551;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code HideAndSeekPlayerCapturedNotify}
   */
  public static final class HideAndSeekPlayerCapturedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekPlayerCapturedNotify)
      HideAndSeekPlayerCapturedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekPlayerCapturedNotify.newBuilder() to construct.
    private HideAndSeekPlayerCapturedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekPlayerCapturedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekPlayerCapturedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HideAndSeekPlayerCapturedNotify(
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

              ghostSkillId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.class, emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.Builder.class);
    }

    public static final int GHOSTSKILLID_FIELD_NUMBER = 13;
    private int ghostSkillId_;
    /**
     * <code>uint32 ghostSkillId = 13;</code>
     * @return The ghostSkillId.
     */
    @java.lang.Override
    public int getGhostSkillId() {
      return ghostSkillId_;
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
      if (ghostSkillId_ != 0) {
        output.writeUInt32(13, ghostSkillId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ghostSkillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, ghostSkillId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify other = (emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify) obj;

      if (getGhostSkillId()
          != other.getGhostSkillId()) return false;
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
      hash = (37 * hash) + GHOSTSKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getGhostSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify prototype) {
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
     *enum AKLNMHDJEAB {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5551;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code HideAndSeekPlayerCapturedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekPlayerCapturedNotify)
        emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.class, emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.newBuilder()
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
        ghostSkillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify build() {
        emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify buildPartial() {
        emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify result = new emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify(this);
        result.ghostSkillId_ = ghostSkillId_;
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
        if (other instanceof emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify other) {
        if (other == emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.getDefaultInstance()) return this;
        if (other.getGhostSkillId() != 0) {
          setGhostSkillId(other.getGhostSkillId());
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
        emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ghostSkillId_ ;
      /**
       * <code>uint32 ghostSkillId = 13;</code>
       * @return The ghostSkillId.
       */
      @java.lang.Override
      public int getGhostSkillId() {
        return ghostSkillId_;
      }
      /**
       * <code>uint32 ghostSkillId = 13;</code>
       * @param value The ghostSkillId to set.
       * @return This builder for chaining.
       */
      public Builder setGhostSkillId(int value) {
        
        ghostSkillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ghostSkillId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGhostSkillId() {
        
        ghostSkillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekPlayerCapturedNotify)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekPlayerCapturedNotify)
    private static final emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify();
    }

    public static emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekPlayerCapturedNotify>() {
      @java.lang.Override
      public HideAndSeekPlayerCapturedNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekPlayerCapturedNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HideAndSeekPlayerCapturedNotify.proto\"" +
      "7\n\037HideAndSeekPlayerCapturedNotify\022\024\n\014gh" +
      "ostSkillId\030\r \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekPlayerCapturedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekPlayerCapturedNotify_descriptor,
        new java.lang.String[] { "GhostSkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
