// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetFriendRemarkNameRsp.proto

package emu.grasscutter.net.proto;

public final class SetFriendRemarkNameRspOuterClass {
  private SetFriendRemarkNameRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetFriendRemarkNameRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetFriendRemarkNameRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string remarkName = 12;</code>
     * @return The remarkName.
     */
    java.lang.String getRemarkName();
    /**
     * <code>string remarkName = 12;</code>
     * @return The bytes for remarkName.
     */
    com.google.protobuf.ByteString
        getRemarkNameBytes();

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>bool isClearRemark = 6;</code>
     * @return The isClearRemark.
     */
    boolean getIsClearRemark();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   *enum NDICEJFAIGO {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4081;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code SetFriendRemarkNameRsp}
   */
  public static final class SetFriendRemarkNameRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetFriendRemarkNameRsp)
      SetFriendRemarkNameRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetFriendRemarkNameRsp.newBuilder() to construct.
    private SetFriendRemarkNameRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetFriendRemarkNameRsp() {
      remarkName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetFriendRemarkNameRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetFriendRemarkNameRsp(
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              isClearRemark_ = input.readBool();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              remarkName_ = s;
              break;
            }
            case 112: {

              uid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.class, emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.Builder.class);
    }

    public static final int REMARKNAME_FIELD_NUMBER = 12;
    private volatile java.lang.Object remarkName_;
    /**
     * <code>string remarkName = 12;</code>
     * @return The remarkName.
     */
    @java.lang.Override
    public java.lang.String getRemarkName() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remarkName_ = s;
        return s;
      }
    }
    /**
     * <code>string remarkName = 12;</code>
     * @return The bytes for remarkName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarkNameBytes() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remarkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int ISCLEARREMARK_FIELD_NUMBER = 6;
    private boolean isClearRemark_;
    /**
     * <code>bool isClearRemark = 6;</code>
     * @return The isClearRemark.
     */
    @java.lang.Override
    public boolean getIsClearRemark() {
      return isClearRemark_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (isClearRemark_ != false) {
        output.writeBool(6, isClearRemark_);
      }
      if (!getRemarkNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, remarkName_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (isClearRemark_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isClearRemark_);
      }
      if (!getRemarkNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, remarkName_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp other = (emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp) obj;

      if (!getRemarkName()
          .equals(other.getRemarkName())) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getIsClearRemark()
          != other.getIsClearRemark()) return false;
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
      hash = (37 * hash) + REMARKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getRemarkName().hashCode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + ISCLEARREMARK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsClearRemark());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp prototype) {
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
     *enum NDICEJFAIGO {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4081;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code SetFriendRemarkNameRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetFriendRemarkNameRsp)
        emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.class, emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.newBuilder()
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
        remarkName_ = "";

        uid_ = 0;

        isClearRemark_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp build() {
        emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp buildPartial() {
        emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp result = new emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp(this);
        result.remarkName_ = remarkName_;
        result.uid_ = uid_;
        result.isClearRemark_ = isClearRemark_;
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
        if (other instanceof emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp other) {
        if (other == emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.getDefaultInstance()) return this;
        if (!other.getRemarkName().isEmpty()) {
          remarkName_ = other.remarkName_;
          onChanged();
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getIsClearRemark() != false) {
          setIsClearRemark(other.getIsClearRemark());
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
        emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object remarkName_ = "";
      /**
       * <code>string remarkName = 12;</code>
       * @return The remarkName.
       */
      public java.lang.String getRemarkName() {
        java.lang.Object ref = remarkName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          remarkName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string remarkName = 12;</code>
       * @return The bytes for remarkName.
       */
      public com.google.protobuf.ByteString
          getRemarkNameBytes() {
        java.lang.Object ref = remarkName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          remarkName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string remarkName = 12;</code>
       * @param value The remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        remarkName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string remarkName = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemarkName() {
        
        remarkName_ = getDefaultInstance().getRemarkName();
        onChanged();
        return this;
      }
      /**
       * <code>string remarkName = 12;</code>
       * @param value The bytes for remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        remarkName_ = value;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private boolean isClearRemark_ ;
      /**
       * <code>bool isClearRemark = 6;</code>
       * @return The isClearRemark.
       */
      @java.lang.Override
      public boolean getIsClearRemark() {
        return isClearRemark_;
      }
      /**
       * <code>bool isClearRemark = 6;</code>
       * @param value The isClearRemark to set.
       * @return This builder for chaining.
       */
      public Builder setIsClearRemark(boolean value) {
        
        isClearRemark_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isClearRemark = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsClearRemark() {
        
        isClearRemark_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:SetFriendRemarkNameRsp)
    }

    // @@protoc_insertion_point(class_scope:SetFriendRemarkNameRsp)
    private static final emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp();
    }

    public static emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetFriendRemarkNameRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetFriendRemarkNameRsp>() {
      @java.lang.Override
      public SetFriendRemarkNameRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetFriendRemarkNameRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetFriendRemarkNameRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetFriendRemarkNameRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetFriendRemarkNameRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetFriendRemarkNameRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetFriendRemarkNameRsp.proto\"a\n\026SetFri" +
      "endRemarkNameRsp\022\022\n\nremarkName\030\014 \001(\t\022\013\n\003" +
      "uid\030\016 \001(\r\022\025\n\risClearRemark\030\006 \001(\010\022\017\n\007retc" +
      "ode\030\001 \001(\005B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetFriendRemarkNameRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetFriendRemarkNameRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetFriendRemarkNameRsp_descriptor,
        new java.lang.String[] { "RemarkName", "Uid", "IsClearRemark", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
