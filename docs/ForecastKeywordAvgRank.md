# ForecastKeywordAvgRank

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialRank** | **Integer** | The initial rank of the keyword for the month when the scenario was created. |  [optional]
**actualRank** | **Integer** | The latest rank of the keyword on the day the data is returned. Returns empty if the scenario is not set as an Objective. |  [optional]
**estimatedRank** | **Integer** | The estimated rank of the keyword for the month when the data is returned. If the Target Rank Range parameter is enabled for the Scenario or Objective, this is the value for the lower (worst) target rank. |  [optional]
**estimatedRankBestTarget** | **Integer** | If the Target Rank Range parameter is enabled for the Scenario or Objective, this is the value for the higher (best) target rank. If not enabled, this parameter will return empty. |  [optional]
**targetRank** | **Integer** | The targetted rank of the keyword for the last month of the timeframe. If the Target Rank Range parameter is enabled for the Scenario or Objective, this is the value for the lower (worst) target rank. |  [optional]
**targetRankBest** | **Integer** | If the Target Rank Range parameter is enabled for the Scenario or Objective, this is the value for the higher (best) target rank. If not enabled, this parameter will return empty. |  [optional]
