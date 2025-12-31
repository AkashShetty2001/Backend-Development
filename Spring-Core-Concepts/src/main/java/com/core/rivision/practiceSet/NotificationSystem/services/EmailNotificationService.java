package com.core.rivision.practiceSet.NotificationSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService  implements NotificationService{

    public EmailNotificationService(){
    }

    @Override
    public void sendNotification(String message){
        System.out.println("Email :"+message);
    }


}
