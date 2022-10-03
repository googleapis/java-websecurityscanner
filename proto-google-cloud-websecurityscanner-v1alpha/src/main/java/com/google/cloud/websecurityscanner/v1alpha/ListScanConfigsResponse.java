/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * Response for the `ListScanConfigs` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse}
 */
public final class ListScanConfigsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse)
    ListScanConfigsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListScanConfigsResponse.newBuilder() to construct.
  private ListScanConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListScanConfigsResponse() {
    scanConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListScanConfigsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_ListScanConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_ListScanConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse.class,
            com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse.Builder.class);
  }

  public static final int SCAN_CONFIGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig> scanConfigs_;
  /**
   *
   *
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig>
      getScanConfigsList() {
    return scanConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
      getScanConfigsOrBuilderList() {
    return scanConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
   */
  @java.lang.Override
  public int getScanConfigsCount() {
    return scanConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfigs(int index) {
    return scanConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of ScanConfigs returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder getScanConfigsOrBuilder(
      int index) {
    return scanConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < scanConfigs_.size(); i++) {
      output.writeMessage(1, scanConfigs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < scanConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, scanConfigs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse other =
        (com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse) obj;

    if (!getScanConfigsList().equals(other.getScanConfigsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getScanConfigsCount() > 0) {
      hash = (37 * hash) + SCAN_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getScanConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `ListScanConfigs` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse)
      com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListScanConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListScanConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse.class,
              com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (scanConfigsBuilder_ == null) {
        scanConfigs_ = java.util.Collections.emptyList();
      } else {
        scanConfigs_ = null;
        scanConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_ListScanConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse build() {
      com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse result =
          new com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse(this);
      int from_bitField0_ = bitField0_;
      if (scanConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          scanConfigs_ = java.util.Collections.unmodifiableList(scanConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scanConfigs_ = scanConfigs_;
      } else {
        result.scanConfigs_ = scanConfigsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse) {
        return mergeFrom(
            (com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse other) {
      if (other
          == com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
              .getDefaultInstance()) return this;
      if (scanConfigsBuilder_ == null) {
        if (!other.scanConfigs_.isEmpty()) {
          if (scanConfigs_.isEmpty()) {
            scanConfigs_ = other.scanConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScanConfigsIsMutable();
            scanConfigs_.addAll(other.scanConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.scanConfigs_.isEmpty()) {
          if (scanConfigsBuilder_.isEmpty()) {
            scanConfigsBuilder_.dispose();
            scanConfigsBuilder_ = null;
            scanConfigs_ = other.scanConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scanConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getScanConfigsFieldBuilder()
                    : null;
          } else {
            scanConfigsBuilder_.addAllMessages(other.scanConfigs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig m =
                    input.readMessage(
                        com.google.cloud.websecurityscanner.v1alpha.ScanConfig.parser(),
                        extensionRegistry);
                if (scanConfigsBuilder_ == null) {
                  ensureScanConfigsIsMutable();
                  scanConfigs_.add(m);
                } else {
                  scanConfigsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig> scanConfigs_ =
        java.util.Collections.emptyList();

    private void ensureScanConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scanConfigs_ =
            new java.util.ArrayList<com.google.cloud.websecurityscanner.v1alpha.ScanConfig>(
                scanConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        scanConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig>
        getScanConfigsList() {
      if (scanConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(scanConfigs_);
      } else {
        return scanConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public int getScanConfigsCount() {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.size();
      } else {
        return scanConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfigs(int index) {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.get(index);
      } else {
        return scanConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder setScanConfigs(
        int index, com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.set(index, value);
        onChanged();
      } else {
        scanConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder setScanConfigs(
        int index, com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.add(value);
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        int index, com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanConfigsIsMutable();
        scanConfigs_.add(index, value);
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder addScanConfigs(
        int index, com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder builderForValue) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        scanConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder addAllScanConfigs(
        java.lang.Iterable<? extends com.google.cloud.websecurityscanner.v1alpha.ScanConfig>
            values) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, scanConfigs_);
        onChanged();
      } else {
        scanConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder clearScanConfigs() {
      if (scanConfigsBuilder_ == null) {
        scanConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scanConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public Builder removeScanConfigs(int index) {
      if (scanConfigsBuilder_ == null) {
        ensureScanConfigsIsMutable();
        scanConfigs_.remove(index);
        onChanged();
      } else {
        scanConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder getScanConfigsBuilder(
        int index) {
      return getScanConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder getScanConfigsOrBuilder(
        int index) {
      if (scanConfigsBuilder_ == null) {
        return scanConfigs_.get(index);
      } else {
        return scanConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        getScanConfigsOrBuilderList() {
      if (scanConfigsBuilder_ != null) {
        return scanConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(scanConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder addScanConfigsBuilder() {
      return getScanConfigsFieldBuilder()
          .addBuilder(com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder addScanConfigsBuilder(
        int index) {
      return getScanConfigsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of ScanConfigs returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder>
        getScanConfigsBuilderList() {
      return getScanConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        getScanConfigsFieldBuilder() {
      if (scanConfigsBuilder_ == null) {
        scanConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>(
                scanConfigs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        scanConfigs_ = null;
      }
      return scanConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse)
  private static final com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListScanConfigsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListScanConfigsResponse>() {
        @java.lang.Override
        public ListScanConfigsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListScanConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListScanConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ListScanConfigsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
