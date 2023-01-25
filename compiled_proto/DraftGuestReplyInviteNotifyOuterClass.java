// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyInviteNotify.proto

package emu.grasscutter.net.proto;

public final class DraftGuestReplyInviteNotifyOuterClass {
  private DraftGuestReplyInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 guestUid = 13;</code>
     * @return The guestUid.
     */
    int getGuestUid();

    /**
     * <code>uint32 draftId = 15;</code>
     * @return The draftId.
     */
    int getDraftId();

    /**
     * <code>bool isAgree = 7;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();
  }
  /**
   * <pre>
   *enum MFEGBELFGPP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5470;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyInviteNotify}
   */
  public static final class DraftGuestReplyInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyInviteNotify)
      DraftGuestReplyInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyInviteNotify.newBuilder() to construct.
    private DraftGuestReplyInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DraftGuestReplyInviteNotify(
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
            case 56: {

              isAgree_ = input.readBool();
              break;
            }
            case 104: {

              guestUid_ = input.readUInt32();
              break;
            }
            case 120: {

              draftId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
    }

    public static final int GUESTUID_FIELD_NUMBER = 13;
    private int guestUid_;
    /**
     * <code>uint32 guestUid = 13;</code>
     * @return The guestUid.
     */
    @java.lang.Override
    public int getGuestUid() {
      return guestUid_;
    }

    public static final int DRAFTID_FIELD_NUMBER = 15;
    private int draftId_;
    /**
     * <code>uint32 draftId = 15;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
    }

    public static final int ISAGREE_FIELD_NUMBER = 7;
    private boolean isAgree_;
    /**
     * <code>bool isAgree = 7;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
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
      if (isAgree_ != false) {
        output.writeBool(7, isAgree_);
      }
      if (guestUid_ != 0) {
        output.writeUInt32(13, guestUid_);
      }
      if (draftId_ != 0) {
        output.writeUInt32(15, draftId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAgree_);
      }
      if (guestUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, guestUid_);
      }
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, draftId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other = (emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) obj;

      if (getGuestUid()
          != other.getGuestUid()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
      if (getIsAgree()
          != other.getIsAgree()) return false;
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
      hash = (37 * hash) + GUESTUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuestUid();
      hash = (37 * hash) + DRAFTID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (37 * hash) + ISAGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify prototype) {
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
     *enum MFEGBELFGPP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5470;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyInviteNotify)
        emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.newBuilder()
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
        guestUid_ = 0;

        draftId_ = 0;

        isAgree_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify build() {
        emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify buildPartial() {
        emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = new emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify(this);
        result.guestUid_ = guestUid_;
        result.draftId_ = draftId_;
        result.isAgree_ = isAgree_;
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
        if (other instanceof emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other) {
        if (other == emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance()) return this;
        if (other.getGuestUid() != 0) {
          setGuestUid(other.getGuestUid());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
        }
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
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
        emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int guestUid_ ;
      /**
       * <code>uint32 guestUid = 13;</code>
       * @return The guestUid.
       */
      @java.lang.Override
      public int getGuestUid() {
        return guestUid_;
      }
      /**
       * <code>uint32 guestUid = 13;</code>
       * @param value The guestUid to set.
       * @return This builder for chaining.
       */
      public Builder setGuestUid(int value) {
        
        guestUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guestUid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuestUid() {
        
        guestUid_ = 0;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draftId = 15;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draftId = 15;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draftId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool isAgree = 7;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool isAgree = 7;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAgree = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
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


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyInviteNotify)
    private static final emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify();
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyInviteNotify>() {
      @java.lang.Override
      public DraftGuestReplyInviteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DraftGuestReplyInviteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DraftGuestReplyInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!DraftGuestReplyInviteNotify.proto\"Q\n\033D" +
      "raftGuestReplyInviteNotify\022\020\n\010guestUid\030\r" +
      " \001(\r\022\017\n\007draftId\030\017 \001(\r\022\017\n\007isAgree\030\007 \001(\010B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyInviteNotify_descriptor,
        new java.lang.String[] { "GuestUid", "DraftId", "IsAgree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
