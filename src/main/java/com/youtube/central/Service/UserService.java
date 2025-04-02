package com.youtube.central.Service;

import com.youtube.central.Repository.AppUserRepo;
import com.youtube.central.dto.NotificationMessage;
import com.youtube.central.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class UserService {
    AppUserRepo appUserRepo;
    RabbitMqService rabbitMqService;

    @Autowired
     public UserService(AppUserRepo appUserRepo, RabbitMqService rabbitMqService){
        this.appUserRepo=appUserRepo;
        this.rabbitMqService=rabbitMqService;

}
    public AppUserRepo getAppUserRepo() {
        return appUserRepo;
    }

    public void setAppUserRepo(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public RabbitMqService getRabbitMqService() {
        return rabbitMqService;
    }

    public void setRabbitMqService(RabbitMqService rabbitMqService) {
        this.rabbitMqService = rabbitMqService;
    }

    public void registerUser(AppUser user) {
        //call repository layer to save the user
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt((LocalDateTime.now()));
        appUserRepo.save(user);

        //Insert registration message payload inside rabbit mq queue
        NotificationMessage message=new NotificationMessage();
        message.setEmail(user.getEmail());
        message.setType("user-registration");
        message.setName(user.getName());

        rabbitMqService.insertMessageToQueue(message);




        //we need to add notification message record in mq
//        NotificationMessage notificationMessage = new NotificationMessage();
//        notificationMessage.setEmail(user.getEmail());
//        notificationMessage.setPurpose("user-registration");
//        rabbitMqService. sendNotificationMessageToQueue(notificationMessage);

    }

}
