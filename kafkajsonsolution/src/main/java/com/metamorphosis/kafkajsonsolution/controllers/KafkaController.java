package com.metamorphosis.kafkajsonsolution.controllers;

import com.metamorphosis.kafkajsonsolution.entities.Course;
import com.metamorphosis.kafkajsonsolution.entities.Prof;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping
public class KafkaController {
    @Autowired
    private StreamBridge streamBridge;
    @GetMapping("/publish/{topic}/{name}")
    public Course publish(@PathVariable String topic, @PathVariable String name){
        Course course = Course.builder()
                .id(1L)
                .name(name)
                .description("dead").build();
        streamBridge.send("producer-out-0",course);
        return course;
    }
}
