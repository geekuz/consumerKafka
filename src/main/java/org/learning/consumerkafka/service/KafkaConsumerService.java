package org.learning.consumerkafka.service;

import org.learning.consumerkafka.entity.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

//    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
//    public void consumeMessage(String message) {
//        System.out.println(String.format("Consumed message: %s", message));
//    }
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeUserMessage(User user) { // Change method parameter type to User
        System.out.println(String.format("Consumed User: %s", user));
    }
}
