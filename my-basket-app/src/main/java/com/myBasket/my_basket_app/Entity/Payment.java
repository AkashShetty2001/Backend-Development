package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my-basket-payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    /*
    so we need have an separate entity for payment to store payment related information
     */

    /*
    paymnet is associated with single order so @OneToOne relationship
     */

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod=PaymentMethod.CASH_ON_DELIVERY;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus=PaymentStatus.PENDING;

    @OneToOne
    @JoinColumn(name="payment_method_info_id")
    private PaymentMethodInfo paymentMethodInfo;
}
