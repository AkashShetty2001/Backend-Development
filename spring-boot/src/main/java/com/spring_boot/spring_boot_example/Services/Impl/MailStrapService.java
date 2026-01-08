package com.spring_boot.spring_boot_example.Services.Impl;

import org.springframework.stereotype.Service;

@Service
public class MailStrapService implements EmailService{
    @Override
    public void SendEmail(String sendTo,String subject,String body){
      //lets us assume we are using Mail Strap as email Service provider
        System.out.println("Using Mail Strap Service");
        System.out.println("Sending Email to "+sendTo+" with subject "+subject+" and body "+body);
    }

    /*
    so it basically depends on Mail Strap.
    so it is tightly coupled with Mail Strap.
    if we want to change the email service provider we have to change the code here.
     */
}
