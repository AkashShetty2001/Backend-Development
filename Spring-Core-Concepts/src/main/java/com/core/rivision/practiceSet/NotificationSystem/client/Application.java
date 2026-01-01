package com.core.rivision.practiceSet.NotificationSystem.client;

import com.core.rivision.practiceSet.NotificationSystem.config.Configuration;
import com.core.rivision.practiceSet.NotificationSystem.manager.NotificationManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(Configuration.class);

        NotificationManager notificationManager = context.getBean("notificationManager", NotificationManager.class);
        notificationManager.send("Hello u got a Message");

        /*
        So thi s is a simple Spring application that demonstrates dependency injection and component scanning.
         */
    }
}
