// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeExchangeWoodReq.proto

package emu.grasscutter.net.proto;

public final class HomeExchangeWoodReqOuterClass {
  private HomeExchangeWoodReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeExchangeWoodReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeExchangeWoodReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    int getMaterialCountMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    boolean containsMaterialCountMap(
        int key);
    /**
     * Use {@link #getMaterialCountMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getMaterialCountMap();
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getMaterialCountMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */

    int getMaterialCountMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */

    int getMaterialCountMapOrThrow(
        int key);

    /**
     * <code>uint32 woodId = 8;</code>
     * @return The woodId.
     */
    int getWoodId();
  }
  /**
   * <pre>
   *enum NIIPNNDOJGL {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4672;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code HomeExchangeWoodReq}
   */
  public static final class HomeExchangeWoodReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeExchangeWoodReq)
      HomeExchangeWoodReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeExchangeWoodReq.newBuilder() to construct.
    private HomeExchangeWoodReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeExchangeWoodReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeExchangeWoodReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeExchangeWoodReq(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                materialCountMap_ = com.google.protobuf.MapField.newMapField(
                    MaterialCountMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              materialCountMap__ = input.readMessage(
                  MaterialCountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              materialCountMap_.getMutableMap().put(
                  materialCountMap__.getKey(), materialCountMap__.getValue());
              break;
            }
            case 64: {

              woodId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMaterialCountMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.class, emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.Builder.class);
    }

    public static final int MATERIALCOUNTMAP_FIELD_NUMBER = 1;
    private static final class MaterialCountMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> materialCountMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMaterialCountMap() {
      if (materialCountMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MaterialCountMapDefaultEntryHolder.defaultEntry);
      }
      return materialCountMap_;
    }

    public int getMaterialCountMapCount() {
      return internalGetMaterialCountMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */

    @java.lang.Override
    public boolean containsMaterialCountMap(
        int key) {
      
      return internalGetMaterialCountMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMaterialCountMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getMaterialCountMap() {
      return getMaterialCountMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getMaterialCountMapMap() {
      return internalGetMaterialCountMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    @java.lang.Override

    public int getMaterialCountMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetMaterialCountMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
     */
    @java.lang.Override

    public int getMaterialCountMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetMaterialCountMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int WOODID_FIELD_NUMBER = 8;
    private int woodId_;
    /**
     * <code>uint32 woodId = 8;</code>
     * @return The woodId.
     */
    @java.lang.Override
    public int getWoodId() {
      return woodId_;
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
          internalGetMaterialCountMap(),
          MaterialCountMapDefaultEntryHolder.defaultEntry,
          1);
      if (woodId_ != 0) {
        output.writeUInt32(8, woodId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetMaterialCountMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        materialCountMap__ = MaterialCountMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, materialCountMap__);
      }
      if (woodId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, woodId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq other = (emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq) obj;

      if (!internalGetMaterialCountMap().equals(
          other.internalGetMaterialCountMap())) return false;
      if (getWoodId()
          != other.getWoodId()) return false;
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
      if (!internalGetMaterialCountMap().getMap().isEmpty()) {
        hash = (37 * hash) + MATERIALCOUNTMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMaterialCountMap().hashCode();
      }
      hash = (37 * hash) + WOODID_FIELD_NUMBER;
      hash = (53 * hash) + getWoodId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq prototype) {
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
     *enum NIIPNNDOJGL {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4672;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code HomeExchangeWoodReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeExchangeWoodReq)
        emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMaterialCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableMaterialCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.class, emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.newBuilder()
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
        internalGetMutableMaterialCountMap().clear();
        woodId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.internal_static_HomeExchangeWoodReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq build() {
        emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq buildPartial() {
        emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq result = new emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq(this);
        int from_bitField0_ = bitField0_;
        result.materialCountMap_ = internalGetMaterialCountMap();
        result.materialCountMap_.makeImmutable();
        result.woodId_ = woodId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq other) {
        if (other == emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq.getDefaultInstance()) return this;
        internalGetMutableMaterialCountMap().mergeFrom(
            other.internalGetMaterialCountMap());
        if (other.getWoodId() != 0) {
          setWoodId(other.getWoodId());
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
        emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> materialCountMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMaterialCountMap() {
        if (materialCountMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MaterialCountMapDefaultEntryHolder.defaultEntry);
        }
        return materialCountMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableMaterialCountMap() {
        onChanged();;
        if (materialCountMap_ == null) {
          materialCountMap_ = com.google.protobuf.MapField.newMapField(
              MaterialCountMapDefaultEntryHolder.defaultEntry);
        }
        if (!materialCountMap_.isMutable()) {
          materialCountMap_ = materialCountMap_.copy();
        }
        return materialCountMap_;
      }

      public int getMaterialCountMapCount() {
        return internalGetMaterialCountMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */

      @java.lang.Override
      public boolean containsMaterialCountMap(
          int key) {
        
        return internalGetMaterialCountMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMaterialCountMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getMaterialCountMap() {
        return getMaterialCountMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getMaterialCountMapMap() {
        return internalGetMaterialCountMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */
      @java.lang.Override

      public int getMaterialCountMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetMaterialCountMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */
      @java.lang.Override

      public int getMaterialCountMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetMaterialCountMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMaterialCountMap() {
        internalGetMutableMaterialCountMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */

      public Builder removeMaterialCountMap(
          int key) {
        
        internalGetMutableMaterialCountMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableMaterialCountMap() {
        return internalGetMutableMaterialCountMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */
      public Builder putMaterialCountMap(
          int key,
          int value) {
        
        
        internalGetMutableMaterialCountMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; materialCountMap = 1;</code>
       */

      public Builder putAllMaterialCountMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableMaterialCountMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int woodId_ ;
      /**
       * <code>uint32 woodId = 8;</code>
       * @return The woodId.
       */
      @java.lang.Override
      public int getWoodId() {
        return woodId_;
      }
      /**
       * <code>uint32 woodId = 8;</code>
       * @param value The woodId to set.
       * @return This builder for chaining.
       */
      public Builder setWoodId(int value) {
        
        woodId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 woodId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWoodId() {
        
        woodId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeExchangeWoodReq)
    }

    // @@protoc_insertion_point(class_scope:HomeExchangeWoodReq)
    private static final emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq();
    }

    public static emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeExchangeWoodReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeExchangeWoodReq>() {
      @java.lang.Override
      public HomeExchangeWoodReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeExchangeWoodReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeExchangeWoodReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeExchangeWoodReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeExchangeWoodReqOuterClass.HomeExchangeWoodReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeExchangeWoodReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeExchangeWoodReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeExchangeWoodReq.proto\"\244\001\n\023HomeExch" +
      "angeWoodReq\022D\n\020materialCountMap\030\001 \003(\0132*." +
      "HomeExchangeWoodReq.MaterialCountMapEntr" +
      "y\022\016\n\006woodId\030\010 \001(\r\0327\n\025MaterialCountMapEnt" +
      "ry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeExchangeWoodReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeExchangeWoodReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeExchangeWoodReq_descriptor,
        new java.lang.String[] { "MaterialCountMap", "WoodId", });
    internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_descriptor =
      internal_static_HomeExchangeWoodReq_descriptor.getNestedTypes().get(0);
    internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeExchangeWoodReq_MaterialCountMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
