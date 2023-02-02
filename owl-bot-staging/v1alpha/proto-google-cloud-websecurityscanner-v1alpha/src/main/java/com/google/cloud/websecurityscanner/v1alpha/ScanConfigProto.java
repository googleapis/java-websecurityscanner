// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/scan_config.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class ScanConfigProto {
  private ScanConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/websecurityscanner/v1alph" +
      "a/scan_config.proto\022\'google.cloud.websec" +
      "urityscanner.v1alpha\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\0326google/cloud/websecurityscanner/v1alph" +
      "a/scan_run.proto\032\037google/protobuf/timest" +
      "amp.proto\"\261\n\n\nScanConfig\022\014\n\004name\030\001 \001(\t\022\031" +
      "\n\014display_name\030\002 \001(\tB\003\340A\002\022\017\n\007max_qps\030\003 \001" +
      "(\005\022\032\n\rstarting_urls\030\004 \003(\tB\003\340A\002\022Z\n\016authen" +
      "tication\030\005 \001(\0132B.google.cloud.websecurit" +
      "yscanner.v1alpha.ScanConfig.Authenticati" +
      "on\022Q\n\nuser_agent\030\006 \001(\0162=.google.cloud.we" +
      "bsecurityscanner.v1alpha.ScanConfig.User" +
      "Agent\022\032\n\022blacklist_patterns\030\007 \003(\t\022N\n\010sch" +
      "edule\030\010 \001(\0132<.google.cloud.websecuritysc" +
      "anner.v1alpha.ScanConfig.Schedule\022\\\n\020tar" +
      "get_platforms\030\t \003(\0162B.google.cloud.webse" +
      "curityscanner.v1alpha.ScanConfig.TargetP" +
      "latform\022D\n\nlatest_run\030\013 \001(\01320.google.clo" +
      "ud.websecurityscanner.v1alpha.ScanRun\032\226\003" +
      "\n\016Authentication\022j\n\016google_account\030\001 \001(\013" +
      "2P.google.cloud.websecurityscanner.v1alp" +
      "ha.ScanConfig.Authentication.GoogleAccou" +
      "ntH\000\022j\n\016custom_account\030\002 \001(\0132P.google.cl" +
      "oud.websecurityscanner.v1alpha.ScanConfi" +
      "g.Authentication.CustomAccountH\000\032@\n\rGoog" +
      "leAccount\022\025\n\010username\030\001 \001(\tB\003\340A\002\022\030\n\010pass" +
      "word\030\002 \001(\tB\006\340A\002\340A\004\032X\n\rCustomAccount\022\025\n\010u" +
      "sername\030\001 \001(\tB\003\340A\002\022\030\n\010password\030\002 \001(\tB\006\340A" +
      "\002\340A\004\022\026\n\tlogin_url\030\003 \001(\tB\003\340A\002B\020\n\016authenti" +
      "cation\032b\n\010Schedule\0221\n\rschedule_time\030\001 \001(" +
      "\0132\032.google.protobuf.Timestamp\022#\n\026interva" +
      "l_duration_days\030\002 \001(\005B\003\340A\002\"`\n\tUserAgent\022" +
      "\032\n\026USER_AGENT_UNSPECIFIED\020\000\022\020\n\014CHROME_LI" +
      "NUX\020\001\022\022\n\016CHROME_ANDROID\020\002\022\021\n\rSAFARI_IPHO" +
      "NE\020\003\"N\n\016TargetPlatform\022\037\n\033TARGET_PLATFOR" +
      "M_UNSPECIFIED\020\000\022\016\n\nAPP_ENGINE\020\001\022\013\n\007COMPU" +
      "TE\020\002:_\352A\\\n,websecurityscanner.googleapis" +
      ".com/ScanConfig\022,projects/{project}/scan" +
      "Configs/{scan_config}B\235\001\n+com.google.clo" +
      "ud.websecurityscanner.v1alphaB\017ScanConfi" +
      "gProtoP\001Z[cloud.google.com/go/websecurit" +
      "yscanner/apiv1alpha/websecurityscannerpb" +
      ";websecurityscannerpbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.websecurityscanner.v1alpha.ScanRunProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "MaxQps", "StartingUrls", "Authentication", "UserAgent", "BlacklistPatterns", "Schedule", "TargetPlatforms", "LatestRun", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor,
        new java.lang.String[] { "GoogleAccount", "CustomAccount", "Authentication", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_GoogleAccount_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Authentication_CustomAccount_descriptor,
        new java.lang.String[] { "Username", "Password", "LoginUrl", });
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor =
      internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_websecurityscanner_v1alpha_ScanConfig_Schedule_descriptor,
        new java.lang.String[] { "ScheduleTime", "IntervalDurationDays", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1alpha.ScanRunProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
