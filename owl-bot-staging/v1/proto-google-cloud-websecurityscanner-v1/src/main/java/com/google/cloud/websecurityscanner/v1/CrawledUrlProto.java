// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/crawled_url.proto

package com.google.cloud.websecurityscanner.v1;

public final class CrawledUrlProto {
  private CrawledUrlProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_CrawledUrl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_CrawledUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/websecurityscanner/v1/cra" +
      "wled_url.proto\022\"google.cloud.websecurity" +
      "scanner.v1\"<\n\nCrawledUrl\022\023\n\013http_method\030" +
      "\001 \001(\t\022\013\n\003url\030\002 \001(\t\022\014\n\004body\030\003 \001(\tB\205\002\n&com" +
      ".google.cloud.websecurityscanner.v1B\017Cra" +
      "wledUrlProtoP\001ZVcloud.google.com/go/webs" +
      "ecurityscanner/apiv1/websecurityscannerp" +
      "b;websecurityscannerpb\252\002\"Google.Cloud.We" +
      "bSecurityScanner.V1\312\002\"Google\\Cloud\\WebSe" +
      "curityScanner\\V1\352\002%Google::Cloud::WebSec" +
      "urityScanner::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_websecurityscanner_v1_CrawledUrl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_CrawledUrl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_CrawledUrl_descriptor,
        new java.lang.String[] { "HttpMethod", "Url", "Body", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
