package com.example.pos.services;

import com.example.pos.dto.ListValues;
import com.example.pos.dto.ProductDTO;
import com.example.pos.entities.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    List<Product> checkRecord(List<Integer> ids,List<Integer> quantities);

    Product getRecord(Integer id);

    List<Product> getAllRecords();

    ResponseEntity<Product> insertRecord(ProductDTO productDTO);

    Integer updateRecord(ProductDTO productDTO);

    void deleteRecord(Integer id);

}
