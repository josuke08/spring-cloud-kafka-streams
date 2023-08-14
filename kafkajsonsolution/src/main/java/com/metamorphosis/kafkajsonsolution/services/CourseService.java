package com.metamorphosis.kafkajsonsolution.services;

import com.metamorphosis.kafkajsonsolution.entities.Course;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class CourseService {
    //@Bean
    public Supplier<Course> producer() {
        return () -> Course.builder().build();
    }
    @Bean
    public Consumer<Course> consumer() {
        return message -> System.out.println("received " + message);
    }}
