package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.PaymentMethodInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodInfoRepository  extends JpaRepository<PaymentMethodInfo, Long> {
}
