package com.lswebworld.nfl.stats.data.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Statistic Api Model.
 */

@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticModel {

  @JsonProperty("statisticCode")
  private String statisticCode;

  @JsonProperty("playerUrl")
  private String playerUrl;

  @JsonProperty("teamId")
  private int teamId;

  @JsonProperty("value")
  private double value;

  @JsonProperty("gameId")
  private long gameId;

  @JsonProperty("scheduleId")
  private long scheduleId;

  @JsonProperty("categoryCode")
  private String categoryCode;

}
