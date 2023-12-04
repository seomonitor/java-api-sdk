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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ContentChange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-04T14:33:47.208100+02:00[Africa/Johannesburg]")

public class ContentChange {
  @SerializedName("element")
  private String element = null;

  @SerializedName("state_from")
  private String stateFrom = null;

  @SerializedName("state_to")
  private String stateTo = null;

  @SerializedName("content_from")
  private String contentFrom = null;

  @SerializedName("content_to")
  private String contentTo = null;

  @SerializedName("full_occurences")
  private Integer fullOccurences = null;

  @SerializedName("partial_occurences")
  private Integer partialOccurences = null;

  @SerializedName("full_occurences_change")
  private Integer fullOccurencesChange = null;

  @SerializedName("partial_occurences_change")
  private Integer partialOccurencesChange = null;

  @SerializedName("words_from")
  private Integer wordsFrom = null;

  @SerializedName("words_to")
  private Integer wordsTo = null;

  @SerializedName("percentage_change")
  private BigDecimal percentageChange = null;

  public ContentChange element(String element) {
    this.element = element;
    return this;
  }

   /**
   * The type of HTML element on the landing page. Types are Title, H1, H2, H3, H4, H5, H6 or BODY
   * @return element
  **/
  @Schema(example = "h6", description = "The type of HTML element on the landing page. Types are Title, H1, H2, H3, H4, H5, H6 or BODY")
  public String getElement() {
    return element;
  }

  public void setElement(String element) {
    this.element = element;
  }

  public ContentChange stateFrom(String stateFrom) {
    this.stateFrom = stateFrom;
    return this;
  }

   /**
   * The keyword occurrences status in the previous element content. States are missing, not-present, partialy-present or fully-present
   * @return stateFrom
  **/
  @Schema(example = "fully-present", description = "The keyword occurrences status in the previous element content. States are missing, not-present, partialy-present or fully-present")
  public String getStateFrom() {
    return stateFrom;
  }

  public void setStateFrom(String stateFrom) {
    this.stateFrom = stateFrom;
  }

  public ContentChange stateTo(String stateTo) {
    this.stateTo = stateTo;
    return this;
  }

   /**
   * The keyword occurrences status in the current element content. States are missing, not-present, partialy-present or fully-present
   * @return stateTo
  **/
  @Schema(example = "partialy-present", description = "The keyword occurrences status in the current element content. States are missing, not-present, partialy-present or fully-present")
  public String getStateTo() {
    return stateTo;
  }

  public void setStateTo(String stateTo) {
    this.stateTo = stateTo;
  }

  public ContentChange contentFrom(String contentFrom) {
    this.contentFrom = contentFrom;
    return this;
  }

   /**
   * The previous content of the element
   * @return contentFrom
  **/
  @Schema(example = "Zaitoun", description = "The previous content of the element")
  public String getContentFrom() {
    return contentFrom;
  }

  public void setContentFrom(String contentFrom) {
    this.contentFrom = contentFrom;
  }

  public ContentChange contentTo(String contentTo) {
    this.contentTo = contentTo;
    return this;
  }

   /**
   * The current content of the element
   * @return contentTo
  **/
  @Schema(example = "The Book of Good Food", description = "The current content of the element")
  public String getContentTo() {
    return contentTo;
  }

  public void setContentTo(String contentTo) {
    this.contentTo = contentTo;
  }

  public ContentChange fullOccurences(Integer fullOccurences) {
    this.fullOccurences = fullOccurences;
    return this;
  }

   /**
   * This indicates if there are fully present keywords in the HTML element
   * @return fullOccurences
  **/
  @Schema(example = "10", description = "This indicates if there are fully present keywords in the HTML element")
  public Integer getFullOccurences() {
    return fullOccurences;
  }

  public void setFullOccurences(Integer fullOccurences) {
    this.fullOccurences = fullOccurences;
  }

  public ContentChange partialOccurences(Integer partialOccurences) {
    this.partialOccurences = partialOccurences;
    return this;
  }

   /**
   * This indicates if there are partially present keywords in the HTML element
   * @return partialOccurences
  **/
  @Schema(example = "10", description = "This indicates if there are partially present keywords in the HTML element")
  public Integer getPartialOccurences() {
    return partialOccurences;
  }

  public void setPartialOccurences(Integer partialOccurences) {
    this.partialOccurences = partialOccurences;
  }

  public ContentChange fullOccurencesChange(Integer fullOccurencesChange) {
    this.fullOccurencesChange = fullOccurencesChange;
    return this;
  }

   /**
   * This is the difference between previous fully present occurrences count and the current fully present occurrences count in the element
   * @return fullOccurencesChange
  **/
  @Schema(example = "5", description = "This is the difference between previous fully present occurrences count and the current fully present occurrences count in the element")
  public Integer getFullOccurencesChange() {
    return fullOccurencesChange;
  }

