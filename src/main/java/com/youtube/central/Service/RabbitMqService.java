package com.youtube.central.Service;

import com.youtube.central.dto.NotificationMessage;
import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {
    public void sendNotificationMessageToQueue(NotificationMessage message){


    }
}

