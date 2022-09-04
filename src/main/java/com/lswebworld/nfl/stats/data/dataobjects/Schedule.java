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
 * Schedule Entry for a Game.
 */

@Entity
@Table(name = "schedule")
@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Schedule {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @JsonProperty("id")
  private long id;

  @Column(name = "team_id", nullable = false)
  @JsonProperty("teamId")
  private int teamId;

  @Column(name = "opponent_id", nullable = false)
  @JsonProperty("opponentId")
  private int opponentId;

  @Column(name = "year_value", nullable = false)
  @JsonProperty("year")
  private int year;

  @Column(name = "week_number", nullable = false)
  @JsonProperty("week")
  private int week;

  @Column(name = "game_id", nullable = false)
  @JsonProperty("gameId")
  private long gameId;

  @Column(name = "url", nullable = false)
  @JsonProperty("url")
  private String url;

  @Column(name = "type_id", nullable = false)
  @JsonProperty("typeId")
  private int typeId;

  @Column(name = "is_home", nullable = false)
  @JsonProperty("HomeGame")
  private boolean homeGame;

}
