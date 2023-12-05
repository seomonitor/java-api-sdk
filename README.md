## Overview

SEOmonitor API Documentation
- API version: 3.0.0
- 
For more information, please visit [https://www.seomonitor.com/](https://www.seomonitor.com/)

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CampaignsApi;

import java.io.File;
import java.util.*;

public class CampaignsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: AuthorizationToken
        ApiKeyAuth AuthorizationToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationToken");
        AuthorizationToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //AuthorizationToken.setApiKeyPrefix("Token");

        CampaignsApi apiInstance = new CampaignsApi();
        String campaignIds = "campaignIds_example"; // String | The Tracked Campaigns IDs for which you want the data to be returned.  Please refer to the Quick Start Guide to learn how to retrieve your campaign IDs.  If you do not specify `campaign_ids`, the endpoint will return the data for all active Tracked Campaigns you have access to, across all company accounts.
        Integer companyId = 56; // Integer | The ID of the subscription that contains the Tracked Campaigns for which you want to return data. This is useful for users who have access to multiple company accounts.  Please refer to the Quick Start Guide to learn how to retrieve your company IDs.  If you don't specify a `company_id`, the endpoint will return the data for all Tracked Campaigns you have access to, across all company accounts.
        Integer limit = 56; // Integer | The maximum number of Tracked Campaigns to return data for.   Maximum Value: 100 records per request  If you do not specify a `limit`, the default number of records returned per request will be 10.
        Integer offset = 56; // Integer | This parameter specifies the starting point within the collection of resource results. It's typically used with the `limit` parameter to implement pagination.  If you do not specify an `offset`, the API will start from the first record.
        try {
            List<CampaignDetailsRegular> result = apiInstance.dashboardV30CampaignsTrackedGet(campaignIds, companyId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#dashboardV30CampaignsTrackedGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://apix.seomonitor.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignsApi* | [**dashboardV30CampaignsTrackedGet**](docs/CampaignsApi.md#dashboardV30CampaignsTrackedGet) | **GET** /dashboard/v3.0/campaigns/tracked | Get Tracked Campaigns
*ForecastApi* | [**forecastV30KeywordsGet**](docs/ForecastApi.md#forecastV30KeywordsGet) | **GET** /forecast/v3.0/keywords | Get Forecast keywords
*ForecastApi* | [**forecastV30ObjectiveGet**](docs/ForecastApi.md#forecastV30ObjectiveGet) | **GET** /forecast/v3.0/objective | Get Forecast objective Data
*ForecastApi* | [**forecastV30ScenarioGet**](docs/ForecastApi.md#forecastV30ScenarioGet) | **GET** /forecast/v3.0/scenario | Get Forecast scenario Data
*ForecastApi* | [**forecastV30ScenariosGet**](docs/ForecastApi.md#forecastV30ScenariosGet) | **GET** /forecast/v3.0/scenarios | Get Forecast scenarios
*KeywordResearchApi* | [**researchV30DomainOverviewGet**](docs/KeywordResearchApi.md#researchV30DomainOverviewGet) | **GET** /research/v3.0/domain-overview | Get URL/Domain Overview
*KeywordResearchApi* | [**researchV30DomainRankingKeywordsGet**](docs/KeywordResearchApi.md#researchV30DomainRankingKeywordsGet) | **GET** /research/v3.0/domain-ranking-keywords | Get Ranking Keywords
*KeywordResearchApi* | [**researchV30KeywordsGet**](docs/KeywordResearchApi.md#researchV30KeywordsGet) | **GET** /research/v3.0/keywords | Get Keyword Data
*KeywordResearchApi* | [**researchV30RankingDataGet**](docs/KeywordResearchApi.md#researchV30RankingDataGet) | **GET** /research/v3.0/ranking-data | Get Ranking Data
*KeywordResearchApi* | [**researchV30RelatedKeywordsGet**](docs/KeywordResearchApi.md#researchV30RelatedKeywordsGet) | **GET** /research/v3.0/related-keywords | Get Related Keywords
*KeywordResearchApi* | [**researchV30TopicOverviewGet**](docs/KeywordResearchApi.md#researchV30TopicOverviewGet) | **GET** /research/v3.0/topic-overview | Get Topic Overview
*KeywordVaultApi* | [**keywordVaultV30GetKeywordDataByListGet**](docs/KeywordVaultApi.md#keywordVaultV30GetKeywordDataByListGet) | **GET** /keyword-vault/v3.0/get-keyword-data-by-list | Get Keyword Data by List
*KeywordVaultApi* | [**keywordVaultV30GetOverviewDataGet**](docs/KeywordVaultApi.md#keywordVaultV30GetOverviewDataGet) | **GET** /keyword-vault/v3.0/get-overview-data | Get Overview Data
*OrganicTrafficApi* | [**organicTrafficV30DailyTrafficGet**](docs/OrganicTrafficApi.md#organicTrafficV30DailyTrafficGet) | **GET** /organic-traffic/v3.0/daily-traffic | Get Daily Traffic Data by Segment
*OrganicTrafficApi* | [**organicTrafficV30KeywordsGet**](docs/OrganicTrafficApi.md#organicTrafficV30KeywordsGet) | **GET** /organic-traffic/v3.0/keywords | Get Traffic Data by Keywords
*RankTrackerApi* | [**rankTrackerV30DailyShareOfClicksGet**](docs/RankTrackerApi.md#rankTrackerV30DailyShareOfClicksGet) | **GET** /rank-tracker/v3.0/daily-share-of-clicks | Get Daily Share of Clicks
*RankTrackerApi* | [**rankTrackerV30GroupsDailyVisibilityGet**](docs/RankTrackerApi.md#rankTrackerV30GroupsDailyVisibilityGet) | **GET** /rank-tracker/v3.0/groups/daily-visibility | Get Daily Group Visibility
*RankTrackerApi* | [**rankTrackerV30GroupsDataGet**](docs/RankTrackerApi.md#rankTrackerV30GroupsDataGet) | **GET** /rank-tracker/v3.0/groups/data | Get Groups Data
*RankTrackerApi* | [**rankTrackerV30GroupsGet**](docs/RankTrackerApi.md#rankTrackerV30GroupsGet) | **GET** /rank-tracker/v3.0/groups | Get Groups List
*RankTrackerApi* | [**rankTrackerV30KeywordsCompetitionGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsCompetitionGet) | **GET** /rank-tracker/v3.0/keywords/competition | Get Keywords Competition Data
*RankTrackerApi* | [**rankTrackerV30KeywordsDailyRanksGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsDailyRanksGet) | **GET** /rank-tracker/v3.0/keywords/daily-ranks | Get Daily Keyword Ranks
*RankTrackerApi* | [**rankTrackerV30KeywordsGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsGet) | **GET** /rank-tracker/v3.0/keywords | Get Keyword Data
*RankTrackerApi* | [**rankTrackerV30KeywordsImportPost**](docs/RankTrackerApi.md#rankTrackerV30KeywordsImportPost) | **POST** /rank-tracker/v3.0/keywords/import | Add New Keywords
*RankTrackerApi* | [**rankTrackerV30KeywordsImportStatusGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsImportStatusGet) | **GET** /rank-tracker/v3.0/keywords/import-status | Get Keywords Import Status
*RankTrackerApi* | [**rankTrackerV30KeywordsRankingPagesGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsRankingPagesGet) | **GET** /rank-tracker/v3.0/keywords/ranking-pages | Get Ranking Pages
*RankTrackerApi* | [**rankTrackerV30KeywordsSerpFeaturePresenceGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsSerpFeaturePresenceGet) | **GET** /rank-tracker/v3.0/keywords/serp-feature-presence | Get Daily SERP Feature Presence
*RankTrackerApi* | [**rankTrackerV30KeywordsTopResultsGet**](docs/RankTrackerApi.md#rankTrackerV30KeywordsTopResultsGet) | **GET** /rank-tracker/v3.0/keywords/top-results | Get Top 100 Results

## Documentation for Models

 - [AddCampaignPostBody](docs/AddCampaignPostBody.md)
 - [AddKeywords](docs/AddKeywords.md)
 - [AnalyticsData](docs/AnalyticsData.md)
 - [BestRank](docs/BestRank.md)
 - [CampaignDetailsRegular](docs/CampaignDetailsRegular.md)
 - [CampaignInfo](docs/CampaignInfo.md)
 - [CampaignVisibility](docs/CampaignVisibility.md)
 - [CampaignVisibilityTimeframes](docs/CampaignVisibilityTimeframes.md)
 - [CompletionStatus30days](docs/CompletionStatus30days.md)
 - [CompletionStatusDateSessions](docs/CompletionStatusDateSessions.md)
 - [ContentChange](docs/ContentChange.md)
 - [ContentChanges](docs/ContentChanges.md)
 - [ContentLandingPageIssue](docs/ContentLandingPageIssue.md)
 - [DailyShareOfClicks](docs/DailyShareOfClicks.md)
 - [DifficultyValue](docs/DifficultyValue.md)
 - [DomainCompetitorRank](docs/DomainCompetitorRank.md)
 - [DomainCompetitorVisibility](docs/DomainCompetitorVisibility.md)
 - [DomainOverviewTraffic](docs/DomainOverviewTraffic.md)
 - [DomainOverviewVisibility](docs/DomainOverviewVisibility.md)
 - [DomainRankingKeywordsData](docs/DomainRankingKeywordsData.md)
 - [DomainRankingsData](docs/DomainRankingsData.md)
 - [DomainVisibility](docs/DomainVisibility.md)
 - [ForecastAdditionalTraffic](docs/ForecastAdditionalTraffic.md)
 - [ForecastAdsEquivalent](docs/ForecastAdsEquivalent.md)
 - [ForecastConfigConversionData](docs/ForecastConfigConversionData.md)
 - [ForecastConfiguration](docs/ForecastConfiguration.md)
 - [ForecastKeywordAdditionalTraffic](docs/ForecastKeywordAdditionalTraffic.md)
 - [ForecastKeywordAvgRank](docs/ForecastKeywordAvgRank.md)
 - [ForecastKeywordData](docs/ForecastKeywordData.md)
 - [ForecastKeywords](docs/ForecastKeywords.md)
 - [ForecastMonthlyForecastTrafficSessions](docs/ForecastMonthlyForecastTrafficSessions.md)
 - [ForecastMonthlyForecasts](docs/ForecastMonthlyForecasts.md)
 - [ForecastMonthlyForecastsTraffic](docs/ForecastMonthlyForecastsTraffic.md)
 - [ForecastObjectiveData](docs/ForecastObjectiveData.md)
 - [ForecastObjectiveDetails](docs/ForecastObjectiveDetails.md)
 - [ForecastOverviewData](docs/ForecastOverviewData.md)
 - [ForecastOverviewInertialTraffic](docs/ForecastOverviewInertialTraffic.md)
 - [ForecastScenarioData](docs/ForecastScenarioData.md)
 - [ForecastScenarioSearchData](docs/ForecastScenarioSearchData.md)
 - [ForecastSeoGoal](docs/ForecastSeoGoal.md)
 - [ForecastTargetAvgRank](docs/ForecastTargetAvgRank.md)
 - [ForecastTargetAvgVisibility](docs/ForecastTargetAvgVisibility.md)
 - [ForecastTargetData](docs/ForecastTargetData.md)
 - [ForecastTrafficConversions](docs/ForecastTrafficConversions.md)
 - [ForecastTrafficEstimatedAvgRanks](docs/ForecastTrafficEstimatedAvgRanks.md)
 - [ForecastTrafficRevenue](docs/ForecastTrafficRevenue.md)
 - [ForecastTrafficVisibility](docs/ForecastTrafficVisibility.md)
 - [Group](docs/Group.md)
 - [GroupDailyVisibility](docs/GroupDailyVisibility.md)
 - [GroupDetails](docs/GroupDetails.md)
 - [GroupDetailsVisibility](docs/GroupDetailsVisibility.md)
 - [GroupKeywordCounters](docs/GroupKeywordCounters.md)
 - [GroupsAvgRank](docs/GroupsAvgRank.md)
 - [GroupsDesktopVisibility](docs/GroupsDesktopVisibility.md)
 - [GroupsDetailsKeywordsCounters](docs/GroupsDetailsKeywordsCounters.md)
 - [GroupsFeatureVisibility](docs/GroupsFeatureVisibility.md)
 - [GroupsImportPostBody](docs/GroupsImportPostBody.md)
 - [GroupsMobileVisibility](docs/GroupsMobileVisibility.md)
 - [GroupsOpportunity](docs/GroupsOpportunity.md)
 - [GroupsSearchData](docs/GroupsSearchData.md)
 - [GroupsSearchIntent](docs/GroupsSearchIntent.md)
 - [GroupsSerpData](docs/GroupsSerpData.md)
 - [GroupsSerpMobileDesktop](docs/GroupsSerpMobileDesktop.md)
 - [GroupsTrafficData](docs/GroupsTrafficData.md)
 - [GroupsVisibility](docs/GroupsVisibility.md)
 - [GroupsVolumeByDevice](docs/GroupsVolumeByDevice.md)
 - [GscData](docs/GscData.md)
 - [KeywordCanibalizationLandingPageChange](docs/KeywordCanibalizationLandingPageChange.md)
 - [KeywordCanibalizationOnDate](docs/KeywordCanibalizationOnDate.md)
 - [KeywordCanibalizationRankData](docs/KeywordCanibalizationRankData.md)
 - [KeywordCompetition](docs/KeywordCompetition.md)
 - [KeywordCompetitorRankingData](docs/KeywordCompetitorRankingData.md)
 - [KeywordDailyRank](docs/KeywordDailyRank.md)
 - [KeywordDailyRankingData](docs/KeywordDailyRankingData.md)
 - [KeywordDailyRanks](docs/KeywordDailyRanks.md)
 - [KeywordDetail](docs/KeywordDetail.md)
 - [KeywordLandingPages](docs/KeywordLandingPages.md)
 - [KeywordRankTrend](docs/KeywordRankTrend.md)
 - [KeywordRankingData](docs/KeywordRankingData.md)
 - [KeywordResearchRankingData](docs/KeywordResearchRankingData.md)
 - [KeywordSerpData](docs/KeywordSerpData.md)
 - [KeywordSerpFeature](docs/KeywordSerpFeature.md)
 - [KeywordSerpResult](docs/KeywordSerpResult.md)
 - [KeywordTrafficData](docs/KeywordTrafficData.md)
 - [KeywordTrafficEcommerce](docs/KeywordTrafficEcommerce.md)
 - [KeywordTrafficGoals](docs/KeywordTrafficGoals.md)
 - [KeywordVaultGetKeywordDataByList](docs/KeywordVaultGetKeywordDataByList.md)
 - [KeywordVaultGetOverviewData](docs/KeywordVaultGetOverviewData.md)
 - [KeywordsImportPostBody](docs/KeywordsImportPostBody.md)
 - [KeywordsImportStatus](docs/KeywordsImportStatus.md)
 - [LandingPages](docs/LandingPages.md)
 - [MonthlySearches](docs/MonthlySearches.md)
 - [Objective](docs/Objective.md)
 - [ObjectiveCompletionStatus](docs/ObjectiveCompletionStatus.md)
 - [Opportunity](docs/Opportunity.md)
 - [OverviewTrafficData](docs/OverviewTrafficData.md)
 - [RankingKeywords](docs/RankingKeywords.md)
 - [RankingPages](docs/RankingPages.md)
 - [ResearchDomainOverview](docs/ResearchDomainOverview.md)
 - [ResearchDomainRanking](docs/ResearchDomainRanking.md)
 - [ResearchKeywords](docs/ResearchKeywords.md)
 - [ResearchRankingData](docs/ResearchRankingData.md)
 - [ResearchSearchData](docs/ResearchSearchData.md)
 - [ResearchSerpData](docs/ResearchSerpData.md)
 - [ResearchSerpFeature](docs/ResearchSerpFeature.md)
 - [Scenarios](docs/Scenarios.md)
 - [SearchData](docs/SearchData.md)
 - [SearchesPercentagesByDevice](docs/SearchesPercentagesByDevice.md)
 - [SerpFeatuersCounter](docs/SerpFeatuersCounter.md)
 - [SerpFeaturePresence](docs/SerpFeaturePresence.md)
 - [SerpFeaturePresenceByDevice](docs/SerpFeaturePresenceByDevice.md)
 - [SerpFeaturePresenceSerpData](docs/SerpFeaturePresenceSerpData.md)
 - [ShareOfClicksDomains](docs/ShareOfClicksDomains.md)
 - [Top100Results](docs/Top100Results.md)
 - [TopResults](docs/TopResults.md)
 - [TopicKeywordDetail](docs/TopicKeywordDetail.md)
 - [TopicOverviewSerpData](docs/TopicOverviewSerpData.md)
 - [TopicOverviewSerpFeature](docs/TopicOverviewSerpFeature.md)
 - [TopicOverviewVisibility](docs/TopicOverviewVisibility.md)
 - [TopicsOverview](docs/TopicsOverview.md)
 - [TrafficEcommerce](docs/TrafficEcommerce.md)
 - [TrafficGoals](docs/TrafficGoals.md)
 - [TrafficKeywords](docs/TrafficKeywords.md)
 - [TrafficKeywordsEcommerce](docs/TrafficKeywordsEcommerce.md)
 - [TrafficKeywordsGoals](docs/TrafficKeywordsGoals.md)
 - [TrafficOverview](docs/TrafficOverview.md)
 - [TrafficUnallocated](docs/TrafficUnallocated.md)
 - [VisibilityDesktopMobile](docs/VisibilityDesktopMobile.md)
 - [WebsiteExplorerKeywordCompetitorData](docs/WebsiteExplorerKeywordCompetitorData.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### AuthorizationToken

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

customer.success@seomonitor.com
