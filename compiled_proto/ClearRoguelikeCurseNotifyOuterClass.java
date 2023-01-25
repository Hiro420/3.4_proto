// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClearRoguelikeCurseNotify.proto

package emu.grasscutter.net.proto;

public final class ClearRoguelikeCurseNotifyOuterClass {
  private ClearRoguelikeCurseNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClearRoguelikeCurseNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClearRoguelikeCurseNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isCurseAllClear = 14;</code>
     * @return The isCurseAllClear.
     */
    boolean getIsCurseAllClear();

    /**
     * <code>bool isClearAll = 9;</code>
     * @return The isClearAll.
     */
    boolean getIsClearAll();

    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    int getClearCurseMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    boolean containsClearCurseMap(
        int key);
    /**
     * Use {@link #getClearCurseMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getClearCurseMap();
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getClearCurseMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */

    int getClearCurseMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */

    int getClearCurseMapOrThrow(
        int key);

    /**
     * <code>uint32 cardId = 6;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   *enum FACMIBLDHHO {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8183;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ClearRoguelikeCurseNotify}
   */
  public static final class ClearRoguelikeCurseNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClearRoguelikeCurseNotify)
      ClearRoguelikeCurseNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClearRoguelikeCurseNotify.newBuilder() to construct.
    private ClearRoguelikeCurseNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClearRoguelikeCurseNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClearRoguelikeCurseNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClearRoguelikeCurseNotify(
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
            case 48: {

              cardId_ = input.readUInt32();
              break;
            }
            case 72: {

              isClearAll_ = input.readBool();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                clearCurseMap_ = com.google.protobuf.MapField.newMapField(
                    ClearCurseMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              clearCurseMap__ = input.readMessage(
                  ClearCurseMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              clearCurseMap_.getMutableMap().put(
                  clearCurseMap__.getKey(), clearCurseMap__.getValue());
              break;
            }
            case 112: {

              isCurseAllClear_ = input.readBool();
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
      return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetClearCurseMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.class, emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.Builder.class);
    }

    public static final int ISCURSEALLCLEAR_FIELD_NUMBER = 14;
    private boolean isCurseAllClear_;
    /**
     * <code>bool isCurseAllClear = 14;</code>
     * @return The isCurseAllClear.
     */
    @java.lang.Override
    public boolean getIsCurseAllClear() {
      return isCurseAllClear_;
    }

    public static final int ISCLEARALL_FIELD_NUMBER = 9;
    private boolean isClearAll_;
    /**
     * <code>bool isClearAll = 9;</code>
     * @return The isClearAll.
     */
    @java.lang.Override
    public boolean getIsClearAll() {
      return isClearAll_;
    }

    public static final int CLEARCURSEMAP_FIELD_NUMBER = 12;
    private static final class ClearCurseMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> clearCurseMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetClearCurseMap() {
      if (clearCurseMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ClearCurseMapDefaultEntryHolder.defaultEntry);
      }
      return clearCurseMap_;
    }

    public int getClearCurseMapCount() {
      return internalGetClearCurseMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */

    @java.lang.Override
    public boolean containsClearCurseMap(
        int key) {
      
      return internalGetClearCurseMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getClearCurseMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getClearCurseMap() {
      return getClearCurseMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getClearCurseMapMap() {
      return internalGetClearCurseMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    @java.lang.Override

    public int getClearCurseMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetClearCurseMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
     */
    @java.lang.Override

    public int getClearCurseMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetClearCurseMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int CARDID_FIELD_NUMBER = 6;
    private int cardId_;
    /**
     * <code>uint32 cardId = 6;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(6, cardId_);
      }
      if (isClearAll_ != false) {
        output.writeBool(9, isClearAll_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetClearCurseMap(),
          ClearCurseMapDefaultEntryHolder.defaultEntry,
          12);
      if (isCurseAllClear_ != false) {
        output.writeBool(14, isCurseAllClear_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cardId_);
      }
      if (isClearAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isClearAll_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetClearCurseMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        clearCurseMap__ = ClearCurseMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, clearCurseMap__);
      }
      if (isCurseAllClear_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isCurseAllClear_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify other = (emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify) obj;

      if (getIsCurseAllClear()
          != other.getIsCurseAllClear()) return false;
      if (getIsClearAll()
          != other.getIsClearAll()) return false;
      if (!internalGetClearCurseMap().equals(
          other.internalGetClearCurseMap())) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + ISCURSEALLCLEAR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCurseAllClear());
      hash = (37 * hash) + ISCLEARALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsClearAll());
      if (!internalGetClearCurseMap().getMap().isEmpty()) {
        hash = (37 * hash) + CLEARCURSEMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetClearCurseMap().hashCode();
      }
      hash = (37 * hash) + CARDID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify prototype) {
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
     *enum FACMIBLDHHO {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8183;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ClearRoguelikeCurseNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClearRoguelikeCurseNotify)
        emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetClearCurseMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableClearCurseMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.class, emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.newBuilder()
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
        isCurseAllClear_ = false;

        isClearAll_ = false;

        internalGetMutableClearCurseMap().clear();
        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.internal_static_ClearRoguelikeCurseNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify build() {
        emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify buildPartial() {
        emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify result = new emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify(this);
        int from_bitField0_ = bitField0_;
        result.isCurseAllClear_ = isCurseAllClear_;
        result.isClearAll_ = isClearAll_;
        result.clearCurseMap_ = internalGetClearCurseMap();
        result.clearCurseMap_.makeImmutable();
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify other) {
        if (other == emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify.getDefaultInstance()) return this;
        if (other.getIsCurseAllClear() != false) {
          setIsCurseAllClear(other.getIsCurseAllClear());
        }
        if (other.getIsClearAll() != false) {
          setIsClearAll(other.getIsClearAll());
        }
        internalGetMutableClearCurseMap().mergeFrom(
            other.internalGetClearCurseMap());
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isCurseAllClear_ ;
      /**
       * <code>bool isCurseAllClear = 14;</code>
       * @return The isCurseAllClear.
       */
      @java.lang.Override
      public boolean getIsCurseAllClear() {
        return isCurseAllClear_;
      }
      /**
       * <code>bool isCurseAllClear = 14;</code>
       * @param value The isCurseAllClear to set.
       * @return This builder for chaining.
       */
      public Builder setIsCurseAllClear(boolean value) {
        
        isCurseAllClear_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isCurseAllClear = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCurseAllClear() {
        
        isCurseAllClear_ = false;
        onChanged();
        return this;
      }

      private boolean isClearAll_ ;
      /**
       * <code>bool isClearAll = 9;</code>
       * @return The isClearAll.
       */
      @java.lang.Override
      public boolean getIsClearAll() {
        return isClearAll_;
      }
      /**
       * <code>bool isClearAll = 9;</code>
       * @param value The isClearAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsClearAll(boolean value) {
        
        isClearAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isClearAll = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsClearAll() {
        
        isClearAll_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> clearCurseMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetClearCurseMap() {
        if (clearCurseMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ClearCurseMapDefaultEntryHolder.defaultEntry);
        }
        return clearCurseMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableClearCurseMap() {
        onChanged();;
        if (clearCurseMap_ == null) {
          clearCurseMap_ = com.google.protobuf.MapField.newMapField(
              ClearCurseMapDefaultEntryHolder.defaultEntry);
        }
        if (!clearCurseMap_.isMutable()) {
          clearCurseMap_ = clearCurseMap_.copy();
        }
        return clearCurseMap_;
      }

      public int getClearCurseMapCount() {
        return internalGetClearCurseMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */

      @java.lang.Override
      public boolean containsClearCurseMap(
          int key) {
        
        return internalGetClearCurseMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getClearCurseMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getClearCurseMap() {
        return getClearCurseMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getClearCurseMapMap() {
        return internalGetClearCurseMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */
      @java.lang.Override

      public int getClearCurseMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetClearCurseMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */
      @java.lang.Override

      public int getClearCurseMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetClearCurseMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearClearCurseMap() {
        internalGetMutableClearCurseMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */

      public Builder removeClearCurseMap(
          int key) {
        
        internalGetMutableClearCurseMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableClearCurseMap() {
        return internalGetMutableClearCurseMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */
      public Builder putClearCurseMap(
          int key,
          int value) {
        
        
        internalGetMutableClearCurseMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; clearCurseMap = 12;</code>
       */

      public Builder putAllClearCurseMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableClearCurseMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 cardId = 6;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 cardId = 6;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClearRoguelikeCurseNotify)
    }

    // @@protoc_insertion_point(class_scope:ClearRoguelikeCurseNotify)
    private static final emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify();
    }

    public static emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClearRoguelikeCurseNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClearRoguelikeCurseNotify>() {
      @java.lang.Override
      public ClearRoguelikeCurseNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClearRoguelikeCurseNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClearRoguelikeCurseNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClearRoguelikeCurseNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClearRoguelikeCurseNotifyOuterClass.ClearRoguelikeCurseNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClearRoguelikeCurseNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClearRoguelikeCurseNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ClearRoguelikeCurseNotify.proto\"\324\001\n\031Cl" +
      "earRoguelikeCurseNotify\022\027\n\017isCurseAllCle" +
      "ar\030\016 \001(\010\022\022\n\nisClearAll\030\t \001(\010\022D\n\rclearCur" +
      "seMap\030\014 \003(\0132-.ClearRoguelikeCurseNotify." +
      "ClearCurseMapEntry\022\016\n\006cardId\030\006 \001(\r\0324\n\022Cl" +
      "earCurseMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002" +
      " \001(\r:\0028\001B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClearRoguelikeCurseNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClearRoguelikeCurseNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClearRoguelikeCurseNotify_descriptor,
        new java.lang.String[] { "IsCurseAllClear", "IsClearAll", "ClearCurseMap", "CardId", });
    internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_descriptor =
      internal_static_ClearRoguelikeCurseNotify_descriptor.getNestedTypes().get(0);
    internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClearRoguelikeCurseNotify_ClearCurseMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
