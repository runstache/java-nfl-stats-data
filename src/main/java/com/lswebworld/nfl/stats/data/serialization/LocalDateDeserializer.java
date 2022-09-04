package com.lswebworld.nfl.stats.data.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.StringUtils;

/**
 * Deserializes Json String value to LocalDate.
 */
public class LocalDateDeserializer extends StdDeserializer<LocalDate> {



  public LocalDateDeserializer() {
    this(null);
  }

  public LocalDateDeserializer(Class<LocalDate> clazz) {
    super(clazz);
  }

  @Override
  public LocalDate deserialize(JsonParser jsonParser,
                               DeserializationContext deserializationContext) throws IOException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    var dateValue = node.textValue();
    if (StringUtils.isNotEmpty(dateValue)) {
      return LocalDate.parse(dateValue, DateTimeFormatter.ISO_LOCAL_DATE);
    }
    return null;
  }
}
