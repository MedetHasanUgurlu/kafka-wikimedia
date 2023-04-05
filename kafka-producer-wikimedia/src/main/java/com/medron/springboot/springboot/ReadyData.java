package com.medron.springboot.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ReadyData {
    private final WikimediaChangesProducer wikimediaChangesProducer;

    @Bean

    CommandLineRunner commandLineRunner(){
        return (args)->{
            wikimediaChangesProducer.sendMessage();
        };
    }
}
