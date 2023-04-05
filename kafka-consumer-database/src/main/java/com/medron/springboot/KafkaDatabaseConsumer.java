package com.medron.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    @KafkaListener(groupId = "myGroup",topics = "wikimedia-recent-change")
    public void Consume(String eventMessage){
        LOGGER.info(String.format("data received : %s",eventMessage));
    }
}
