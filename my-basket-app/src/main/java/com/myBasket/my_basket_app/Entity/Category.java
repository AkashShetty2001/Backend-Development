package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="my-basket-categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;
    private String imageURL;

    @ManyToMany(mappedBy = "categories",
                cascade = {CascadeType.ALL})
    private List<Product> products;
}
