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
 * Team Information.
 */

@Entity
@Table(name = "teams")
@Getter
@Setter
@EqualsAndHashCode
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @JsonProperty("id")
  private int id;

  @Column(name = "url", nullable = false)
  @JsonProperty("url")
  private String url;

  @Column(name = "code", length = 3, nullable = false)
  @JsonProperty("code")
  private String code;

  @Column(name = "name", length = 100, nullable = false)
  @JsonProperty("name")
  private String name;

}
