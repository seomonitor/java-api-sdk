# CampaignsApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardV30CampaignsTrackedGet**](CampaignsApi.md#dashboardV30CampaignsTrackedGet) | **GET** /dashboard/v3.0/campaigns/tracked | Get Tracked Campaigns

<a name="dashboardV30CampaignsTrackedGet"></a>
# **dashboardV30CampaignsTrackedGet**
> List&lt;CampaignDetailsRegular&gt; dashboardV30CampaignsTrackedGet(campaignIds, companyId, limit, offset)

Get Tracked Campaigns

This endpoint returns a list of active Tracked Campaigns with their details, such as campaign_id, name, URL, keyword number, date created, account manager details, and Visibility data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String campaignIds = "campaignIds_example"; // String | The Tracked Campaigns IDs for which you want the data to be returned.  Please refer to the Quick Start Guide to learn how to retrieve your campaign IDs.  If you do not specify `campaign_ids`, the endpoint will return the data for all active Tracked Campaigns you have access to, across all company accounts.
Integer companyId = 56; // Integer | The ID of the subscription that contains the Tracked Campaigns for which you want to return data. This is useful for users who have access to multiple company accounts.  Please refer to the Quick Start Guide to learn how to retrieve your company IDs.  If you don't specify a `company_id`, the endpoint will return the data for all Tracked Campaigns you have access to, across all company accounts.
Integer limit = 56; // Integer | The maximum number of Tracked Campaigns to return data for.   Maximum Value: 100 records per request  If you do not specify a `limit`, the default number of records returned per request will be 10.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
try {
    List<CampaignDetailsRegular> result = apiInstance.dashboardV30CampaignsTrackedGet(campaignIds, companyId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#dashboardV30CampaignsTrackedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignIds** | **String**| The Tracked Campaigns IDs for which you want the data to be returned.  Please refer to the Quick Start Guide to learn how to retrieve your campaign IDs.  If you do not specify &#x60;campaign_ids&#x60;, the endpoint will return the data for all active Tracked Campaigns you have access to, across all company accounts. | [optional]
 **companyId** | **Integer**| The ID of the subscription that contains the Tracked Campaigns for which you want to return data. This is useful for users who have access to multiple company accounts.  Please refer to the Quick Start Guide to learn how to retrieve your company IDs.  If you don&#x27;t specify a &#x60;company_id&#x60;, the endpoint will return the data for all Tracked Campaigns you have access to, across all company accounts. | [optional]
 **limit** | **Integer**| The maximum number of Tracked Campaigns to return data for.   Maximum Value: 100 records per request  If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 10. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]

### Return type

[**List&lt;CampaignDetailsRegular&gt;**](CampaignDetailsRegular.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

