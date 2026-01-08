package com.spring_boot.spring_boot_example.Services.Impl;

public interface EmailService {
    void SendEmail(String sendTo,String subject,String body);
    /*
    I Can also make this default method and give default implementation here.
    it will be useful in scenarios, where the implementation is same for all the classes or the child class fails to provide implementation.

    default void SendEmail(String sendTo,String subject,String body){
        System.out.println("Sending Email to "+sendTo+" with subject "+subject+" and body "+body);
     */
}
