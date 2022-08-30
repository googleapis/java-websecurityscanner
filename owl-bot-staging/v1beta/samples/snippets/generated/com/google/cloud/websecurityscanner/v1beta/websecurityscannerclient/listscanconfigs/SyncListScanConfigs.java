/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.websecurityscanner.v1beta.samples;

// [START websecurityscanner_v1beta_generated_websecurityscannerclient_listscanconfigs_sync]
import com.google.cloud.websecurityscanner.v1beta.ListScanConfigsRequest;
import com.google.cloud.websecurityscanner.v1beta.ProjectName;
import com.google.cloud.websecurityscanner.v1beta.ScanConfig;
import com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient;

public class SyncListScanConfigs {

  public static void main(String[] args) throws Exception {
    syncListScanConfigs();
  }

  public static void syncListScanConfigs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListScanConfigsRequest request =
          ListScanConfigsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      for (ScanConfig element : webSecurityScannerClient.listScanConfigs(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END websecurityscanner_v1beta_generated_websecurityscannerclient_listscanconfigs_sync]
