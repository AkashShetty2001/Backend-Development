package com.myBasket.my_basket_app.Entity.paymentMethodInformation;

import jakarta.persistence.Embeddable;

@Embeddable
public class CASH_ON_DELIVERY {

    /*
    For CASH_ON_DELIVERY, we might want to store additional information like:
    - recipientName: Name of the person receiving the delivery.
    - contactNumber: Contact number for delivery issues.
     */

    private String recipientName;

    private String contactNumber;
}
