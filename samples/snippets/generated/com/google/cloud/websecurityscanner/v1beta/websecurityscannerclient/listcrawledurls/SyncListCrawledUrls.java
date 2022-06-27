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

// [START websecurityscanner_v1beta_generated_websecurityscannerclient_listcrawledurls_sync]
import com.google.cloud.websecurityscanner.v1beta.CrawledUrl;
import com.google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest;
import com.google.cloud.websecurityscanner.v1beta.ScanRunName;
import com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient;

public class SyncListCrawledUrls {

  public static void main(String[] args) throws Exception {
    syncListCrawledUrls();
  }

  public static void syncListCrawledUrls() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListCrawledUrlsRequest request =
          ListCrawledUrlsRequest.newBuilder()
              .setParent(ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]").toString())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      for (CrawledUrl element : webSecurityScannerClient.listCrawledUrls(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END websecurityscanner_v1beta_generated_websecurityscannerclient_listcrawledurls_sync]
