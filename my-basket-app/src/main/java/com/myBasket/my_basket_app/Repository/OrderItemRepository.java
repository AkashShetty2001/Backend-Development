package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
