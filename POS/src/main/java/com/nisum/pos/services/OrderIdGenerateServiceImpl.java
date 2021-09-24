package com.nisum.pos.services;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.OrderIdGenerate;
import com.nisum.pos.exceptionHandler.ServiceGeneralException;
import com.nisum.pos.repositories.OrderIdGenerateRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderIdGenerateServiceImpl implements OrderIdGenerateService {

    private final ModelMapper modelMapper;
    private final OrderIdGenerateRepository orderIdGenerateRepository;

    @Autowired
    public OrderIdGenerateServiceImpl(ModelMapper modelMapper, OrderIdGenerateRepository orderIdGenerateRepository) {
        this.modelMapper = modelMapper;
        this.orderIdGenerateRepository = orderIdGenerateRepository;
    }

    @Override
    public OrderIdGenerate getRecord(Integer id) {

        return orderIdGenerateRepository.findById(id)
                .orElseThrow(() ->  new ServiceGeneralException("RECORD NOT FOUND !!!" , HttpStatus.BAD_REQUEST));
    }

    @Override
    public List<OrderIdGenerate> getAllRecord() {
        return orderIdGenerateRepository.findAll();
    }

    @Override
    public ResponseEntity<OrderIdGenerate> insertRecord(PlaceOrderDTO placeOrderDTO) {
        System.out.println(modelMapper.map(placeOrderDTO, OrderIdGenerate.class));
        return new ResponseEntity<OrderIdGenerate>(orderIdGenerateRepository.save(modelMapper.map(placeOrderDTO, OrderIdGenerate.class)), HttpStatus.CREATED);
    }

    @Override
    public Integer updateRecord(PlaceOrderDTO placeOrderDTO) {
        return orderIdGenerateRepository.save(modelMapper.map(placeOrderDTO, OrderIdGenerate.class)).getId();
    }


}
