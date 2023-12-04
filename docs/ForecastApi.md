# ForecastApi

All URIs are relative to *https://apix.seomonitor.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forecastV30KeywordsGet**](ForecastApi.md#forecastV30KeywordsGet) | **GET** /forecast/v3.0/keywords | Get Forecast keywords
[**forecastV30ObjectiveGet**](ForecastApi.md#forecastV30ObjectiveGet) | **GET** /forecast/v3.0/objective | Get Forecast objective Data
[**forecastV30ScenarioGet**](ForecastApi.md#forecastV30ScenarioGet) | **GET** /forecast/v3.0/scenario | Get Forecast scenario Data
[**forecastV30ScenariosGet**](ForecastApi.md#forecastV30ScenariosGet) | **GET** /forecast/v3.0/scenarios | Get Forecast scenarios

<a name="forecastV30KeywordsGet"></a>
# **forecastV30KeywordsGet**
> List&lt;ForecastKeywords&gt; forecastV30KeywordsGet(campaignId, forecastId, limit, offset)

Get Forecast keywords

This endpoint returns the forecast data for the keywords included in the Forecast Scenario or Objective, including keyword data, target rank data, and additional traffic data, for the forecast timeframe.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ForecastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

ForecastApi apiInstance = new ForecastApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
Integer forecastId = 56; // Integer | This parameter specifies the ID of the Forecast scenario set as an Objective for which you want to return data.   Please refer to the 'Quick Start Guide'  to retrieve the ID of your scenarios. 
Integer limit = 56; // Integer | This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a `limit`, the default number of records returned per request will be 100.
Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
try {
    List<ForecastKeywords> result = apiInstance.forecastV30KeywordsGet(campaignId, forecastId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForecastApi#forecastV30KeywordsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **forecastId** | **Integer**| This parameter specifies the ID of the Forecast scenario set as an Objective for which you want to return data.   Please refer to the &#x27;Quick Start Guide&#x27;  to retrieve the ID of your scenarios.  |
 **limit** | **Integer**| This parameter determines the maximum number of records to return in a single request.   Maximum Value: 1000 records per request   If you do not specify a &#x60;limit&#x60;, the default number of records returned per request will be 100. | [optional]
 **offset** | **Integer**| This parameter specifies the starting point within the collection of resource results. It&#x27;s typically used with the &#x60;limit&#x60; parameter to implement pagination.  If you do not specify an &#x60;offset&#x60;, the API will start from the first record. | [optional]

### Return type

[**List&lt;ForecastKeywords&gt;**](ForecastKeywords.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forecastV30ObjectiveGet"></a>
# **forecastV30ObjectiveGet**
> ForecastObjectiveData forecastV30ObjectiveGet(campaignId, forecastId)

Get Forecast objective Data

This endpoint returns the data of Forecast Scenarios set as Objectives, including the SEO goal and configuration parameters, the forecast results overview data, and the monthly actual and estimated results for the forecast timeframe.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ForecastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

ForecastApi apiInstance = new ForecastApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
Integer forecastId = 56; // Integer | This parameter specifies the ID of the Forecast scenario for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your Forecast scenarios. 
try {
    ForecastObjectiveData result = apiInstance.forecastV30ObjectiveGet(campaignId, forecastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForecastApi#forecastV30ObjectiveGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **forecastId** | **Integer**| This parameter specifies the ID of the Forecast scenario for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your Forecast scenarios.  |

### Return type

[**ForecastObjectiveData**](ForecastObjectiveData.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forecastV30ScenarioGet"></a>
# **forecastV30ScenarioGet**
> ForecastScenarioData forecastV30ScenarioGet(campaignId, forecastId)

Get Forecast scenario Data

This endpoint returns the data of Forecast Scenarios created in a specified campaign, including the scenario details, the SEO goal and configuration parameters, the forecast results overview data, and the monthly estimated results for the forecast timeframe.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ForecastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

ForecastApi apiInstance = new ForecastApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
Integer forecastId = 56; // Integer | This parameter specifies the ID of the Forecast scenario for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your Forecast scenarios.  To get data for the Campaign Objective, use the 'Get Forecast Objective Data'. 
try {
    ForecastScenarioData result = apiInstance.forecastV30ScenarioGet(campaignId, forecastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForecastApi#forecastV30ScenarioGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |
 **forecastId** | **Integer**| This parameter specifies the ID of the Forecast scenario for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your Forecast scenarios.  To get data for the Campaign Objective, use the &#x27;Get Forecast Objective Data&#x27;.  |

### Return type

[**ForecastScenarioData**](ForecastScenarioData.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forecastV30ScenariosGet"></a>
# **forecastV30ScenariosGet**
> Scenarios forecastV30ScenariosGet(campaignId)

Get Forecast scenarios

This endpoint returns a list of Scenarios created in a specified campaign, including the Objective if one is set, and their details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ForecastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: AuthorizationToken
ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
AuthorizationToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//AuthorizationToken.setApiKeyPrefix("Token");

ForecastApi apiInstance = new ForecastApi();
Integer campaignId = 56; // Integer | This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns.
try {
    Scenarios result = apiInstance.forecastV30ScenariosGet(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ForecastApi#forecastV30ScenariosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Integer**| This parameter specifies the ID of the campaign for which you want to return data.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |

### Return type

[**Scenarios**](Scenarios.md)

### Authorization

[AuthorizationToken](../README.md#AuthorizationToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

