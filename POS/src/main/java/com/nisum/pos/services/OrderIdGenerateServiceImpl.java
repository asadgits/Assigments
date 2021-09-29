package com.nisum.pos.services;

import com.nisum.pos.dao.PlaceOrderDTO;
import com.nisum.pos.entities.OrderIdGenerate;
import com.nisum.pos.entities.OrderInDetail;
import com.nisum.pos.entities.Product;
import com.nisum.pos.exceptionHandler.ServiceGeneralException;
import com.nisum.pos.repositories.OrderIdGenerateRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderIdGenerateServiceImpl implements OrderIdGenerateService {

    private final ModelMapper modelMapper;
    private final OrderIdGenerateRepository orderIdGenerateRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public OrderIdGenerateServiceImpl(ModelMapper modelMapper, OrderIdGenerateRepository orderIdGenerateRepository , RestTemplate restTemplate) {
        this.modelMapper = modelMapper;
        this.orderIdGenerateRepository = orderIdGenerateRepository;
        this.restTemplate = restTemplate;
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
        List<OrderInDetail> inDetail = placeOrderDTO.getOrderInDetailList();

        List<Integer> productIds = new ArrayList<>();
        List<Integer> productQuantities = new ArrayList<>();

        inDetail.forEach(orderInDetail -> {
            productIds.add(orderInDetail.getProduct().getProductId());
            productQuantities.add(orderInDetail.getProduct().getProductQuantity());
        } );

        System.out.println("before Request");
        restTemplate.getForObject("http://localhost:8083/checkData?ids="+productIds.stream().map(Object::toString).collect(Collectors.joining(","))+"&quantities="+productQuantities.stream().map(Object::toString).collect(Collectors.joining(",")),String.class);
        System.out.println("Request OK");
     return null;
    }

    @Override
    public Integer updateRecord(PlaceOrderDTO placeOrderDTO) {
        return orderIdGenerateRepository.save(modelMapper.map(placeOrderDTO, OrderIdGenerate.class)).getId();
    }


}
