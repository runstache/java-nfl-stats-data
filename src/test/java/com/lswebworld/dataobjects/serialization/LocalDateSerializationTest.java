package com.lswebworld.dataobjects.serialization;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lswebworld.nfl.stats.data.models.PlayerModel;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class LocalDateSerializationTest {

  @Test
  void testDeserializeLocalDate() throws JsonProcessingException {

    var mapper = new ObjectMapper();
    var player = new PlayerModel();

    player.setDob(LocalDate.of(2022, 5, 1));
    var result = mapper.writeValueAsString(player);

    assertThat(result).contains("2022-05-01");

  }

  @Test
  void testSerializeLocalDate() throws JsonProcessingException {
    var mapper = new ObjectMapper();
    var jsonString = "{\"dob\":\"2022-05-01\"}";
    var result = mapper.readValue(jsonString, PlayerModel.class);

    assertThat(result.getDob()).isEqualTo(LocalDate.of(2022,5,1));

  }

  @Test
  void testSerializationNullValue() throws JsonProcessingException {
    var mapper = new ObjectMapper();
    var jsonString = "{\"name\":\"jim smith\"}";
    var result = mapper.readValue(jsonString, PlayerModel.class);

    assertThat(result.getDob()).isNull();

  }

  @Test
  void testDeserializationNullValue() throws JsonProcessingException {
    var mapper = new ObjectMapper();
    var player = new PlayerModel();

    player.setName("jim smith");

    var result = mapper.writeValueAsString(player);

    assertThat(result).doesNotContain("2022-05-01");
  }

}
