package com.shouvick.springboot.kafka.kafka;

import com.shouvick.springboot.kafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {
    public static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic_json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }
}
