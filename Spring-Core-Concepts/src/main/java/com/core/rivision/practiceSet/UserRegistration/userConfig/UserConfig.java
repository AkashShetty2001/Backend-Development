package com.core.rivision.practiceSet.UserRegistration.userConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.core.rivision.practiceSet.UserRegistration")
public class UserConfig {

    @Bean
    public String getName(){
        return "";
    }

    @Bean
    public Integer getAge(){
        return 0;
    }

}
