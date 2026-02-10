package com.myBasket.my_basket_app.controller;

import com.myBasket.my_basket_app.Entity.Users;
import com.myBasket.my_basket_app.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public Users getUser(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }


    @RequestMapping("/users")
    @ResponseBody
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}

