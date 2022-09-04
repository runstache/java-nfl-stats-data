package com.lswebworld.nfl.stats.data.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Serializes a LocalDate for Json.
 */
public class LocalDateSerializer extends StdSerializer<LocalDate> {

  public LocalDateSerializer() {
    this(null);
  }

  public LocalDateSerializer(Class<LocalDate> clazz) {
    super(clazz);

  }

  @Override
  public void serialize(LocalDate localDate,
                        JsonGenerator jsonGenerator,
                        SerializerProvider serializerProvider) throws IOException {
    if (ObjectUtils.isNotEmpty(localDate)) {
      jsonGenerator.writeString(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
  }
}
