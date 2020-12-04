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
package com.google.cloud.websecurityscanner.v1beta;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto")
public final class WebSecurityScannerGrpc {

  private WebSecurityScannerGrpc() {}

  public static final String SERVICE_NAME =
      "google.cloud.websecurityscanner.v1beta.WebSecurityScanner";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getCreateScanConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScanConfig",
      requestType = com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getCreateScanConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        getCreateScanConfigMethod;
    if ((getCreateScanConfigMethod = WebSecurityScannerGrpc.getCreateScanConfigMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getCreateScanConfigMethod = WebSecurityScannerGrpc.getCreateScanConfigMethod)
            == null) {
          WebSecurityScannerGrpc.getCreateScanConfigMethod =
              getCreateScanConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScanConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanConfig
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("CreateScanConfig"))
                      .build();
        }
      }
    }
    return getCreateScanConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,
          com.google.protobuf.Empty>
      getDeleteScanConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScanConfig",
      requestType = com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,
          com.google.protobuf.Empty>
      getDeleteScanConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,
            com.google.protobuf.Empty>
        getDeleteScanConfigMethod;
    if ((getDeleteScanConfigMethod = WebSecurityScannerGrpc.getDeleteScanConfigMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getDeleteScanConfigMethod = WebSecurityScannerGrpc.getDeleteScanConfigMethod)
            == null) {
          WebSecurityScannerGrpc.getDeleteScanConfigMethod =
              getDeleteScanConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScanConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("DeleteScanConfig"))
                      .build();
        }
      }
    }
    return getDeleteScanConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getGetScanConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScanConfig",
      requestType = com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getGetScanConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        getGetScanConfigMethod;
    if ((getGetScanConfigMethod = WebSecurityScannerGrpc.getGetScanConfigMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getGetScanConfigMethod = WebSecurityScannerGrpc.getGetScanConfigMethod) == null) {
          WebSecurityScannerGrpc.getGetScanConfigMethod =
              getGetScanConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScanConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanConfig
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("GetScanConfig"))
                      .build();
        }
      }
    }
    return getGetScanConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
      getListScanConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScanConfigs",
      requestType = com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
      getListScanConfigsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,
            com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
        getListScanConfigsMethod;
    if ((getListScanConfigsMethod = WebSecurityScannerGrpc.getListScanConfigsMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getListScanConfigsMethod = WebSecurityScannerGrpc.getListScanConfigsMethod) == null) {
          WebSecurityScannerGrpc.getListScanConfigsMethod =
              getListScanConfigsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,
                          com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScanConfigs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("ListScanConfigs"))
                      .build();
        }
      }
    }
    return getListScanConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getUpdateScanConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScanConfig",
      requestType = com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
      getUpdateScanConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        getUpdateScanConfigMethod;
    if ((getUpdateScanConfigMethod = WebSecurityScannerGrpc.getUpdateScanConfigMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getUpdateScanConfigMethod = WebSecurityScannerGrpc.getUpdateScanConfigMethod)
            == null) {
          WebSecurityScannerGrpc.getUpdateScanConfigMethod =
              getUpdateScanConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScanConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanConfig
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("UpdateScanConfig"))
                      .build();
        }
      }
    }
    return getUpdateScanConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getStartScanRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartScanRun",
      requestType = com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getStartScanRunMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        getStartScanRunMethod;
    if ((getStartScanRunMethod = WebSecurityScannerGrpc.getStartScanRunMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getStartScanRunMethod = WebSecurityScannerGrpc.getStartScanRunMethod) == null) {
          WebSecurityScannerGrpc.getStartScanRunMethod =
              getStartScanRunMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanRun>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartScanRun"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanRun
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("StartScanRun"))
                      .build();
        }
      }
    }
    return getStartScanRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getGetScanRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScanRun",
      requestType = com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getGetScanRunMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        getGetScanRunMethod;
    if ((getGetScanRunMethod = WebSecurityScannerGrpc.getGetScanRunMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getGetScanRunMethod = WebSecurityScannerGrpc.getGetScanRunMethod) == null) {
          WebSecurityScannerGrpc.getGetScanRunMethod =
              getGetScanRunMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanRun>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScanRun"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanRun
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("GetScanRun"))
                      .build();
        }
      }
    }
    return getGetScanRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
      getListScanRunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScanRuns",
      requestType = com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
      getListScanRunsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,
            com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
        getListScanRunsMethod;
    if ((getListScanRunsMethod = WebSecurityScannerGrpc.getListScanRunsMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getListScanRunsMethod = WebSecurityScannerGrpc.getListScanRunsMethod) == null) {
          WebSecurityScannerGrpc.getListScanRunsMethod =
              getListScanRunsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,
                          com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScanRuns"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("ListScanRuns"))
                      .build();
        }
      }
    }
    return getListScanRunsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getStopScanRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopScanRun",
      requestType = com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ScanRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,
          com.google.cloud.websecurityscanner.v1beta.ScanRun>
      getStopScanRunMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        getStopScanRunMethod;
    if ((getStopScanRunMethod = WebSecurityScannerGrpc.getStopScanRunMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getStopScanRunMethod = WebSecurityScannerGrpc.getStopScanRunMethod) == null) {
          WebSecurityScannerGrpc.getStopScanRunMethod =
              getStopScanRunMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,
                          com.google.cloud.websecurityscanner.v1beta.ScanRun>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopScanRun"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ScanRun
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("StopScanRun"))
                      .build();
        }
      }
    }
    return getStopScanRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
      getListCrawledUrlsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCrawledUrls",
      requestType = com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
      getListCrawledUrlsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,
            com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
        getListCrawledUrlsMethod;
    if ((getListCrawledUrlsMethod = WebSecurityScannerGrpc.getListCrawledUrlsMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getListCrawledUrlsMethod = WebSecurityScannerGrpc.getListCrawledUrlsMethod) == null) {
          WebSecurityScannerGrpc.getListCrawledUrlsMethod =
              getListCrawledUrlsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,
                          com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCrawledUrls"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("ListCrawledUrls"))
                      .build();
        }
      }
    }
    return getListCrawledUrlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,
          com.google.cloud.websecurityscanner.v1beta.Finding>
      getGetFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFinding",
      requestType = com.google.cloud.websecurityscanner.v1beta.GetFindingRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.Finding.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,
          com.google.cloud.websecurityscanner.v1beta.Finding>
      getGetFindingMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,
            com.google.cloud.websecurityscanner.v1beta.Finding>
        getGetFindingMethod;
    if ((getGetFindingMethod = WebSecurityScannerGrpc.getGetFindingMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getGetFindingMethod = WebSecurityScannerGrpc.getGetFindingMethod) == null) {
          WebSecurityScannerGrpc.getGetFindingMethod =
              getGetFindingMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,
                          com.google.cloud.websecurityscanner.v1beta.Finding>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFinding"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.GetFindingRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.Finding
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("GetFinding"))
                      .build();
        }
      }
    }
    return getGetFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
      getListFindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFindings",
      requestType = com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
      getListFindingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,
            com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
        getListFindingsMethod;
    if ((getListFindingsMethod = WebSecurityScannerGrpc.getListFindingsMethod) == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getListFindingsMethod = WebSecurityScannerGrpc.getListFindingsMethod) == null) {
          WebSecurityScannerGrpc.getListFindingsMethod =
              getListFindingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,
                          com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFindings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("ListFindings"))
                      .build();
        }
      }
    }
    return getListFindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
      getListFindingTypeStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFindingTypeStats",
      requestType = com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest.class,
      responseType = com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,
          com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
      getListFindingTypeStatsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
        getListFindingTypeStatsMethod;
    if ((getListFindingTypeStatsMethod = WebSecurityScannerGrpc.getListFindingTypeStatsMethod)
        == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        if ((getListFindingTypeStatsMethod = WebSecurityScannerGrpc.getListFindingTypeStatsMethod)
            == null) {
          WebSecurityScannerGrpc.getListFindingTypeStatsMethod =
              getListFindingTypeStatsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,
                          com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListFindingTypeStats"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.websecurityscanner.v1beta
                                  .ListFindingTypeStatsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new WebSecurityScannerMethodDescriptorSupplier("ListFindingTypeStats"))
                      .build();
        }
      }
    }
    return getListFindingTypeStatsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static WebSecurityScannerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerStub>() {
          @java.lang.Override
          public WebSecurityScannerStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new WebSecurityScannerStub(channel, callOptions);
          }
        };
    return WebSecurityScannerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebSecurityScannerBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerBlockingStub>() {
          @java.lang.Override
          public WebSecurityScannerBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new WebSecurityScannerBlockingStub(channel, callOptions);
          }
        };
    return WebSecurityScannerBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static WebSecurityScannerFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<WebSecurityScannerFutureStub>() {
          @java.lang.Override
          public WebSecurityScannerFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new WebSecurityScannerFutureStub(channel, callOptions);
          }
        };
    return WebSecurityScannerFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class WebSecurityScannerImplBase implements io.grpc.BindableService {

    /** */
    public void createScanConfig(
        com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateScanConfigMethod(), responseObserver);
    }

    /** */
    public void deleteScanConfig(
        com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteScanConfigMethod(), responseObserver);
    }

    /** */
    public void getScanConfig(
        com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetScanConfigMethod(), responseObserver);
    }

    /** */
    public void listScanConfigs(
        com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListScanConfigsMethod(), responseObserver);
    }

    /** */
    public void updateScanConfig(
        com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateScanConfigMethod(), responseObserver);
    }

    /** */
    public void startScanRun(
        com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnimplementedUnaryCall(getStartScanRunMethod(), responseObserver);
    }

    /** */
    public void getScanRun(
        com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetScanRunMethod(), responseObserver);
    }

    /** */
    public void listScanRuns(
        com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListScanRunsMethod(), responseObserver);
    }

    /** */
    public void stopScanRun(
        com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnimplementedUnaryCall(getStopScanRunMethod(), responseObserver);
    }

    /** */
    public void listCrawledUrls(
        com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListCrawledUrlsMethod(), responseObserver);
    }

    /** */
    public void getFinding(
        com.google.cloud.websecurityscanner.v1beta.GetFindingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.Finding>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetFindingMethod(), responseObserver);
    }

    /** */
    public void listFindings(
        com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListFindingsMethod(), responseObserver);
    }

    /** */
    public void listFindingTypeStats(
        com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListFindingTypeStatsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateScanConfigMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanConfig>(
                      this, METHODID_CREATE_SCAN_CONFIG)))
          .addMethod(
              getDeleteScanConfigMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_SCAN_CONFIG)))
          .addMethod(
              getGetScanConfigMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanConfig>(
                      this, METHODID_GET_SCAN_CONFIG)))
          .addMethod(
              getListScanConfigsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest,
                      com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>(
                      this, METHODID_LIST_SCAN_CONFIGS)))
          .addMethod(
              getUpdateScanConfigMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanConfig>(
                      this, METHODID_UPDATE_SCAN_CONFIG)))
          .addMethod(
              getStartScanRunMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanRun>(
                      this, METHODID_START_SCAN_RUN)))
          .addMethod(
              getGetScanRunMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanRun>(
                      this, METHODID_GET_SCAN_RUN)))
          .addMethod(
              getListScanRunsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest,
                      com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>(
                      this, METHODID_LIST_SCAN_RUNS)))
          .addMethod(
              getStopScanRunMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest,
                      com.google.cloud.websecurityscanner.v1beta.ScanRun>(
                      this, METHODID_STOP_SCAN_RUN)))
          .addMethod(
              getListCrawledUrlsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest,
                      com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>(
                      this, METHODID_LIST_CRAWLED_URLS)))
          .addMethod(
              getGetFindingMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.GetFindingRequest,
                      com.google.cloud.websecurityscanner.v1beta.Finding>(
                      this, METHODID_GET_FINDING)))
          .addMethod(
              getListFindingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest,
                      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>(
                      this, METHODID_LIST_FINDINGS)))
          .addMethod(
              getListFindingTypeStatsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest,
                      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>(
                      this, METHODID_LIST_FINDING_TYPE_STATS)))
          .build();
    }
  }

  /** */
  public static final class WebSecurityScannerStub
      extends io.grpc.stub.AbstractAsyncStub<WebSecurityScannerStub> {
    private WebSecurityScannerStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSecurityScannerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSecurityScannerStub(channel, callOptions);
    }

    /** */
    public void createScanConfig(
        com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateScanConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteScanConfig(
        com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteScanConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getScanConfig(
        com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScanConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listScanConfigs(
        com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListScanConfigsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateScanConfig(
        com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateScanConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void startScanRun(
        com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartScanRunMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getScanRun(
        com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScanRunMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listScanRuns(
        com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListScanRunsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void stopScanRun(
        com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopScanRunMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listCrawledUrls(
        com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCrawledUrlsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getFinding(
        com.google.cloud.websecurityscanner.v1beta.GetFindingRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.Finding>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listFindings(
        com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFindingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listFindingTypeStats(
        com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFindingTypeStatsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class WebSecurityScannerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebSecurityScannerBlockingStub> {
    private WebSecurityScannerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSecurityScannerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSecurityScannerBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanConfig createScanConfig(
        com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateScanConfigMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteScanConfig(
        com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteScanConfigMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanConfig getScanConfig(
        com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest request) {
      return blockingUnaryCall(getChannel(), getGetScanConfigMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse listScanConfigs(
        com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest request) {
      return blockingUnaryCall(getChannel(), getListScanConfigsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanConfig updateScanConfig(
        com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateScanConfigMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanRun startScanRun(
        com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest request) {
      return blockingUnaryCall(getChannel(), getStartScanRunMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanRun getScanRun(
        com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest request) {
      return blockingUnaryCall(getChannel(), getGetScanRunMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse listScanRuns(
        com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest request) {
      return blockingUnaryCall(getChannel(), getListScanRunsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ScanRun stopScanRun(
        com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest request) {
      return blockingUnaryCall(getChannel(), getStopScanRunMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse listCrawledUrls(
        com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest request) {
      return blockingUnaryCall(getChannel(), getListCrawledUrlsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.Finding getFinding(
        com.google.cloud.websecurityscanner.v1beta.GetFindingRequest request) {
      return blockingUnaryCall(getChannel(), getGetFindingMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse listFindings(
        com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest request) {
      return blockingUnaryCall(getChannel(), getListFindingsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse
        listFindingTypeStats(
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFindingTypeStatsMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class WebSecurityScannerFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebSecurityScannerFutureStub> {
    private WebSecurityScannerFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSecurityScannerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSecurityScannerFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        createScanConfig(
            com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateScanConfigMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteScanConfig(
            com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteScanConfigMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        getScanConfig(com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScanConfigMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>
        listScanConfigs(com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListScanConfigsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanConfig>
        updateScanConfig(
            com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateScanConfigMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        startScanRun(com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartScanRunMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        getScanRun(com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScanRunMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>
        listScanRuns(com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListScanRunsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ScanRun>
        stopScanRun(com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopScanRunMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>
        listCrawledUrls(com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCrawledUrlsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.Finding>
        getFinding(com.google.cloud.websecurityscanner.v1beta.GetFindingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFindingMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>
        listFindings(com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFindingsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>
        listFindingTypeStats(
            com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFindingTypeStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SCAN_CONFIG = 0;
  private static final int METHODID_DELETE_SCAN_CONFIG = 1;
  private static final int METHODID_GET_SCAN_CONFIG = 2;
  private static final int METHODID_LIST_SCAN_CONFIGS = 3;
  private static final int METHODID_UPDATE_SCAN_CONFIG = 4;
  private static final int METHODID_START_SCAN_RUN = 5;
  private static final int METHODID_GET_SCAN_RUN = 6;
  private static final int METHODID_LIST_SCAN_RUNS = 7;
  private static final int METHODID_STOP_SCAN_RUN = 8;
  private static final int METHODID_LIST_CRAWLED_URLS = 9;
  private static final int METHODID_GET_FINDING = 10;
  private static final int METHODID_LIST_FINDINGS = 11;
  private static final int METHODID_LIST_FINDING_TYPE_STATS = 12;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebSecurityScannerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebSecurityScannerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SCAN_CONFIG:
          serviceImpl.createScanConfig(
              (com.google.cloud.websecurityscanner.v1beta.CreateScanConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>)
                  responseObserver);
          break;
        case METHODID_DELETE_SCAN_CONFIG:
          serviceImpl.deleteScanConfig(
              (com.google.cloud.websecurityscanner.v1beta.DeleteScanConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SCAN_CONFIG:
          serviceImpl.getScanConfig(
              (com.google.cloud.websecurityscanner.v1beta.GetScanConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>)
                  responseObserver);
          break;
        case METHODID_LIST_SCAN_CONFIGS:
          serviceImpl.listScanConfigs(
              (com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.websecurityscanner.v1beta.ListScanConfigsResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_SCAN_CONFIG:
          serviceImpl.updateScanConfig(
              (com.google.cloud.websecurityscanner.v1beta.UpdateScanConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanConfig>)
                  responseObserver);
          break;
        case METHODID_START_SCAN_RUN:
          serviceImpl.startScanRun(
              (com.google.cloud.websecurityscanner.v1beta.StartScanRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>)
                  responseObserver);
          break;
        case METHODID_GET_SCAN_RUN:
          serviceImpl.getScanRun(
              (com.google.cloud.websecurityscanner.v1beta.GetScanRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>)
                  responseObserver);
          break;
        case METHODID_LIST_SCAN_RUNS:
          serviceImpl.listScanRuns(
              (com.google.cloud.websecurityscanner.v1beta.ListScanRunsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.websecurityscanner.v1beta.ListScanRunsResponse>)
                  responseObserver);
          break;
        case METHODID_STOP_SCAN_RUN:
          serviceImpl.stopScanRun(
              (com.google.cloud.websecurityscanner.v1beta.StopScanRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.ScanRun>)
                  responseObserver);
          break;
        case METHODID_LIST_CRAWLED_URLS:
          serviceImpl.listCrawledUrls(
              (com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_FINDING:
          serviceImpl.getFinding(
              (com.google.cloud.websecurityscanner.v1beta.GetFindingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.websecurityscanner.v1beta.Finding>)
                  responseObserver);
          break;
        case METHODID_LIST_FINDINGS:
          serviceImpl.listFindings(
              (com.google.cloud.websecurityscanner.v1beta.ListFindingsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.websecurityscanner.v1beta.ListFindingsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_FINDING_TYPE_STATS:
          serviceImpl.listFindingTypeStats(
              (com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.websecurityscanner.v1beta.ListFindingTypeStatsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class WebSecurityScannerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebSecurityScannerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebSecurityScanner");
    }
  }

  private static final class WebSecurityScannerFileDescriptorSupplier
      extends WebSecurityScannerBaseDescriptorSupplier {
    WebSecurityScannerFileDescriptorSupplier() {}
  }

  private static final class WebSecurityScannerMethodDescriptorSupplier
      extends WebSecurityScannerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebSecurityScannerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebSecurityScannerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new WebSecurityScannerFileDescriptorSupplier())
                      .addMethod(getCreateScanConfigMethod())
                      .addMethod(getDeleteScanConfigMethod())
                      .addMethod(getGetScanConfigMethod())
                      .addMethod(getListScanConfigsMethod())
                      .addMethod(getUpdateScanConfigMethod())
                      .addMethod(getStartScanRunMethod())
                      .addMethod(getGetScanRunMethod())
                      .addMethod(getListScanRunsMethod())
                      .addMethod(getStopScanRunMethod())
                      .addMethod(getListCrawledUrlsMethod())
                      .addMethod(getGetFindingMethod())
                      .addMethod(getListFindingsMethod())
                      .addMethod(getListFindingTypeStatsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
