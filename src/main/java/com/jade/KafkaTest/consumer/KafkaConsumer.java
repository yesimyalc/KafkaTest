package com.jade.KafkaTest.consumer;

import com.jade.KafkaTest.util.AppConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics= AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(String message) throws InterruptedException {
        System.out.println("Kafka Consumer: "+message);
        Thread.sleep(10L);
    }
}
