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
 * Player Data Class.
 */
@Entity
@Table(name = "players")
@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, insertable = false)
  @JsonProperty("id")
  private long id;

  @Column(name = "url",  nullable = false)
  @JsonProperty("url")
  private String url;


  @Column(name = "name", length = 500, nullable = false)
  @JsonProperty("name")
  private String name;

  @Column(name = "position_id", nullable = false)
  @JsonProperty("positionId")
  private int positionId;

}
