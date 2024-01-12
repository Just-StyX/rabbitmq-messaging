package com.article.section2.example1.config;


import com.article.section2.example1.models.Producer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
    @Bean
    ApplicationRunner applicationRunner(Producer producer) {
        return args1 -> {
            producer.sentName("Michael Jordan");
        };
    }
}
