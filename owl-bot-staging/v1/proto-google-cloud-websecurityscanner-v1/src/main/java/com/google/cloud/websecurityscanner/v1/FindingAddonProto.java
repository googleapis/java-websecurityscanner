// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

package com.google.cloud.websecurityscanner.v1;

public final class FindingAddonProto {
  private FindingAddonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_Form_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_Form_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_OutdatedLibrary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_OutdatedLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_ViolatingResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_ViolatingResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_Xss_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_Xss_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1_Xxe_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/websecurityscanner/v1/fin" +
      "ding_addon.proto\022\"google.cloud.websecuri" +
      "tyscanner.v1\"*\n\004Form\022\022\n\naction_uri\030\001 \001(\t" +
      "\022\016\n\006fields\030\002 \003(\t\"Q\n\017OutdatedLibrary\022\024\n\014l" +
      "ibrary_name\030\001 \001(\t\022\017\n\007version\030\002 \001(\t\022\027\n\017le" +
      "arn_more_urls\030\003 \003(\t\"?\n\021ViolatingResource" +
      "\022\024\n\014content_type\030\001 \001(\t\022\024\n\014resource_url\030\002" +
      " \001(\t\"/\n\024VulnerableParameters\022\027\n\017paramete" +
      "r_names\030\001 \003(\t\"\340\001\n\021VulnerableHeaders\022M\n\007h" +
      "eaders\030\001 \003(\0132<.google.cloud.websecuritys" +
      "canner.v1.VulnerableHeaders.Header\022U\n\017mi" +
      "ssing_headers\030\002 \003(\0132<.google.cloud.webse" +
      "curityscanner.v1.VulnerableHeaders.Heade" +
      "r\032%\n\006Header\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      "\"\333\003\n\003Xss\022\024\n\014stack_traces\030\001 \003(\t\022\025\n\rerror_" +
      "message\030\002 \001(\t\022K\n\rattack_vector\030\003 \001(\01624.g" +
      "oogle.cloud.websecurityscanner.v1.Xss.At" +
      "tackVector\022\036\n\026stored_xss_seeding_url\030\004 \001" +
      "(\t\"\271\002\n\014AttackVector\022\035\n\031ATTACK_VECTOR_UNS" +
      "PECIFIED\020\000\022\021\n\rLOCAL_STORAGE\020\001\022\023\n\017SESSION" +
      "_STORAGE\020\002\022\017\n\013WINDOW_NAME\020\003\022\014\n\010REFERRER\020" +
      "\004\022\016\n\nFORM_INPUT\020\005\022\n\n\006COOKIE\020\006\022\020\n\014POST_ME" +
      "SSAGE\020\007\022\022\n\016GET_PARAMETERS\020\010\022\020\n\014URL_FRAGM" +
      "ENT\020\t\022\020\n\014HTML_COMMENT\020\n\022\023\n\017POST_PARAMETE" +
      "RS\020\013\022\014\n\010PROTOCOL\020\014\022\016\n\nSTORED_XSS\020\r\022\017\n\013SA" +
      "ME_ORIGIN\020\016\022\031\n\025USER_CONTROLLABLE_URL\020\017\"\251" +
      "\001\n\003Xxe\022\025\n\rpayload_value\030\001 \001(\t\022J\n\020payload" +
      "_location\030\002 \001(\01620.google.cloud.websecuri" +
      "tyscanner.v1.Xxe.Location\"?\n\010Location\022\030\n" +
      "\024LOCATION_UNSPECIFIED\020\000\022\031\n\025COMPLETE_REQU" +
      "EST_BODY\020\001B\207\002\n&com.google.cloud.websecur" +
      "ityscanner.v1B\021FindingAddonProtoP\001ZVclou" +
      "d.google.com/go/websecurityscanner/apiv1" +
      "/websecurityscannerpb;websecurityscanner" +
      "pb\252\002\"Google.Cloud.WebSecurityScanner.V1\312" +
      "\002\"Google\\Cloud\\WebSecurityScanner\\V1\352\002%G" +
      "oogle::Cloud::WebSecurityScanner::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_websecurityscanner_v1_Form_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_Form_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_Form_descriptor,
        new java.lang.String[] { "ActionUri", "Fields", });
    internal_static_google_cloud_websecurityscanner_v1_OutdatedLibrary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1_OutdatedLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_OutdatedLibrary_descriptor,
        new java.lang.String[] { "LibraryName", "Version", "LearnMoreUrls", });
    internal_static_google_cloud_websecurityscanner_v1_ViolatingResource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_websecurityscanner_v1_ViolatingResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_ViolatingResource_descriptor,
        new java.lang.String[] { "ContentType", "ResourceUrl", });
    internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor,
        new java.lang.String[] { "ParameterNames", });
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_descriptor,
        new java.lang.String[] { "Headers", "MissingHeaders", });
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_Header_descriptor =
      internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_VulnerableHeaders_Header_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_google_cloud_websecurityscanner_v1_Xss_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_websecurityscanner_v1_Xss_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_Xss_descriptor,
        new java.lang.String[] { "StackTraces", "ErrorMessage", "AttackVector", "StoredXssSeedingUrl", });
    internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_websecurityscanner_v1_Xxe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1_Xxe_descriptor,
        new java.lang.String[] { "PayloadValue", "PayloadLocation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
