package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = " my-basket-orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_id")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    /*many orders can belong to one user*/
    private Users users;

    @ManyToOne(fetch =FetchType.LAZY)/* many orders can have one shipping address*/
    private Address shippingAddress;

    @OneToMany(mappedBy= "orders",
            fetch = FetchType.EAGER,
               cascade = {CascadeType.ALL})/*one order can have many order items*/
    private List<OrderItem> orderItems= new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus= OrderStatus.PACKED;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus=PaymentStatus.PENDING;
}
