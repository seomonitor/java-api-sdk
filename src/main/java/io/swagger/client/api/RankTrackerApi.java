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


import io.swagger.client.model.AddKeywords;
import io.swagger.client.model.DailyShareOfClicks;
import io.swagger.client.model.Group;
import io.swagger.client.model.GroupDailyVisibility;
import io.swagger.client.model.GroupDetails;
import io.swagger.client.model.KeywordCompetition;
import io.swagger.client.model.KeywordDailyRanks;
import io.swagger.client.model.KeywordDetail;
import io.swagger.client.model.KeywordsImportPostBody;
import io.swagger.client.model.KeywordsImportStatus;
import org.threeten.bp.LocalDate;
import io.swagger.client.model.RankingPages;
import io.swagger.client.model.SerpFeaturePresence;
import io.swagger.client.model.TopResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RankTrackerApi {
    private ApiClient apiClient;

    public RankTrackerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RankTrackerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for rankTrackerV30DailyShareOfClicksGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (optional)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (optional)
     * @param groupId The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30DailyShareOfClicksGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/daily-share-of-clicks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword_ids", keywordIds));

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
    private com.squareup.okhttp.Call rankTrackerV30DailyShareOfClicksGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30DailyShareOfClicksGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30DailyShareOfClicksGetCall(campaignId, startDate, endDate, groupId, keywordIds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Daily Share of Clicks
     * Retrieves the daily share of clicks of your domain and the top ten ones by visibility, on a specific keyword list, for the selected timeframe.   You can use this endpoint in two ways:  to retrieve the Share of Clicks data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Share of Clicks data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (optional)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (optional)
     * @param groupId The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @return DailyShareOfClicks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DailyShareOfClicks rankTrackerV30DailyShareOfClicksGet(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds) throws ApiException {
        ApiResponse<DailyShareOfClicks> resp = rankTrackerV30DailyShareOfClicksGetWithHttpInfo(campaignId, startDate, endDate, groupId, keywordIds);
        return resp.getData();
    }

    /**
     * Get Daily Share of Clicks
     * Retrieves the daily share of clicks of your domain and the top ten ones by visibility, on a specific keyword list, for the selected timeframe.   You can use this endpoint in two ways:  to retrieve the Share of Clicks data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Share of Clicks data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (optional)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (optional)
     * @param groupId The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @return ApiResponse&lt;DailyShareOfClicks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DailyShareOfClicks> rankTrackerV30DailyShareOfClicksGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30DailyShareOfClicksGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, null, null);
        Type localVarReturnType = new TypeToken<DailyShareOfClicks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Daily Share of Clicks (asynchronously)
     * Retrieves the daily share of clicks of your domain and the top ten ones by visibility, on a specific keyword list, for the selected timeframe.   You can use this endpoint in two ways:  to retrieve the Share of Clicks data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Share of Clicks data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (optional)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (optional)
     * @param groupId The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30DailyShareOfClicksGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, final ApiCallback<DailyShareOfClicks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30DailyShareOfClicksGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DailyShareOfClicks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30GroupsDailyVisibilityGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param domain The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param featureVisibility This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  &#x60;images_pack&#x60;  &#x60;questions&#x60;  &#x60;ads_pack&#x60;  &#x60;knowledge_graph&#x60;  &#x60;top_stories&#x60;  &#x60;local_pack&#x60;  &#x60;featured_snippet&#x60;  &#x60;recipes&#x60;  &#x60;news&#x60;  If no &#x60;feature_visibility&#x60; is specified, the endpoint will return an empty array. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsDailyVisibilityGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, String domain, String featureVisibility, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/groups/daily-visibility";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword_ids", keywordIds));
        if (domain != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("domain", domain));
        if (featureVisibility != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("feature_visibility", featureVisibility));

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
    private com.squareup.okhttp.Call rankTrackerV30GroupsDailyVisibilityGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, String domain, String featureVisibility, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30GroupsDailyVisibilityGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30GroupsDailyVisibilityGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30GroupsDailyVisibilityGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30GroupsDailyVisibilityGetCall(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Daily Group Visibility
     * Retrieves the daily Visibility and average weighted ranks of your website or of any other domain, for a group of keywords, over a specified timeframe.  You can use this endpoint in two ways:   to retrieve the Visibility data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Visibility data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request. 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param domain The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param featureVisibility This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  &#x60;images_pack&#x60;  &#x60;questions&#x60;  &#x60;ads_pack&#x60;  &#x60;knowledge_graph&#x60;  &#x60;top_stories&#x60;  &#x60;local_pack&#x60;  &#x60;featured_snippet&#x60;  &#x60;recipes&#x60;  &#x60;news&#x60;  If no &#x60;feature_visibility&#x60; is specified, the endpoint will return an empty array. (optional)
     * @return GroupDailyVisibility
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupDailyVisibility rankTrackerV30GroupsDailyVisibilityGet(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, String domain, String featureVisibility) throws ApiException {
        ApiResponse<GroupDailyVisibility> resp = rankTrackerV30GroupsDailyVisibilityGetWithHttpInfo(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility);
        return resp.getData();
    }

    /**
     * Get Daily Group Visibility
     * Retrieves the daily Visibility and average weighted ranks of your website or of any other domain, for a group of keywords, over a specified timeframe.  You can use this endpoint in two ways:   to retrieve the Visibility data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Visibility data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request. 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param domain The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param featureVisibility This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  &#x60;images_pack&#x60;  &#x60;questions&#x60;  &#x60;ads_pack&#x60;  &#x60;knowledge_graph&#x60;  &#x60;top_stories&#x60;  &#x60;local_pack&#x60;  &#x60;featured_snippet&#x60;  &#x60;recipes&#x60;  &#x60;news&#x60;  If no &#x60;feature_visibility&#x60; is specified, the endpoint will return an empty array. (optional)
     * @return ApiResponse&lt;GroupDailyVisibility&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupDailyVisibility> rankTrackerV30GroupsDailyVisibilityGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, String domain, String featureVisibility) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30GroupsDailyVisibilityGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility, null, null);
        Type localVarReturnType = new TypeToken<GroupDailyVisibility>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Daily Group Visibility (asynchronously)
     * Retrieves the daily Visibility and average weighted ranks of your website or of any other domain, for a group of keywords, over a specified timeframe.  You can use this endpoint in two ways:   to retrieve the Visibility data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Visibility data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request. 
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param domain The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param featureVisibility This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  &#x60;images_pack&#x60;  &#x60;questions&#x60;  &#x60;ads_pack&#x60;  &#x60;knowledge_graph&#x60;  &#x60;top_stories&#x60;  &#x60;local_pack&#x60;  &#x60;featured_snippet&#x60;  &#x60;recipes&#x60;  &#x60;news&#x60;  If no &#x60;feature_visibility&#x60; is specified, the endpoint will return an empty array. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsDailyVisibilityGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, String keywordIds, String domain, String featureVisibility, final ApiCallback<GroupDailyVisibility> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30GroupsDailyVisibilityGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupDailyVisibility>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30GroupsDataGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupIds The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is &#x60;All Keywords&#x60; group, which means data will be returned for all keywords in the campaign. (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsDataGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String groupIds, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/groups/data";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (groupIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_ids", groupIds));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

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
    private com.squareup.okhttp.Call rankTrackerV30GroupsDataGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String groupIds, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30GroupsDataGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30GroupsDataGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30GroupsDataGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30GroupsDataGetCall(campaignId, startDate, endDate, groupIds, limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Groups Data
     * With this endpoint, you can retrieve overall aggregated search and SERP data along with Visibility metrics and trends for all the keywords of the groups specified through group IDs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupIds The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is &#x60;All Keywords&#x60; group, which means data will be returned for all keywords in the campaign. (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @return List&lt;GroupDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GroupDetails> rankTrackerV30GroupsDataGet(Integer campaignId, LocalDate startDate, LocalDate endDate, String groupIds, Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<GroupDetails>> resp = rankTrackerV30GroupsDataGetWithHttpInfo(campaignId, startDate, endDate, groupIds, limit, offset);
        return resp.getData();
    }

    /**
     * Get Groups Data
     * With this endpoint, you can retrieve overall aggregated search and SERP data along with Visibility metrics and trends for all the keywords of the groups specified through group IDs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupIds The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is &#x60;All Keywords&#x60; group, which means data will be returned for all keywords in the campaign. (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @return ApiResponse&lt;List&lt;GroupDetails&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GroupDetails>> rankTrackerV30GroupsDataGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, String groupIds, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30GroupsDataGetValidateBeforeCall(campaignId, startDate, endDate, groupIds, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<GroupDetails>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Groups Data (asynchronously)
     * With this endpoint, you can retrieve overall aggregated search and SERP data along with Visibility metrics and trends for all the keywords of the groups specified through group IDs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupIds The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is &#x60;All Keywords&#x60; group, which means data will be returned for all keywords in the campaign. (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsDataGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, String groupIds, Integer limit, Integer offset, final ApiCallback<List<GroupDetails>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30GroupsDataGetValidateBeforeCall(campaignId, startDate, endDate, groupIds, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GroupDetails>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30GroupsGet
     * @param campaignId The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsGetCall(Integer campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));

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
    private com.squareup.okhttp.Call rankTrackerV30GroupsGetValidateBeforeCall(Integer campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30GroupsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30GroupsGetCall(campaignId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Groups List
     * This endpoint allows you to retrieve all keyword groups including their structure within folders, for a particular campaign ID. It provides the hierarchical data in a nested JSON structure, with the top-level groups (folders) for the campaign ID at the root level, and any groups nested under them. The response contains details on each group, including its unique ID, name, and type (folder, group, or smart group).
     * @param campaignId The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @return List&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Group> rankTrackerV30GroupsGet(Integer campaignId) throws ApiException {
        ApiResponse<List<Group>> resp = rankTrackerV30GroupsGetWithHttpInfo(campaignId);
        return resp.getData();
    }

    /**
     * Get Groups List
     * This endpoint allows you to retrieve all keyword groups including their structure within folders, for a particular campaign ID. It provides the hierarchical data in a nested JSON structure, with the top-level groups (folders) for the campaign ID at the root level, and any groups nested under them. The response contains details on each group, including its unique ID, name, and type (folder, group, or smart group).
     * @param campaignId The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @return ApiResponse&lt;List&lt;Group&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Group>> rankTrackerV30GroupsGetWithHttpInfo(Integer campaignId) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30GroupsGetValidateBeforeCall(campaignId, null, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Groups List (asynchronously)
     * This endpoint allows you to retrieve all keyword groups including their structure within folders, for a particular campaign ID. It provides the hierarchical data in a nested JSON structure, with the top-level groups (folders) for the campaign ID at the root level, and any groups nested under them. The response contains details on each group, including its unique ID, name, and type (folder, group, or smart group).
     * @param campaignId The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30GroupsGetAsync(Integer campaignId, final ApiCallback<List<Group>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30GroupsGetValidateBeforeCall(campaignId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsCompetitionGet
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include. (required)
     * @param endDate The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param search Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. (optional)
     * @param keywordIds The IDs of the keywords for which you want to get competitor ranking data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param groupId The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param competitors An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: &#x60;[\&quot;examplecompetitor1.com\&quot;, \&quot;examplecompetitor2.net\&quot;]&#x60;   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group. (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  &#x60;keyword&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking.   If you do not specify the &#x60;order_by&#x60; parameter, the data will be sorted by default by the keyword name (&#x60;keyword&#x60;). (optional)
     * @param orderDirection Determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsCompetitionGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String device, String search, String keywordIds, Integer groupId, String competitors, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/competition";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
        if (device != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("device", device));
        if (keywordIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword_ids", keywordIds));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (competitors != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("competitors", competitors));
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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsCompetitionGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String device, String search, String keywordIds, Integer groupId, String competitors, Integer limit, Integer offset, String orderBy, String orderDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsCompetitionGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30KeywordsCompetitionGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30KeywordsCompetitionGet(Async)");
        }
        // verify the required parameter 'device' is set
        if (device == null) {
            throw new ApiException("Missing the required parameter 'device' when calling rankTrackerV30KeywordsCompetitionGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsCompetitionGetCall(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Keywords Competition Data
     * This endpoint returns the specified competitors&#x27; ranking data for a campaign.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include. (required)
     * @param endDate The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param search Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. (optional)
     * @param keywordIds The IDs of the keywords for which you want to get competitor ranking data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param groupId The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param competitors An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: &#x60;[\&quot;examplecompetitor1.com\&quot;, \&quot;examplecompetitor2.net\&quot;]&#x60;   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group. (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  &#x60;keyword&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking.   If you do not specify the &#x60;order_by&#x60; parameter, the data will be sorted by default by the keyword name (&#x60;keyword&#x60;). (optional)
     * @param orderDirection Determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return KeywordCompetition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeywordCompetition rankTrackerV30KeywordsCompetitionGet(Integer campaignId, LocalDate startDate, LocalDate endDate, String device, String search, String keywordIds, Integer groupId, String competitors, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        ApiResponse<KeywordCompetition> resp = rankTrackerV30KeywordsCompetitionGetWithHttpInfo(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection);
        return resp.getData();
    }

    /**
     * Get Keywords Competition Data
     * This endpoint returns the specified competitors&#x27; ranking data for a campaign.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include. (required)
     * @param endDate The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param search Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. (optional)
     * @param keywordIds The IDs of the keywords for which you want to get competitor ranking data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param groupId The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param competitors An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: &#x60;[\&quot;examplecompetitor1.com\&quot;, \&quot;examplecompetitor2.net\&quot;]&#x60;   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group. (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  &#x60;keyword&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking.   If you do not specify the &#x60;order_by&#x60; parameter, the data will be sorted by default by the keyword name (&#x60;keyword&#x60;). (optional)
     * @param orderDirection Determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @return ApiResponse&lt;KeywordCompetition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeywordCompetition> rankTrackerV30KeywordsCompetitionGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, String device, String search, String keywordIds, Integer groupId, String competitors, Integer limit, Integer offset, String orderBy, String orderDirection) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsCompetitionGetValidateBeforeCall(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection, null, null);
        Type localVarReturnType = new TypeToken<KeywordCompetition>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Keywords Competition Data (asynchronously)
     * This endpoint returns the specified competitors&#x27; ranking data for a campaign.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include. (required)
     * @param endDate The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param search Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. (optional)
     * @param keywordIds The IDs of the keywords for which you want to get competitor ranking data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param groupId The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param competitors An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: &#x60;[\&quot;examplecompetitor1.com\&quot;, \&quot;examplecompetitor2.net\&quot;]&#x60;   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group. (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  &#x60;keyword&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking.   If you do not specify the &#x60;order_by&#x60; parameter, the data will be sorted by default by the keyword name (&#x60;keyword&#x60;). (optional)
     * @param orderDirection Determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsCompetitionGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, String device, String search, String keywordIds, Integer groupId, String competitors, Integer limit, Integer offset, String orderBy, String orderDirection, final ApiCallback<KeywordCompetition> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsCompetitionGetValidateBeforeCall(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeywordCompetition>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsDailyRanksGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param domain The domain name for which the ranks will be returned.   If no &#x60;domain&#x60; is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param getArchive If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is &#x60;false&#x60; and will return the data only for actively tracked keywords. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsDailyRanksGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String search, String domain, String groupId, String keywordIds, Boolean getArchive, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/daily-ranks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
        if (domain != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("domain", domain));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword_ids", keywordIds));
        if (getArchive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("get_archive", getArchive));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsDailyRanksGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, String search, String domain, String groupId, String keywordIds, Boolean getArchive, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsDailyRanksGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30KeywordsDailyRanksGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30KeywordsDailyRanksGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsDailyRanksGetCall(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Daily Keyword Ranks
     * This endpoint returns the daily desktop and mobile ranks for your website or any other domain in a specified timeframe for actively tracked or archived keywords.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param domain The domain name for which the ranks will be returned.   If no &#x60;domain&#x60; is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param getArchive If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is &#x60;false&#x60; and will return the data only for actively tracked keywords. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @return KeywordDailyRanks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeywordDailyRanks rankTrackerV30KeywordsDailyRanksGet(Integer campaignId, LocalDate startDate, LocalDate endDate, String search, String domain, String groupId, String keywordIds, Boolean getArchive, Integer limit, Integer offset) throws ApiException {
        ApiResponse<KeywordDailyRanks> resp = rankTrackerV30KeywordsDailyRanksGetWithHttpInfo(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset);
        return resp.getData();
    }

    /**
     * Get Daily Keyword Ranks
     * This endpoint returns the daily desktop and mobile ranks for your website or any other domain in a specified timeframe for actively tracked or archived keywords.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param domain The domain name for which the ranks will be returned.   If no &#x60;domain&#x60; is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param getArchive If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is &#x60;false&#x60; and will return the data only for actively tracked keywords. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @return ApiResponse&lt;KeywordDailyRanks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeywordDailyRanks> rankTrackerV30KeywordsDailyRanksGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, String search, String domain, String groupId, String keywordIds, Boolean getArchive, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsDailyRanksGetValidateBeforeCall(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<KeywordDailyRanks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Daily Keyword Ranks (asynchronously)
     * This endpoint returns the daily desktop and mobile ranks for your website or any other domain in a specified timeframe for actively tracked or archived keywords.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param endDate The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. (required)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param domain The domain name for which the ranks will be returned.   If no &#x60;domain&#x60; is provided, the endpoint will return the data for the campaign&#x27;s website. (optional)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param getArchive If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is &#x60;false&#x60; and will return the data only for actively tracked keywords. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsDailyRanksGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, String search, String domain, String groupId, String keywordIds, Boolean getArchive, Integer limit, Integer offset, final ApiCallback<KeywordDailyRanks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsDailyRanksGetValidateBeforeCall(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeywordDailyRanks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify an &#x60;end_date&#x60;, the default is the current day. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify a &#x60;start_date&#x60;, the default is 30 days before the &#x60;end_date&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - &#x60;keyword&#x60; - &#x60;search_volume&#x60; - &#x60;year-over-year&#x60; - &#x60;rank&#x60; - &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking. - &#x60;rank_trend_impact&#x60;: Sorts the data based on the rank trend impact on Visibility. - &#x60;opportunity&#x60;: Sorts the data based on the keyword Opportunity score.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by with &#x60;order_by&#x60;.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsGetCall(Integer campaignId, LocalDate endDate, LocalDate startDate, Integer groupId, String keywordIds, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keyword_ids", keywordIds));
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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsGetValidateBeforeCall(Integer campaignId, LocalDate endDate, LocalDate startDate, Integer groupId, String keywordIds, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30KeywordsGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30KeywordsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsGetCall(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Keyword Data
     * This endpoint retrieves active keywords and their corresponding data within a specified timeframe from the Rank Tracker.   With this endpoint, you can get:  &#x60;Campaign-wide Data&#x60;: By default, this endpoint returns data for all active keywords in a specified campaign.  &#x60;Group-specific Data&#x60;: If you supply a &#x60;group_id&#x60;, the endpoint will return data only for the keywords in the specified group.  &#x60;Keyword-specific Data&#x60;: You can request data for specific keywords within a campaign by supplying their IDs using the &#x60;keyword_ids&#x60;  parameter. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Note: Use other parameters like &#x60;limit&#x60;, &#x60;offset&#x60;, &#x60;order_by&#x60;, &#x60;order_direction&#x60;, and &#x60;search&#x60; to further customize the data retrieval as per your needs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify an &#x60;end_date&#x60;, the default is the current day. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify a &#x60;start_date&#x60;, the default is 30 days before the &#x60;end_date&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - &#x60;keyword&#x60; - &#x60;search_volume&#x60; - &#x60;year-over-year&#x60; - &#x60;rank&#x60; - &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking. - &#x60;rank_trend_impact&#x60;: Sorts the data based on the rank trend impact on Visibility. - &#x60;opportunity&#x60;: Sorts the data based on the keyword Opportunity score.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by with &#x60;order_by&#x60;.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @return List&lt;KeywordDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<KeywordDetail> rankTrackerV30KeywordsGet(Integer campaignId, LocalDate endDate, LocalDate startDate, Integer groupId, String keywordIds, Integer limit, Integer offset, String orderBy, String orderDirection, String search) throws ApiException {
        ApiResponse<List<KeywordDetail>> resp = rankTrackerV30KeywordsGetWithHttpInfo(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search);
        return resp.getData();
    }

    /**
     * Get Keyword Data
     * This endpoint retrieves active keywords and their corresponding data within a specified timeframe from the Rank Tracker.   With this endpoint, you can get:  &#x60;Campaign-wide Data&#x60;: By default, this endpoint returns data for all active keywords in a specified campaign.  &#x60;Group-specific Data&#x60;: If you supply a &#x60;group_id&#x60;, the endpoint will return data only for the keywords in the specified group.  &#x60;Keyword-specific Data&#x60;: You can request data for specific keywords within a campaign by supplying their IDs using the &#x60;keyword_ids&#x60;  parameter. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Note: Use other parameters like &#x60;limit&#x60;, &#x60;offset&#x60;, &#x60;order_by&#x60;, &#x60;order_direction&#x60;, and &#x60;search&#x60; to further customize the data retrieval as per your needs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify an &#x60;end_date&#x60;, the default is the current day. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify a &#x60;start_date&#x60;, the default is 30 days before the &#x60;end_date&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - &#x60;keyword&#x60; - &#x60;search_volume&#x60; - &#x60;year-over-year&#x60; - &#x60;rank&#x60; - &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking. - &#x60;rank_trend_impact&#x60;: Sorts the data based on the rank trend impact on Visibility. - &#x60;opportunity&#x60;: Sorts the data based on the keyword Opportunity score.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by with &#x60;order_by&#x60;.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @return ApiResponse&lt;List&lt;KeywordDetail&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<KeywordDetail>> rankTrackerV30KeywordsGetWithHttpInfo(Integer campaignId, LocalDate endDate, LocalDate startDate, Integer groupId, String keywordIds, Integer limit, Integer offset, String orderBy, String orderDirection, String search) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsGetValidateBeforeCall(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search, null, null);
        Type localVarReturnType = new TypeToken<List<KeywordDetail>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Keyword Data (asynchronously)
     * This endpoint retrieves active keywords and their corresponding data within a specified timeframe from the Rank Tracker.   With this endpoint, you can get:  &#x60;Campaign-wide Data&#x60;: By default, this endpoint returns data for all active keywords in a specified campaign.  &#x60;Group-specific Data&#x60;: If you supply a &#x60;group_id&#x60;, the endpoint will return data only for the keywords in the specified group.  &#x60;Keyword-specific Data&#x60;: You can request data for specific keywords within a campaign by supplying their IDs using the &#x60;keyword_ids&#x60;  parameter. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Note: Use other parameters like &#x60;limit&#x60;, &#x60;offset&#x60;, &#x60;order_by&#x60;, &#x60;order_direction&#x60;, and &#x60;search&#x60; to further customize the data retrieval as per your needs.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify an &#x60;end_date&#x60;, the default is the current day. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify a &#x60;start_date&#x60;, the default is 30 days before the &#x60;end_date&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param orderBy This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - &#x60;keyword&#x60; - &#x60;search_volume&#x60; - &#x60;year-over-year&#x60; - &#x60;rank&#x60; - &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking. - &#x60;rank_trend_impact&#x60;: Sorts the data based on the rank trend impact on Visibility. - &#x60;opportunity&#x60;: Sorts the data based on the keyword Opportunity score.  (optional)
     * @param orderDirection This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by with &#x60;order_by&#x60;.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsGetAsync(Integer campaignId, LocalDate endDate, LocalDate startDate, Integer groupId, String keywordIds, Integer limit, Integer offset, String orderBy, String orderDirection, String search, final ApiCallback<List<KeywordDetail>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsGetValidateBeforeCall(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<KeywordDetail>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsImportPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsImportPostCall(KeywordsImportPostBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/import";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rankTrackerV30KeywordsImportPostValidateBeforeCall(KeywordsImportPostBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling rankTrackerV30KeywordsImportPost(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add New Keywords
     * With this endpoint, you can add a list of keywords to the specified groups of a campaign.   Note: The keywords added through this API endpoint will be charged according to our &#x60;pricing policy&#x60;. This endpoint cannot be used without setting &#x60;spend limits in the Billing section&#x60;. Unless you have spend limits set, the endpoint will return an error.  Note: the endpoint can also be used to allocate already tracked keywords to existing groups.
     * @param body  (required)
     * @return AddKeywords
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddKeywords rankTrackerV30KeywordsImportPost(KeywordsImportPostBody body) throws ApiException {
        ApiResponse<AddKeywords> resp = rankTrackerV30KeywordsImportPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add New Keywords
     * With this endpoint, you can add a list of keywords to the specified groups of a campaign.   Note: The keywords added through this API endpoint will be charged according to our &#x60;pricing policy&#x60;. This endpoint cannot be used without setting &#x60;spend limits in the Billing section&#x60;. Unless you have spend limits set, the endpoint will return an error.  Note: the endpoint can also be used to allocate already tracked keywords to existing groups.
     * @param body  (required)
     * @return ApiResponse&lt;AddKeywords&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddKeywords> rankTrackerV30KeywordsImportPostWithHttpInfo(KeywordsImportPostBody body) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AddKeywords>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add New Keywords (asynchronously)
     * With this endpoint, you can add a list of keywords to the specified groups of a campaign.   Note: The keywords added through this API endpoint will be charged according to our &#x60;pricing policy&#x60;. This endpoint cannot be used without setting &#x60;spend limits in the Billing section&#x60;. Unless you have spend limits set, the endpoint will return an error.  Note: the endpoint can also be used to allocate already tracked keywords to existing groups.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsImportPostAsync(KeywordsImportPostBody body, final ApiCallback<AddKeywords> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddKeywords>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsImportStatusGet
     * @param importId The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the &#x60;import_id&#x60;. (required)
     * @param campaignId The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsImportStatusGetCall(Integer importId, Integer campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/import-status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (importId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("import_id", importId));
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));

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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsImportStatusGetValidateBeforeCall(Integer importId, Integer campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'importId' is set
        if (importId == null) {
            throw new ApiException("Missing the required parameter 'importId' when calling rankTrackerV30KeywordsImportStatusGet(Async)");
        }
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsImportStatusGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportStatusGetCall(importId, campaignId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Keywords Import Status
     * With this endpoint, you can retrieve the current status of a keyword import task using the provided import ID, with information on the number of keywords imported so far and the number remaining. 
     * @param importId The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the &#x60;import_id&#x60;. (required)
     * @param campaignId The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @return KeywordsImportStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeywordsImportStatus rankTrackerV30KeywordsImportStatusGet(Integer importId, Integer campaignId) throws ApiException {
        ApiResponse<KeywordsImportStatus> resp = rankTrackerV30KeywordsImportStatusGetWithHttpInfo(importId, campaignId);
        return resp.getData();
    }

    /**
     * Get Keywords Import Status
     * With this endpoint, you can retrieve the current status of a keyword import task using the provided import ID, with information on the number of keywords imported so far and the number remaining. 
     * @param importId The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the &#x60;import_id&#x60;. (required)
     * @param campaignId The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @return ApiResponse&lt;KeywordsImportStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeywordsImportStatus> rankTrackerV30KeywordsImportStatusGetWithHttpInfo(Integer importId, Integer campaignId) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportStatusGetValidateBeforeCall(importId, campaignId, null, null);
        Type localVarReturnType = new TypeToken<KeywordsImportStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Keywords Import Status (asynchronously)
     * With this endpoint, you can retrieve the current status of a keyword import task using the provided import ID, with information on the number of keywords imported so far and the number remaining. 
     * @param importId The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the &#x60;import_id&#x60;. (required)
     * @param campaignId The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsImportStatusGetAsync(Integer importId, Integer campaignId, final ApiCallback<KeywordsImportStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsImportStatusGetValidateBeforeCall(importId, campaignId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeywordsImportStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsRankingPagesGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsRankingPagesGetCall(Integer campaignId, Integer groupId, Integer limit, Integer offset, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/ranking-pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsRankingPagesGetValidateBeforeCall(Integer campaignId, Integer groupId, Integer limit, Integer offset, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsRankingPagesGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsRankingPagesGetCall(campaignId, groupId, limit, offset, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Ranking Pages
     * This endpoint returns the ranking pages of the tracked keywords in a campaign.  The response contains an array with ranking pages and their URL, title, description, and associated keyword IDs.  Note: Using the keyword IDs of the ranking keywords for the returned landing pages, you can make API calls through the other endpoints, in order to further process landing page-level search volumes, Visibility, and other metrics.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL. (optional)
     * @return List&lt;RankingPages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<RankingPages> rankTrackerV30KeywordsRankingPagesGet(Integer campaignId, Integer groupId, Integer limit, Integer offset, String search) throws ApiException {
        ApiResponse<List<RankingPages>> resp = rankTrackerV30KeywordsRankingPagesGetWithHttpInfo(campaignId, groupId, limit, offset, search);
        return resp.getData();
    }

    /**
     * Get Ranking Pages
     * This endpoint returns the ranking pages of the tracked keywords in a campaign.  The response contains an array with ranking pages and their URL, title, description, and associated keyword IDs.  Note: Using the keyword IDs of the ranking keywords for the returned landing pages, you can make API calls through the other endpoints, in order to further process landing page-level search volumes, Visibility, and other metrics.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL. (optional)
     * @return ApiResponse&lt;List&lt;RankingPages&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<RankingPages>> rankTrackerV30KeywordsRankingPagesGetWithHttpInfo(Integer campaignId, Integer groupId, Integer limit, Integer offset, String search) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsRankingPagesGetValidateBeforeCall(campaignId, groupId, limit, offset, search, null, null);
        Type localVarReturnType = new TypeToken<List<RankingPages>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Ranking Pages (asynchronously)
     * This endpoint returns the ranking pages of the tracked keywords in a campaign.  The response contains an array with ranking pages and their URL, title, description, and associated keyword IDs.  Note: Using the keyword IDs of the ranking keywords for the returned landing pages, you can make API calls through the other endpoints, in order to further process landing page-level search volumes, Visibility, and other metrics.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. (optional)
     * @param limit Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsRankingPagesGetAsync(Integer campaignId, Integer groupId, Integer limit, Integer offset, String search, final ApiCallback<List<RankingPages>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsRankingPagesGetValidateBeforeCall(campaignId, groupId, limit, offset, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<RankingPages>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsSerpFeaturePresenceGet
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsSerpFeaturePresenceGetCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/serp-feature-presence";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "keyword_ids", keywordIds));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsSerpFeaturePresenceGetValidateBeforeCall(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, String search, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsSerpFeaturePresenceGet(Async)");
        }
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling rankTrackerV30KeywordsSerpFeaturePresenceGet(Async)");
        }
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling rankTrackerV30KeywordsSerpFeaturePresenceGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsSerpFeaturePresenceGetCall(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Daily SERP Feature Presence
     * This endpoint returns the historical daily SERP feature data for specified keywords over a specified timeframe.  It provides a comprehensive timeline view of the different SERP features present for each keyword on desktop and mobile searches. This includes detailed tracking of whether the website being monitored is listed in each detected feature per date.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @return SerpFeaturePresence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SerpFeaturePresence rankTrackerV30KeywordsSerpFeaturePresenceGet(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, String search) throws ApiException {
        ApiResponse<SerpFeaturePresence> resp = rankTrackerV30KeywordsSerpFeaturePresenceGetWithHttpInfo(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search);
        return resp.getData();
    }

    /**
     * Get Daily SERP Feature Presence
     * This endpoint returns the historical daily SERP feature data for specified keywords over a specified timeframe.  It provides a comprehensive timeline view of the different SERP features present for each keyword on desktop and mobile searches. This includes detailed tracking of whether the website being monitored is listed in each detected feature per date.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @return ApiResponse&lt;SerpFeaturePresence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SerpFeaturePresence> rankTrackerV30KeywordsSerpFeaturePresenceGetWithHttpInfo(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, String search) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsSerpFeaturePresenceGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search, null, null);
        Type localVarReturnType = new TypeToken<SerpFeaturePresence>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Daily SERP Feature Presence (asynchronously)
     * This endpoint returns the historical daily SERP feature data for specified keywords over a specified timeframe.  It provides a comprehensive timeline view of the different SERP features present for each keyword on desktop and mobile searches. This includes detailed tracking of whether the website being monitored is listed in each detected feature per date.
     * @param campaignId This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param startDate This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param endDate This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. (required)
     * @param groupId The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. (optional)
     * @param search The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsSerpFeaturePresenceGetAsync(Integer campaignId, LocalDate startDate, LocalDate endDate, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, String search, final ApiCallback<SerpFeaturePresence> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsSerpFeaturePresenceGetValidateBeforeCall(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SerpFeaturePresence>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rankTrackerV30KeywordsTopResultsGet
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param date The date for which the ranking data will be provided, in YYYY-MM-DD format. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return the data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an offset, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsTopResultsGetCall(Integer campaignId, LocalDate date, String device, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/rank-tracker/v3.0/keywords/top-results";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (campaignId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaign_id", campaignId));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
        if (device != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("device", device));
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (keywordIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "keyword_ids", keywordIds));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

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
    private com.squareup.okhttp.Call rankTrackerV30KeywordsTopResultsGetValidateBeforeCall(Integer campaignId, LocalDate date, String device, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling rankTrackerV30KeywordsTopResultsGet(Async)");
        }
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling rankTrackerV30KeywordsTopResultsGet(Async)");
        }
        // verify the required parameter 'device' is set
        if (device == null) {
            throw new ApiException("Missing the required parameter 'device' when calling rankTrackerV30KeywordsTopResultsGet(Async)");
        }
        
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsTopResultsGetCall(campaignId, date, device, groupId, keywordIds, limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Top 100 Results
     * This endpoint returns the top 100 results for the requested keywords on a specified date.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param date The date for which the ranking data will be provided, in YYYY-MM-DD format. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return the data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an offset, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @return TopResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TopResults rankTrackerV30KeywordsTopResultsGet(Integer campaignId, LocalDate date, String device, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset) throws ApiException {
        ApiResponse<TopResults> resp = rankTrackerV30KeywordsTopResultsGetWithHttpInfo(campaignId, date, device, groupId, keywordIds, limit, offset);
        return resp.getData();
    }

    /**
     * Get Top 100 Results
     * This endpoint returns the top 100 results for the requested keywords on a specified date.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param date The date for which the ranking data will be provided, in YYYY-MM-DD format. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return the data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an offset, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @return ApiResponse&lt;TopResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TopResults> rankTrackerV30KeywordsTopResultsGetWithHttpInfo(Integer campaignId, LocalDate date, String device, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = rankTrackerV30KeywordsTopResultsGetValidateBeforeCall(campaignId, date, device, groupId, keywordIds, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<TopResults>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Top 100 Results (asynchronously)
     * This endpoint returns the top 100 results for the requested keywords on a specified date.
     * @param campaignId The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. (required)
     * @param date The date for which the ranking data will be provided, in YYYY-MM-DD format. (required)
     * @param device The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. (required)
     * @param groupId The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  (optional)
     * @param keywordIds The IDs of the keywords for which you want to return the data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). (optional)
     * @param limit Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. (optional)
     * @param offset The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an offset, the default is &#x60;0&#x60;, which means the API will start from the first record. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rankTrackerV30KeywordsTopResultsGetAsync(Integer campaignId, LocalDate date, String device, Integer groupId, List<Integer> keywordIds, Integer limit, Integer offset, final ApiCallback<TopResults> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rankTrackerV30KeywordsTopResultsGetValidateBeforeCall(campaignId, date, device, groupId, keywordIds, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TopResults>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
