# KeywordResearchApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**researchV30DomainOverviewGet**](KeywordResearchApi.md#researchV30DomainOverviewGet) | **GET** /research/v3.0/domain-overview | Get URL/Domain Overview
[**researchV30DomainRankingKeywordsGet**](KeywordResearchApi.md#researchV30DomainRankingKeywordsGet) | **GET** /research/v3.0/domain-ranking-keywords | Get Ranking Keywords
[**researchV30KeywordsGet**](KeywordResearchApi.md#researchV30KeywordsGet) | **GET** /research/v3.0/keywords | Get Keyword Data
[**researchV30RankingDataGet**](KeywordResearchApi.md#researchV30RankingDataGet) | **GET** /research/v3.0/ranking-data | Get Ranking Data
[**researchV30RelatedKeywordsGet**](KeywordResearchApi.md#researchV30RelatedKeywordsGet) | **GET** /research/v3.0/related-keywords | Get Related Keywords
[**researchV30TopicOverviewGet**](KeywordResearchApi.md#researchV30TopicOverviewGet) | **GET** /research/v3.0/topic-overview | Get Topic Overview

<a name="researchV30DomainOverviewGet"></a>
# **researchV30DomainOverviewGet**
> ResearchDomainOverview researchV30DomainOverviewGet(campaignId, url, gapAnalysis)

Get URL/Domain Overview

This endpoint returns the overall aggregated search, SERP, and Visibility data for all the ranking keywords of a specified domain or URL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String url = "url_example"; // String | This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. 
String gapAnalysis = "gapAnalysis_example"; // String | The type of keywords you want to return data for. Allowed values are `overlapping`, `non-overlapping`, or `all-keywords`.  If the `keyword_gap_type` is not specified, data for `all-keywords` is returned.
try {
    ResearchDomainOverview result = apiInstance.researchV30DomainOverviewGet(campaignId, url, gapAnalysis);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30DomainOverviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **url** | **String**| This parameter specifies the domain or URL path for which you want to return the data.   If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.  |
 **gapAnalysis** | **String**| The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.  If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. | [optional]

### Return type

[**ResearchDomainOverview**](ResearchDomainOverview.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="researchV30DomainRankingKeywordsGet"></a>
# **researchV30DomainRankingKeywordsGet**
> DomainRankingsData researchV30DomainRankingKeywordsGet(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search)

Get Ranking Keywords

This endpoint returns the keywords on which the specified domain or URL ranks in top 100. For each keyword, it will return SERP, search and two sets of ranking data for your campaign domain, and for the requested one.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String url = "url_example"; // String | This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  `search_volume`  `year-over-year`  `rank`: Sorts the data based on the keyword rank for the requested domain or URL.  `rank_trend`: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  `my_rank`: Sorts the data based on the keyword rank for the tracked website.  `my_rank_trend`: Sorts the data based on the trend in keyword ranking for the tracked website.  `percentage_clicks`: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword. 
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If you do not specify an `order_direction`, the default is `asc`.
String gapAnalysis = "gapAnalysis_example"; // String | The type of keywords you want to return data for. Allowed values are `overlapping`, `non-overlapping`, or `all-keywords`.   If the `keyword_gap_type` is not specified, data for `all-keywords` is returned.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. 
try {
    DomainRankingsData result = apiInstance.researchV30DomainRankingKeywordsGet(campaignId, url, limit, offset, orderBy, orderDirection, gapAnalysis, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30DomainRankingKeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **url** | **String**| This parameter specifies the domain or URL path for which you want to return the keywords ranking in top 100.  If you request a domain, the endpoint will return the data for the entire domain.   If you request a URL, the endpoint will return the data only for the specified URL path. |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;: Sorts the data based on the keyword rank for the requested domain or URL.  &#x60;rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the requested domain or URL.  &#x60;my_rank&#x60;: Sorts the data based on the keyword rank for the tracked website.  &#x60;my_rank_trend&#x60;: Sorts the data based on the trend in keyword ranking for the tracked website.  &#x60;percentage_clicks&#x60;: Sorts the data based on the percentage of clicks that end up on organic results after discounting the impact of the top 10 SERP features present on the keyword.  | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]
 **gapAnalysis** | **String**| The type of keywords you want to return data for. Allowed values are &#x60;overlapping&#x60;, &#x60;non-overlapping&#x60;, or &#x60;all-keywords&#x60;.   If the &#x60;keyword_gap_type&#x60; is not specified, data for &#x60;all-keywords&#x60; is returned. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword name search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  | [optional]

### Return type

[**DomainRankingsData**](DomainRankingsData.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="researchV30KeywordsGet"></a>
# **researchV30KeywordsGet**
> List&lt;ResearchKeywords&gt; researchV30KeywordsGet(campaignId, keywords, limit, offset, orderBy, orderDirection)

Get Keyword Data

This endpoint returns the SERP, search and your ranking data for the keywords specified in the request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. 
String keywords = "keywords_example"; // String | Comma-separated list of keyword phrases that you want to return data for. 
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  `search_volume`  `year-over-year`  `rank`  `rank_trend`  `percentage_clicks`
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If you do not specify an `order_direction`, the default is `asc`.
try {
    List<ResearchKeywords> result = apiInstance.researchV30KeywordsGet(campaignId, keywords, limit, offset, orderBy, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30KeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  |
 **keywords** | **String**| Comma-separated list of keyword phrases that you want to return data for.  |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60; | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]

### Return type

[**List&lt;ResearchKeywords&gt;**](ResearchKeywords.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="researchV30RankingDataGet"></a>
# **researchV30RankingDataGet**
> List&lt;KeywordResearchRankingData&gt; researchV30RankingDataGet(campaignId, keywords, domains, limit, offset, orderBy, orderDirection)

Get Ranking Data

This endpoint returns the SERP, search, and ranking data for the keywords specified in the request, for both your campaign website and the specified domains or URLs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. 
List<String> keywords = Arrays.asList("keywords_example"); // List<String> | A comma-separated list of keyword phrases that you want to return data for.
String domains = "domains_example"; // String | A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  `rank`  `rank_trend`  If you do not specify an `order_by`parameter, the API will sort the data by `rank` by default.
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If you do not specify an `order_direction`, the default is `asc`.
try {
    List<KeywordResearchRankingData> result = apiInstance.researchV30RankingDataGet(campaignId, keywords, domains, limit, offset, orderBy, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30RankingDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.  |
 **keywords** | [**List&lt;String&gt;**](String.md)| A comma-separated list of keyword phrases that you want to return data for. |
 **domains** | **String**| A comma-separated list of domains for which you want to return the ranking data. The maximum number of domains allowed is 10. |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  If you do not specify an &#x60;order_by&#x60;parameter, the API will sort the data by &#x60;rank&#x60; by default. | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]

### Return type

[**List&lt;KeywordResearchRankingData&gt;**](KeywordResearchRankingData.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="researchV30RelatedKeywordsGet"></a>
# **researchV30RelatedKeywordsGet**
> List&lt;TopicKeywordDetail&gt; researchV30RelatedKeywordsGet(campaignId, keyword, limit, offset, orderBy, orderDirection, search)

Get Related Keywords

This endpoint returns the SERP, search, and your ranking data of the related keywords for a specified keyword (topic).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String keyword = "keyword_example"; // String | The topic for which you want to return related keywords' data.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  `connection_strength`  `search_volume`  `year-over-year`  `rank`  `rank_trend`  `percentage_clicks`  If not otherwise specified, the returned data will be sorted by `connection_strength` by default.
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If you do not specify an `order_direction`, the default is `asc`.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing. 
try {
    List<TopicKeywordDetail> result = apiInstance.researchV30RelatedKeywordsGet(campaignId, keyword, limit, offset, orderBy, orderDirection, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30RelatedKeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **keyword** | **String**| The topic for which you want to return related keywords&#x27; data. |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;connection_strength&#x60;  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term. The search parameter is case-insensitive, allowing partial matches irrespective of casing.  | [optional]

### Return type

[**List&lt;TopicKeywordDetail&gt;**](TopicKeywordDetail.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="researchV30TopicOverviewGet"></a>
# **researchV30TopicOverviewGet**
> TopicsOverview researchV30TopicOverviewGet(campaignId, keyword)

Get Topic Overview

This endpoint returns the overall aggregated search, SERP, and your website&#x27;s Visibility data for all the related keywords of a specified keyword (topic). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordResearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordResearchApi apiInstance = new KeywordResearchApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String keyword = "keyword_example"; // String | The topic for which you want to return related keywords' data.
try {
    TopicsOverview result = apiInstance.researchV30TopicOverviewGet(campaignId, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordResearchApi#researchV30TopicOverviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **keyword** | **String**| The topic for which you want to return related keywords&#x27; data. |

### Return type

[**TopicsOverview**](TopicsOverview.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

