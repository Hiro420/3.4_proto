// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DBIBEJBEOEE.proto

package emu.grasscutter.net.proto;

public final class DBIBEJBEOEEOuterClass {
  private DBIBEJBEOEEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DBIBEJBEOEEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DBIBEJBEOEE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    java.lang.String getCreateTime();
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    com.google.protobuf.ByteString
        getCreateTimeBytes();

    /**
     * <code>int32 daehjagbjbl = 2;</code>
     * @return The daehjagbjbl.
     */
    int getDaehjagbjbl();

    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     * @return Whether the jkfdibhoggm field is set.
     */
    boolean hasJkfdibhoggm();
    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     * @return The jkfdibhoggm.
     */
    emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH getJkfdibhoggm();
    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     */
    emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder getJkfdibhoggmOrBuilder();
  }
  /**
   * Protobuf type {@code DBIBEJBEOEE}
   */
  public static final class DBIBEJBEOEE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DBIBEJBEOEE)
      DBIBEJBEOEEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DBIBEJBEOEE.newBuilder() to construct.
    private DBIBEJBEOEE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DBIBEJBEOEE() {
      createTime_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DBIBEJBEOEE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DBIBEJBEOEE(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              createTime_ = s;
              break;
            }
            case 16: {

              daehjagbjbl_ = input.readInt32();
              break;
            }
            case 26: {
              emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder subBuilder = null;
              if (jkfdibhoggm_ != null) {
                subBuilder = jkfdibhoggm_.toBuilder();
              }
              jkfdibhoggm_ = input.readMessage(emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jkfdibhoggm_);
                jkfdibhoggm_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.internal_static_DBIBEJBEOEE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.internal_static_DBIBEJBEOEE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.class, emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.Builder.class);
    }

    public static final int CREATETIME_FIELD_NUMBER = 1;
    private volatile java.lang.Object createTime_;
    /**
     * <code>string createTime = 1;</code>
     * @return The createTime.
     */
    @java.lang.Override
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      }
    }
    /**
     * <code>string createTime = 1;</code>
     * @return The bytes for createTime.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DAEHJAGBJBL_FIELD_NUMBER = 2;
    private int daehjagbjbl_;
    /**
     * <code>int32 daehjagbjbl = 2;</code>
     * @return The daehjagbjbl.
     */
    @java.lang.Override
    public int getDaehjagbjbl() {
      return daehjagbjbl_;
    }

    public static final int JKFDIBHOGGM_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH jkfdibhoggm_;
    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     * @return Whether the jkfdibhoggm field is set.
     */
    @java.lang.Override
    public boolean hasJkfdibhoggm() {
      return jkfdibhoggm_ != null;
    }
    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     * @return The jkfdibhoggm.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH getJkfdibhoggm() {
      return jkfdibhoggm_ == null ? emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.getDefaultInstance() : jkfdibhoggm_;
    }
    /**
     * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder getJkfdibhoggmOrBuilder() {
      return getJkfdibhoggm();
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
      if (!getCreateTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, createTime_);
      }
      if (daehjagbjbl_ != 0) {
        output.writeInt32(2, daehjagbjbl_);
      }
      if (jkfdibhoggm_ != null) {
        output.writeMessage(3, getJkfdibhoggm());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getCreateTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, createTime_);
      }
      if (daehjagbjbl_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, daehjagbjbl_);
      }
      if (jkfdibhoggm_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getJkfdibhoggm());
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
      if (!(obj instanceof emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE other = (emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE) obj;

      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
      if (getDaehjagbjbl()
          != other.getDaehjagbjbl()) return false;
      if (hasJkfdibhoggm() != other.hasJkfdibhoggm()) return false;
      if (hasJkfdibhoggm()) {
        if (!getJkfdibhoggm()
            .equals(other.getJkfdibhoggm())) return false;
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
      hash = (37 * hash) + CREATETIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      hash = (37 * hash) + DAEHJAGBJBL_FIELD_NUMBER;
      hash = (53 * hash) + getDaehjagbjbl();
      if (hasJkfdibhoggm()) {
        hash = (37 * hash) + JKFDIBHOGGM_FIELD_NUMBER;
        hash = (53 * hash) + getJkfdibhoggm().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE prototype) {
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
     * Protobuf type {@code DBIBEJBEOEE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DBIBEJBEOEE)
        emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.internal_static_DBIBEJBEOEE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.internal_static_DBIBEJBEOEE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.class, emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.newBuilder()
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
        createTime_ = "";

        daehjagbjbl_ = 0;

        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = null;
        } else {
          jkfdibhoggm_ = null;
          jkfdibhoggmBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.internal_static_DBIBEJBEOEE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE build() {
        emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE buildPartial() {
        emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE result = new emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE(this);
        result.createTime_ = createTime_;
        result.daehjagbjbl_ = daehjagbjbl_;
        if (jkfdibhoggmBuilder_ == null) {
          result.jkfdibhoggm_ = jkfdibhoggm_;
        } else {
          result.jkfdibhoggm_ = jkfdibhoggmBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE) {
          return mergeFrom((emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE other) {
        if (other == emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE.getDefaultInstance()) return this;
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
          onChanged();
        }
        if (other.getDaehjagbjbl() != 0) {
          setDaehjagbjbl(other.getDaehjagbjbl());
        }
        if (other.hasJkfdibhoggm()) {
          mergeJkfdibhoggm(other.getJkfdibhoggm());
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
        emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object createTime_ = "";
      /**
       * <code>string createTime = 1;</code>
       * @return The createTime.
       */
      public java.lang.String getCreateTime() {
        java.lang.Object ref = createTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          createTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @return The bytes for createTime.
       */
      public com.google.protobuf.ByteString
          getCreateTimeBytes() {
        java.lang.Object ref = createTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          createTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCreateTime() {
        
        createTime_ = getDefaultInstance().getCreateTime();
        onChanged();
        return this;
      }
      /**
       * <code>string createTime = 1;</code>
       * @param value The bytes for createTime to set.
       * @return This builder for chaining.
       */
      public Builder setCreateTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        createTime_ = value;
        onChanged();
        return this;
      }

      private int daehjagbjbl_ ;
      /**
       * <code>int32 daehjagbjbl = 2;</code>
       * @return The daehjagbjbl.
       */
      @java.lang.Override
      public int getDaehjagbjbl() {
        return daehjagbjbl_;
      }
      /**
       * <code>int32 daehjagbjbl = 2;</code>
       * @param value The daehjagbjbl to set.
       * @return This builder for chaining.
       */
      public Builder setDaehjagbjbl(int value) {
        
        daehjagbjbl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 daehjagbjbl = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDaehjagbjbl() {
        
        daehjagbjbl_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH jkfdibhoggm_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder> jkfdibhoggmBuilder_;
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       * @return Whether the jkfdibhoggm field is set.
       */
      public boolean hasJkfdibhoggm() {
        return jkfdibhoggmBuilder_ != null || jkfdibhoggm_ != null;
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       * @return The jkfdibhoggm.
       */
      public emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH getJkfdibhoggm() {
        if (jkfdibhoggmBuilder_ == null) {
          return jkfdibhoggm_ == null ? emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.getDefaultInstance() : jkfdibhoggm_;
        } else {
          return jkfdibhoggmBuilder_.getMessage();
        }
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public Builder setJkfdibhoggm(emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH value) {
        if (jkfdibhoggmBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jkfdibhoggm_ = value;
          onChanged();
        } else {
          jkfdibhoggmBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public Builder setJkfdibhoggm(
          emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder builderForValue) {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = builderForValue.build();
          onChanged();
        } else {
          jkfdibhoggmBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public Builder mergeJkfdibhoggm(emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH value) {
        if (jkfdibhoggmBuilder_ == null) {
          if (jkfdibhoggm_ != null) {
            jkfdibhoggm_ =
              emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.newBuilder(jkfdibhoggm_).mergeFrom(value).buildPartial();
          } else {
            jkfdibhoggm_ = value;
          }
          onChanged();
        } else {
          jkfdibhoggmBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public Builder clearJkfdibhoggm() {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggm_ = null;
          onChanged();
        } else {
          jkfdibhoggm_ = null;
          jkfdibhoggmBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder getJkfdibhoggmBuilder() {
        
        onChanged();
        return getJkfdibhoggmFieldBuilder().getBuilder();
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      public emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder getJkfdibhoggmOrBuilder() {
        if (jkfdibhoggmBuilder_ != null) {
          return jkfdibhoggmBuilder_.getMessageOrBuilder();
        } else {
          return jkfdibhoggm_ == null ?
              emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.getDefaultInstance() : jkfdibhoggm_;
        }
      }
      /**
       * <code>.EIEBDOJCDBH jkfdibhoggm = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder> 
          getJkfdibhoggmFieldBuilder() {
        if (jkfdibhoggmBuilder_ == null) {
          jkfdibhoggmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBH.Builder, emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.EIEBDOJCDBHOrBuilder>(
                  getJkfdibhoggm(),
                  getParentForChildren(),
                  isClean());
          jkfdibhoggm_ = null;
        }
        return jkfdibhoggmBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DBIBEJBEOEE)
    }

    // @@protoc_insertion_point(class_scope:DBIBEJBEOEE)
    private static final emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE();
    }

    public static emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DBIBEJBEOEE>
        PARSER = new com.google.protobuf.AbstractParser<DBIBEJBEOEE>() {
      @java.lang.Override
      public DBIBEJBEOEE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DBIBEJBEOEE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DBIBEJBEOEE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DBIBEJBEOEE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DBIBEJBEOEEOuterClass.DBIBEJBEOEE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DBIBEJBEOEE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DBIBEJBEOEE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DBIBEJBEOEE.proto\032\021EIEBDOJCDBH.proto\"Y" +
      "\n\013DBIBEJBEOEE\022\022\n\ncreateTime\030\001 \001(\t\022\023\n\013dae" +
      "hjagbjbl\030\002 \001(\005\022!\n\013jkfdibhoggm\030\003 \001(\0132\014.EI" +
      "EBDOJCDBHB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.getDescriptor(),
        });
    internal_static_DBIBEJBEOEE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DBIBEJBEOEE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DBIBEJBEOEE_descriptor,
        new java.lang.String[] { "CreateTime", "Daehjagbjbl", "Jkfdibhoggm", });
    emu.grasscutter.net.proto.EIEBDOJCDBHOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
