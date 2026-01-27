package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
