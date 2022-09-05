package com.lswebworld.nfl.stats.data.dataobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Statistic Entry.
 */

@Entity
@Table(name = "statistics")
@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Statistic {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @JsonProperty("id")
  private long id;

  @Column(name = "statistic_code_id", nullable = false)
  @JsonProperty("statisticCodeId")
  private long statisticCodeId;

  @Column(name = "player_id")
  @JsonProperty("playerId")
  private long playerId;

  @Column(name = "team_id")
  @JsonProperty("teamId")
  private int teamId;

  @Column(name = "schedule_id", nullable = false)
  @JsonProperty("scheduleId")
  private long scheduleId;

  @Column(name = "value", nullable = false)
  @JsonProperty("value")
  private double value;

  @Column(name = "category_id", nullable = false)
  @JsonProperty("categoryId")
  private int categoryId;

}
