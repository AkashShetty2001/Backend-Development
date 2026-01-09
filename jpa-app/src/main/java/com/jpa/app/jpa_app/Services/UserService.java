package com.jpa.app.jpa_app.Services;

import com.jpa.app.jpa_app.Entity.Users;
import com.jpa.app.jpa_app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/* indicating that this class is a service component in the Spring framework */
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    public void saveUser(Users user){
        Users users = userRepository.save(user);
        System.out.println("User saved with ID: " + users.getUserId());
    }

}
