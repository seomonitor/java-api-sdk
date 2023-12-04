/*
 * SEOmonitor API Documentation
 * `Introduction`  The SEOmonitor API allows you to programmatically access keyword ranking, traffic, and other SEO data from the SEOmonitor platform. You can use the API to build custom reports, automate workflows, and integrate SEOmonitor data into your own applications. The API enables free and unrestricted access to all your data in the platform, for all Tracked Campaigns. Additionally, it provides access to SEOmonitor's curated UK and US keyword database.   `Main Capabilities`  These are the main data sets you can retrieve with the API 3.0 endpoints:  `Campaign-level data`: Campaign details and campaign-wide keyword data, landing page data, groups data, traffic data, content opportunities data, forecast data, or campaign website research data.  `Keyword-level data`: Data for any and all keywords in the campaign, including ranking data, search data, SERP data, competitor data, SEO Opportunity, keyword-level traffic data, content optimization opportunities' data by keyword and keyword-level forecast projections data.  `Keyword group-level data`: Data for any keyword group in the campaign, including aggregated search and SERP data, website Visibility on specific groups, group SEO Opportunity data.  `Landing page-level data`: Data for specific landing pages that are ranking with the keywords in the campaign, including aggregated search and SERP data, SEO Opportunity, and landing page Visibility.  `Organic traffic data`: Data for the website's organic sessions, conversions, and revenue, including traffic data by segments (brand, non-brand, all traffic, and custom user-created traffic segments), by specific keywords and by specific landing pages.  `Keyword & website research data`: Data for any keyword in SEOmonitor's Research database – any domain-level aggregated search, SERP, and ranking data, and keyword-level and keyword list-level metrics, for the tracked website and for any competitor in top 100.  `Forecast data`: Overview data and details for specific Forecast Scenarios and Objectives, and keyword-level forecast data.  `Website content data`: Data related to content optimization opportunities of the tracked website, including landing page and keyword data for each of the content opportunities categories in SEOmonitor's Content Audit platform (Positive and negative correlations with Visibility, Cannibalization issues, Pages serving too many keywords, Keywords with missing pages, Suboptimal keyword inclusion in the title or H1 or page content, Pages with missing title or H1).   `Getting Started`  Log into your SEOmonitor account and retrieve your unique API Token (Account Settings > Edit Profile).  Check out the `quick start guide` to make your first API call.  Read through the `authentication guide` to learn how to properly authenticate your API requests.   `Libraries and SDKs`  SEOmonitor API uses HTTP protocol, which allows the application of our API to almost all programming languages. All the responses are returned in JSON format by default.  For convenience, we offer client libraries for popular programming languages:  JavaScript PHP Python Java   `Support`  Need help using the API, or have general inquiries? Please contact our support team.  For more information about the SEOmonitor platform, you can visit www.seomonitor.com.   `Changelog`      This is the first version of API 3.0. The Changelog page will be updated as we continue to develop new features and improvements.     `Quick Start Guide`  This guide will walk you through making your first API call.  `Get your API key`  First, you'll need to get an API key:      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Go to Account Settings > Edit Profile     3. Copy the API Token to use in your API requests  Note: Clicking `Regenerate API Token` will overwrite the current key and you will lose access if you or other users are currently using it.   `Make a request`  Next, we'll use cURL to make a request to get Tracked Campaigns details:      curl --request GET \\     --url https://apix.seomonitor.com/dashboard/v3.0/campaigns/tracked \\     --header 'Accept: application/json' \\     --header 'Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJzZW9tb25pdG9yLmNvbSIsImlhdCI6MTY1Mjc4NTcwNCwidXNlcl9pZCI6IjY2NTI5In0.2_l9e7ohs9QHbwmr48mIoEF-QxZHNPFiAzJbMk00jcA'  This will retrieve the Tracked Campaigns data for an SEOmonitor account having the following API Token:      'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJzZW9tb25pdG9yLmNvbSIsImlhdCI6MTY1Mjc4NTcwNCwidXNlcl9pZCI6IjY2NTI5In0.2_l9e7ohs9QHbwmr48mIoEF-QxZHNPFiAzJbMk00jcA'   Let's break down the parts of the request:      - `--request GET` - Make a GET request     - `--url` - The API endpoint URL     - `--header` - Adds the Authorization header with your API key   Handle the response  The API will return a JSON response like this:      {       \"campaign_info\": {         \"id\": \"74516\",         \"name\": \"Asos.com\",          \"company\": \"Asos\",         \"company_id\": \"51256\",         \"domain\": \"www.asos.com\",         \"keyword_count\": 588,          \"date_created\": \"2023-04-25\",         \"location\": \"United Kingdom\",         \"currency\": \"EUR\",         \"mrr\": 3000       },       \"visibility\": {         \"desktop\": {           \"latest\": 0.28,           \"trend_7days\": 0.2,           \"trend_30days\": 0.2         },         \"mobile\": {           \"latest\": 0.27,            \"trend_7days\": 0.2,           \"trend_30days\": 0.2         }       },       \"multiple_locations\": [         {           \"campaign_id\": 12746,           \"location\": \"London, United Kingdom\",           \"visibility\": {             \"desktop\": {               \"latest\": 0.32,               \"trend_7days\": 0.02               \"trend_30days: 0.1               },             \"mobile\": {               \"latest\": 0.33,               \"trend\": 0.03               \"trend_30days\": 0.1                 }             }           }         }       ],       \"health_status\": \"healthy\",       \"objective_status\": {         \"actual_sessions\": 78400,         \"estimated_sessions\": 78400,           \"performance\": 1,         \"status\": \"on_track\",         \"start_month\": \"Jun, 2023\",          \"end_month\": \"Jul, 2024\"       },       \"reporting_status\": \"submitted\",       \"account_manager\": \"Jo Hart\"     }  And that's it! You just made your first API call. Check out the rest of the API reference documentation to see what else you can build.  `Best practices`      - Keep your API key private – do not share your key publicly.     - Do not include your key directly in code that you distribute – use environment variables instead.     - Regenerate your key periodically for improved security.     - Limit API key access to only required endpoints if possible.  `Revoking API keys`  If your API key is compromised, you can revoke it by regenerating the API Token in your SEOmonitor Account Settings. This will immediately invalidate the current key so further requests can't be made.  For any other issues with authentication, contact our support team.   `Retrieve the IDs of the company, campaigns, keywords and keyword groups`  The unique IDs of your company, campaigns, keywords, or keyword groups can be retrieved either from the specific URLs of the platform, or from specific API endpoint responses. Further below you'll find details on these alternatives.   `Company ID`  The company ID can only be retrieved from the platform. Follow these steps:      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Go to Account Settings > Billing     3. In the Billing section, the platform URL contains the company ID.     E.g.: \"app.seomonitor.com/v2/account/company/51244/billing\" – in this example, the company ID is \"51244\"   `Campaign ID`  To retrieve the campaign ID from the platform, follow these steps:       1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign by clicking on its name in the Agency Dashboard.     3. By default, the campaign opens in the Rank Tracker view. The platform URL contains the company ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/0/desktop/keywords?timeframe=2023-09-04%3A2023-10-04\" – in this example, the campaign ID is \"72416\".  To retrieve the campaign ID through the API, make a call through the `Get Tracked Campaigns Details endpoint`. The response will contain the details of the requested Tracked Campaigns, including their IDs, which you can further use in other endpoint requests.   `Keyword ID`  To retrieve the keyword ID from the platform, follow these steps:       1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and click on the required keyword.     3. The platform URL for the keyword view (Keyword Sidebar) contains the keyword ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/0/desktop/keywords?timeframe=2023-09-04%3A2023-10-04&ksid=7063139\" – in this example, the keyword ID is \"7063139\"   To retrieve the keyword ID through the API, make a call through the `Get Keyword Data endpoint`. The response will contain the details of the requested keywords, including their IDs, which you can further use in other endpoint requests.   `Keyword Group ID`      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and click on the required keyword group (Groups side-menu).     3. The platform URL for the keyword group view contains the keyword ID.     E.g.: \"https://app.seomonitor.com/v2/72416/manage/strategy/69976/desktop/keywords?timeframe=2023-09-04%3A2023-10-04\" – in this example, the keyword group ID is \"69976\"  To retrieve the keyword group ID through the API, make a call through the `Get Groups List endpoint`. The response will contain the details of the requested keyword groups, including their IDs, which you can further use in other endpoint requests.   `Forecast ID for Scenarios or Objectives`      1. Log in to your SEOmonitor account (https://app.seomonitor.com)     2. Open the required campaign and go to Forecast from the main menu (top).     3. Select a Scenario or the Objective (if set). The platform URL for the specific scenario contains the forecast ID.     E.g.: \"https://app.seomonitor.com/v2/forecast/118794/3788\" – in this example, the forecast ID is \"3788\"   To retrieve the forecast ID through the API, make a call through the`Get Forecast Scenarios endpoint`. The response will contain the details of the requested Scenario or Objective, including their IDs, which you can further use in other endpoint requests.   `SERP Feature Abbreviations`  The returned data for some endpoints will contain SERP feature names in abbreviated form.  The returned values for SERP features are abbreviated as follows:      - \"adt\": Ads Pack Top     - \"def\": Definitions      - \"dir\": Directions      - \"fsn\": Featured Snippet      - \"flt\": Flights      - \"htl\": Hotels      - \"img\": Images Pack      - \"job\": Jobs      - \"kng\": Knowledge Graph      - \"geo\": Local Pack      - \"shp\": Product listing      - \"rcp\": Recipes      - \"qns\": Questions      - \"new\": Top Stories      - \"vid\": Video Carousel      - \"app\": Apps    `Rate Limits`  There are request limits in place to prevent abuse and ensure fair usage.   Exceeding the request limits will lead to HTTP 429 responses. If you need higher limits, contact our support team.   `Limits & Quotas`      -------------------------------------------------------------------------     |Limit                                    |  Number of requests              -------------------------------------------------------------------------     |Maximum requests per second              |  10                              -------------------------------------------------------------------------     |Maximum rows per request (Request Quota) |  1000                            -------------------------------------------------------------------------     |Daily Quota                              |  10 000                          -------------------------------------------------------------------------   `Exceeding Limits`  If you exceed the rate limits, you will receive a 429 Too Many Requests response.  Daily Quota Exceeded      {       \"error\": {         \"message\": \"Daily quota exceeded\",         \"details\": [           \"You have exceeded the allowed daily requests\"          ]       }     }  Details:  This error message indicates that the request exceeds the rate limits for daily requests. Retry the request after some delay.  Rate Limit Exceeded      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }  Details:  This error message indicates that the request exceeds the rate limits for requests per second. Retry the request after some delay.   `Increasing Limits`  The default limits allow most normal API usage patterns. However, if you need higher limits, please contact our support team.    Provide details on:      - Your specific use case      - The endpoints you are using     - The increased limits you are looking for  We will review your request and adjust limits where appropriate   `Need Higher Limits?`  For most use cases, the default limits are sufficient. But if you require higher limits, please contact our support team. We will review your use case and adjust limits where appropriate.   `Errors`  SEOmonitor API uses standard HTTP response codes to indicate the success or failure of API requests.   HTTP Status Codes      ----------------------------------------------------------------------------------     | Code  | Description                                                                 ----------------------------------------------------------------------------------     | 200   | Success                                                                     ----------------------------------------------------------------------------------     | 400   | Bad request - the request was malformed or missing required parameters      ----------------------------------------------------------------------------------      | 401   | Unauthorized - invalid or missing API key                                   ----------------------------------------------------------------------------------     | 403   | Forbidden - API key does not have access to the requested resource          ----------------------------------------------------------------------------------     | 404   | Not found - the requested resource does not exist                           ----------------------------------------------------------------------------------     | 429   | Too many requests - rate or quota limit exceeded                            ----------------------------------------------------------------------------------     | 500   | Internal server error - an unexpected error on the API server               ----------------------------------------------------------------------------------     | 50x   | Errors specific to various endpoints                                        ----------------------------------------------------------------------------------   `Error Response Format`  Error responses will be returned in JSON format:      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }   The error object contains:  - `message` - A general error message   - `details` - More specific details about the error   `Common Errors`  401 Unauthorized      {       \"error\": {         \"message\": \"Invalid authentication\",         \"details\": [           \"The API key provided is invalid\"          ]       }     }   Details:   This error message indicates there is a problem with the API key:  - The API key is missing from the request  - The key is invalid or incorrect  - The key is expired or revoked   Check that you are sending the correct API key in the Authorization header.  403 Forbidden      {       \"error\": {         \"message\": \"Forbidden access\",         \"details\": [           \"Your API key does not have access to the requested data\"          ]       }     }  Details:  This error message indicates that the API key being used does not have access to perform the requested operation. Ensure the key has the required scopes enabled.   404 Not Found      {       \"error\": {         \"message\": \"Data not found\",         \"details\": [           \"The requested data does not exist.\"          ]       }     }   Details:  This error message indicates that the object specified by the request does not exist. For example, requesting a keyword that is not in your SEOmonitor account.   429 Too Many Requests   Daily Quota Exceeded      {       \"error\": {         \"message\": \"Daily quota exceeded\",         \"details\": [           \"You have exceeded the allowed daily requests\"          ]       }     }   Details:  This error message indicates that the request exceeds the rate limits for daily requests. Retry the request after some delay.   Rate Limit Exceeded      {       \"error\": {         \"message\": \"Rate limit exceeded\",         \"details\": [           \"You have exceeded the allowed requests per second\"          ]       }     }   Details:  This error message indicates that the request exceeds the rate limits for requests per second. Retry the request after some delay.   500 Internal Server Error       {       \"error\": {         \"message\": \"Internal server error\",         \"details\": [           \"The server encountered an error while processing your requests\"          ]       }     }   Details:  This error message indicates that an unexpected error occurred on the API server. Try the request again later. If the issue persists, contact support.   50X Endpoint-specific errors  You may encounter errors on specific endpoint requests – these are listed and explained under each endpoint page.   Support  If you have any questions about API errors, please contact our support team.   `Changelog`  Version 3.0 (current)   Release Date: ?  This is the first version of the API 3.0.  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: customer.success@seomonitor.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ForecastConfigConversionData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ForecastConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-04T14:33:47.208100+02:00[Africa/Johannesburg]")

public class ForecastConfiguration {
  @SerializedName("timeframe")
  private String timeframe = null;

  @SerializedName("start_month")
  private String startMonth = null;

  @SerializedName("extended_forecast")
  private Boolean extendedForecast = null;

  @SerializedName("target_rank_range")
  private Boolean targetRankRange = null;

  @SerializedName("progression_speed")
  private String progressionSpeed = null;

  @SerializedName("use_year_over_year")
  private Boolean useYearOverYear = null;

  @SerializedName("use_search_volume_by_device")
  private Boolean useSearchVolumeByDevice = null;

  @SerializedName("use_long_tail_effect")
  private Boolean useLongTailEffect = null;

  @SerializedName("use_percentage_clicks")
  private Boolean usePercentageClicks = null;

  @SerializedName("conversion_data")
  private ForecastConfigConversionData conversionData = null;

  public ForecastConfiguration timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

   /**
   * The duration of the scenario in months.
   * @return timeframe
  **/
  @Schema(description = "The duration of the scenario in months.")
  public String getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }

  public ForecastConfiguration startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * The month and year when the scenario was set to start.
   * @return startMonth
  **/
  @Schema(description = "The month and year when the scenario was set to start.")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public ForecastConfiguration extendedForecast(Boolean extendedForecast) {
    this.extendedForecast = extendedForecast;
    return this;
  }

   /**
   * Whether the projection includes the extended forecast timeframe and the results estimated for it.
   * @return extendedForecast
  **/
  @Schema(description = "Whether the projection includes the extended forecast timeframe and the results estimated for it.")
  public Boolean isExtendedForecast() {
    return extendedForecast;
  }

  public void setExtendedForecast(Boolean extendedForecast) {
    this.extendedForecast = extendedForecast;
  }

  public ForecastConfiguration targetRankRange(Boolean targetRankRange) {
    this.targetRankRange = targetRankRange;
    return this;
  }

   /**
   * Whether the target rank range option is enabled for the Objective. If &#x27;true&#x27;, the estimated results of the forecast will be returned for both the lower (worst) and the higher (best) target.
   * @return targetRankRange
  **/
  @Schema(description = "Whether the target rank range option is enabled for the Objective. If 'true', the estimated results of the forecast will be returned for both the lower (worst) and the higher (best) target.")
  public Boolean isTargetRankRange() {
    return targetRankRange;
  }

  public void setTargetRankRange(Boolean targetRankRange) {
    this.targetRankRange = targetRankRange;
  }

  public ForecastConfiguration progressionSpeed(String progressionSpeed) {
    this.progressionSpeed = progressionSpeed;
    return this;
  }

   /**
   * The user-configured speed at which the average selected target rank will be reached.  Possible values are &#x60;conservative&#x60;, &#x60;mostly conservative&#x60;, &#x60;moderate&#x60;, &#x60;mostly moderate&#x60;, &#x60;optimistic&#x60;, &#x60;mostly optimistic&#x60;, and &#x60;custom&#x60;.
   * @return progressionSpeed
  **/
  @Schema(description = "The user-configured speed at which the average selected target rank will be reached.  Possible values are `conservative`, `mostly conservative`, `moderate`, `mostly moderate`, `optimistic`, `mostly optimistic`, and `custom`.")
  public String getProgressionSpeed() {
    return progressionSpeed;
  }

  public void setProgressionSpeed(String progressionSpeed) {
    this.progressionSpeed = progressionSpeed;
  }

  public ForecastConfiguration useYearOverYear(Boolean useYearOverYear) {
    this.useYearOverYear = useYearOverYear;
    return this;
  }

   /**
   * Whether the option to include the Year-over-Year search trends of the keywords in the forecast calculation is enabled.
   * @return useYearOverYear
  **/
  @Schema(description = "Whether the option to include the Year-over-Year search trends of the keywords in the forecast calculation is enabled.")
  public Boolean isUseYearOverYear() {
    return useYearOverYear;
  }

  public void setUseYearOverYear(Boolean useYearOverYear) {
    this.useYearOverYear = useYearOverYear;
  }

  public ForecastConfiguration useSearchVolumeByDevice(Boolean useSearchVolumeByDevice) {
    this.useSearchVolumeByDevice = useSearchVolumeByDevice;
    return this;
  }

   /**
   * Whether the option to include the search volume for each device of the keywords in the forecast calculation is enabled.
   * @return useSearchVolumeByDevice
  **/
  @Schema(description = "Whether the option to include the search volume for each device of the keywords in the forecast calculation is enabled.")
  public Boolean isUseSearchVolumeByDevice() {
    return useSearchVolumeByDevice;
  }

  public void setUseSearchVolumeByDevice(Boolean useSearchVolumeByDevice) {
    this.useSearchVolumeByDevice = useSearchVolumeByDevice;
  }

  public ForecastConfiguration useLongTailEffect(Boolean useLongTailEffect) {
    this.useLongTailEffect = useLongTailEffect;
    return this;
  }

   /**
   * Whether the option to include the estimation of additional traffic generated by other keywords semantically related to the ones included in the forecast is enabled.
   * @return useLongTailEffect
  **/
  @Schema(description = "Whether the option to include the estimation of additional traffic generated by other keywords semantically related to the ones included in the forecast is enabled.")
  public Boolean isUseLongTailEffect() {
    return useLongTailEffect;
  }

  public void setUseLongTailEffect(Boolean useLongTailEffect) {
    this.useLongTailEffect = useLongTailEffect;
  }

  public ForecastConfiguration usePercentageClicks(Boolean usePercentageClicks) {
    this.usePercentageClicks = usePercentageClicks;
    return this;
  }

   /**
   * Whether the option to include the Percentage Clicks metric in the forecast calculation is enabled.
   * @return usePercentageClicks
  **/
  @Schema(description = "Whether the option to include the Percentage Clicks metric in the forecast calculation is enabled.")
  public Boolean isUsePercentageClicks() {
    return usePercentageClicks;
  }

  public void setUsePercentageClicks(Boolean usePercentageClicks) {
    this.usePercentageClicks = usePercentageClicks;
  }

  public ForecastConfiguration conversionData(ForecastConfigConversionData conversionData) {
    this.conversionData = conversionData;
    return this;
  }

   /**
   * Get conversionData
   * @return conversionData
  **/
  @Schema(description = "")
  public ForecastConfigConversionData getConversionData() {
    return conversionData;
  }

  public void setConversionData(ForecastConfigConversionData conversionData) {
    this.conversionData = conversionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastConfiguration forecastConfiguration = (ForecastConfiguration) o;
    return Objects.equals(this.timeframe, forecastConfiguration.timeframe) &&
        Objects.equals(this.startMonth, forecastConfiguration.startMonth) &&
        Objects.equals(this.extendedForecast, forecastConfiguration.extendedForecast) &&
        Objects.equals(this.targetRankRange, forecastConfiguration.targetRankRange) &&
        Objects.equals(this.progressionSpeed, forecastConfiguration.progressionSpeed) &&
        Objects.equals(this.useYearOverYear, forecastConfiguration.useYearOverYear) &&
        Objects.equals(this.useSearchVolumeByDevice, forecastConfiguration.useSearchVolumeByDevice) &&
        Objects.equals(this.useLongTailEffect, forecastConfiguration.useLongTailEffect) &&
        Objects.equals(this.usePercentageClicks, forecastConfiguration.usePercentageClicks) &&
        Objects.equals(this.conversionData, forecastConfiguration.conversionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeframe, startMonth, extendedForecast, targetRankRange, progressionSpeed, useYearOverYear, useSearchVolumeByDevice, useLongTailEffect, usePercentageClicks, conversionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastConfiguration {\n");
    
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    extendedForecast: ").append(toIndentedString(extendedForecast)).append("\n");
    sb.append("    targetRankRange: ").append(toIndentedString(targetRankRange)).append("\n");
    sb.append("    progressionSpeed: ").append(toIndentedString(progressionSpeed)).append("\n");
    sb.append("    useYearOverYear: ").append(toIndentedString(useYearOverYear)).append("\n");
    sb.append("    useSearchVolumeByDevice: ").append(toIndentedString(useSearchVolumeByDevice)).append("\n");
    sb.append("    useLongTailEffect: ").append(toIndentedString(useLongTailEffect)).append("\n");
    sb.append("    usePercentageClicks: ").append(toIndentedString(usePercentageClicks)).append("\n");
    sb.append("    conversionData: ").append(toIndentedString(conversionData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
