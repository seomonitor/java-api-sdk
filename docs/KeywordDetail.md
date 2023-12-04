# KeywordDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywordId** | **Integer** | The unique ID used to identify and reference the keyword in the system. It can be stored and used in other endpoints for filtering. |  [optional]
**keyword** | **String** | The exact keyword phrase. |  [optional]
**mainKeywordId** | **Integer** | The ID of the main keyword, if the current keyword is aggregated under another keyword as its close variation. |  [optional]
**searchIntent** | **String** | The search intent of the keyword.  Possible values: &#x60;informational&#x60;, &#x60;commercial&#x60;, or &#x60;transactional&#x60;. |  [optional]
**labels** | **String** | The label associated with the keyword, either manually or automatically applied, that indicate specific attributes or characteristics of a keyword.  Possible values: automatic labels: &#x60;misspelled&#x60;, &#x60;low relevance&#x60;, &#x60;brands&#x60;, &#x60;localized&#x60;. for keywords labeled as &#x60;seasonal&#x60; in the platform, the endpoint will return one of the following possible values: &#x60;in_full_season&#x60;, &#x60;out_of_season&#x60;, &#x60;season_approaching&#x60;. custom labels: User-defined label name.  |  [optional]
**groups** | **String** | The group_ids of the groups this keyword is included in. |  [optional]
**serpData** | [**KeywordSerpData**](KeywordSerpData.md) |  |  [optional]
**searchData** | [**SearchData**](SearchData.md) |  |  [optional]
**rankingData** | [**KeywordRankingData**](KeywordRankingData.md) |  |  [optional]
**landingPages** | [**KeywordLandingPages**](KeywordLandingPages.md) |  |  [optional]
**trafficData** | [**KeywordTrafficData**](KeywordTrafficData.md) |  |  [optional]
**opportunity** | [**Opportunity**](Opportunity.md) |  |  [optional]
