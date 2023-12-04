/*
 * SEOmonitor API Documentation
 * `Introduction`  The SEOmonitor API allows you to programmatically access keyword ranking, traffic, and other SEO data from the SEOmonitor platform. You can use the API to build custom reports, automate workflows, and integrate SEOmonitor data into your own applications. The API enables free and unrestricted access to all your data in the platform, for all Tracked Campaigns. Additionally, it provides access to SEOmonitor's curated UK and US keyword database.   `Main Capabilities`  These are the main data sets you can retrieve with the API 3.0 endpoints:  `Campaign-level data`: Campaign details and campaign-wide keyword data, landing page data, groups data, traffic data, content opportunities data, forecast data, or campaign website research data.  `Keyword-level data`: Data for any and all keywords in the campaign, including ranking data, search data, SERP data, competitor data, SEO Opportunity, keyword-level traffic data, content optimization opportunities' data by keyword and keyword-level forecast projections data.  `Keyword group-level data`: Data for any keyword group in the campaign, including aggregated search and SERP data, website Visibility on specific groups, group SEO Opportunity data.  `Landing page-level data`: Data for specific landing pages that are ranking with the keywords in the campaign, including aggregated search and SERP data, SEO Opportunity, and landing page Visibility.  `Organic traffic data`: Data for the website's organic sessions, conversions, and revenue, including traffic data by segments (brand, non-brand, all traffic, and custom user-created traffic segments), by specific keywords and by specific landing pages.  `Keyword & website research data`: Data for any keyword in SEOmonitor's Research database – any domain-level aggregated search, SERP, and ranking data, and keyword-level and keyword list-level metrics, for the tracked website and for any competitor in top 100.  `Forecast data`: Overview data and details for specific Forecast Scenarios and Objectives, and keyword-level forecast data.  `Website content data`: Data related to content optimization opportunities of the tracked website, including landing page and keyword data for each of the content opportunities categories in SEOmonitor's Content Audit platform (Positive and negative correlations with Visibility, Cannibalization issues, Pages serving too many keywords, Keywords with missing pages, Suboptimal keyword inclusion in the title or H1 or page content, Pages with missing title or H1).   `Getting Started`  Log into your SEOmonitor account and retrieve your unique API Token (Account Settings > Edit Profile).  Check out the `quick start guide` to make your first API call.  Read through the `authentication guide` to learn how to properly authenticate your API requests.   `Libraries and SDKs`  SEOmonitor API uses HTTP protocol, which allows the application of our API to almost all programming languages. All the responses are returned in JSON format by default.  For convenience, we offer client libraries for popular programming languages:  JavaScript PHP Python Java   `Support`  Need help using the API, or have general inquiries? Please contact our support team.  For more information about the SEOmonitor platform, you can visit www.seomonitor.com.   `Changelog`      This is the first version of API 3.0. The Changelog page will be updated as we continue to develop new features and improvements.     `Quick Start Guide`  This guide will walk you through making your first API call.  `Get your API key`  First, you'll need to get an API key:      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Go to Account Settings > Edit Profile     3. Copy the API Token to use in your API requests  Note: Clicking `Regenerate API Token` will overwrite the current key and you will lose access if you or other users are currently using it.   `Make a request`  Next, we'll use cURL to make a request to get Tracked Campaigns details:      curl --request GET \\     --url https://apix.seomonitor.com/dashboard/v3.0/campaigns/tracked \\     --header 'Accept: application/json' \\     --header 'Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJzZW9tb25pdG9yLmNvbSIsImlhdCI6MTY1Mjc4NTcwNCwidXNlcl9pZCI6IjY2NTI5In0.2_l9e7ohs9QHbwmr48mIoEF-QxZHNPFiAzJbMk00jcA'  This will retrieve the Tracked Campaigns data for an SEOmonitor account having the following API Token:      'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJzZW9tb25pdG9yLmNvbSIsImlhdCI6MTY1Mjc4NTcwNCwidXNlcl9pZCI6IjY2NTI5In0.2_l9e7ohs9QHbwmr48mIoEF-QxZHNPFiAzJbMk00jcA'   Let's break down the parts of the request:      - `--request GET` - Make a GET request     - `--url` - The API endpoint URL     - `--header` - Adds the Authorization header with your API key   Handle the response  The API will return a JSON response like this:      {       \"campaign_info\": {         \"id\": \"74516\",         \"name\": \"Asos.com\",          \"company\": \"Asos\",         \"company_id\": \"51256\",         \"domain\": \"www.asos.com\",         \"keyword_count\": 588,          \"date_created\": \"2023-04-25\",         \"location\": \"United Kingdom\",         \"currency\": \"EUR\",         \"mrr\": 3000       },       \"visibility\": {         \"desktop\": {           \"latest\": 0.28,           \"trend_7days\": 0.2,           \"trend_30days\": 0.2         },         \"mobile\": {           \"latest\": 0.27,            \"trend_7days\": 0.2,           \"trend_30days\": 0.2         }       },       \"multiple_locations\": [         {           \"campaign_id\": 12746,           \"location\": \"London, United Kingdom\",           \"visibility\": {             \"desktop\": {               \"latest\": 0.32,               \"trend_7days\": 0.02               \"trend_30days: 0.1               },             \"mobile\": {               \"latest\": 0.33,               \"trend\": 0.03               \"trend_30days\": 0.1                 }             }           }         }       ],       \"health_status\": \"healthy\",       \"objective_status\": {         \"actual_sessions\": 78400,         \"estimated_sessions\": 78400,           \"performance\": 1,         \"status\": \"on_track\",         \"start_month\": \"Jun, 2023\",          \"end_month\": \"Jul, 2024\"       },       \"reporting_status\": \"submitted\",       \"account_manager\": \"Jo Hart\"     }  And that's it! You just made your first API call. Check out the rest of the API reference documentation to see what else you can build.  `Best practices`      - Keep your API key private – do not share your key publicly.     - Do not include your key directly in code that you distribute – use environment variables instead.     - Regenerate your key periodically for improved security.     - Limit API key access to only required endpoints if possible.  `Revoking API keys`  If your API key is compromised, you can revoke it by regenerating the API Token in your SEOmonitor Account Settings. This will immediately invalidate the current key so further requests can't be made.  For any other issues with authentication, contact our support team.   `Retrieve the IDs of the company, campaigns, keywords and keyword groups`  The unique IDs of your company, campaigns, keywords, or keyword groups can be retrieved either from the specific URLs of the platform, or from specific API endpoint responses. Further below you'll find details on these alternatives.   `Company ID`  The company ID can only be retrieved from the platform. Follow these steps:      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Go to Account Settings > Billing     3. In the Billing section, the platform URL contains the company ID.     E.g.: \"app.seomonitor.com/v2/account/company/51244/billing\" – in this example, the company ID is \"51244\"   `Campaign ID`  To retrieve the campaign ID from the platform, follow these steps:       1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign by clicking on its name in the Agency Dashboard.     3. By default, the campaign opens in the Rank Tracker view. The platform URL contains the company ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/0/desktop/keywords?timeframe=2023-09-04%3A2023-10-04\" – in this example, the campaign ID is \"72416\".  To retrieve the campaign ID through the API, make a call through the `Get Tracked Campaigns Details endpoint`. The response will contain the details of the requested Tracked Campaigns, including their IDs, which you can further use in other endpoint requests.   `Keyword ID`  To retrieve the keyword ID from the platform, follow these steps:       1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and click on the required keyword.     3. The platform URL for the keyword view (Keyword Sidebar) contains the keyword ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/0/desktop/keywords?timeframe=2023-09-04%3A2023-10-04&ksid=7063139\" – in this example, the keyword ID is \"7063139\"   To retrieve the keyword ID through the API, make a call through the `Get Keyword Data endpoint`. The response will contain the details of the requested keywords, including their IDs, which you can further use in other endpoint requests.   `Keyword Group ID`      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and click on the required keyword group (Groups side-menu).     3. The platform URL for the keyword group view contains the keyword ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/69976/desktop/keywords?timeframe=2023-09-04%3A2023-10-04\" – in this example, the keyword group ID is \"69976\"  To retrieve the keyword group ID through the API, make a call through the `Get Groups List endpoint`. The response will contain the details of the requested keyword groups, including their IDs, which you can further use in other endpoint requests.   `Forecast ID for Scenarios or Objectives`      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and go to Forecast from the main menu (top).     3. Select a Scenario or the Objective (if set). The platform URL for the specific scenario contains the forecast ID.     E.g.: \"https://app.seomonitor.com/v2/forecast/118794/3788\" – in this example, the forecast ID is \"3788\"   To retrieve the forecast ID through the API, make a call through the`Get Forecast Scenarios endpoint`. The response will contain the details of the requested Scenario or Objective, including their IDs, which you can further use in other endpoint requests.   `SERP Feature Abbreviations`  The returned data for some endpoints will contain SERP feature names in abbreviated form.  The returned values for SERP features are abbreviated as follows:      - \"adt\": Ads Pack Top     - \"def\": Definitions      - \"dir\": Directions      - \"fsn\": Featured Snippet      - \"flt\": Flights      - \"htl\": Hotels      - \"img\": Images Pack      - \"job\": Jobs      - \"kng\": Knowledge Graph      - \"geo\": Local Pack      - \"shp\": Product listing      - \"rcp\": Recipes      - \"qns\": Questions      - \"new\": Top Stories      - \"vid\": Video Carousel      - \"app\": Apps    `Rate Limits`  There are request limits in place to prevent abuse and ensure fair usage.   Exceeding the request limits will lead to HTTP 429 responses. If you need higher limits, contact our support team.   `Limits & Quotas`      -------------------------------------------------------------------------     |Limit                                    |  Number of requests              -------------------------------------------------------------------------     |Maximum requests per second              |  10                              -------------------------------------------------------------------------     |Maximum rows per request (Request Quota) |  1000                            -------------------------------------------------------------------------     |Daily Quota                              |  10 000                          -------------------------------------------------------------------------   `Exceeding Limits`  If you exceed the rate limits, you will receive a 429 Too Many Requests response.  Daily Quota Exceeded      {       \"error\": {         \"message\": \"Daily quota exceeded\",         \"details\": [           \"You have exceeded the allowed daily requests\"          ]       }     }  Details:  This error message indicates that the request exceeds the rate limits for daily requests. Retry the request after some delay.  Rate Limit Exceeded      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }  Details:  This error message indicates that the request exceeds the rate limits for requests per second. Retry the request after some delay.   `Increasing Limits`  The default limits allow most normal API usage patterns. However, if you need higher limits, please contact our support team.    Provide details on:      - Your specific use case      - The endpoints you are using     - The increased limits you are looking for  We will review your request and adjust limits where appropriate   `Need Higher Limits?`  For most use cases, the default limits are sufficient. But if you require higher limits, please contact our support team. We will review your use case and adjust limits where appropriate.   `Errors`  SEOmonitor API uses standard HTTP response codes to indicate the success or failure of API requests.   HTTP Status Codes      ----------------------------------------------------------------------------------     | Code  | Description                                                                 ----------------------------------------------------------------------------------     | 200   | Success                                                                     ----------------------------------------------------------------------------------     | 400   | Bad request - the request was malformed or missing required parameters      ----------------------------------------------------------------------------------      | 401   | Unauthorized - invalid or missing API key                                   ----------------------------------------------------------------------------------     | 403   | Forbidden - API key does not have access to the requested resource          ----------------------------------------------------------------------------------     | 404   | Not found - the requested resource does not exist                           ----------------------------------------------------------------------------------     | 429   | Too many requests - rate or quota limit exceeded                            ----------------------------------------------------------------------------------     | 500   | Internal server error - an unexpected error on the API server               ----------------------------------------------------------------------------------     | 50x   | Errors specific to various endpoints                                        ----------------------------------------------------------------------------------   `Error Response Format`  Error responses will be returned in JSON format:      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }   The error object contains:  - `message` - A general error message   - `details` - More specific details about the error   `Common Errors`  401 Unauthorized      {       \"error\": {         \"message\": \"Invalid authentication\",         \"details\": [           \"The API key provided is invalid\"          ]       }     }   Details:   This error message indicates there is a problem with the API key:  - The API key is missing from the request  - The key is invalid or incorrect  - The key is expired or revoked   Check that you are sending the correct API key in the Authorization header.  403 Forbidden      {       \"error\": {         \"message\": \"Forbidden access\",         \"details\": [           \"Your API key does not have access to the requested data\"          ]       }     }  Details:  This error message indicates that the API key being used does not have access to perform the requested operation. Ensure the key has the required scopes enabled.   404 Not Found      {       \"error\": {         \"message\": \"Data not found\",         \"details\": [           \"The requested data does not exist.\"          ]       }     }   Details:  This error message indicates that the object specified by the request does not exist. For example, requesting a keyword that is not in your SEOmonitor account.   429 Too Many Requests   Daily Quota Exceeded      {       \"error\": {         \"message\": \"Daily quota exceeded\",         \"details\": [           \"You have exceeded the allowed daily requests\"          ]       }     }   Details:  This error message indicates that the request exceeds the rate limits for daily requests. Retry the request after some delay.   Rate Limit Exceeded      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }   Details:  This error message indicates that the request exceeds the rate limits for requests per second. Retry the request after some delay.   500 Internal Server Error       {       \"error\": {         \"message\": \"Internal server error\",         \"details\": [           \"The server encountered an error while processing your requests\"          ]       }     }   Details:  This error message indicates that an unexpected error occurred on the API server. Try the request again later. If the issue persists, contact support.   50X Endpoint-specific errors  You may encounter errors on specific endpoint requests – these are listed and explained under each endpoint page.   Support  If you have any questions about API errors, please contact our support team.   `Changelog`  Version 3.0 (current)   Release Date: ?  This is the first version of the API 3.0.  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: customer.success@seomonitor.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DomainRankingsData;
import io.swagger.client.model.KeywordResearchRankingData;
import io.swagger.client.model.ResearchDomainOverview;
import io.swagger.client.model.ResearchKeywords;
import io.swagger.client.model.TopicKeywordDetail;
import io.swagger.client.model.TopicsOverview;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeywordResearchApi {
    private ApiClient apiClient;

    public KeywordResearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeywordResearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for researchV30DomainOverviewGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.  (required)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.  If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30DomainOverviewGetCall(Integer campaignId, String url, String gapAnalysis, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/domain-overview";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("url", url));
        if (gapAnalysis != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gap_analysis", gapAnalysis));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30DomainOverviewGetValidateBeforeCall(Integer campaignId, String url, String gapAnalysis, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30DomainOverviewGet(Async)");
        }
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling researchV30DomainOverviewGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30DomainOverviewGetCall(campaignId, url, gapAnalysis, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get URL/Domain Overview
     * This endpoint returns the overall aggregated search, SERP, and Visibility data for all the ranking keywords of a specified domain or URL.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.  (required)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.  If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @return ResearchDomainOverview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResearchDomainOverview researchV30DomainOverviewGet(Integer campaignId, String url, String gapAnalysis) throws ApiException {
        ApiResponse<ResearchDomainOverview> resp = researchV30DomainOverviewGetWithHttpInfo(campaignId, url, gapAnalysis);
        return resp.getData();
    }

    /**
     * Get URL/Domain Overview
     * This endpoint returns the overall aggregated search, SERP, and Visibility data for all the ranking keywords of a specified domain or URL.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.  (required)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.  If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @return ApiResponse&lt;ResearchDomainOverview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResearchDomainOverview> researchV30DomainOverviewGetWithHttpInfo(Integer campaignId, String url, String gapAnalysis) throws ApiException {
        com.squareup.okhttp.Call call = researchV30DomainOverviewGetValidateBeforeCall(campaignId, url, gapAnalysis, null, null);
        Type localVarReturnType = new TypeToken<ResearchDomainOverview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get URL/Domain Overview (asynchronously)
     * This endpoint returns the overall aggregated search, SERP, and Visibility data for all the ranking keywords of a specified domain or URL.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.  (required)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.  If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30DomainOverviewGetAsync(Integer campaignId, String url, String gapAnalysis, final ApiCallback<ResearchDomainOverview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30DomainOverviewGetValidateBeforeCall(campaignId, url, gapAnalysis, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResearchDomainOverview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for researchV30DomainRankingKeywordsGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;: Sorts the data based on the keyword rank for the requested domain or URL.  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  &#x60;my_rank&#x60;: Sorts the data based on the keyword rank for the tracked website.  &#x60;my_rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the tracked website.  &#x60;percentage_clicks&#x60;: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.   If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30DomainRankingKeywordsGetCall(Integer campaignId, String url, Integer limit, Integer offset, String orderBy, String orderDirection, String gapAnalysis, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/domain-ranking-keywords";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("url", url));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        if (gapAnalysis != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gap_analysis", gapAnalysis));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30DomainRankingKeywordsGetValidateBeforeCall(Integer campaignId, String url, Integer limit, Integer offset, String orderBy, String orderDirection, String gapAnalysis, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30DomainRankingKeywordsGet(Async)");
        }
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling researchV30DomainRankingKeywordsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30DomainRankingKeywordsGetCall(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Ranking Keywords
     * This endpoint returns the keywords on which the specified domain or URL ranks in top 100. For each keyword, it will return SERP, search and two sets of ranking data for your campaign domain, and for the requested one.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;: Sorts the data based on the keyword rank for the requested domain or URL.  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  &#x60;my_rank&#x60;: Sorts the data based on the keyword rank for the tracked website.  &#x60;my_rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the tracked website.  &#x60;percentage_clicks&#x60;: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.   If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @return DomainRankingsData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DomainRankingsData researchV30DomainRankingKeywordsGet(Integer campaignId, String url, Integer limit, Integer offset, String orderBy, String orderDirection, String gapAnalysis, String search) throws ApiException {
        ApiResponse<DomainRankingsData> resp = researchV30DomainRankingKeywordsGetWithHttpInfo(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search);
        return resp.getData();
    }

    /**
     * Get Ranking Keywords
     * This endpoint returns the keywords on which the specified domain or URL ranks in top 100. For each keyword, it will return SERP, search and two sets of ranking data for your campaign domain, and for the requested one.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;: Sorts the data based on the keyword rank for the requested domain or URL.  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  &#x60;my_rank&#x60;: Sorts the data based on the keyword rank for the tracked website.  &#x60;my_rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the tracked website.  &#x60;percentage_clicks&#x60;: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.   If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @return ApiResponse&lt;DomainRankingsData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DomainRankingsData> researchV30DomainRankingKeywordsGetWithHttpInfo(Integer campaignId, String url, Integer limit, Integer offset, String orderBy, String orderDirection, String gapAnalysis, String search) throws ApiException {
        com.squareup.okhttp.Call call = researchV30DomainRankingKeywordsGetValidateBeforeCall(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search, null, null);
        Type localVarReturnType = new TypeToken<DomainRankingsData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Ranking Keywords (asynchronously)
     * This endpoint returns the keywords on which the specified domain or URL ranks in top 100. For each keyword, it will return SERP, search and two sets of ranking data for your campaign domain, and for the requested one.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param url This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;: Sorts the data based on the keyword rank for the requested domain or URL.  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  &#x60;my_rank&#x60;: Sorts the data based on the keyword rank for the tracked website.  &#x60;my_rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the tracked website.  &#x60;percentage_clicks&#x60;: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param gapAnalysis The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.   If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30DomainRankingKeywordsGetAsync(Integer campaignId, String url, Integer limit, Integer offset, String orderBy, String orderDirection, String gapAnalysis, String search, final ApiCallback<DomainRankingsData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30DomainRankingKeywordsGetValidateBeforeCall(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomainRankingsData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for researchV30KeywordsGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords Comma-separated list of keyword phrases that you want to return data for.  (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60; (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30KeywordsGetCall(Integer campaignId, String keywords, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/keywords";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (keywords != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keywords", keywords));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30KeywordsGetValidateBeforeCall(Integer campaignId, String keywords, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30KeywordsGet(Async)");
        }
        // verify the required parameter 'keywords' is set
        if (keywords == null) {
            throw new ApiException("Missing the required parameter 'keywords' when calling researchV30KeywordsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30KeywordsGetCall(campaignId, keywords, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Keyword Data
     * This endpoint returns the SERP, search and your ranking data for the keywords specified in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords Comma-separated list of keyword phrases that you want to return data for.  (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60; (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return List&lt;ResearchKeywords&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ResearchKeywords> researchV30KeywordsGet(Integer campaignId, String keywords, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        ApiResponse<List<ResearchKeywords>> resp = researchV30KeywordsGetWithHttpInfo(campaignId, keywords, limit, offset, orderBy, orderDirection);
        return resp.getData();
    }

    /**
     * Get Keyword Data
     * This endpoint returns the SERP, search and your ranking data for the keywords specified in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords Comma-separated list of keyword phrases that you want to return data for.  (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60; (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return ApiResponse&lt;List&lt;ResearchKeywords&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ResearchKeywords>> researchV30KeywordsGetWithHttpInfo(Integer campaignId, String keywords, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        com.squareup.okhttp.Call call = researchV30KeywordsGetValidateBeforeCall(campaignId, keywords, limit, offset, orderBy, orderDirection, null, null);
        Type localVarReturnType = new TypeToken<List<ResearchKeywords>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Keyword Data (asynchronously)
     * This endpoint returns the SERP, search and your ranking data for the keywords specified in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords Comma-separated list of keyword phrases that you want to return data for.  (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60; (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30KeywordsGetAsync(Integer campaignId, String keywords, Integer limit, Integer offset, String orderBy, String orderDirection, final ApiCallback<List<ResearchKeywords>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30KeywordsGetValidateBeforeCall(campaignId, keywords, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ResearchKeywords>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for researchV30RankingDataGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords A comma-separated list of keyword phrases that you want to return data for. (required)
     * @param domains A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  If you do not specify an &#x60;order_by&#x60;parameter, the API will sort the data by &#x60;rank&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30RankingDataGetCall(Integer campaignId, List<String> keywords, String domains, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/ranking-data";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (keywords != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "keywords", keywords));
        if (domains != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("domains", domains));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30RankingDataGetValidateBeforeCall(Integer campaignId, List<String> keywords, String domains, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30RankingDataGet(Async)");
        }
        // verify the required parameter 'keywords' is set
        if (keywords == null) {
            throw new ApiException("Missing the required parameter 'keywords' when calling researchV30RankingDataGet(Async)");
        }
        // verify the required parameter 'domains' is set
        if (domains == null) {
            throw new ApiException("Missing the required parameter 'domains' when calling researchV30RankingDataGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30RankingDataGetCall(campaignId, keywords, domains, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Ranking Data
     * This endpoint returns the SERP, search, and ranking data for the keywords specified in the request, for both your campaign website and the specified domains or URLs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords A comma-separated list of keyword phrases that you want to return data for. (required)
     * @param domains A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  If you do not specify an &#x60;order_by&#x60;parameter, the API will sort the data by &#x60;rank&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return List&lt;KeywordResearchRankingData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<KeywordResearchRankingData> researchV30RankingDataGet(Integer campaignId, List<String> keywords, String domains, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        ApiResponse<List<KeywordResearchRankingData>> resp = researchV30RankingDataGetWithHttpInfo(campaignId, keywords, domains, limit, offset, orderBy, orderDirection);
        return resp.getData();
    }

    /**
     * Get Ranking Data
     * This endpoint returns the SERP, search, and ranking data for the keywords specified in the request, for both your campaign website and the specified domains or URLs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords A comma-separated list of keyword phrases that you want to return data for. (required)
     * @param domains A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  If you do not specify an &#x60;order_by&#x60;parameter, the API will sort the data by &#x60;rank&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return ApiResponse&lt;List&lt;KeywordResearchRankingData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<KeywordResearchRankingData>> researchV30RankingDataGetWithHttpInfo(Integer campaignId, List<String> keywords, String domains, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        com.squareup.okhttp.Call call = researchV30RankingDataGetValidateBeforeCall(campaignId, keywords, domains, limit, offset, orderBy, orderDirection, null, null);
        Type localVarReturnType = new TypeToken<List<KeywordResearchRankingData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Ranking Data (asynchronously)
     * This endpoint returns the SERP, search, and ranking data for the keywords specified in the request, for both your campaign website and the specified domains or URLs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param keywords A comma-separated list of keyword phrases that you want to return data for. (required)
     * @param domains A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  If you do not specify an &#x60;order_by&#x60;parameter, the API will sort the data by &#x60;rank&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30RankingDataGetAsync(Integer campaignId, List<String> keywords, String domains, Integer limit, Integer offset, String orderBy, String orderDirection, final ApiCallback<List<KeywordResearchRankingData>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30RankingDataGetValidateBeforeCall(campaignId, keywords, domains, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<KeywordResearchRankingData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for researchV30RelatedKeywordsGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;connection_strength&#x60;  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30RelatedKeywordsGetCall(Integer campaignId, String keyword, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/related-keywords";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (keyword != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword", keyword));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30RelatedKeywordsGetValidateBeforeCall(Integer campaignId, String keyword, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30RelatedKeywordsGet(Async)");
        }
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException("Missing the required parameter 'keyword' when calling researchV30RelatedKeywordsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30RelatedKeywordsGetCall(campaignId, keyword, limit, offset, orderBy, orderDirection, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Related Keywords
     * This endpoint returns the SERP, search, and your ranking data of the related keywords for a specified keyword (topic).
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;connection_strength&#x60;  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @return List&lt;TopicKeywordDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TopicKeywordDetail> researchV30RelatedKeywordsGet(Integer campaignId, String keyword, Integer limit, Integer offset, String orderBy, String orderDirection, String search) throws ApiException {
        ApiResponse<List<TopicKeywordDetail>> resp = researchV30RelatedKeywordsGetWithHttpInfo(campaignId, keyword, limit, offset, orderBy, orderDirection, search);
        return resp.getData();
    }

    /**
     * Get Related Keywords
     * This endpoint returns the SERP, search, and your ranking data of the related keywords for a specified keyword (topic).
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;connection_strength&#x60;  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @return ApiResponse&lt;List&lt;TopicKeywordDetail&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TopicKeywordDetail>> researchV30RelatedKeywordsGetWithHttpInfo(Integer campaignId, String keyword, Integer limit, Integer offset, String orderBy, String orderDirection, String search) throws ApiException {
        com.squareup.okhttp.Call call = researchV30RelatedKeywordsGetValidateBeforeCall(campaignId, keyword, limit, offset, orderBy, orderDirection, search, null, null);
        Type localVarReturnType = new TypeToken<List<TopicKeywordDetail>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Related Keywords (asynchronously)
     * This endpoint returns the SERP, search, and your ranking data of the related keywords for a specified keyword (topic).
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;connection_strength&#x60;  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30RelatedKeywordsGetAsync(Integer campaignId, String keyword, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ApiCallback<List<TopicKeywordDetail>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30RelatedKeywordsGetValidateBeforeCall(campaignId, keyword, limit, offset, orderBy, orderDirection, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TopicKeywordDetail>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for researchV30TopicOverviewGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call researchV30TopicOverviewGetCall(Integer campaignId, String keyword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/research/v3.0/topic-overview";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (keyword != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword", keyword));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call researchV30TopicOverviewGetValidateBeforeCall(Integer campaignId, String keyword, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling researchV30TopicOverviewGet(Async)");
        }
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException("Missing the required parameter 'keyword' when calling researchV30TopicOverviewGet(Async)");
        }
        
        com.squareup.okhttp.Call call = researchV30TopicOverviewGetCall(campaignId, keyword, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Topic Overview
     * This endpoint returns the overall aggregated search, SERP, and your website&#x27;s Visibility data for all the related keywords of a specified keyword (topic). 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @return TopicsOverview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TopicsOverview researchV30TopicOverviewGet(Integer campaignId, String keyword) throws ApiException {
        ApiResponse<TopicsOverview> resp = researchV30TopicOverviewGetWithHttpInfo(campaignId, keyword);
        return resp.getData();
    }

    /**
     * Get Topic Overview
     * This endpoint returns the overall aggregated search, SERP, and your website&#x27;s Visibility data for all the related keywords of a specified keyword (topic). 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @return ApiResponse&lt;TopicsOverview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TopicsOverview> researchV30TopicOverviewGetWithHttpInfo(Integer campaignId, String keyword) throws ApiException {
        com.squareup.okhttp.Call call = researchV30TopicOverviewGetValidateBeforeCall(campaignId, keyword, null, null);
        Type localVarReturnType = new TypeToken<TopicsOverview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Topic Overview (asynchronously)
     * This endpoint returns the overall aggregated search, SERP, and your website&#x27;s Visibility data for all the related keywords of a specified keyword (topic). 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param keyword The topic for which you want to return related keywords&#x27; data. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call researchV30TopicOverviewGetAsync(Integer campaignId, String keyword, final ApiCallback<TopicsOverview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = researchV30TopicOverviewGetValidateBeforeCall(campaignId, keyword, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TopicsOverview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
