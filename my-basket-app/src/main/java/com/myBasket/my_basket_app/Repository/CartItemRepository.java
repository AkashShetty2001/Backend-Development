package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
