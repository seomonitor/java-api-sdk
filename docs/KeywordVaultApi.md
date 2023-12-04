# KeywordVaultApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordVaultV30GetKeywordDataByListGet**](KeywordVaultApi.md#keywordVaultV30GetKeywordDataByListGet) | **GET** /keyword-vault/v3.0/get-keyword-data-by-list | Get Keyword Data by List
[**keywordVaultV30GetOverviewDataGet**](KeywordVaultApi.md#keywordVaultV30GetOverviewDataGet) | **GET** /keyword-vault/v3.0/get-overview-data | Get Overview Data

<a name="keywordVaultV30GetKeywordDataByListGet"></a>
# **keywordVaultV30GetKeywordDataByListGet**
> KeywordVaultGetKeywordDataByList keywordVaultV30GetKeywordDataByListGet(campaignId, list, limit, offset, orderBy, orderDirection, search)

Get Keyword Data by List

This endpoint returns the SERP, search and ranking data for the keywords in a specified list within the Keyword Vault of a specified campaign. The ranking data is for both the website tracked in the specified SEOmonitor campaign and for the specified competitor websites.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordVaultApi apiInstance = new KeywordVaultApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String list = "list_example"; // String | The name of the list created in the Keyword Vault for which you want to return keyword data.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  `search_volume`  `year-over-year`  `rank`  `rank_trend`  `percentage_clicks`  If not otherwise specified, the returned data will be sorted by `connection_strength` by default.
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If you do not specify an `order_direction`, the default is `asc`.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. 
try {
    KeywordVaultGetKeywordDataByList result = apiInstance.keywordVaultV30GetKeywordDataByListGet(campaignId, list, limit, offset, orderBy, orderDirection, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordVaultApi#keywordVaultV30GetKeywordDataByListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **list** | **String**| The name of the list created in the Keyword Vault for which you want to return keyword data. |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  &#x60;search_volume&#x60;  &#x60;year-over-year&#x60;  &#x60;rank&#x60;  &#x60;rank_trend&#x60;  &#x60;percentage_clicks&#x60;  If not otherwise specified, the returned data will be sorted by &#x60;connection_strength&#x60; by default. | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.  | [optional]

### Return type

[**KeywordVaultGetKeywordDataByList**](KeywordVaultGetKeywordDataByList.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keywordVaultV30GetOverviewDataGet"></a>
# **keywordVaultV30GetOverviewDataGet**
> KeywordVaultGetOverviewData keywordVaultV30GetOverviewDataGet(campaignId, list)

Get Overview Data

This endpoint returns the overall aggregated search, SERP, and Visibility data for all the keywords of a specified list in the Keyword Vault.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeywordVaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

KeywordVaultApi apiInstance = new KeywordVaultApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
String list = "list_example"; // String | The name of the list created in the Keyword Vault for which you want to return keyword data.
try {
    KeywordVaultGetOverviewData result = apiInstance.keywordVaultV30GetOverviewDataGet(campaignId, list);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeywordVaultApi#keywordVaultV30GetOverviewDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **list** | **String**| The name of the list created in the Keyword Vault for which you want to return keyword data. |

### Return type

[**KeywordVaultGetOverviewData**](KeywordVaultGetOverviewData.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

