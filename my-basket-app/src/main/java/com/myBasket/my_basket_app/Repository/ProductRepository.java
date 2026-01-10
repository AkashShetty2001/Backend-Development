package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
