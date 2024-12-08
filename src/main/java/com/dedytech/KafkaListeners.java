package com.dedytech;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "dedytech",
            groupId = "groupId"
    )
    void listener(Message data) {
        System.out.println("Listener received: " + data + " cc:");
    }
}
