// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EKLDJGJBLNF.proto

package emu.grasscutter.net.proto;

public final class EKLDJGJBLNFOuterClass {
  private EKLDJGJBLNFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EKLDJGJBLNFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EKLDJGJBLNF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dmkljglcbij = 1;</code>
     * @return The dmkljglcbij.
     */
    int getDmkljglcbij();
  }
  /**
   * Protobuf type {@code EKLDJGJBLNF}
   */
  public static final class EKLDJGJBLNF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EKLDJGJBLNF)
      EKLDJGJBLNFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EKLDJGJBLNF.newBuilder() to construct.
    private EKLDJGJBLNF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EKLDJGJBLNF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EKLDJGJBLNF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EKLDJGJBLNF(
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

              dmkljglcbij_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.internal_static_EKLDJGJBLNF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.internal_static_EKLDJGJBLNF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.class, emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.Builder.class);
    }

    public static final int DMKLJGLCBIJ_FIELD_NUMBER = 1;
    private int dmkljglcbij_;
    /**
     * <code>uint32 dmkljglcbij = 1;</code>
     * @return The dmkljglcbij.
     */
    @java.lang.Override
    public int getDmkljglcbij() {
      return dmkljglcbij_;
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
      if (dmkljglcbij_ != 0) {
        output.writeUInt32(1, dmkljglcbij_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dmkljglcbij_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dmkljglcbij_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF other = (emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF) obj;

      if (getDmkljglcbij()
          != other.getDmkljglcbij()) return false;
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
      hash = (37 * hash) + DMKLJGLCBIJ_FIELD_NUMBER;
      hash = (53 * hash) + getDmkljglcbij();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF prototype) {
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
     * Protobuf type {@code EKLDJGJBLNF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EKLDJGJBLNF)
        emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.internal_static_EKLDJGJBLNF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.internal_static_EKLDJGJBLNF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.class, emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.newBuilder()
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
        dmkljglcbij_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.internal_static_EKLDJGJBLNF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF build() {
        emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF buildPartial() {
        emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF result = new emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF(this);
        result.dmkljglcbij_ = dmkljglcbij_;
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
        if (other instanceof emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF) {
          return mergeFrom((emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF other) {
        if (other == emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF.getDefaultInstance()) return this;
        if (other.getDmkljglcbij() != 0) {
          setDmkljglcbij(other.getDmkljglcbij());
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
        emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dmkljglcbij_ ;
      /**
       * <code>uint32 dmkljglcbij = 1;</code>
       * @return The dmkljglcbij.
       */
      @java.lang.Override
      public int getDmkljglcbij() {
        return dmkljglcbij_;
      }
      /**
       * <code>uint32 dmkljglcbij = 1;</code>
       * @param value The dmkljglcbij to set.
       * @return This builder for chaining.
       */
      public Builder setDmkljglcbij(int value) {
        
        dmkljglcbij_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dmkljglcbij = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDmkljglcbij() {
        
        dmkljglcbij_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EKLDJGJBLNF)
    }

    // @@protoc_insertion_point(class_scope:EKLDJGJBLNF)
    private static final emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF();
    }

    public static emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EKLDJGJBLNF>
        PARSER = new com.google.protobuf.AbstractParser<EKLDJGJBLNF>() {
      @java.lang.Override
      public EKLDJGJBLNF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EKLDJGJBLNF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EKLDJGJBLNF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EKLDJGJBLNF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EKLDJGJBLNFOuterClass.EKLDJGJBLNF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EKLDJGJBLNF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EKLDJGJBLNF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EKLDJGJBLNF.proto\"\"\n\013EKLDJGJBLNF\022\023\n\013dm" +
      "kljglcbij\030\001 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EKLDJGJBLNF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EKLDJGJBLNF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EKLDJGJBLNF_descriptor,
        new java.lang.String[] { "Dmkljglcbij", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
