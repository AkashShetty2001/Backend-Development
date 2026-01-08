package com.spring_boot.spring_boot_example.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

     final private EmailService emailService;

    @Autowired
    public OrderService( @Qualifier("mailStrapService")EmailService emailService){
        /*
        @Qualifier("mailStrapService") is used to specify which implementation of EmailService to use.
         */
        this.emailService=emailService;
    }

    public void sendInvoice(){
        System.out.println("Sending Invoice from Order Service, using "+ emailService.getClass().getSimpleName());
            emailService.SendEmail("akashkd9911@gmail.com","Invoice for your order",
                    "Thank you for your order. Here is your invoice.");
    }
}
