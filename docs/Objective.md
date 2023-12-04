# Objective

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The status of the Objective, based on the campaign performance.  Possible values: &#x60;on_track&#x60;, &#x60;behind&#x60;, &#x60;at_risk&#x60;. |  [optional]
**actualSessions** | **Double** | The non-brand organic traffic sessions recorded in the past 30 days. |  [optional]
**estimatedSessions** | **Integer** | The non-brand organic traffic sessions estimated to be obtained in the past 30 days, based on the SEO goal set up in the Forecast Objective. |  [optional]
**performance** | [**BigDecimal**](BigDecimal.md) | The campaign&#x27;s traffic performance over the past 30 days, calculated by dividing the actual non-brand organic traffic by the estimated traffic in the last 30 days. |  [optional]
**startMonth** | **String** | The first month of the forecast scenario that was set as an Objective. |  [optional]
**endMonth** | **String** | The last month of the forecast scenario that was set as an Objective.  |  [optional]
