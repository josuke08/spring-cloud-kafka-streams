package com.metamorphosis.kafkajsonsolution.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.metamorphosis.kafkajsonsolution.entities.Course;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class CourseDeserializer implements Deserializer<Course> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Course deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data), Course.class);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
