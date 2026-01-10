package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
