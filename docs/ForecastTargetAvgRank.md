# ForecastTargetAvgRank

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialRank** | **Integer** | The average initial rank of the keywords included in the scenario, calculated for the month when the scenario was created. |  [optional]
**trend3months** | **Integer** | The average increase or drop in positions of the keywords in the scenario, over the previous 3 months up to the month the scenario was created, weighted by the keywords&#x27; search volume. |  [optional]
**targetRank** | **Integer** | The average target rank of the keywords in the Objective. If the &#x60;target_rank_range&#x60; parameter returns \&quot;true\&quot;, the &#x60;target_rank&#x60; is the lower (worst) average target rank. |  [optional]
**bestTargetRank** | **Integer** | If the &#x60;target_rank_range&#x60; parameter returns \&quot;true\&quot;, this parameter is the higher (best) average target rank. If the &#x60;target_rank_range&#x60; parameter returns \&quot;false\&quot;, this parameter will return empty. |  [optional]
