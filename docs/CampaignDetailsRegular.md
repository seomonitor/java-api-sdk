# CampaignDetailsRegular

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignInfo** | [**CampaignInfo**](CampaignInfo.md) |  |  [optional]
**visibility** | [**CampaignVisibility**](CampaignVisibility.md) |  |  [optional]
**multipleLocations** | **List&lt;Object&gt;** | Parent field containing data for the additional tracked locations of the campaign. |  [optional]
**healthStatus** | **String** | The health status of the campaign.  Possible values: &#x60;poor&#x60;, &#x60;average&#x60;, &#x60;healthy&#x60;.  |  [optional]
**objectiveStatus** | [**Objective**](Objective.md) |  |  [optional]
**reportingStatus** | **String** | The reporting status for the current month.  Possible values:   &#x60;pending&#x60;: The default status of the report at the beginning of the month.  &#x60;overdue&#x60;: If the report is not submitted by the due date set.  &#x60;in_progress&#x60;: If someone started working on the report in Google Slides.  &#x60;submitted&#x60;: If the report has been uploaded or finalized in Google Slides.  &#x60;inactive&#x60;: If the report tracking is turned off for the campaign.  |  [optional]
**accountManager** | **String** | The first and last name of the user assigned as the Account Manager of the campaign. |  [optional]
