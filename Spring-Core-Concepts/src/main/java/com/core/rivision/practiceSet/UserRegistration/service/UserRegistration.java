package com.core.rivision.practiceSet.UserRegistration.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRegistration {
    private String name;
    private Integer age;

    @Autowired
    public UserRegistration(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    List<UserRegistration> users= new ArrayList<>();

    public boolean addUser(UserRegistration userRegistration){
        return users.add(userRegistration);
    }

    public UserRegistration getUser(String name){
        for(int i=0;i<users.size();i++){
            UserRegistration user=users.get(i);
            if(user.name.equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }

}
