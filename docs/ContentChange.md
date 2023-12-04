# ContentChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**element** | **String** | The type of HTML element on the landing page. Types are Title, H1, H2, H3, H4, H5, H6 or BODY |  [optional]
**stateFrom** | **String** | The keyword occurrences status in the previous element content. States are missing, not-present, partialy-present or fully-present |  [optional]
**stateTo** | **String** | The keyword occurrences status in the current element content. States are missing, not-present, partialy-present or fully-present |  [optional]
**contentFrom** | **String** | The previous content of the element |  [optional]
**contentTo** | **String** | The current content of the element |  [optional]
**fullOccurences** | **Integer** | This indicates if there are fully present keywords in the HTML element |  [optional]
**partialOccurences** | **Integer** | This indicates if there are partially present keywords in the HTML element |  [optional]
**fullOccurencesChange** | **Integer** | This is the difference between previous fully present occurrences count and the current fully present occurrences count in the element |  [optional]
**partialOccurencesChange** | **Integer** | This is the difference between previous partially present occurrences count and the current partially present occurrences count in the element |  [optional]
**wordsFrom** | **Integer** | The total number of words in the previous content of the BODY element. This is only applicable to BODY element |  [optional]
**wordsTo** | **Integer** | The total number of words in the current content of the BODY element. This is only applicable to BODY element |  [optional]
**percentageChange** | [**BigDecimal**](BigDecimal.md) | The percentage change of the content in the BODY element. This is only applicable to BODY element |  [optional]
