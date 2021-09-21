package com.nisum.pos.repositories;

import com.nisum.pos.entities.PlaceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceOrderRepository  extends JpaRepository<PlaceOrder,Integer> {
}
