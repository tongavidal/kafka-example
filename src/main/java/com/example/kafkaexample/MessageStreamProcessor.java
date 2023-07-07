package com.example.kafkaexample;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageStreamProcessor {

    @Autowired
    private StreamsBuilder streamsBuilder;

    @Bean
    public void streamTopology(){
        KStream<String, String> kstream = streamsBuilder.stream("gastonTopic", Consumed.with(Serdes.String(), Serdes.String()));
        kstream.filter((key, value) -> value.startsWith("Message_"))
                .mapValues((key, value) -> value.toUpperCase())
                .peek((k, v) -> System.out.println("Value received through stream: " + v))
                .to("afterStreamTopic", Produced.with(Serdes.String(), Serdes.String()));
    }
}
