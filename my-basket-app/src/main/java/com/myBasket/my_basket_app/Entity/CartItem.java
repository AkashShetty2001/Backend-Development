package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="my-basket-cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private Long cartItemId;

    private Integer quantity;

    private Double totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;
}
