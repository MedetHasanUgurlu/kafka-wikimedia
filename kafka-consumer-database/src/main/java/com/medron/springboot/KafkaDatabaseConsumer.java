package com.medron.springboot;

import com.medron.springboot.entity.WikimediaData;
import com.medron.springboot.repository.WikimediaDataRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private final WikimediaDataRepository wikimediaDataRepository;
    /*
    @KafkaListener(groupId = "myGroup",topics = "wikimedia-recent-change")
    public void Consume(String eventMessage){
        LOGGER.info(String.format("data received : %s",eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setData(eventMessage);
        wikimediaDataRepository.save(wikimediaData);
    }*/
}
