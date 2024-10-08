// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PBNavMeshPoly.proto

package emu.grasscutter.net.proto;

public final class PBNavMeshPolyOuterClass {
  private PBNavMeshPolyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PBNavMeshPolyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PBNavMeshPoly)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 vects = 1;</code>
     * @return A list containing the vects.
     */
    java.util.List<java.lang.Integer> getVectsList();
    /**
     * <code>repeated int32 vects = 1;</code>
     * @return The count of vects.
     */
    int getVectsCount();
    /**
     * <code>repeated int32 vects = 1;</code>
     * @param index The index of the element to return.
     * @return The vects at the given index.
     */
    int getVects(int index);

    /**
     * <code>int32 area = 7;</code>
     * @return The area.
     */
    int getArea();

    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return A list containing the edgeTypes.
     */
    java.util.List<emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType> getEdgeTypesList();
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return The count of edgeTypes.
     */
    int getEdgeTypesCount();
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @param index The index of the element to return.
     * @return The edgeTypes at the given index.
     */
    emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType getEdgeTypes(int index);
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return A list containing the enum numeric values on the wire for edgeTypes.
     */
    java.util.List<java.lang.Integer>
    getEdgeTypesValueList();
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of edgeTypes at the given index.
     */
    int getEdgeTypesValue(int index);
  }
  /**
   * Protobuf type {@code PBNavMeshPoly}
   */
  public static final class PBNavMeshPoly extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PBNavMeshPoly)
      PBNavMeshPolyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PBNavMeshPoly.newBuilder() to construct.
    private PBNavMeshPoly(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PBNavMeshPoly() {
      vects_ = emptyIntList();
      edgeTypes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PBNavMeshPoly();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PBNavMeshPoly(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                vects_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              vects_.addInt(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                vects_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                vects_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {

              area_ = input.readInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                edgeTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              edgeTypes_.add(rawValue);
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                  edgeTypes_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000002;
                }
                edgeTypes_.add(rawValue);
              }
              input.popLimit(oldLimit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          vects_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          edgeTypes_ = java.util.Collections.unmodifiableList(edgeTypes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.internal_static_PBNavMeshPoly_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.internal_static_PBNavMeshPoly_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.class, emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.Builder.class);
    }

    public static final int VECTS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList vects_;
    /**
     * <code>repeated int32 vects = 1;</code>
     * @return A list containing the vects.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getVectsList() {
      return vects_;
    }
    /**
     * <code>repeated int32 vects = 1;</code>
     * @return The count of vects.
     */
    public int getVectsCount() {
      return vects_.size();
    }
    /**
     * <code>repeated int32 vects = 1;</code>
     * @param index The index of the element to return.
     * @return The vects at the given index.
     */
    public int getVects(int index) {
      return vects_.getInt(index);
    }
    private int vectsMemoizedSerializedSize = -1;

    public static final int AREA_FIELD_NUMBER = 7;
    private int area_;
    /**
     * <code>int32 area = 7;</code>
     * @return The area.
     */
    @java.lang.Override
    public int getArea() {
      return area_;
    }

    public static final int EDGE_TYPES_FIELD_NUMBER = 8;
    private java.util.List<java.lang.Integer> edgeTypes_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType> edgeTypes_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType>() {
              public emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType convert(java.lang.Integer from) {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType result = emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType.valueOf(from);
                return result == null ? emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return A list containing the edgeTypes.
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType> getEdgeTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType>(edgeTypes_, edgeTypes_converter_);
    }
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return The count of edgeTypes.
     */
    @java.lang.Override
    public int getEdgeTypesCount() {
      return edgeTypes_.size();
    }
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @param index The index of the element to return.
     * @return The edgeTypes at the given index.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType getEdgeTypes(int index) {
      return edgeTypes_converter_.convert(edgeTypes_.get(index));
    }
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @return A list containing the enum numeric values on the wire for edgeTypes.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getEdgeTypesValueList() {
      return edgeTypes_;
    }
    /**
     * <code>repeated .EdgeType edge_types = 8;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of edgeTypes at the given index.
     */
    @java.lang.Override
    public int getEdgeTypesValue(int index) {
      return edgeTypes_.get(index);
    }
    private int edgeTypesMemoizedSerializedSize;

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
      getSerializedSize();
      if (getVectsList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(vectsMemoizedSerializedSize);
      }
      for (int i = 0; i < vects_.size(); i++) {
        output.writeInt32NoTag(vects_.getInt(i));
      }
      if (area_ != 0) {
        output.writeInt32(7, area_);
      }
      if (getEdgeTypesList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(edgeTypesMemoizedSerializedSize);
      }
      for (int i = 0; i < edgeTypes_.size(); i++) {
        output.writeEnumNoTag(edgeTypes_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < vects_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(vects_.getInt(i));
        }
        size += dataSize;
        if (!getVectsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        vectsMemoizedSerializedSize = dataSize;
      }
      if (area_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, area_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < edgeTypes_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(edgeTypes_.get(i));
        }
        size += dataSize;
        if (!getEdgeTypesList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }edgeTypesMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly other = (emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly) obj;

      if (!getVectsList()
          .equals(other.getVectsList())) return false;
      if (getArea()
          != other.getArea()) return false;
      if (!edgeTypes_.equals(other.edgeTypes_)) return false;
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
      if (getVectsCount() > 0) {
        hash = (37 * hash) + VECTS_FIELD_NUMBER;
        hash = (53 * hash) + getVectsList().hashCode();
      }
      hash = (37 * hash) + AREA_FIELD_NUMBER;
      hash = (53 * hash) + getArea();
      if (getEdgeTypesCount() > 0) {
        hash = (37 * hash) + EDGE_TYPES_FIELD_NUMBER;
        hash = (53 * hash) + edgeTypes_.hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly prototype) {
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
     * Protobuf type {@code PBNavMeshPoly}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PBNavMeshPoly)
        emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPolyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.internal_static_PBNavMeshPoly_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.internal_static_PBNavMeshPoly_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.class, emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.newBuilder()
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
        vects_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        area_ = 0;

        edgeTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.internal_static_PBNavMeshPoly_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly build() {
        emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly buildPartial() {
        emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly result = new emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          vects_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vects_ = vects_;
        result.area_ = area_;
        if (((bitField0_ & 0x00000002) != 0)) {
          edgeTypes_ = java.util.Collections.unmodifiableList(edgeTypes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.edgeTypes_ = edgeTypes_;
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
        if (other instanceof emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly) {
          return mergeFrom((emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly other) {
        if (other == emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly.getDefaultInstance()) return this;
        if (!other.vects_.isEmpty()) {
          if (vects_.isEmpty()) {
            vects_ = other.vects_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVectsIsMutable();
            vects_.addAll(other.vects_);
          }
          onChanged();
        }
        if (other.getArea() != 0) {
          setArea(other.getArea());
        }
        if (!other.edgeTypes_.isEmpty()) {
          if (edgeTypes_.isEmpty()) {
            edgeTypes_ = other.edgeTypes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEdgeTypesIsMutable();
            edgeTypes_.addAll(other.edgeTypes_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList vects_ = emptyIntList();
      private void ensureVectsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          vects_ = mutableCopy(vects_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @return A list containing the vects.
       */
      public java.util.List<java.lang.Integer>
          getVectsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(vects_) : vects_;
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @return The count of vects.
       */
      public int getVectsCount() {
        return vects_.size();
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @param index The index of the element to return.
       * @return The vects at the given index.
       */
      public int getVects(int index) {
        return vects_.getInt(index);
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @param index The index to set the value at.
       * @param value The vects to set.
       * @return This builder for chaining.
       */
      public Builder setVects(
          int index, int value) {
        ensureVectsIsMutable();
        vects_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @param value The vects to add.
       * @return This builder for chaining.
       */
      public Builder addVects(int value) {
        ensureVectsIsMutable();
        vects_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @param values The vects to add.
       * @return This builder for chaining.
       */
      public Builder addAllVects(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureVectsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vects_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 vects = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVects() {
        vects_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int area_ ;
      /**
       * <code>int32 area = 7;</code>
       * @return The area.
       */
      @java.lang.Override
      public int getArea() {
        return area_;
      }
      /**
       * <code>int32 area = 7;</code>
       * @param value The area to set.
       * @return This builder for chaining.
       */
      public Builder setArea(int value) {
        
        area_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 area = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearArea() {
        
        area_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> edgeTypes_ =
        java.util.Collections.emptyList();
      private void ensureEdgeTypesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          edgeTypes_ = new java.util.ArrayList<java.lang.Integer>(edgeTypes_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @return A list containing the edgeTypes.
       */
      public java.util.List<emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType> getEdgeTypesList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType>(edgeTypes_, edgeTypes_converter_);
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @return The count of edgeTypes.
       */
      public int getEdgeTypesCount() {
        return edgeTypes_.size();
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param index The index of the element to return.
       * @return The edgeTypes at the given index.
       */
      public emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType getEdgeTypes(int index) {
        return edgeTypes_converter_.convert(edgeTypes_.get(index));
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param index The index to set the value at.
       * @param value The edgeTypes to set.
       * @return This builder for chaining.
       */
      public Builder setEdgeTypes(
          int index, emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgeTypesIsMutable();
        edgeTypes_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param value The edgeTypes to add.
       * @return This builder for chaining.
       */
      public Builder addEdgeTypes(emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgeTypesIsMutable();
        edgeTypes_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param values The edgeTypes to add.
       * @return This builder for chaining.
       */
      public Builder addAllEdgeTypes(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType> values) {
        ensureEdgeTypesIsMutable();
        for (emu.grasscutter.net.proto.EdgeTypeOuterClass.EdgeType value : values) {
          edgeTypes_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEdgeTypes() {
        edgeTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @return A list containing the enum numeric values on the wire for edgeTypes.
       */
      public java.util.List<java.lang.Integer>
      getEdgeTypesValueList() {
        return java.util.Collections.unmodifiableList(edgeTypes_);
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of edgeTypes at the given index.
       */
      public int getEdgeTypesValue(int index) {
        return edgeTypes_.get(index);
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of edgeTypes at the given index.
       * @return This builder for chaining.
       */
      public Builder setEdgeTypesValue(
          int index, int value) {
        ensureEdgeTypesIsMutable();
        edgeTypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param value The enum numeric value on the wire for edgeTypes to add.
       * @return This builder for chaining.
       */
      public Builder addEdgeTypesValue(int value) {
        ensureEdgeTypesIsMutable();
        edgeTypes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .EdgeType edge_types = 8;</code>
       * @param values The enum numeric values on the wire for edgeTypes to add.
       * @return This builder for chaining.
       */
      public Builder addAllEdgeTypesValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensureEdgeTypesIsMutable();
        for (int value : values) {
          edgeTypes_.add(value);
        }
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


      // @@protoc_insertion_point(builder_scope:PBNavMeshPoly)
    }

    // @@protoc_insertion_point(class_scope:PBNavMeshPoly)
    private static final emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly();
    }

    public static emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PBNavMeshPoly>
        PARSER = new com.google.protobuf.AbstractParser<PBNavMeshPoly>() {
      @java.lang.Override
      public PBNavMeshPoly parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PBNavMeshPoly(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PBNavMeshPoly> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PBNavMeshPoly> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PBNavMeshPolyOuterClass.PBNavMeshPoly getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PBNavMeshPoly_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PBNavMeshPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PBNavMeshPoly.proto\032\016EdgeType.proto\"K\n" +
      "\rPBNavMeshPoly\022\r\n\005vects\030\001 \003(\005\022\014\n\004area\030\007 " +
      "\001(\005\022\035\n\nedge_types\030\010 \003(\0162\t.EdgeTypeB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EdgeTypeOuterClass.getDescriptor(),
        });
    internal_static_PBNavMeshPoly_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PBNavMeshPoly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PBNavMeshPoly_descriptor,
        new java.lang.String[] { "Vects", "Area", "EdgeTypes", });
    emu.grasscutter.net.proto.EdgeTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
