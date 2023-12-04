# KeywordsImportStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateStart** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the import task was started. |  [optional]
**dateDone** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the import task was completed. It returns &#x27;N/A&#x27; if the task is still in progress. |  [optional]
**imported** | **Integer** | The number of keywords that have been successfully imported so far. |  [optional]
**processing** | **Integer** | The number of keywords still being processed and imported. |  [optional]
