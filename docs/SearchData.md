# SearchData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**yearOverYear** | **Integer** | A numeric value representing the last month&#x27;s search volume divided by the search volume of the same month of the previous year. E.g. +49% year-over-year search trend would be represented as 1.49.  The returned values will be capped at 10, which represents \&quot;newcomers\&quot; (keywords that registered very low search volumes in the previous year). |  [optional]
**searchVolume** | **Integer** | The latest average 12-month search volume as provided by Google Ads. |  [optional]
**monthlySearches** | [**List&lt;MonthlySearches&gt;**](MonthlySearches.md) | An array of objects containing the search volumes for each of the previous 13 months as provided by Google Ads. |  [optional]
