package com.core.rivision.practiceSet.PaymentProcessing.Services;


import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private final ObjectProvider<TransactionService> transactionService;

    @Autowired
    public PaymentService(ObjectProvider<TransactionService> transactionService) {
        this.transactionService = transactionService;
    }

    public void performPayment(String message){
        TransactionService transactionServiceProvider =
                transactionService.getObject();

        System.out.println(
                "Performing payment for " + message +
                        " for reference transaction code is " + transactionServiceProvider
        );

    }
}
