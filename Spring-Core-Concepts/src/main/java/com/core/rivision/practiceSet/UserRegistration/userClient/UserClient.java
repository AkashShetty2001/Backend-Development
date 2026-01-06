package com.core.rivision.practiceSet.UserRegistration.userClient;

import com.core.rivision.practiceSet.UserRegistration.userConfig.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserClient {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);


    }
}
