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
    }


