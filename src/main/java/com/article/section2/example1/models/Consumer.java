package com.article.section2.example1.models;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.logging.Logger;

@Component
public class Consumer {
    private final Logger logger = Logger.getLogger(Consumer.class.getName());
    @RabbitListener(queues = {"queue"})
    public void receiveName(String name) {
        var message = "I will not say hello world! : " + name + " -> " + LocalDate.now();
        logger.info(message);
    }
}
