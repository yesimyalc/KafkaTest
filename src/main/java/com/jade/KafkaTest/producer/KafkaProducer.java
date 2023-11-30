package com.jade.KafkaTest.producer;

import com.jade.KafkaTest.util.AppConstants;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaProducerTemplate;

    public void sendMessage(String message){

        log.log(Level.INFO, "Producer: "+message);
        kafkaProducerTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}
