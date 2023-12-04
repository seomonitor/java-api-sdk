# TrafficOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | The date for which the traffic data is being returned, in YYYY-MM-DD format. |  [optional]
**sessions** | **Integer** | The sum of sessions for the specified traffic segment, if the campaign is connected to both Google Search Console and Google Analytics – or clicks, if the campaign is only connected to Google Search Console, on the date within the selected timeframe. |  [optional]
**ecommerce** | [**TrafficEcommerce**](TrafficEcommerce.md) |  |  [optional]
**goals** | [**TrafficGoals**](TrafficGoals.md) |  |  [optional]
**bounceRate** | [**BigDecimal**](BigDecimal.md) | The percentage of single-page sessions for the website segment on the specified date. |  [optional]
