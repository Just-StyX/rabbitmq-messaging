package com.article.section2.example1.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {
    @Bean
    public Queue queue() { return new Queue("queue", true); }

    @Bean
    public DirectExchange exchange() { return new DirectExchange("directExchange"); }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with("name");
    }
}
