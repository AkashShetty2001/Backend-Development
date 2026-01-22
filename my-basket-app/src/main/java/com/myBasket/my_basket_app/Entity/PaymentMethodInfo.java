package com.myBasket.my_basket_app.Entity;


import com.myBasket.my_basket_app.Entity.paymentMethodInformation.*;
import jakarta.persistence.*;

@Entity
@Table(name="my-basket-payment_method_info")
public class PaymentMethodInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="payment_method_info_id")
    private Long paymentMethodInfoId;

    /*
        we have different payment method info for different payment methods,
        so they are related to payment ..
        parent is payment , which is mapped by paymentMethodInfo
     */

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="payment_id")
    private Payment payment;

    @Embedded
    /*
        embedding UPI payment method information,
        which means a column of UPI payment method information will be created in payment_method_info table
     */
    private UPI upi;

    @Embedded
    private CASH_ON_DELIVERY cashOnDelivery;

//    private DEBIT_CARD debitCard;
//
//    private CREDIT_CARD creditCard;
//
//    private NET_BANKING netBanking;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private Users user;

}