  public void setFullOccurencesChange(Integer fullOccurencesChange) {
    this.fullOccurencesChange = fullOccurencesChange;
  }

  public ContentChange partialOccurencesChange(Integer partialOccurencesChange) {
    this.partialOccurencesChange = partialOccurencesChange;
    return this;
  }

   /**
   * This is the difference between previous partially present occurrences count and the current partially present occurrences count in the element
   * @return partialOccurencesChange
  **/
  @Schema(example = "5", description = "This is the difference between previous partially present occurrences count and the current partially present occurrences count in the element")
  public Integer getPartialOccurencesChange() {
    return partialOccurencesChange;
  }

  public void setPartialOccurencesChange(Integer partialOccurencesChange) {
    this.partialOccurencesChange = partialOccurencesChange;
  }

  public ContentChange wordsFrom(Integer wordsFrom) {
    this.wordsFrom = wordsFrom;
    return this;
  }

   /**
   * The total number of words in the previous content of the BODY element. This is only applicable to BODY element
   * @return wordsFrom
  **/
  @Schema(example = "1418", description = "The total number of words in the previous content of the BODY element. This is only applicable to BODY element")
  public Integer getWordsFrom() {
    return wordsFrom;
  }

  public void setWordsFrom(Integer wordsFrom) {
    this.wordsFrom = wordsFrom;
  }

  public ContentChange wordsTo(Integer wordsTo) {
    this.wordsTo = wordsTo;
    return this;
  }

   /**
   * The total number of words in the current content of the BODY element. This is only applicable to BODY element
   * @return wordsTo
  **/
  @Schema(example = "1322", description = "The total number of words in the current content of the BODY element. This is only applicable to BODY element")
  public Integer getWordsTo() {
    return wordsTo;
  }

  public void setWordsTo(Integer wordsTo) {
    this.wordsTo = wordsTo;
  }

  public ContentChange percentageChange(BigDecimal percentageChange) {
    this.percentageChange = percentageChange;
    return this;
  }

   /**
   * The percentage change of the content in the BODY element. This is only applicable to BODY element
   * @return percentageChange
  **/
  @Schema(example = "27", description = "The percentage change of the content in the BODY element. This is only applicable to BODY element")
  public BigDecimal getPercentageChange() {
    return percentageChange;
  }

  public void setPercentageChange(BigDecimal percentageChange) {
    this.percentageChange = percentageChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentChange contentChange = (ContentChange) o;
    return Objects.equals(this.element, contentChange.element) &&
        Objects.equals(this.stateFrom, contentChange.stateFrom) &&
        Objects.equals(this.stateTo, contentChange.stateTo) &&
        Objects.equals(this.contentFrom, contentChange.contentFrom) &&
        Objects.equals(this.contentTo, contentChange.contentTo) &&
        Objects.equals(this.fullOccurences, contentChange.fullOccurences) &&
        Objects.equals(this.partialOccurences, contentChange.partialOccurences) &&
        Objects.equals(this.fullOccurencesChange, contentChange.fullOccurencesChange) &&
        Objects.equals(this.partialOccurencesChange, contentChange.partialOccurencesChange) &&
        Objects.equals(this.wordsFrom, contentChange.wordsFrom) &&
        Objects.equals(this.wordsTo, contentChange.wordsTo) &&
        Objects.equals(this.percentageChange, contentChange.percentageChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(element, stateFrom, stateTo, contentFrom, contentTo, fullOccurences, partialOccurences, fullOccurencesChange, partialOccurencesChange, wordsFrom, wordsTo, percentageChange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentChange {\n");
    
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    stateFrom: ").append(toIndentedString(stateFrom)).append("\n");
    sb.append("    stateTo: ").append(toIndentedString(stateTo)).append("\n");
    sb.append("    contentFrom: ").append(toIndentedString(contentFrom)).append("\n");
    sb.append("    contentTo: ").append(toIndentedString(contentTo)).append("\n");
    sb.append("    fullOccurences: ").append(toIndentedString(fullOccurences)).append("\n");
    sb.append("    partialOccurences: ").append(toIndentedString(partialOccurences)).append("\n");
    sb.append("    fullOccurencesChange: ").append(toIndentedString(fullOccurencesChange)).append("\n");
    sb.append("    partialOccurencesChange: ").append(toIndentedString(partialOccurencesChange)).append("\n");
    sb.append("    wordsFrom: ").append(toIndentedString(wordsFrom)).append("\n");
    sb.append("    wordsTo: ").append(toIndentedString(wordsTo)).append("\n");
    sb.append("    percentageChange: ").append(toIndentedString(percentageChange)).append("\n");
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
