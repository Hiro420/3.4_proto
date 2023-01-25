// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairBalloonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class FleurFairBalloonSettleNotifyOuterClass {
  private FleurFairBalloonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairBalloonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairBalloonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 minigameId = 10;</code>
     * @return The minigameId.
     */
    int getMinigameId();

    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    int getSettleInfoMapCount();
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    boolean containsSettleInfoMap(
        int key);
    /**
     * Use {@link #getSettleInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
    getSettleInfoMap();
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
    getSettleInfoMapMap();
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */

    emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrDefault(
        int key,
        emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo defaultValue);
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */

    emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrThrow(
        int key);
  }
  /**
   * <pre>
   *enum MIOADOGMIFA {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 2183;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code FleurFairBalloonSettleNotify}
   */
  public static final class FleurFairBalloonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairBalloonSettleNotify)
      FleurFairBalloonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairBalloonSettleNotify.newBuilder() to construct.
    private FleurFairBalloonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairBalloonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairBalloonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairBalloonSettleNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                settleInfoMap_ = com.google.protobuf.MapField.newMapField(
                    SettleInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
              settleInfoMap__ = input.readMessage(
                  SettleInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              settleInfoMap_.getMutableMap().put(
                  settleInfoMap__.getKey(), settleInfoMap__.getValue());
              break;
            }
            case 80: {

              minigameId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetSettleInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.class, emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.Builder.class);
    }

    public static final int MINIGAMEID_FIELD_NUMBER = 10;
    private int minigameId_;
    /**
     * <code>uint32 minigameId = 10;</code>
     * @return The minigameId.
     */
    @java.lang.Override
    public int getMinigameId() {
      return minigameId_;
    }

    public static final int SETTLEINFOMAP_FIELD_NUMBER = 5;
    private static final class SettleInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> settleInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
    internalGetSettleInfoMap() {
      if (settleInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SettleInfoMapDefaultEntryHolder.defaultEntry);
      }
      return settleInfoMap_;
    }

    public int getSettleInfoMapCount() {
      return internalGetSettleInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */

    @java.lang.Override
    public boolean containsSettleInfoMap(
        int key) {
      
      return internalGetSettleInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSettleInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> getSettleInfoMap() {
      return getSettleInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> getSettleInfoMapMap() {
      return internalGetSettleInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrDefault(
        int key,
        emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> map =
          internalGetSettleInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> map =
          internalGetSettleInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSettleInfoMap(),
          SettleInfoMapDefaultEntryHolder.defaultEntry,
          5);
      if (minigameId_ != 0) {
        output.writeUInt32(10, minigameId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> entry
           : internalGetSettleInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
        settleInfoMap__ = SettleInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(5, settleInfoMap__);
      }
      if (minigameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, minigameId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify other = (emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify) obj;

      if (getMinigameId()
          != other.getMinigameId()) return false;
      if (!internalGetSettleInfoMap().equals(
          other.internalGetSettleInfoMap())) return false;
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
      hash = (37 * hash) + MINIGAMEID_FIELD_NUMBER;
      hash = (53 * hash) + getMinigameId();
      if (!internalGetSettleInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + SETTLEINFOMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSettleInfoMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify prototype) {
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
     *enum MIOADOGMIFA {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 2183;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code FleurFairBalloonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairBalloonSettleNotify)
        emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetSettleInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetMutableSettleInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.class, emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.newBuilder()
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
        minigameId_ = 0;

        internalGetMutableSettleInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.internal_static_FleurFairBalloonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify build() {
        emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify result = new emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify(this);
        int from_bitField0_ = bitField0_;
        result.minigameId_ = minigameId_;
        result.settleInfoMap_ = internalGetSettleInfoMap();
        result.settleInfoMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify.getDefaultInstance()) return this;
        if (other.getMinigameId() != 0) {
          setMinigameId(other.getMinigameId());
        }
        internalGetMutableSettleInfoMap().mergeFrom(
            other.internalGetSettleInfoMap());
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
        emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int minigameId_ ;
      /**
       * <code>uint32 minigameId = 10;</code>
       * @return The minigameId.
       */
      @java.lang.Override
      public int getMinigameId() {
        return minigameId_;
      }
      /**
       * <code>uint32 minigameId = 10;</code>
       * @param value The minigameId to set.
       * @return This builder for chaining.
       */
      public Builder setMinigameId(int value) {
        
        minigameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 minigameId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinigameId() {
        
        minigameId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> settleInfoMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
      internalGetSettleInfoMap() {
        if (settleInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SettleInfoMapDefaultEntryHolder.defaultEntry);
        }
        return settleInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
      internalGetMutableSettleInfoMap() {
        onChanged();;
        if (settleInfoMap_ == null) {
          settleInfoMap_ = com.google.protobuf.MapField.newMapField(
              SettleInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!settleInfoMap_.isMutable()) {
          settleInfoMap_ = settleInfoMap_.copy();
        }
        return settleInfoMap_;
      }

      public int getSettleInfoMapCount() {
        return internalGetSettleInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */

      @java.lang.Override
      public boolean containsSettleInfoMap(
          int key) {
        
        return internalGetSettleInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSettleInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> getSettleInfoMap() {
        return getSettleInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> getSettleInfoMapMap() {
        return internalGetSettleInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrDefault(
          int key,
          emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> map =
            internalGetSettleInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo getSettleInfoMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> map =
            internalGetSettleInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSettleInfoMap() {
        internalGetMutableSettleInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */

      public Builder removeSettleInfoMap(
          int key) {
        
        internalGetMutableSettleInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo>
      getMutableSettleInfoMap() {
        return internalGetMutableSettleInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */
      public Builder putSettleInfoMap(
          int key,
          emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableSettleInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairBalloonSettleInfo&gt; settleInfoMap = 5;</code>
       */

      public Builder putAllSettleInfoMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.FleurFairBalloonSettleInfo> values) {
        internalGetMutableSettleInfoMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:FleurFairBalloonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:FleurFairBalloonSettleNotify)
    private static final emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify();
    }

    public static emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairBalloonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairBalloonSettleNotify>() {
      @java.lang.Override
      public FleurFairBalloonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairBalloonSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairBalloonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairBalloonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairBalloonSettleNotifyOuterClass.FleurFairBalloonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairBalloonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairBalloonSettleNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"FleurFairBalloonSettleNotify.proto\032 Fl" +
      "eurFairBalloonSettleInfo.proto\"\316\001\n\034Fleur" +
      "FairBalloonSettleNotify\022\022\n\nminigameId\030\n " +
      "\001(\r\022G\n\rsettleInfoMap\030\005 \003(\01320.FleurFairBa" +
      "lloonSettleNotify.SettleInfoMapEntry\032Q\n\022" +
      "SettleInfoMapEntry\022\013\n\003key\030\001 \001(\r\022*\n\005value" +
      "\030\002 \001(\0132\033.FleurFairBalloonSettleInfo:\0028\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_FleurFairBalloonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairBalloonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairBalloonSettleNotify_descriptor,
        new java.lang.String[] { "MinigameId", "SettleInfoMap", });
    internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_descriptor =
      internal_static_FleurFairBalloonSettleNotify_descriptor.getNestedTypes().get(0);
    internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairBalloonSettleNotify_SettleInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.FleurFairBalloonSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
