# OrganicTrafficApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organicTrafficV30DailyTrafficGet**](OrganicTrafficApi.md#organicTrafficV30DailyTrafficGet) | **GET** /organic-traffic/v3.0/daily-traffic | Get Daily Traffic Data by Segment
[**organicTrafficV30KeywordsGet**](OrganicTrafficApi.md#organicTrafficV30KeywordsGet) | **GET** /organic-traffic/v3.0/keywords | Get Traffic Data by Keywords

<a name="organicTrafficV30DailyTrafficGet"></a>
# **organicTrafficV30DailyTrafficGet**
> TrafficOverview organicTrafficV30DailyTrafficGet(campaignId, startDate, endDate, segment)

Get Daily Traffic Data by Segment

This endpoint returns the organic traffic metrics by day for a traffic segment over a specified timeframe.  The data returned includes the number of sessions, conversions, bounce rate, and revenue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganicTrafficApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

OrganicTrafficApi apiInstance = new OrganicTrafficApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
String segment = "segment_example"; // String | The name assigned to the segment in the platform. Accepted values are `all`, `non-brand`, `brand`, or the name of a custom traffic segment created in the SEOmonitor platform, e.g. \"blog\".  Unless otherwise specified, data will be returned for the Non-Brand segment by default.
try {
    TrafficOverview result = apiInstance.organicTrafficV30DailyTrafficGet(campaignId, startDate, endDate, segment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganicTrafficApi#organicTrafficV30DailyTrafficGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **segment** | **String**| The name assigned to the segment in the platform. Accepted values are &#x60;all&#x60;, &#x60;non-brand&#x60;, &#x60;brand&#x60;, or the name of a custom traffic segment created in the SEOmonitor platform, e.g. \&quot;blog\&quot;.  Unless otherwise specified, data will be returned for the Non-Brand segment by default. | [optional]

### Return type

[**TrafficOverview**](TrafficOverview.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organicTrafficV30KeywordsGet"></a>
# **organicTrafficV30KeywordsGet**
> TrafficKeywords organicTrafficV30KeywordsGet(campaignId, startDate, endDate, segment, limit, offset, orderBy, orderDirection, trackingStatus, search)

Get Traffic Data by Keywords

This endpoint returns the traffic data by keyword for a specific traffic segment and timeframe.  Note: This endpoint will return data only if SEOmonitor pulled Google Search Console and/or Google Analytics data for the selected timeframe through an active connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganicTrafficApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

OrganicTrafficApi apiInstance = new OrganicTrafficApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
LocalDate startDate = new LocalDate(); // LocalDate | This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
LocalDate endDate = new LocalDate(); // LocalDate | This parameter specifies the end date of the timeframe for which you want to return the data, in YYYY-MM-DD format.
String segment = "segment_example"; // String | The name assigned to the segment in the platform. Accepted values are `all`, `non-brand`, `brand`, or the name of a custom traffic segment created in the SEOmonitor platform, e.g. \"blog\".  Unless otherwise specified, data will be returned for the Non-Brand segment by default.
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
String orderBy = "orderBy_example"; // String | This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  - `avg_position`   - `sessions`  - `transactions`  - `goals`  - `transactions_revenue`  - `goals_revenue`   If you do not specify an `order_direction`, the default is `asc`, which means the API will sort the data in ascending order. 
String orderDirection = "orderDirection_example"; // String | This parameter determines the sorting direction of the `order_by` field. You can sort the data in either ascending (`asc`) or descending (`desc`) order.  If the `tracking_status` is not specified, data for all keywords is returned.
String trackingStatus = "trackingStatus_example"; // String | This parameter enables you to filter the results based on the keyword property of being tracked in the SEOmonitor platform. Allowed values are `tracked`, `untracked`, and `all`.  If the `tracking_status` is not specified, data for all keywords is returned.
String search = "search_example"; // String | The `search` parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing.
try {
    TrafficKeywords result = apiInstance.organicTrafficV30KeywordsGet(campaignId, startDate, endDate, segment, limit, offset, orderBy, orderDirection, trackingStatus, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganicTrafficApi#organicTrafficV30KeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **startDate** | **LocalDate**| This parameter specifies the start date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **endDate** | **LocalDate**| This parameter specifies the end date of the timeframe for which you want to return the data, in YYYY-MM-DD format. |
 **segment** | **String**| The name assigned to the segment in the platform. Accepted values are &#x60;all&#x60;, &#x60;non-brand&#x60;, &#x60;brand&#x60;, or the name of a custom traffic segment created in the SEOmonitor platform, e.g. \&quot;blog\&quot;.  Unless otherwise specified, data will be returned for the Non-Brand segment by default. | [optional]
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]
 **orderBy** | **String**| This parameter enables you to sort the returned data based on a specified field.  The field names you can use to sort data are:  - &#x60;avg_position&#x60;   - &#x60;sessions&#x60;  - &#x60;transactions&#x60;  - &#x60;goals&#x60;  - &#x60;transactions_revenue&#x60;  - &#x60;goals_revenue&#x60;   If you do not specify an &#x60;order_direction&#x60;, the default is &#x60;asc&#x60;, which means the API will sort the data in ascending order.  | [optional]
 **orderDirection** | **String**| This parameter determines the sorting direction of the &#x60;order_by&#x60; field. You can sort the data in either ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;) order.  If the &#x60;tracking_status&#x60; is not specified, data for all keywords is returned. | [optional]
 **trackingStatus** | **String**| This parameter enables you to filter the results based on the keyword property of being tracked in the SEOmonitor platform. Allowed values are &#x60;tracked&#x60;, &#x60;untracked&#x60;, and &#x60;all&#x60;.  If the &#x60;tracking_status&#x60; is not specified, data for all keywords is returned. | [optional]
 **search** | **String**| The &#x60;search&#x60; parameter allows you to filter the results based on a keyword search. The API will return only those records where the keyword matches (fully or partially) the provided search term.  The search parameter is case-insensitive, allowing partial matches irrespective of casing. | [optional]

### Return type

[**TrafficKeywords**](TrafficKeywords.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

