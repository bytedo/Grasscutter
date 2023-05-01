// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordUsage.proto

package emu.grasscutter.net.proto;

public final class RecordUsageOuterClass {
  private RecordUsageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: CFEMNBDBBCK
   * </pre>
   *
   * Protobuf enum {@code RecordUsage}
   */
  public enum RecordUsage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UGC_RECORD_USAGE_NONE = 0;</code>
     */
    UGC_RECORD_USAGE_NONE(0),
    /**
     * <code>UGC_RECORD_USAGE_IMPORT = 1;</code>
     */
    UGC_RECORD_USAGE_IMPORT(1),
    /**
     * <code>UGC_RECORD_USAGE_PLAY = 2;</code>
     */
    UGC_RECORD_USAGE_PLAY(2),
    /**
     * <code>UGC_RECORD_USAGE_TRIAL = 3;</code>
     */
    UGC_RECORD_USAGE_TRIAL(3),
    /**
     * <code>UGC_RECORD_USAGE_COMPARE = 4;</code>
     */
    UGC_RECORD_USAGE_COMPARE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UGC_RECORD_USAGE_NONE = 0;</code>
     */
    public static final int UGC_RECORD_USAGE_NONE_VALUE = 0;
    /**
     * <code>UGC_RECORD_USAGE_IMPORT = 1;</code>
     */
    public static final int UGC_RECORD_USAGE_IMPORT_VALUE = 1;
    /**
     * <code>UGC_RECORD_USAGE_PLAY = 2;</code>
     */
    public static final int UGC_RECORD_USAGE_PLAY_VALUE = 2;
    /**
     * <code>UGC_RECORD_USAGE_TRIAL = 3;</code>
     */
    public static final int UGC_RECORD_USAGE_TRIAL_VALUE = 3;
    /**
     * <code>UGC_RECORD_USAGE_COMPARE = 4;</code>
     */
    public static final int UGC_RECORD_USAGE_COMPARE_VALUE = 4;


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
    public static RecordUsage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RecordUsage forNumber(int value) {
      switch (value) {
        case 0: return UGC_RECORD_USAGE_NONE;
        case 1: return UGC_RECORD_USAGE_IMPORT;
        case 2: return UGC_RECORD_USAGE_PLAY;
        case 3: return UGC_RECORD_USAGE_TRIAL;
        case 4: return UGC_RECORD_USAGE_COMPARE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RecordUsage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RecordUsage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RecordUsage>() {
            public RecordUsage findValueByNumber(int number) {
              return RecordUsage.forNumber(number);
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
      return emu.grasscutter.net.proto.RecordUsageOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RecordUsage[] VALUES = values();

    public static RecordUsage valueOf(
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

    private RecordUsage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RecordUsage)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RecordUsage.proto*\232\001\n\013RecordUsage\022\031\n\025U" +
      "GC_RECORD_USAGE_NONE\020\000\022\033\n\027UGC_RECORD_USA" +
      "GE_IMPORT\020\001\022\031\n\025UGC_RECORD_USAGE_PLAY\020\002\022\032" +
      "\n\026UGC_RECORD_USAGE_TRIAL\020\003\022\034\n\030UGC_RECORD" +
      "_USAGE_COMPARE\020\004B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
