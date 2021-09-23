package com.nisum.pos.services;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.OrderIdGenerate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderIdGenerateService {

    OrderIdGenerate getRecord(Integer id);
    List<OrderIdGenerate> getAllRecord();
    ResponseEntity<OrderIdGenerate> insertRecord(PlaceOrderDTO placeOrderDTO);
    Integer updateRecord(PlaceOrderDTO placeOrderDTO);

}
