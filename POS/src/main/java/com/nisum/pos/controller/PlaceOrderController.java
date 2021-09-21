package com.nisum.pos.controller;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.PlaceOrder;
import com.nisum.pos.services.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/PlaceOrder/V1/")
public class PlaceOrderController {

    private final PlaceOrderService placeOrderService;

    @Autowired
    public PlaceOrderController(PlaceOrderService placeOrderService) {
        this.placeOrderService = placeOrderService;
    }


    @PostMapping
    public ResponseEntity<PlaceOrder> insertRecord(@Valid @RequestBody PlaceOrderDTO placeOrderDTO) {
        return placeOrderService.insertRecord(placeOrderDTO);
    }


}
