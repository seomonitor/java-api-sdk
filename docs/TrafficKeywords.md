# TrafficKeywords

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **String** | The exact keyword phrase for which traffic data is returned. |  [optional]
**trackedKeywordId** | **Integer** | The unique ID used to identify and reference the keyword in the system. Returned only if the keyword is tracked in the SEOmonitor campaign. It can be stored and used in other endpoints for filtering. |  [optional]
**brand** | **Boolean** | Whether the keyword is a brand name. |  [optional]
**currentPage** | **String** | The current landing page that ranks for the keyword, irrespective of the specified timeframe. |  [optional]
**gscData** | [**GscData**](GscData.md) |  |  [optional]
**analyticsData** | [**AnalyticsData**](AnalyticsData.md) |  |  [optional]
