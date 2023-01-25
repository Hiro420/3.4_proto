// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayInviteResultNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayInviteResultNotifyOuterClass {
  private ScenePlayInviteResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayInviteResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayInviteResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 playId = 10;</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>bool isAllAgree = 4;</code>
     * @return The isAllAgree.
     */
    boolean getIsAllAgree();
  }
  /**
   * <pre>
   *enum LPKLIONOBLC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4364;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ScenePlayInviteResultNotify}
   */
  public static final class ScenePlayInviteResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayInviteResultNotify)
      ScenePlayInviteResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayInviteResultNotify.newBuilder() to construct.
    private ScenePlayInviteResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayInviteResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayInviteResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayInviteResultNotify(
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

              isAllAgree_ = input.readBool();
              break;
            }
            case 80: {

              playId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.internal_static_ScenePlayInviteResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.internal_static_ScenePlayInviteResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.class, emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.Builder.class);
    }

    public static final int PLAYID_FIELD_NUMBER = 10;
    private int playId_;
    /**
     * <code>uint32 playId = 10;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static final int ISALLAGREE_FIELD_NUMBER = 4;
    private boolean isAllAgree_;
    /**
     * <code>bool isAllAgree = 4;</code>
     * @return The isAllAgree.
     */
    @java.lang.Override
    public boolean getIsAllAgree() {
      return isAllAgree_;
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
      if (isAllAgree_ != false) {
        output.writeBool(4, isAllAgree_);
      }
      if (playId_ != 0) {
        output.writeUInt32(10, playId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAllAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAllAgree_);
      }
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, playId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify other = (emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify) obj;

      if (getPlayId()
          != other.getPlayId()) return false;
      if (getIsAllAgree()
          != other.getIsAllAgree()) return false;
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
      hash = (37 * hash) + PLAYID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (37 * hash) + ISALLAGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllAgree());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify prototype) {
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
     *enum LPKLIONOBLC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4364;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ScenePlayInviteResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayInviteResultNotify)
        emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.internal_static_ScenePlayInviteResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.internal_static_ScenePlayInviteResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.class, emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.newBuilder()
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
        playId_ = 0;

        isAllAgree_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.internal_static_ScenePlayInviteResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify build() {
        emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify buildPartial() {
        emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify result = new emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify(this);
        result.playId_ = playId_;
        result.isAllAgree_ = isAllAgree_;
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify other) {
        if (other == emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify.getDefaultInstance()) return this;
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
        }
        if (other.getIsAllAgree() != false) {
          setIsAllAgree(other.getIsAllAgree());
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
        emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 playId = 10;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 playId = 10;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllAgree_ ;
      /**
       * <code>bool isAllAgree = 4;</code>
       * @return The isAllAgree.
       */
      @java.lang.Override
      public boolean getIsAllAgree() {
        return isAllAgree_;
      }
      /**
       * <code>bool isAllAgree = 4;</code>
       * @param value The isAllAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllAgree(boolean value) {
        
        isAllAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAllAgree = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllAgree() {
        
        isAllAgree_ = false;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayInviteResultNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayInviteResultNotify)
    private static final emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify();
    }

    public static emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayInviteResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayInviteResultNotify>() {
      @java.lang.Override
      public ScenePlayInviteResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayInviteResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayInviteResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayInviteResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayInviteResultNotifyOuterClass.ScenePlayInviteResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayInviteResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayInviteResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ScenePlayInviteResultNotify.proto\"A\n\033S" +
      "cenePlayInviteResultNotify\022\016\n\006playId\030\n \001" +
      "(\r\022\022\n\nisAllAgree\030\004 \001(\010B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayInviteResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayInviteResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayInviteResultNotify_descriptor,
        new java.lang.String[] { "PlayId", "IsAllAgree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
