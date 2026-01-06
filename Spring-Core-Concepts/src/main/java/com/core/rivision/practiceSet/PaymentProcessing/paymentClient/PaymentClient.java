package com.core.rivision.practiceSet.PaymentProcessing.paymentClient;

import com.core.rivision.practiceSet.PaymentProcessing.Services.PaymentService;
import com.core.rivision.practiceSet.PaymentProcessing.paymentConfig.PaymentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentClient {
    public static void main(String[] args) {
              ApplicationContext context =new AnnotationConfigApplicationContext(PaymentConfig.class);
              PaymentService pay1=context.getBean("paymentService", PaymentService.class);
              pay1.performPayment("paying to zomato");

              PaymentService pay2=context.getBean("paymentService", PaymentService.class);
              pay2.performPayment("paying to Swiggy");


    }
}
