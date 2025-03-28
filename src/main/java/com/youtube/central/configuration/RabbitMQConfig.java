package com.youtube.central.configuration;

import com.rabbitmq.client.AMQP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfig {
    private static final String queueName="notification-queue";
    private static final String exchangeName="notification-exchange";
    private static final String routingkey="notification-123";
    @Bean
    public AMQP.Queue queue(){
        return new  AMQP.Queue();

    }
}
