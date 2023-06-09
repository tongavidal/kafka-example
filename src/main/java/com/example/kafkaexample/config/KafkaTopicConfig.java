package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic gastonTopic(){
        return TopicBuilder.name("gastonTopic").build();
    }

    public NewTopic afterStreamTopic(){
        return TopicBuilder.name("afterStreamTopic").build();
    }
}
