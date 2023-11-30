package com.jade.KafkaTest.producer;

import com.jade.KafkaTest.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaProducerTemplate;

    public void sendMessage(String message){
        System.out.println("Kafka Producer: "+message);
        kafkaProducerTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}
