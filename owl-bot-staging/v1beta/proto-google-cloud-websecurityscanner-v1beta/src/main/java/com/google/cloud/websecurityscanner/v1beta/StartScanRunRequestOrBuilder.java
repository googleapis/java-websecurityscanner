// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface StartScanRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.StartScanRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the ScanConfig to be used. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the ScanConfig to be used. The name follows the
   * format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
