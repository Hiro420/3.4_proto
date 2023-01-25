// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFollowRouteNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarFollowRouteNotifyOuterClass {
  private AvatarFollowRouteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFollowRouteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFollowRouteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 startSceneTimeMs = 6;</code>
     * @return The startSceneTimeMs.
     */
    int getStartSceneTimeMs();

    /**
     * <code>uint32 templateId = 2;</code>
     * @return The templateId.
     */
    int getTemplateId();

    /**
     * <code>string clientParams = 10;</code>
     * @return The clientParams.
     */
    java.lang.String getClientParams();
    /**
     * <code>string clientParams = 10;</code>
     * @return The bytes for clientParams.
     */
    com.google.protobuf.ByteString
        getClientParamsBytes();

    /**
     * <code>.Route route = 4;</code>
     * @return Whether the route field is set.
     */
    boolean hasRoute();
    /**
     * <code>.Route route = 4;</code>
     * @return The route.
     */
    emu.grasscutter.net.proto.RouteOuterClass.Route getRoute();
    /**
     * <code>.Route route = 4;</code>
     */
    emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder();

    /**
     * <code>uint32 entityId = 1;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   *enum PEPNPAGIKJC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 3097;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code AvatarFollowRouteNotify}
   */
  public static final class AvatarFollowRouteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFollowRouteNotify)
      AvatarFollowRouteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFollowRouteNotify.newBuilder() to construct.
    private AvatarFollowRouteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFollowRouteNotify() {
      clientParams_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFollowRouteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarFollowRouteNotify(
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

              entityId_ = input.readUInt32();
              break;
            }
            case 16: {

              templateId_ = input.readUInt32();
              break;
            }
            case 34: {
              emu.grasscutter.net.proto.RouteOuterClass.Route.Builder subBuilder = null;
              if (route_ != null) {
                subBuilder = route_.toBuilder();
              }
              route_ = input.readMessage(emu.grasscutter.net.proto.RouteOuterClass.Route.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(route_);
                route_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {

              startSceneTimeMs_ = input.readUInt32();
              break;
            }
            case 82: {
              java.lang.String s = input.readStringRequireUtf8();

              clientParams_ = s;
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
      return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
    }

    public static final int STARTSCENETIMEMS_FIELD_NUMBER = 6;
    private int startSceneTimeMs_;
    /**
     * <code>uint32 startSceneTimeMs = 6;</code>
     * @return The startSceneTimeMs.
     */
    @java.lang.Override
    public int getStartSceneTimeMs() {
      return startSceneTimeMs_;
    }

    public static final int TEMPLATEID_FIELD_NUMBER = 2;
    private int templateId_;
    /**
     * <code>uint32 templateId = 2;</code>
     * @return The templateId.
     */
    @java.lang.Override
    public int getTemplateId() {
      return templateId_;
    }

    public static final int CLIENTPARAMS_FIELD_NUMBER = 10;
    private volatile java.lang.Object clientParams_;
    /**
     * <code>string clientParams = 10;</code>
     * @return The clientParams.
     */
    @java.lang.Override
    public java.lang.String getClientParams() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientParams_ = s;
        return s;
      }
    }
    /**
     * <code>string clientParams = 10;</code>
     * @return The bytes for clientParams.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientParamsBytes() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientParams_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROUTE_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.RouteOuterClass.Route route_;
    /**
     * <code>.Route route = 4;</code>
     * @return Whether the route field is set.
     */
    @java.lang.Override
    public boolean hasRoute() {
      return route_ != null;
    }
    /**
     * <code>.Route route = 4;</code>
     * @return The route.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RouteOuterClass.Route getRoute() {
      return route_ == null ? emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
    }
    /**
     * <code>.Route route = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
      return getRoute();
    }

    public static final int ENTITYID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entityId = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (templateId_ != 0) {
        output.writeUInt32(2, templateId_);
      }
      if (route_ != null) {
        output.writeMessage(4, getRoute());
      }
      if (startSceneTimeMs_ != 0) {
        output.writeUInt32(6, startSceneTimeMs_);
      }
      if (!getClientParamsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, clientParams_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (templateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, templateId_);
      }
      if (route_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getRoute());
      }
      if (startSceneTimeMs_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, startSceneTimeMs_);
      }
      if (!getClientParamsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, clientParams_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other = (emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) obj;

      if (getStartSceneTimeMs()
          != other.getStartSceneTimeMs()) return false;
      if (getTemplateId()
          != other.getTemplateId()) return false;
      if (!getClientParams()
          .equals(other.getClientParams())) return false;
      if (hasRoute() != other.hasRoute()) return false;
      if (hasRoute()) {
        if (!getRoute()
            .equals(other.getRoute())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + STARTSCENETIMEMS_FIELD_NUMBER;
      hash = (53 * hash) + getStartSceneTimeMs();
      hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateId();
      hash = (37 * hash) + CLIENTPARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getClientParams().hashCode();
      if (hasRoute()) {
        hash = (37 * hash) + ROUTE_FIELD_NUMBER;
        hash = (53 * hash) + getRoute().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify prototype) {
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
     *enum PEPNPAGIKJC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 3097;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code AvatarFollowRouteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFollowRouteNotify)
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.newBuilder()
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
        startSceneTimeMs_ = 0;

        templateId_ = 0;

        clientParams_ = "";

        if (routeBuilder_ == null) {
          route_ = null;
        } else {
          route_ = null;
          routeBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify build() {
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = new emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify(this);
        result.startSceneTimeMs_ = startSceneTimeMs_;
        result.templateId_ = templateId_;
        result.clientParams_ = clientParams_;
        if (routeBuilder_ == null) {
          result.route_ = route_;
        } else {
          result.route_ = routeBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance()) return this;
        if (other.getStartSceneTimeMs() != 0) {
          setStartSceneTimeMs(other.getStartSceneTimeMs());
        }
        if (other.getTemplateId() != 0) {
          setTemplateId(other.getTemplateId());
        }
        if (!other.getClientParams().isEmpty()) {
          clientParams_ = other.clientParams_;
          onChanged();
        }
        if (other.hasRoute()) {
          mergeRoute(other.getRoute());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int startSceneTimeMs_ ;
      /**
       * <code>uint32 startSceneTimeMs = 6;</code>
       * @return The startSceneTimeMs.
       */
      @java.lang.Override
      public int getStartSceneTimeMs() {
        return startSceneTimeMs_;
      }
      /**
       * <code>uint32 startSceneTimeMs = 6;</code>
       * @param value The startSceneTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartSceneTimeMs(int value) {
        
        startSceneTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 startSceneTimeMs = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSceneTimeMs() {
        
        startSceneTimeMs_ = 0;
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>uint32 templateId = 2;</code>
       * @return The templateId.
       */
      @java.lang.Override
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>uint32 templateId = 2;</code>
       * @param value The templateId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateId(int value) {
        
        templateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 templateId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateId() {
        
        templateId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object clientParams_ = "";
      /**
       * <code>string clientParams = 10;</code>
       * @return The clientParams.
       */
      public java.lang.String getClientParams() {
        java.lang.Object ref = clientParams_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientParams_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string clientParams = 10;</code>
       * @return The bytes for clientParams.
       */
      public com.google.protobuf.ByteString
          getClientParamsBytes() {
        java.lang.Object ref = clientParams_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientParams_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clientParams = 10;</code>
       * @param value The clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParams(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientParams_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string clientParams = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientParams() {
        
        clientParams_ = getDefaultInstance().getClientParams();
        onChanged();
        return this;
      }
      /**
       * <code>string clientParams = 10;</code>
       * @param value The bytes for clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParamsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientParams_ = value;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.RouteOuterClass.Route route_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder> routeBuilder_;
      /**
       * <code>.Route route = 4;</code>
       * @return Whether the route field is set.
       */
      public boolean hasRoute() {
        return routeBuilder_ != null || route_ != null;
      }
      /**
       * <code>.Route route = 4;</code>
       * @return The route.
       */
      public emu.grasscutter.net.proto.RouteOuterClass.Route getRoute() {
        if (routeBuilder_ == null) {
          return route_ == null ? emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
        } else {
          return routeBuilder_.getMessage();
        }
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public Builder setRoute(emu.grasscutter.net.proto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          route_ = value;
          onChanged();
        } else {
          routeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public Builder setRoute(
          emu.grasscutter.net.proto.RouteOuterClass.Route.Builder builderForValue) {
        if (routeBuilder_ == null) {
          route_ = builderForValue.build();
          onChanged();
        } else {
          routeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public Builder mergeRoute(emu.grasscutter.net.proto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (route_ != null) {
            route_ =
              emu.grasscutter.net.proto.RouteOuterClass.Route.newBuilder(route_).mergeFrom(value).buildPartial();
          } else {
            route_ = value;
          }
          onChanged();
        } else {
          routeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public Builder clearRoute() {
        if (routeBuilder_ == null) {
          route_ = null;
          onChanged();
        } else {
          route_ = null;
          routeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public emu.grasscutter.net.proto.RouteOuterClass.Route.Builder getRouteBuilder() {
        
        onChanged();
        return getRouteFieldBuilder().getBuilder();
      }
      /**
       * <code>.Route route = 4;</code>
       */
      public emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
        if (routeBuilder_ != null) {
          return routeBuilder_.getMessageOrBuilder();
        } else {
          return route_ == null ?
              emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance() : route_;
        }
      }
      /**
       * <code>.Route route = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder> 
          getRouteFieldBuilder() {
        if (routeBuilder_ == null) {
          routeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.RouteOuterClass.Route, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder, emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder>(
                  getRoute(),
                  getParentForChildren(),
                  isClean());
          route_ = null;
        }
        return routeBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarFollowRouteNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFollowRouteNotify)
    private static final emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify();
    }

    public static emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFollowRouteNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFollowRouteNotify>() {
      @java.lang.Override
      public AvatarFollowRouteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarFollowRouteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarFollowRouteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFollowRouteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFollowRouteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFollowRouteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarFollowRouteNotify.proto\032\013Route.p" +
      "roto\"\206\001\n\027AvatarFollowRouteNotify\022\030\n\020star" +
      "tSceneTimeMs\030\006 \001(\r\022\022\n\ntemplateId\030\002 \001(\r\022\024" +
      "\n\014clientParams\030\n \001(\t\022\025\n\005route\030\004 \001(\0132\006.Ro" +
      "ute\022\020\n\010entityId\030\001 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RouteOuterClass.getDescriptor(),
        });
    internal_static_AvatarFollowRouteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFollowRouteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFollowRouteNotify_descriptor,
        new java.lang.String[] { "StartSceneTimeMs", "TemplateId", "ClientParams", "Route", "EntityId", });
    emu.grasscutter.net.proto.RouteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
