package com.jade.KafkaTest.consumer;

import com.jade.KafkaTest.util.AppConstants;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumer {

    @KafkaListener(topics= AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(String message) throws InterruptedException {
        log.log(Level.INFO, "Consumer: "+message);
        Thread.sleep(10L);
    }
}
