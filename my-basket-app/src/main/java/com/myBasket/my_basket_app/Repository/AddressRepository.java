package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
