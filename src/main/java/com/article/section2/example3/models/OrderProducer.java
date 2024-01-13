package com.article.section2.example3.models;

import com.article.section2.example3.object.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {
    private final RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sentOrder(Order order) {
        rabbitTemplate.convertAndSend("orderExchange", "name.bar", order);
    }
}
