// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_type_stats.proto

package com.google.cloud.websecurityscanner.v1;

public final class FindingTypeStatsProto {
  private FindingTypeStatsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_FindingTypeStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_FindingTypeStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/websecurityscanner/v1/fin" +
      "ding_type_stats.proto\022\"google.cloud.webs" +
      "ecurityscanner.v1\"?\n\020FindingTypeStats\022\024\n" +
      "\014finding_type\030\001 \001(\t\022\025\n\rfinding_count\030\002 \001" +
      "(\005B\211\002\n&com.google.cloud.websecurityscann" +
      "er.v1B\025FindingTypeStatsProtoP\001ZTgoogle.g" +
      "olang.org/genproto/googleapis/cloud/webs" +
      "ecurityscanner/v1;websecurityscanner\252\002\"G" +
      "oogle.Cloud.WebSecurityScanner.V1\312\002\"Goog" +
      "le\\Cloud\\WebSecurityScanner\\V1\352\002%Google:" +
      ":Cloud::WebSecurityScanner::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_websecurityscanner_v1_FindingTypeStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_FindingTypeStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_FindingTypeStats_descriptor,
        new java.lang.String[] { "FindingType", "FindingCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
