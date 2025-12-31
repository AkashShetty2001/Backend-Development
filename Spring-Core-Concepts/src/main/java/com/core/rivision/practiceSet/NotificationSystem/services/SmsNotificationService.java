package com.core.rivision.practiceSet.NotificationSystem.services;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService{

    public SmsNotificationService(){

    }

    @Override
    public void sendNotification(String message){
        System.out.println("Email :"+message);
    }
}
