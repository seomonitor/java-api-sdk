# KeywordsImportPostBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** | The ID of the campaign to which you want to add/import keywords.   Please refer to the Quick Start Guide to learn how to retrieve the IDs of your campaigns. |  [optional]
**keywords** | **String** | A comma-separated list of new keywords that you want to import into the campaign. E.g. &#x60;\&quot;christmas party dresses, christmas sweater, christmas jumpers\&quot;&#x60;.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your keywords. |  [optional]
**groupIds** | **String** | A comma-separated list of group IDs into which you want to import the keywords. E.g. &#x60;\&quot;199212, 1237564\&quot;&#x60;.  Please refer to the Quick Start Guide to learn how to retrieve the IDs of your groups.  If you don&#x27;t specify &#x60;group_ids&#x60;, the keywords will be added to an automatically-generated group (&#x60;API-import-YYYY-MM-DD&#x60;). |  [optional]
