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
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RankTrackerApi
 */
@Ignore
public class RankTrackerApiTest {

    private final RankTrackerApi api = new RankTrackerApi();

    /**
     * Get Daily Share of Clicks
     *
     * Retrieves the daily share of clicks of your domain and the top ten ones by visibility, on a specific keyword list, for the selected timeframe.   You can use this endpoint in two ways:  to retrieve the Share of Clicks data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Share of Clicks data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30DailyShareOfClicksGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer groupId = null;
        String keywordIds = null;
        DailyShareOfClicks response = api.rankTrackerV30DailyShareOfClicksGet(campaignId, startDate, endDate, groupId, keywordIds);

        // TODO: test validations
    }
    /**
     * Get Daily Group Visibility
     *
     * Retrieves the daily Visibility and average weighted ranks of your website or of any other domain, for a group of keywords, over a specified timeframe.  You can use this endpoint in two ways:   to retrieve the Visibility data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Visibility data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30GroupsDailyVisibilityGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer groupId = null;
        String keywordIds = null;
        String domain = null;
        String featureVisibility = null;
        GroupDailyVisibility response = api.rankTrackerV30GroupsDailyVisibilityGet(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility);

        // TODO: test validations
    }
    /**
     * Get Groups Data
     *
     * With this endpoint, you can retrieve overall aggregated search and SERP data along with Visibility metrics and trends for all the keywords of the groups specified through group IDs.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30GroupsDataGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String groupIds = null;
        Integer limit = null;
        Integer offset = null;
        List<GroupDetails> response = api.rankTrackerV30GroupsDataGet(campaignId, startDate, endDate, groupIds, limit, offset);

        // TODO: test validations
    }
    /**
     * Get Groups List
     *
     * This endpoint allows you to retrieve all keyword groups including their structure within folders, for a particular campaign ID. It provides the hierarchical data in a nested JSON structure, with the top-level groups (folders) for the campaign ID at the root level, and any groups nested under them. The response contains details on each group, including its unique ID, name, and type (folder, group, or smart group).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30GroupsGetTest() throws Exception {
        Integer campaignId = null;
        List<Group> response = api.rankTrackerV30GroupsGet(campaignId);

        // TODO: test validations
    }
    /**
     * Get Keywords Competition Data
     *
     * This endpoint returns the specified competitors&#x27; ranking data for a campaign.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsCompetitionGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String device = null;
        String search = null;
        String keywordIds = null;
        Integer groupId = null;
        String competitors = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String orderDirection = null;
        KeywordCompetition response = api.rankTrackerV30KeywordsCompetitionGet(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection);

        // TODO: test validations
    }
    /**
     * Get Daily Keyword Ranks
     *
     * This endpoint returns the daily desktop and mobile ranks for your website or any other domain in a specified timeframe for actively tracked or archived keywords.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsDailyRanksGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String search = null;
        String domain = null;
        String groupId = null;
        String keywordIds = null;
        Boolean getArchive = null;
        Integer limit = null;
        Integer offset = null;
        KeywordDailyRanks response = api.rankTrackerV30KeywordsDailyRanksGet(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset);

        // TODO: test validations
    }
    /**
     * Get Keyword Data
     *
     * This endpoint retrieves active keywords and their corresponding data within a specified timeframe from the Rank Tracker.   With this endpoint, you can get:  &#x60;Campaign-wide Data&#x60;: By default, this endpoint returns data for all active keywords in a specified campaign.  &#x60;Group-specific Data&#x60;: If you supply a &#x60;group_id&#x60;, the endpoint will return data only for the keywords in the specified group.  &#x60;Keyword-specific Data&#x60;: You can request data for specific keywords within a campaign by supplying their IDs using the &#x60;keyword_ids&#x60;  parameter. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Note: Use other parameters like &#x60;limit&#x60;, &#x60;offset&#x60;, &#x60;order_by&#x60;, &#x60;order_direction&#x60;, and &#x60;search&#x60; to further customize the data retrieval as per your needs.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        Integer groupId = null;
        String keywordIds = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String orderDirection = null;
        String search = null;
        List<KeywordDetail> response = api.rankTrackerV30KeywordsGet(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search);

        // TODO: test validations
    }
    /**
     * Add New Keywords
     *
     * With this endpoint, you can add a list of keywords to the specified groups of a campaign.   Note: The keywords added through this API endpoint will be charged according to our &#x60;pricing policy&#x60;. This endpoint cannot be used without setting &#x60;spend limits in the Billing section&#x60;. Unless you have spend limits set, the endpoint will return an error.  Note: the endpoint can also be used to allocate already tracked keywords to existing groups.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsImportPostTest() throws Exception {
        KeywordsImportPostBody body = null;
        AddKeywords response = api.rankTrackerV30KeywordsImportPost(body);

        // TODO: test validations
    }
    /**
     * Get Keywords Import Status
     *
     * With this endpoint, you can retrieve the current status of a keyword import task using the provided import ID, with information on the number of keywords imported so far and the number remaining. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsImportStatusGetTest() throws Exception {
        Integer importId = null;
        Integer campaignId = null;
        KeywordsImportStatus response = api.rankTrackerV30KeywordsImportStatusGet(importId, campaignId);

        // TODO: test validations
    }
    /**
     * Get Ranking Pages
     *
     * This endpoint returns the ranking pages of the tracked keywords in a campaign.  The response contains an array with ranking pages and their URL, title, description, and associated keyword IDs.  Note: Using the keyword IDs of the ranking keywords for the returned landing pages, you can make API calls through the other endpoints, in order to further process landing page-level search volumes, Visibility, and other metrics.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsRankingPagesGetTest() throws Exception {
        Integer campaignId = null;
        Integer groupId = null;
        Integer limit = null;
        Integer offset = null;
        String search = null;
        List<RankingPages> response = api.rankTrackerV30KeywordsRankingPagesGet(campaignId, groupId, limit, offset, search);

        // TODO: test validations
    }
    /**
     * Get Daily SERP Feature Presence
     *
     * This endpoint returns the historical daily SERP feature data for specified keywords over a specified timeframe.  It provides a comprehensive timeline view of the different SERP features present for each keyword on desktop and mobile searches. This includes detailed tracking of whether the website being monitored is listed in each detected feature per date.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsSerpFeaturePresenceGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer groupId = null;
        List<Integer> keywordIds = null;
        Integer limit = null;
        Integer offset = null;
        String search = null;
        SerpFeaturePresence response = api.rankTrackerV30KeywordsSerpFeaturePresenceGet(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search);

        // TODO: test validations
    }
    /**
     * Get Top 100 Results
     *
     * This endpoint returns the top 100 results for the requested keywords on a specified date.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rankTrackerV30KeywordsTopResultsGetTest() throws Exception {
        Integer campaignId = null;
        LocalDate date = null;
        String device = null;
        Integer groupId = null;
        List<Integer> keywordIds = null;
        Integer limit = null;
        Integer offset = null;
        TopResults response = api.rankTrackerV30KeywordsTopResultsGet(campaignId, date, device, groupId, keywordIds, limit, offset);

        // TODO: test validations
    }
}
