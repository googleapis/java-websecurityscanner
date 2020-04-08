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
package com.google.cloud.websecurityscanner.v1alpha;

import static com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient.ListCrawledUrlsPagedResponse;
import static com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient.ListFindingsPagedResponse;
import static com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient.ListScanConfigsPagedResponse;
import static com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient.ListScanRunsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class WebSecurityScannerClientTest {
  private static MockWebSecurityScanner mockWebSecurityScanner;
  private static MockServiceHelper serviceHelper;
  private WebSecurityScannerClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockWebSecurityScanner = new MockWebSecurityScanner();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockWebSecurityScanner));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    WebSecurityScannerSettings settings =
        WebSecurityScannerSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = WebSecurityScannerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void deleteScanConfigTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

    client.deleteScanConfig(name);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteScanConfigRequest actualRequest = (DeleteScanConfigRequest) actualRequests.get(0);

    Assert.assertEquals(name, ScanConfigName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteScanConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

      client.deleteScanConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void createScanConfigTest() {
    ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");
    String displayName = "displayName1615086568";
    int maxQps = 844445913;
    ScanConfig expectedResponse =
        ScanConfig.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setMaxQps(maxQps)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    ScanConfig scanConfig = ScanConfig.newBuilder().build();

    ScanConfig actualResponse = client.createScanConfig(parent, scanConfig);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateScanConfigRequest actualRequest = (CreateScanConfigRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertEquals(scanConfig, actualRequest.getScanConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createScanConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      ScanConfig scanConfig = ScanConfig.newBuilder().build();

      client.createScanConfig(parent, scanConfig);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getScanConfigTest() {
    ScanConfigName name2 = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");
    String displayName = "displayName1615086568";
    int maxQps = 844445913;
    ScanConfig expectedResponse =
        ScanConfig.newBuilder()
            .setName(name2.toString())
            .setDisplayName(displayName)
            .setMaxQps(maxQps)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

    ScanConfig actualResponse = client.getScanConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetScanConfigRequest actualRequest = (GetScanConfigRequest) actualRequests.get(0);

    Assert.assertEquals(name, ScanConfigName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getScanConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

      client.getScanConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listScanConfigsTest() {
    String nextPageToken = "";
    ScanConfig scanConfigsElement = ScanConfig.newBuilder().build();
    List<ScanConfig> scanConfigs = Arrays.asList(scanConfigsElement);
    ListScanConfigsResponse expectedResponse =
        ListScanConfigsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllScanConfigs(scanConfigs)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");

    ListScanConfigsPagedResponse pagedListResponse = client.listScanConfigs(parent);

    List<ScanConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getScanConfigsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListScanConfigsRequest actualRequest = (ListScanConfigsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listScanConfigsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");

      client.listScanConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateScanConfigTest() {
    ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");
    String displayName = "displayName1615086568";
    int maxQps = 844445913;
    ScanConfig expectedResponse =
        ScanConfig.newBuilder()
            .setName(name.toString())
            .setDisplayName(displayName)
            .setMaxQps(maxQps)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanConfig scanConfig = ScanConfig.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    ScanConfig actualResponse = client.updateScanConfig(scanConfig, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateScanConfigRequest actualRequest = (UpdateScanConfigRequest) actualRequests.get(0);

    Assert.assertEquals(scanConfig, actualRequest.getScanConfig());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateScanConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanConfig scanConfig = ScanConfig.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updateScanConfig(scanConfig, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void startScanRunTest() {
    ScanRunName name2 = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");
    long urlsCrawledCount = 1749797253L;
    long urlsTestedCount = 1498664068L;
    boolean hasVulnerabilities = false;
    int progressPercent = 2137894861;
    ScanRun expectedResponse =
        ScanRun.newBuilder()
            .setName(name2.toString())
            .setUrlsCrawledCount(urlsCrawledCount)
            .setUrlsTestedCount(urlsTestedCount)
            .setHasVulnerabilities(hasVulnerabilities)
            .setProgressPercent(progressPercent)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

    ScanRun actualResponse = client.startScanRun(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartScanRunRequest actualRequest = (StartScanRunRequest) actualRequests.get(0);

    Assert.assertEquals(name, ScanConfigName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void startScanRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

      client.startScanRun(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getScanRunTest() {
    ScanRunName name2 = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");
    long urlsCrawledCount = 1749797253L;
    long urlsTestedCount = 1498664068L;
    boolean hasVulnerabilities = false;
    int progressPercent = 2137894861;
    ScanRun expectedResponse =
        ScanRun.newBuilder()
            .setName(name2.toString())
            .setUrlsCrawledCount(urlsCrawledCount)
            .setUrlsTestedCount(urlsTestedCount)
            .setHasVulnerabilities(hasVulnerabilities)
            .setProgressPercent(progressPercent)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanRunName name = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

    ScanRun actualResponse = client.getScanRun(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetScanRunRequest actualRequest = (GetScanRunRequest) actualRequests.get(0);

    Assert.assertEquals(name, ScanRunName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getScanRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanRunName name = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

      client.getScanRun(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listScanRunsTest() {
    String nextPageToken = "";
    ScanRun scanRunsElement = ScanRun.newBuilder().build();
    List<ScanRun> scanRuns = Arrays.asList(scanRunsElement);
    ListScanRunsResponse expectedResponse =
        ListScanRunsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllScanRuns(scanRuns)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanConfigName parent = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

    ListScanRunsPagedResponse pagedListResponse = client.listScanRuns(parent);

    List<ScanRun> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getScanRunsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListScanRunsRequest actualRequest = (ListScanRunsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ScanConfigName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listScanRunsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanConfigName parent = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");

      client.listScanRuns(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void stopScanRunTest() {
    ScanRunName name2 = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");
    long urlsCrawledCount = 1749797253L;
    long urlsTestedCount = 1498664068L;
    boolean hasVulnerabilities = false;
    int progressPercent = 2137894861;
    ScanRun expectedResponse =
        ScanRun.newBuilder()
            .setName(name2.toString())
            .setUrlsCrawledCount(urlsCrawledCount)
            .setUrlsTestedCount(urlsTestedCount)
            .setHasVulnerabilities(hasVulnerabilities)
            .setProgressPercent(progressPercent)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanRunName name = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

    ScanRun actualResponse = client.stopScanRun(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StopScanRunRequest actualRequest = (StopScanRunRequest) actualRequests.get(0);

    Assert.assertEquals(name, ScanRunName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void stopScanRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanRunName name = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

      client.stopScanRun(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listCrawledUrlsTest() {
    String nextPageToken = "";
    CrawledUrl crawledUrlsElement = CrawledUrl.newBuilder().build();
    List<CrawledUrl> crawledUrls = Arrays.asList(crawledUrlsElement);
    ListCrawledUrlsResponse expectedResponse =
        ListCrawledUrlsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllCrawledUrls(crawledUrls)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

    ListCrawledUrlsPagedResponse pagedListResponse = client.listCrawledUrls(parent);

    List<CrawledUrl> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getCrawledUrlsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListCrawledUrlsRequest actualRequest = (ListCrawledUrlsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ScanRunName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listCrawledUrlsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

      client.listCrawledUrls(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getFindingTest() {
    FindingName name2 = FindingName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]", "[FINDING]");
    String httpMethod = "httpMethod820747384";
    String fuzzedUrl = "fuzzedUrl-2120677666";
    String body = "body3029410";
    String description = "description-1724546052";
    String reproductionUrl = "reproductionUrl-244934180";
    String frameUrl = "frameUrl545464221";
    String finalUrl = "finalUrl355601190";
    String trackingId = "trackingId1878901667";
    Finding expectedResponse =
        Finding.newBuilder()
            .setName(name2.toString())
            .setHttpMethod(httpMethod)
            .setFuzzedUrl(fuzzedUrl)
            .setBody(body)
            .setDescription(description)
            .setReproductionUrl(reproductionUrl)
            .setFrameUrl(frameUrl)
            .setFinalUrl(finalUrl)
            .setTrackingId(trackingId)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    FindingName name = FindingName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]", "[FINDING]");

    Finding actualResponse = client.getFinding(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFindingRequest actualRequest = (GetFindingRequest) actualRequests.get(0);

    Assert.assertEquals(name, FindingName.parse(actualRequest.getName()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getFindingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      FindingName name = FindingName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]", "[FINDING]");

      client.getFinding(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listFindingsTest() {
    String nextPageToken = "";
    Finding findingsElement = Finding.newBuilder().build();
    List<Finding> findings = Arrays.asList(findingsElement);
    ListFindingsResponse expectedResponse =
        ListFindingsResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllFindings(findings)
            .build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");
    String filter = "filter-1274492040";

    ListFindingsPagedResponse pagedListResponse = client.listFindings(parent, filter);

    List<Finding> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getFindingsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFindingsRequest actualRequest = (ListFindingsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ScanRunName.parse(actualRequest.getParent()));
    Assert.assertEquals(filter, actualRequest.getFilter());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listFindingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");
      String filter = "filter-1274492040";

      client.listFindings(parent, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listFindingTypeStatsTest() {
    ListFindingTypeStatsResponse expectedResponse =
        ListFindingTypeStatsResponse.newBuilder().build();
    mockWebSecurityScanner.addResponse(expectedResponse);

    ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

    ListFindingTypeStatsResponse actualResponse = client.listFindingTypeStats(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockWebSecurityScanner.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListFindingTypeStatsRequest actualRequest = (ListFindingTypeStatsRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ScanRunName.parse(actualRequest.getParent()));
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listFindingTypeStatsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockWebSecurityScanner.addException(exception);

    try {
      ScanRunName parent = ScanRunName.of("[PROJECT]", "[SCAN_CONFIG]", "[SCAN_RUN]");

      client.listFindingTypeStats(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
