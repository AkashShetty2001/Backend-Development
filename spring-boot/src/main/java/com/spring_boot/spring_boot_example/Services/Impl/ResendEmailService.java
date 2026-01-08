package com.spring_boot.spring_boot_example.Services.Impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
/*
@Primary annotation is used to specify that this is the primary bean to be used when multiple beans of the same type are present.
 */
public class ResendEmailService implements EmailService{
    @Override
    public void SendEmail(String sendTo,String subject,String body){
      //lets us assume we are using Resend as email Service provider
        System.out.println("Using Resend Email Service");
        System.out.println("Sending Email to "+sendTo+" with subject "+subject+" and body "+body);
    }

    /*
    so it basically depends on Resend.
    so it is tightly coupled with Resend.
    if we want to change the email service provider we have to change the code here.
     */
}
