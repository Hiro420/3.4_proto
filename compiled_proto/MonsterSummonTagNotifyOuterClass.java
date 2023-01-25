// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MonsterSummonTagNotify.proto

package emu.grasscutter.net.proto;

public final class MonsterSummonTagNotifyOuterClass {
  private MonsterSummonTagNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterSummonTagNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterSummonTagNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    int getSummonTagMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    boolean containsSummonTagMap(
        int key);
    /**
     * Use {@link #getSummonTagMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSummonTagMap();
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSummonTagMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */

    int getSummonTagMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */

    int getSummonTagMapOrThrow(
        int key);

    /**
     * <code>uint32 monsterEntityId = 3;</code>
     * @return The monsterEntityId.
     */
    int getMonsterEntityId();
  }
  /**
   * <pre>
   *enum DNKEAKFJFDB {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 1305;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code MonsterSummonTagNotify}
   */
  public static final class MonsterSummonTagNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterSummonTagNotify)
      MonsterSummonTagNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterSummonTagNotify.newBuilder() to construct.
    private MonsterSummonTagNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterSummonTagNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterSummonTagNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterSummonTagNotify(
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
            case 24: {

              monsterEntityId_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                summonTagMap_ = com.google.protobuf.MapField.newMapField(
                    SummonTagMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              summonTagMap__ = input.readMessage(
                  SummonTagMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              summonTagMap_.getMutableMap().put(
                  summonTagMap__.getKey(), summonTagMap__.getValue());
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
      return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetSummonTagMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.class, emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.Builder.class);
    }

    public static final int SUMMONTAGMAP_FIELD_NUMBER = 13;
    private static final class SummonTagMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_SummonTagMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> summonTagMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetSummonTagMap() {
      if (summonTagMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SummonTagMapDefaultEntryHolder.defaultEntry);
      }
      return summonTagMap_;
    }

    public int getSummonTagMapCount() {
      return internalGetSummonTagMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */

    @java.lang.Override
    public boolean containsSummonTagMap(
        int key) {
      
      return internalGetSummonTagMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSummonTagMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSummonTagMap() {
      return getSummonTagMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getSummonTagMapMap() {
      return internalGetSummonTagMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    @java.lang.Override

    public int getSummonTagMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSummonTagMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
     */
    @java.lang.Override

    public int getSummonTagMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSummonTagMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int MONSTERENTITYID_FIELD_NUMBER = 3;
    private int monsterEntityId_;
    /**
     * <code>uint32 monsterEntityId = 3;</code>
     * @return The monsterEntityId.
     */
    @java.lang.Override
    public int getMonsterEntityId() {
      return monsterEntityId_;
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
      if (monsterEntityId_ != 0) {
        output.writeUInt32(3, monsterEntityId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSummonTagMap(),
          SummonTagMapDefaultEntryHolder.defaultEntry,
          13);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, monsterEntityId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetSummonTagMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        summonTagMap__ = SummonTagMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, summonTagMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify other = (emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify) obj;

      if (!internalGetSummonTagMap().equals(
          other.internalGetSummonTagMap())) return false;
      if (getMonsterEntityId()
          != other.getMonsterEntityId()) return false;
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
      if (!internalGetSummonTagMap().getMap().isEmpty()) {
        hash = (37 * hash) + SUMMONTAGMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSummonTagMap().hashCode();
      }
      hash = (37 * hash) + MONSTERENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify prototype) {
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
     *enum DNKEAKFJFDB {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 1305;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code MonsterSummonTagNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterSummonTagNotify)
        emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetSummonTagMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableSummonTagMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.class, emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.newBuilder()
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
        internalGetMutableSummonTagMap().clear();
        monsterEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.internal_static_MonsterSummonTagNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify build() {
        emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify buildPartial() {
        emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify result = new emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify(this);
        int from_bitField0_ = bitField0_;
        result.summonTagMap_ = internalGetSummonTagMap();
        result.summonTagMap_.makeImmutable();
        result.monsterEntityId_ = monsterEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify other) {
        if (other == emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify.getDefaultInstance()) return this;
        internalGetMutableSummonTagMap().mergeFrom(
            other.internalGetSummonTagMap());
        if (other.getMonsterEntityId() != 0) {
          setMonsterEntityId(other.getMonsterEntityId());
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
        emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> summonTagMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetSummonTagMap() {
        if (summonTagMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SummonTagMapDefaultEntryHolder.defaultEntry);
        }
        return summonTagMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableSummonTagMap() {
        onChanged();;
        if (summonTagMap_ == null) {
          summonTagMap_ = com.google.protobuf.MapField.newMapField(
              SummonTagMapDefaultEntryHolder.defaultEntry);
        }
        if (!summonTagMap_.isMutable()) {
          summonTagMap_ = summonTagMap_.copy();
        }
        return summonTagMap_;
      }

      public int getSummonTagMapCount() {
        return internalGetSummonTagMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */

      @java.lang.Override
      public boolean containsSummonTagMap(
          int key) {
        
        return internalGetSummonTagMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSummonTagMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSummonTagMap() {
        return getSummonTagMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getSummonTagMapMap() {
        return internalGetSummonTagMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */
      @java.lang.Override

      public int getSummonTagMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSummonTagMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */
      @java.lang.Override

      public int getSummonTagMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSummonTagMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSummonTagMap() {
        internalGetMutableSummonTagMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */

      public Builder removeSummonTagMap(
          int key) {
        
        internalGetMutableSummonTagMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableSummonTagMap() {
        return internalGetMutableSummonTagMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */
      public Builder putSummonTagMap(
          int key,
          int value) {
        
        
        internalGetMutableSummonTagMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; summonTagMap = 13;</code>
       */

      public Builder putAllSummonTagMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableSummonTagMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int monsterEntityId_ ;
      /**
       * <code>uint32 monsterEntityId = 3;</code>
       * @return The monsterEntityId.
       */
      @java.lang.Override
      public int getMonsterEntityId() {
        return monsterEntityId_;
      }
      /**
       * <code>uint32 monsterEntityId = 3;</code>
       * @param value The monsterEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterEntityId(int value) {
        
        monsterEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monsterEntityId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterEntityId() {
        
        monsterEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MonsterSummonTagNotify)
    }

    // @@protoc_insertion_point(class_scope:MonsterSummonTagNotify)
    private static final emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify();
    }

    public static emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterSummonTagNotify>
        PARSER = new com.google.protobuf.AbstractParser<MonsterSummonTagNotify>() {
      @java.lang.Override
      public MonsterSummonTagNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterSummonTagNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterSummonTagNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterSummonTagNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MonsterSummonTagNotifyOuterClass.MonsterSummonTagNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterSummonTagNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterSummonTagNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterSummonTagNotify_SummonTagMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterSummonTagNotify_SummonTagMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034MonsterSummonTagNotify.proto\"\247\001\n\026Monst" +
      "erSummonTagNotify\022?\n\014summonTagMap\030\r \003(\0132" +
      ").MonsterSummonTagNotify.SummonTagMapEnt" +
      "ry\022\027\n\017monsterEntityId\030\003 \001(\r\0323\n\021SummonTag" +
      "MapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MonsterSummonTagNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterSummonTagNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterSummonTagNotify_descriptor,
        new java.lang.String[] { "SummonTagMap", "MonsterEntityId", });
    internal_static_MonsterSummonTagNotify_SummonTagMapEntry_descriptor =
      internal_static_MonsterSummonTagNotify_descriptor.getNestedTypes().get(0);
    internal_static_MonsterSummonTagNotify_SummonTagMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterSummonTagNotify_SummonTagMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
