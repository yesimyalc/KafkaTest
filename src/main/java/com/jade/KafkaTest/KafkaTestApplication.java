package com.jade.KafkaTest;

import com.jade.KafkaTest.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class KafkaTestApplication {

	@Autowired
	private KafkaProducer kafkaProducer;
	private int sentMessageCount=0;

	public static void main(String[] args) {

		SpringApplication.run(KafkaTestApplication.class, args);

	}

	@Scheduled(fixedRate = 10)
	private void sendKafkaMessage(){
		kafkaProducer.sendMessage(String.valueOf((++sentMessageCount)));
	}

}
