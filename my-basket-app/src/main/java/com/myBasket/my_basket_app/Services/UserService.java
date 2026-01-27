package com.myBasket.my_basket_app.Services;

import com.myBasket.my_basket_app.Entity.Users;
import com.myBasket.my_basket_app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository= userRepository;
    }
    public void saveUser(Users user){
        Users users = userRepository.save(user);
        System.out.println("User saved with ID: " + users.getUserId());
    }

    public void deleteUserById(Integer userId){

        userRepository.deleteById(userId);
        System.out.println("User deleted with ID: " + userId);
    }
}
