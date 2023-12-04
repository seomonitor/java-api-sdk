# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **Integer** | The unique identifier for the keyword group. It can be used to reference the group in other endpoints. |  [optional]
**name** | **String** | The name of the group. |  [optional]
**type** | **String** | Indicates the type of group - either a regular group, a folder for organizing groups, or smart group based on rules.   Possible values are &#x60;group&#x60;, &#x60;folder&#x60;, or &#x60;smart_group&#x60;. |  [optional]
**subgroups** | [**List&lt;Group&gt;**](Group.md) | Parent field containing subgroup objects if the group type is &#x60;folder&#x60;.  |  [optional]
