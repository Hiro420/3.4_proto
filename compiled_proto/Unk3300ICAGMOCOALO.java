// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3300_ICAGMOCOALO.proto

package emu.grasscutter.net.proto;

public final class Unk3300ICAGMOCOALO {
  private Unk3300ICAGMOCOALO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3300_ICAGMOCOALOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3300_ICAGMOCOALO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 matchId = 10;</code>
     * @return The matchId.
     */
    int getMatchId();
  }
  /**
   * <pre>
   *enum BLAFLFHMGNI {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4156;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code Unk3300_ICAGMOCOALO}
   */
  public static final class Unk3300_ICAGMOCOALO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3300_ICAGMOCOALO)
      Unk3300_ICAGMOCOALOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3300_ICAGMOCOALO.newBuilder() to construct.
    private Unk3300_ICAGMOCOALO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3300_ICAGMOCOALO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3300_ICAGMOCOALO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3300_ICAGMOCOALO(
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
            case 80: {

              matchId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.internal_static_Unk3300_ICAGMOCOALO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.internal_static_Unk3300_ICAGMOCOALO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.class, emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.Builder.class);
    }

    public static final int MATCHID_FIELD_NUMBER = 10;
    private int matchId_;
    /**
     * <code>uint32 matchId = 10;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
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
      if (matchId_ != 0) {
        output.writeUInt32(10, matchId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, matchId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO other = (emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO) obj;

      if (getMatchId()
          != other.getMatchId()) return false;
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
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO prototype) {
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
     *enum BLAFLFHMGNI {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4156;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code Unk3300_ICAGMOCOALO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3300_ICAGMOCOALO)
        emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.internal_static_Unk3300_ICAGMOCOALO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.internal_static_Unk3300_ICAGMOCOALO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.class, emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.newBuilder()
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
        matchId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.internal_static_Unk3300_ICAGMOCOALO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO build() {
        emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO buildPartial() {
        emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO result = new emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO(this);
        result.matchId_ = matchId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO other) {
        if (other == emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO.getDefaultInstance()) return this;
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
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
        emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 matchId = 10;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 matchId = 10;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 matchId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3300_ICAGMOCOALO)
    }

    // @@protoc_insertion_point(class_scope:Unk3300_ICAGMOCOALO)
    private static final emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO();
    }

    public static emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3300_ICAGMOCOALO>
        PARSER = new com.google.protobuf.AbstractParser<Unk3300_ICAGMOCOALO>() {
      @java.lang.Override
      public Unk3300_ICAGMOCOALO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3300_ICAGMOCOALO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3300_ICAGMOCOALO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3300_ICAGMOCOALO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3300ICAGMOCOALO.Unk3300_ICAGMOCOALO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3300_ICAGMOCOALO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3300_ICAGMOCOALO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3300_ICAGMOCOALO.proto\"&\n\023Unk3300_I" +
      "CAGMOCOALO\022\017\n\007matchId\030\n \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3300_ICAGMOCOALO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3300_ICAGMOCOALO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3300_ICAGMOCOALO_descriptor,
        new java.lang.String[] { "MatchId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
