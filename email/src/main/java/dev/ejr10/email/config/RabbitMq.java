package dev.ejr10.email.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {
    public static final String queueName= "email-queue";

    @Bean
    public Queue queue() {
        return new Queue(queueName, true);
    }
}
