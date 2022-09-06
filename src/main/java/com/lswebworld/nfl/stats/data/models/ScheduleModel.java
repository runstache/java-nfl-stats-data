package com.lswebworld.nfl.stats.data.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Api Model for a Schedule Entry.
 */
@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleModel {

  @JsonProperty("teamUrl")
  private String teamUrl;

  @JsonProperty("opponentUrl")
  private String opponentUrl;

  @JsonProperty("year")
  private int year;

  @JsonProperty("week")
  private int week;

  @JsonProperty("gameId")
  private long gameId;

  @JsonProperty("url")
  private String url;

  @JsonProperty("typeCode")
  private String typeCode;

  @JsonProperty("homeGame")
  private boolean homeGame;
}
