package com.nisum.pos.controller;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.OrderIdGenerate;
import com.nisum.pos.services.OrderIdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/PlaceOrder/V1/")
public class PlaceOrderController {

    private final OrderIdGenerateService orderIdGenerateService;

    @Autowired
    public PlaceOrderController(OrderIdGenerateService orderIdGenerateService) {
        this.orderIdGenerateService = orderIdGenerateService;
    }

    @PostMapping
    public ResponseEntity<OrderIdGenerate> insertData(@RequestBody PlaceOrderDTO placeOrderDTO) {
        return orderIdGenerateService.insertRecord(placeOrderDTO);
    }

    @PutMapping
    public Integer updateData(@RequestBody PlaceOrderDTO placeOrderDTO) {
        return orderIdGenerateService.updateRecord(placeOrderDTO);
    }

    @GetMapping
    public List<OrderIdGenerate> getAllData() {
        return orderIdGenerateService.getAllRecord();
    }

    @GetMapping(path = "/{id}")
    public OrderIdGenerate getData(@PathVariable Integer id) {
        return orderIdGenerateService.getRecord(id);
    }




    public void checkRecord(List<Integer> ids, List<Integer> quantities) {
    }


    }
