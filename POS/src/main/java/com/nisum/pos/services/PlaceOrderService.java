package com.nisum.pos.services;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.PlaceOrder;
import org.springframework.http.ResponseEntity;

public interface PlaceOrderService {

    ResponseEntity<PlaceOrder> insertRecord(PlaceOrderDTO placeOrderDTO);

}
