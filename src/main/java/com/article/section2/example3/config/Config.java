package com.article.section2.example3.config;

import com.article.section2.example3.models.OrderProducer;
import com.article.section2.example3.object.Order;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ApplicationRunner applicationRunner(OrderProducer orderProducer) {
        return  args -> {
            orderProducer.sentOrder(new Order("Oat Milk", 12, 0.99, 0.025));
        };
    }
}
