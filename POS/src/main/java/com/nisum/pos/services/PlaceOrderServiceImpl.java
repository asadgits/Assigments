package com.nisum.pos.services;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.PlaceOrder;
import com.nisum.pos.repositories.PlaceOrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    private final ModelMapper modelMapper;
    private final PlaceOrderRepository placeOrderRepository;

    @Autowired
    public PlaceOrderServiceImpl(ModelMapper modelMapper, PlaceOrderRepository placeOrderRepository) {
        this.modelMapper = modelMapper;
        this.placeOrderRepository = placeOrderRepository;
    }


    @Override
    public ResponseEntity<PlaceOrder> insertRecord(PlaceOrderDTO placeOrderDTO) {
        return new ResponseEntity<PlaceOrder>(placeOrderRepository.save(modelMapper.map(placeOrderDTO,PlaceOrder.class)) , HttpStatus.CREATED);

    }

}
