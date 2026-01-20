package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "my-basket-carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private Long cartId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;

    @OneToMany(mappedBy = "cart",
            fetch = FetchType.EAGER,
            cascade = {CascadeType.ALL})
    private List<CartItem> cartItems= new ArrayList<>();
}
