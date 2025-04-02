package com.youtube.central.Service;

import com.youtube.central.dto.NotificationMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {

       @Autowired
        RabbitTemplate rabbitTemplate;
    public final  String exchangeName="notification-exchange";
   // public final  String queueName="notification-queue";
    public final String routingKey="notification-123";

    public void insertMessageToQueue(NotificationMessage message) {
        //with the combination of exchange and routing key we uniquely identify queue
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);

    }
}


