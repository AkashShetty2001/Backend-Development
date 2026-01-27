package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
