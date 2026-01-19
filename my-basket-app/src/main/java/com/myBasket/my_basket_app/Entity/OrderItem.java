package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "my-basket-order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long orderItemId;

    @ManyToOne
    private List<Order> orders=new ArrayList<>();


    @ManyToOne/* many order items can belong to one product
                 like if 3 quantity of same product is ordered it will create one order item with quantity 3*/
    private Product product;

    private Integer quantity;
}
