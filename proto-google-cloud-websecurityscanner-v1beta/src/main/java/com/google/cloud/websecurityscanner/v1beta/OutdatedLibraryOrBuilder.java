/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface OutdatedLibraryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.OutdatedLibrary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   *
   * @return The libraryName.
   */
  java.lang.String getLibraryName();
  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   *
   * @return The bytes for libraryName.
   */
  com.google.protobuf.ByteString getLibraryNameBytes();

  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @return A list containing the learnMoreUrls.
   */
  java.util.List<java.lang.String> getLearnMoreUrlsList();
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @return The count of learnMoreUrls.
   */
  int getLearnMoreUrlsCount();
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The learnMoreUrls at the given index.
   */
  java.lang.String getLearnMoreUrls(int index);
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the learnMoreUrls at the given index.
   */
  com.google.protobuf.ByteString getLearnMoreUrlsBytes(int index);
}
