// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGELBDLLJBJ.proto

package emu.grasscutter.net.proto;

public final class IGELBDLLJBJOuterClass {
  private IGELBDLLJBJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code IGELBDLLJBJ}
   */
  public enum IGELBDLLJBJ
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IGELBDLLJBJ_NONE = 0;</code>
     */
    IGELBDLLJBJ_NONE(0),
    /**
     * <code>AHEECBJFNHH = 1;</code>
     */
    AHEECBJFNHH(1),
    /**
     * <code>HGICJDHDLFB = 2;</code>
     */
    HGICJDHDLFB(2),
    /**
     * <code>ENGFFCGEOPF = 3;</code>
     */
    ENGFFCGEOPF(3),
    /**
     * <code>BBCFLJLFDAP = 4;</code>
     */
    BBCFLJLFDAP(4),
    /**
     * <code>IGELBDLLJBJ_FIFTH = 5;</code>
     */
    IGELBDLLJBJ_FIFTH(5),
    /**
     * <code>FNPCNAAAGBH = 6;</code>
     */
    FNPCNAAAGBH(6),
    /**
     * <code>FACMNGDGCOG = 7;</code>
     */
    FACMNGDGCOG(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IGELBDLLJBJ_NONE = 0;</code>
     */
    public static final int IGELBDLLJBJ_NONE_VALUE = 0;
    /**
     * <code>AHEECBJFNHH = 1;</code>
     */
    public static final int AHEECBJFNHH_VALUE = 1;
    /**
     * <code>HGICJDHDLFB = 2;</code>
     */
    public static final int HGICJDHDLFB_VALUE = 2;
    /**
     * <code>ENGFFCGEOPF = 3;</code>
     */
    public static final int ENGFFCGEOPF_VALUE = 3;
    /**
     * <code>BBCFLJLFDAP = 4;</code>
     */
    public static final int BBCFLJLFDAP_VALUE = 4;
    /**
     * <code>IGELBDLLJBJ_FIFTH = 5;</code>
     */
    public static final int IGELBDLLJBJ_FIFTH_VALUE = 5;
    /**
     * <code>FNPCNAAAGBH = 6;</code>
     */
    public static final int FNPCNAAAGBH_VALUE = 6;
    /**
     * <code>FACMNGDGCOG = 7;</code>
     */
    public static final int FACMNGDGCOG_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IGELBDLLJBJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IGELBDLLJBJ forNumber(int value) {
      switch (value) {
        case 0: return IGELBDLLJBJ_NONE;
        case 1: return AHEECBJFNHH;
        case 2: return HGICJDHDLFB;
        case 3: return ENGFFCGEOPF;
        case 4: return BBCFLJLFDAP;
        case 5: return IGELBDLLJBJ_FIFTH;
        case 6: return FNPCNAAAGBH;
        case 7: return FACMNGDGCOG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IGELBDLLJBJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IGELBDLLJBJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IGELBDLLJBJ>() {
            public IGELBDLLJBJ findValueByNumber(int number) {
              return IGELBDLLJBJ.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IGELBDLLJBJOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final IGELBDLLJBJ[] VALUES = values();

    public static IGELBDLLJBJ valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IGELBDLLJBJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:IGELBDLLJBJ)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IGELBDLLJBJ.proto*\240\001\n\013IGELBDLLJBJ\022\024\n\020I" +
      "GELBDLLJBJ_NONE\020\000\022\017\n\013AHEECBJFNHH\020\001\022\017\n\013HG" +
      "ICJDHDLFB\020\002\022\017\n\013ENGFFCGEOPF\020\003\022\017\n\013BBCFLJLF" +
      "DAP\020\004\022\025\n\021IGELBDLLJBJ_FIFTH\020\005\022\017\n\013FNPCNAAA" +
      "GBH\020\006\022\017\n\013FACMNGDGCOG\020\007B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
