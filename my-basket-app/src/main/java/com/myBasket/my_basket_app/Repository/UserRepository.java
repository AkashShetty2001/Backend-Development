package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer>{
}
