# TopicKeywordDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **String** | The exact keyword phrase for the returned related keyword. |  [optional]
**connectionStrength** | **Integer** | The strength of the connection between the related keyword returned and the topic specified, in a range from 1 to 5, where 5 is a very strong connection. |  [optional]
**searchData** | [**ResearchSearchData**](ResearchSearchData.md) |  |  [optional]
**rankingData** | [**ResearchRankingData**](ResearchRankingData.md) |  |  [optional]
**serpData** | [**ResearchSerpData**](ResearchSerpData.md) |  |  [optional]
**trackedKeywordId** | **Integer** | The unique ID used to identify and reference the keyword in the system. Returned only if the keyword is tracked in the SEOmonitor campaign. It can be stored and used in other endpoints for filtering. |  [optional]
