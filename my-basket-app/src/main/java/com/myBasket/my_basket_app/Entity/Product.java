package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_products")
public class Product {

    @Id
    private Integer productId;
    private String productName;
    private Double price;

}
