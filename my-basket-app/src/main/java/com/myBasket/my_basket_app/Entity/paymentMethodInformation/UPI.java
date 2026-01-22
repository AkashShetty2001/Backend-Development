package com.myBasket.my_basket_app.Entity.paymentMethodInformation;

import jakarta.persistence.Embeddable;

/*
    UPI payment method information class.but we dont want to treat it as an another table in database.
    so we will use @Embeddable annotation .
    which means this class will be embedded in another entity class.
 */
@Embeddable
public class UPI {

    /*
        UPI ID of the user.
     */
    private String upiId;


}
