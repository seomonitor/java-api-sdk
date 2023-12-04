# RankTrackerApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rankTrackerV30DailyShareOfClicksGet**](RankTrackerApi.md#rankTrackerV30DailyShareOfClicksGet) | **GET** /rank-tracker/v3.0/daily-share-of-clicks | Get Daily Share of Clicks
[**rankTrackerV30GroupsDailyVisibilityGet**](RankTrackerApi.md#rankTrackerV30GroupsDailyVisibilityGet) | **GET** /rank-tracker/v3.0/groups/daily-visibility | Get Daily Group Visibility
[**rankTrackerV30GroupsDataGet**](RankTrackerApi.md#rankTrackerV30GroupsDataGet) | **GET** /rank-tracker/v3.0/groups/data | Get Groups Data
[**rankTrackerV30GroupsGet**](RankTrackerApi.md#rankTrackerV30GroupsGet) | **GET** /rank-tracker/v3.0/groups | Get Groups List
[**rankTrackerV30KeywordsCompetitionGet**](RankTrackerApi.md#rankTrackerV30KeywordsCompetitionGet) | **GET** /rank-tracker/v3.0/keywords/competition | Get Keywords Competition Data
[**rankTrackerV30KeywordsDailyRanksGet**](RankTrackerApi.md#rankTrackerV30KeywordsDailyRanksGet) | **GET** /rank-tracker/v3.0/keywords/daily-ranks | Get Daily Keyword Ranks
[**rankTrackerV30KeywordsGet**](RankTrackerApi.md#rankTrackerV30KeywordsGet) | **GET** /rank-tracker/v3.0/keywords | Get Keyword Data
[**rankTrackerV30KeywordsImportPost**](RankTrackerApi.md#rankTrackerV30KeywordsImportPost) | **POST** /rank-tracker/v3.0/keywords/import | Add New Keywords
[**rankTrackerV30KeywordsImportStatusGet**](RankTrackerApi.md#rankTrackerV30KeywordsImportStatusGet) | **GET** /rank-tracker/v3.0/keywords/import-status | Get Keywords Import Status
[**rankTrackerV30KeywordsRankingPagesGet**](RankTrackerApi.md#rankTrackerV30KeywordsRankingPagesGet) | **GET** /rank-tracker/v3.0/keywords/ranking-pages | Get Ranking Pages
[**rankTrackerV30KeywordsSerpFeaturePresenceGet**](RankTrackerApi.md#rankTrackerV30KeywordsSerpFeaturePresenceGet) | **GET** /rank-tracker/v3.0/keywords/serp-feature-presence | Get Daily SERP Feature Presence
[**rankTrackerV30KeywordsTopResultsGet**](RankTrackerApi.md#rankTrackerV30KeywordsTopResultsGet) | **GET** /rank-tracker/v3.0/keywords/top-results | Get Top 100 Results

<a name="rankTrackerV30DailyShareOfClicksGet"></a>
# **rankTrackerV30DailyShareOfClicksGet**
> DailyShareOfClicks rankTrackerV30DailyShareOfClicksGet(campaignId, startDate, endDate, groupId, keywordIds)

Get Daily Share of Clicks

Retrieves the daily share of clicks of your domain and the top ten ones by visibility, on a specific keyword list, for the selected timeframe.   You can use this endpoint in two ways:  to retrieve the Share of Clicks data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Share of Clicks data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format.
Integer groupId = 56; // Integer | The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign.
String keywordIds = "keywordIds_example"; // String | This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. `keyword_ids` should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify `keyword_ids`, the API will return data for all keywords that meet the other specified criteria (e.g. `group_id`).
try {
    DailyShareOfClicks result = apiInstance.rankTrackerV30DailyShareOfClicksGet(campaignId, startDate, endDate, groupId, keywordIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30DailyShareOfClicksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.    Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. | [optional]
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. | [optional]
 **groupId** | **Integer**| The ID for the group of keywords for which the data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. | [optional]
 **keywordIds** | **String**| This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]

### Return type

[**DailyShareOfClicks**](DailyShareOfClicks.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30GroupsDailyVisibilityGet"></a>
# **rankTrackerV30GroupsDailyVisibilityGet**
> GroupDailyVisibility rankTrackerV30GroupsDailyVisibilityGet(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility)

Get Daily Group Visibility

Retrieves the daily Visibility and average weighted ranks of your website or of any other domain, for a group of keywords, over a specified timeframe.  You can use this endpoint in two ways:   to retrieve the Visibility data of an existing keyword group created in the SEOmonitor campaign, by specifying the &#x60;group_id&#x60; in the request.  to retrieve the Visibility data of a list of requested keywords, by specifying the list of &#x60;keyword_ids&#x60; in the request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format.
Integer groupId = 56; // Integer | The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign. 
String keywordIds = "keywordIds_example"; // String | This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. `keyword_ids` should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify `keyword_ids`, the API will return data for all keywords that meet the other specified criteria (e.g. `group_id`).
String domain = "domain_example"; // String | The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign's website.
String featureVisibility = "featureVisibility_example"; // String | This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  `images_pack`  `questions`  `ads_pack`  `knowledge_graph`  `top_stories`  `local_pack`  `featured_snippet`  `recipes`  `news`  If no `feature_visibility` is specified, the endpoint will return an empty array.
try {
    GroupDailyVisibility result = apiInstance.rankTrackerV30GroupsDailyVisibilityGet(campaignId, startDate, endDate, groupId, keywordIds, domain, featureVisibility);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30GroupsDailyVisibilityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. |
 **groupId** | **Integer**| The ID for the group of keywords for which the data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  | [optional]
 **keywordIds** | **String**| This parameter allows you to specify the IDs of the keywords for which you want to return Visibility data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **domain** | **String**| The domain name for which the Visibility will be returned.   If no domain is provided, the endpoint will return the data for the campaign&#x27;s website. | [optional]
 **featureVisibility** | **String**| This parameter enables you to also retrieve the Visibility for one of the following SERP features: product_listing  &#x60;images_pack&#x60;  &#x60;questions&#x60;  &#x60;ads_pack&#x60;  &#x60;knowledge_graph&#x60;  &#x60;top_stories&#x60;  &#x60;local_pack&#x60;  &#x60;featured_snippet&#x60;  &#x60;recipes&#x60;  &#x60;news&#x60;  If no &#x60;feature_visibility&#x60; is specified, the endpoint will return an empty array. | [optional]

### Return type

[**GroupDailyVisibility**](GroupDailyVisibility.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30GroupsDataGet"></a>
# **rankTrackerV30GroupsDataGet**
> List&lt;GroupDetails&gt; rankTrackerV30GroupsDataGet(campaignId, startDate, endDate, groupIds, limit, offset)

Get Groups Data

With this endpoint, you can retrieve overall aggregated search and SERP data along with Visibility metrics and trends for all the keywords of the groups specified through group IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | The start date of the timeframe for which you want to return the data in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | The end date of the timeframe for which you want to return the data in YYYY-MM-DD format.
String groupIds = "groupIds_example"; // String | The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is `All Keywords` group, which means data will be returned for all keywords in the campaign.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
try {
    List<GroupDetails> result = apiInstance.rankTrackerV30GroupsDataGet(campaignId, startDate, endDate, groupIds, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30GroupsDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| The start date of the timeframe for which you want to return the data in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| The end date of the timeframe for which you want to return the data in YYYY-MM-DD format. |
 **groupIds** | **String**| The ID(s) of the group(s) for which you want to return data.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is &#x60;All Keywords&#x60; group, which means data will be returned for all keywords in the campaign. | [optional]
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]

### Return type

[**List&lt;GroupDetails&gt;**](GroupDetails.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30GroupsGet"></a>
# **rankTrackerV30GroupsGet**
> List&lt;Group&gt; rankTrackerV30GroupsGet(campaignId)

Get Groups List

This endpoint allows you to retrieve all keyword groups including their structure within folders, for a particular campaign ID. It provides the hierarchical data in a nested JSON structure, with the top-level groups (folders) for the campaign ID at the root level, and any groups nested under them. The response contains details on each group, including its unique ID, name, and type (folder, group, or smart group).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
try {
    List<Group> result = apiInstance.rankTrackerV30GroupsGet(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30GroupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| The campaign ID for which the group structure will be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsCompetitionGet"></a>
# **rankTrackerV30KeywordsCompetitionGet**
> KeywordCompetition rankTrackerV30KeywordsCompetitionGet(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection)

Get Keywords Competition Data

This endpoint returns the specified competitors&#x27; ranking data for a campaign.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include.
LocalDate endDate = new LocalDate(); // LocalDate | The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include.
String device = "device_example"; // String | The device type to get ranking data for–either `desktop` or `mobile`.  The default selection is `desktop`.
String search = "search_example"; // String | Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.
String keywordIds = "keywordIds_example"; // String | The IDs of the keywords for which you want to get competitor ranking data. `keyword_ids` should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify `keyword_ids`, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. `group_id`).
Integer groupId = 56; // Integer | The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign. 
String competitors = "competitors_example"; // String | An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: `[\"examplecompetitor1.com\", \"examplecompetitor2.net\"]`   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group.
Integer limit = 56; // Integer | Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | The starting index within the results to begin returning data. Typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  `keyword`  `rank`  `rank_trend`: Sorts the data based on the trend in keyword ranking.   If you do not specify the `order_by` parameter, the data will be sorted by default by the keyword name (`keyword`).
String orderDirection = "orderDirection_example"; // String | Determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  Note: The `order_direction` parameter works in conjunction with the `order_by` parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an `order_direction`, the default is `asc`.
try {
    KeywordCompetition result = apiInstance.rankTrackerV30KeywordsCompetitionGet(campaignId, startDate, endDate, device, search, keywordIds, groupId, competitors, limit, offset, orderBy, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsCompetitionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| The ID of the campaign for which keyword competitor ranking data must be returned.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| The start date of the date range to get ranking data for, in YYYY-MM-DD format. This is the earliest date of rankings to include. |
 **endDate** | **LocalDate**| The end date of the date range to get ranking data for, in YYYY-MM-DD format. This is the most recent date of rankings to include. |
 **device** | **String**| The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. | [enum: desktop, mobile]
 **search** | **String**| Allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. | [optional]
 **keywordIds** | **String**| The IDs of the keywords for which you want to get competitor ranking data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **groupId** | **Integer**| The ID of a specific group in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  | [optional]
 **competitors** | **String**| An optional list of competitor domain names to filter the results by. The ranking data returned will only include the specified competitors. This parameter should be an array of strings containing one or more competitor domains, formatted as follows: &#x60;[\&quot;examplecompetitor1.com\&quot;, \&quot;examplecompetitor2.net\&quot;]&#x60;   If you do not specify the competitors, the endpoint will return data for the competitors configured in the interface for the specified keyword group. | [optional]
 **limit** | **Integer**| Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on the parameter specified. Allowed values:  &#x60;keyword&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking.   If you do not specify the &#x60;order_by&#x60; parameter, the data will be sorted by default by the keyword name (&#x60;keyword&#x60;). | [optional]
 **orderDirection** | **String**| Determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]

### Return type

[**KeywordCompetition**](KeywordCompetition.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsDailyRanksGet"></a>
# **rankTrackerV30KeywordsDailyRanksGet**
> KeywordDailyRanks rankTrackerV30KeywordsDailyRanksGet(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset)

Get Daily Keyword Ranks

This endpoint returns the daily desktop and mobile ranks for your website or any other domain in a specified timeframe for actively tracked or archived keywords.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.
String domain = "domain_example"; // String | The domain name for which the ranks will be returned.   If no `domain` is provided, the endpoint will return the data for the campaign's website.
String groupId = "groupId_example"; // String | The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign. 
String keywordIds = "keywordIds_example"; // String | The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify `keyword_ids`, the API will return data for all keywords that meet the other specified criteria (e.g. `group_id`).
Boolean getArchive = true; // Boolean | If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is `false` and will return the data only for actively tracked keywords.
Integer limit = 56; // Integer | Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | The starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
try {
    KeywordDailyRanks result = apiInstance.rankTrackerV30KeywordsDailyRanksGet(campaignId, startDate, endDate, search, domain, groupId, keywordIds, getArchive, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsDailyRanksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| The start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| The end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. | [optional]
 **domain** | **String**| The domain name for which the ranks will be returned.   If no &#x60;domain&#x60; is provided, the endpoint will return the data for the campaign&#x27;s website. | [optional]
 **groupId** | **String**| The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.   If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  | [optional]
 **keywordIds** | **String**| The IDs of the keywords for which you want to return data. keyword_idsshould be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.   If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **getArchive** | **Boolean**| If true, it returns data only for the archived (deleted) keywords that had been active during the requested timeframe.  The default value is &#x60;false&#x60; and will return the data only for actively tracked keywords. | [optional]
 **limit** | **Integer**| Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]

### Return type

[**KeywordDailyRanks**](KeywordDailyRanks.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsGet"></a>
# **rankTrackerV30KeywordsGet**
> List&lt;KeywordDetail&gt; rankTrackerV30KeywordsGet(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search)

Get Keyword Data

This endpoint retrieves active keywords and their corresponding data within a specified timeframe from the Rank Tracker.   With this endpoint, you can get:  &#x60;Campaign-wide Data&#x60;: By default, this endpoint returns data for all active keywords in a specified campaign.  &#x60;Group-specific Data&#x60;: If you supply a &#x60;group_id&#x60;, the endpoint will return data only for the keywords in the specified group.  &#x60;Keyword-specific Data&#x60;: You can request data for specific keywords within a campaign by supplying their IDs using the &#x60;keyword_ids&#x60;  parameter. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Note: Use other parameters like &#x60;limit&#x60;, &#x60;offset&#x60;, &#x60;order_by&#x60;, &#x60;order_direction&#x60;, and &#x60;search&#x60; to further customize the data retrieval as per your needs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. 
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don't specify an `end_date`, the default is the current day.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don't specify a `start_date`, the default is 30 days before the `end_date`.
Integer groupId = 56; // Integer | The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign.
String keywordIds = "keywordIds_example"; // String | This parameter allows you to specify the IDs of the keywords for which you want to return data. `keyword_ids` should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify `keyword_ids`, the API will return data for all keywords that meet the other specified criteria (e.g. `group_id`).
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - `keyword` - `search_volume` - `year-over-year` - `rank` - `rank_trend`: Sorts the data based on the trend in keyword ranking. - `rank_trend_impact`: Sorts the data based on the rank trend impact on Visibility. - `opportunity`: Sorts the data based on the keyword Opportunity score. 
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  Note: The `order_direction` parameter works in conjunction with the `order_by` parameter. Use it to specify the direction of the sort after choosing the field to order by with `order_by`.  If you do not specify an `order_direction`, the default is `asc`.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.
try {
    List<KeywordDetail> result = apiInstance.rankTrackerV30KeywordsGet(campaignId, endDate, startDate, groupId, keywordIds, limit, offset, orderBy, orderDirection, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  |
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify an &#x60;end_date&#x60;, the default is the current day. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the ranking and traffic data in YYYY-MM-DD format.  If you don&#x27;t specify a &#x60;start_date&#x60;, the default is 30 days before the &#x60;end_date&#x60;. |
 **groupId** | **Integer**| The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. | [optional]
 **keywordIds** | **String**| This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are: - &#x60;keyword&#x60; - &#x60;search_volume&#x60; - &#x60;year-over-year&#x60; - &#x60;rank&#x60; - &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking. - &#x60;rank_trend_impact&#x60;: Sorts the data based on the rank trend impact on Visibility. - &#x60;opportunity&#x60;: Sorts the data based on the keyword Opportunity score.  | [optional] [enum: keyword, search_volume, year-over-year, rank, rank_trend, rank_trend_impact, opportunity]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  Note: The &#x60;order_direction&#x60; parameter works in conjunction with the &#x60;order_by&#x60; parameter. Use it to specify the direction of the sort after choosing the field to order by with &#x60;order_by&#x60;.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional] [enum: asc, desc]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. | [optional]

### Return type

[**List&lt;KeywordDetail&gt;**](KeywordDetail.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsImportPost"></a>
# **rankTrackerV30KeywordsImportPost**
> AddKeywords rankTrackerV30KeywordsImportPost(body)

Add New Keywords

With this endpoint, you can add a list of keywords to the specified groups of a campaign.   Note: The keywords added through this API endpoint will be charged according to our &#x60;pricing policy&#x60;. This endpoint cannot be used without setting &#x60;spend limits in the Billing section&#x60;. Unless you have spend limits set, the endpoint will return an error.  Note: the endpoint can also be used to allocate already tracked keywords to existing groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
KeywordsImportPostBody body = new KeywordsImportPostBody(); // KeywordsImportPostBody | 
try {
    AddKeywords result = apiInstance.rankTrackerV30KeywordsImportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeywordsImportPostBody**](KeywordsImportPostBody.md)|  |

### Return type

[**AddKeywords**](AddKeywords.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsImportStatusGet"></a>
# **rankTrackerV30KeywordsImportStatusGet**
> KeywordsImportStatus rankTrackerV30KeywordsImportStatusGet(importId, campaignId)

Get Keywords Import Status

With this endpoint, you can retrieve the current status of a keyword import task using the provided import ID, with information on the number of keywords imported so far and the number remaining. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer importId = 56; // Integer | The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the `import_id`.
Integer campaignId = 56; // Integer | The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. 
try {
    KeywordsImportStatus result = apiInstance.rankTrackerV30KeywordsImportStatusGet(importId, campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsImportStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importId** | **Integer**| The import ID of the task.  Please refer to the Add New Keywords endpoint in our API to retrieve the &#x60;import_id&#x60;. |
 **campaignId** | **Integer**| The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  |

### Return type

[**KeywordsImportStatus**](KeywordsImportStatus.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsRankingPagesGet"></a>
# **rankTrackerV30KeywordsRankingPagesGet**
> List&lt;RankingPages&gt; rankTrackerV30KeywordsRankingPagesGet(campaignId, groupId, limit, offset, search)

Get Ranking Pages

This endpoint returns the ranking pages of the tracked keywords in a campaign.  The response contains an array with ranking pages and their URL, title, description, and associated keyword IDs.  Note: Using the keyword IDs of the ranking keywords for the returned landing pages, you can make API calls through the other endpoints, in order to further process landing page-level search volumes, Visibility, and other metrics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
Integer groupId = 56; // Integer | The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign.
Integer limit = 56; // Integer | Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | The starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the default is `0`, which means the API will start from the first record.
String search = "search_example"; // String | The `search` parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL.
try {
    List<RankingPages> result = apiInstance.rankTrackerV30KeywordsRankingPagesGet(campaignId, groupId, limit, offset, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsRankingPagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **groupId** | **Integer**| The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign. | [optional]
 **limit** | **Integer**| Determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request.  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| The starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the default is &#x60;0&#x60;, which means the API will start from the first record. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter for landing pages that include the searched term or URL path. The API will return only those records where the landing page matches (fully or partially) the provided search term or URL. | [optional]

### Return type

[**List&lt;RankingPages&gt;**](RankingPages.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsSerpFeaturePresenceGet"></a>
# **rankTrackerV30KeywordsSerpFeaturePresenceGet**
> SerpFeaturePresence rankTrackerV30KeywordsSerpFeaturePresenceGet(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search)

Get Daily SERP Feature Presence

This endpoint returns the historical daily SERP feature data for specified keywords over a specified timeframe.  It provides a comprehensive timeline view of the different SERP features present for each keyword on desktop and mobile searches. This includes detailed tracking of whether the website being monitored is listed in each detected feature per date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format.
Integer groupId = 56; // Integer | The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign. 
List<Integer> keywordIds = Arrays.asList(56); // List<Integer> | This parameter allows you to specify the IDs of the keywords for which you want to return data. `keyword_ids` should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify `keyword_ids`, the API will return data for all keywords that meet the other specified criteria (e.g. `group_id`).
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.
try {
    SerpFeaturePresence result = apiInstance.rankTrackerV30KeywordsSerpFeaturePresenceGet(campaignId, startDate, endDate, groupId, keywordIds, limit, offset, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsSerpFeaturePresenceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the data in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the data in YYYY-MM-DD format. |
 **groupId** | **Integer**| The IDs of specific groups in the campaign to get keyword data for.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  | [optional]
 **keywordIds** | [**List&lt;Integer&gt;**](Integer.md)| This parameter allows you to specify the IDs of the keywords for which you want to return data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.  Please refer to the keyword-related endpoints in our API to retrieve the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. | [optional]

### Return type

[**SerpFeaturePresence**](SerpFeaturePresence.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rankTrackerV30KeywordsTopResultsGet"></a>
# **rankTrackerV30KeywordsTopResultsGet**
> TopResults rankTrackerV30KeywordsTopResultsGet(campaignId, date, device, groupId, keywordIds, limit, offset)

Get Top 100 Results

This endpoint returns the top 100 results for the requested keywords on a specified date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RankTrackerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

RankTrackerApi apiInstance = new RankTrackerApi();
Integer campaignId = 56; // Integer | The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate date = new LocalDate(); // LocalDate | The date for which the ranking data will be provided, in YYYY-MM-DD format.
String device = "device_example"; // String | The device type to get ranking data for–either `desktop` or `mobile`.  The default selection is `desktop`.
Integer groupId = 56; // Integer | The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a `group_id`, the default value is the `All Keywords` group, which means data will be returned for all active keywords in the campaign. 
List<Integer> keywordIds = Arrays.asList(56); // List<Integer> | The IDs of the keywords for which you want to return the data. `keyword_ids` should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify `keyword_ids`, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. `group_id`).
Integer limit = 56; // Integer | Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | The starting index within the results to begin returning data. Typically used with the `limit` parameter to implement pagination.  If you do not specify an offset, the default is `0`, which means the API will start from the first record.
try {
    TopResults result = apiInstance.rankTrackerV30KeywordsTopResultsGet(campaignId, date, device, groupId, keywordIds, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RankTrackerApi#rankTrackerV30KeywordsTopResultsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| The ID of the campaign for which keyword competitor ranking data must be returned.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **date** | **LocalDate**| The date for which the ranking data will be provided, in YYYY-MM-DD format. |
 **device** | **String**| The device type to get ranking data for–either &#x60;desktop&#x60; or &#x60;mobile&#x60;.  The default selection is &#x60;desktop&#x60;. | [enum: desktop, mobile]
 **groupId** | **Integer**| The IDs of specific groups in the campaign to get competitor ranking data for. If not specified, returns data for all of the keywords in the campaign.  Please refer to the Quick Start Guide to learn how to identify the IDs of your groups.  If you do not specify a &#x60;group_id&#x60;, the default value is the &#x60;All Keywords&#x60; group, which means data will be returned for all active keywords in the campaign.  | [optional]
 **keywordIds** | [**List&lt;Integer&gt;**](Integer.md)| The IDs of the keywords for which you want to return the data. &#x60;keyword_ids&#x60; should be a comma-separated list of keyword IDs.   Please refer to the Quick Start Guide to learn how to identify the IDs of your keywords.  If you do not specify &#x60;keyword_ids&#x60;, the API will return data for all keywords in the campaign that meet the other specified criteria (e.g. &#x60;group_id&#x60;). | [optional]
 **limit** | **Integer**| Determines the maximum number of records to return in a single request. Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| The starting index within the results to begin returning data. Typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an offset, the default is &#x60;0&#x60;, which means the API will start from the first record. | [optional]

### Return type

[**TopResults**](TopResults.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

