package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="my-basket-categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageURL;
}
