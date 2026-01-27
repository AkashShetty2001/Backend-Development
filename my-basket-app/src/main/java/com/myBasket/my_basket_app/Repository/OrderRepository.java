package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
