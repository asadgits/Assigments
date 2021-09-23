package com.example.pos.services;

import com.example.pos.dto.ProductDTO;
import com.example.pos.entities.Product;
import com.example.pos.exceptionHandler.ServiceGeneralException;
import com.example.pos.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServicempl implements ProductService {

    private final ModelMapper modelMapper;
    private final ProductRepository productRepository;

    @Autowired
    public ProductServicempl(ModelMapper modelMapper, ProductRepository productRepository) {
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Product> insertRecord(ProductDTO productDTO) {
        System.out.println(productDTO.getProductName());
        return new ResponseEntity<Product>(productRepository.save(modelMapper.map(productDTO, Product.class)) , HttpStatus.CREATED);
    }

    @Override
    public Integer updateRecord(ProductDTO productDTO) {
        return productRepository.save(modelMapper.map(productDTO, Product.class)).getProductId();
    }

    @Override
    public void deleteRecord(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllRecords() {
        return new ArrayList<Product>(productRepository.findAll());
    }

    @Override
    public Product getRecord(Integer id) {
        return productRepository.findById(id)
                .orElseThrow(() ->  new ServiceGeneralException("RECORD NOT FOUND !!!" , HttpStatus.BAD_REQUEST));
}
}
