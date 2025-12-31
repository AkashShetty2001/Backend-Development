package com.core.rivision.practiceSet.NotificationSystem.manager;

import com.core.rivision.practiceSet.NotificationSystem.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private NotificationService notificationService;

    @Autowired

    public NotificationManager(  @Qualifier("smsNotificationService")NotificationService notificationService){
        this.notificationService=notificationService;
    }

    public void send(String message) {
        notificationService.sendNotification(message);
    }




}
