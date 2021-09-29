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

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServicempl implements ProductService {

    private final ModelMapper modelMapper;
    private final ProductRepository productRepository;

    private List<Product> products = new ArrayList<>();

    @Autowired
    public ProductServicempl(ModelMapper modelMapper, ProductRepository productRepository) {
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Product> insertRecord(ProductDTO productDTO) {
        System.out.println(productDTO.getProductName());
        return new ResponseEntity<Product>(productRepository.save(modelMapper.map(productDTO, Product.class)), HttpStatus.CREATED);
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
    public List<Product> checkRecord(List<Integer> ids, List<Integer> quantities) {

        products = productRepository.findAllByProductIdIn(ids);

        if (products.isEmpty() || (products.size() != ids.size())) {
            throw new ServiceGeneralException("Record Not Found !!! ", HttpStatus.BAD_REQUEST);
        } else {
            System.out.println("All Products matched !!!");
//            for(Product product:products){
//                int i=0;
//                if(quantities.get(i) > product.getProductQuantity()){
//                    throw new ServiceGeneralException("QUANTITY MISSED MATCHED of Product "+product.getProductName() , HttpStatus.BAD_REQUEST);
//                }
//                i++;
//            }
            System.out.println(products.stream().flatMap(x-> quantities.stream().filter(y-> x.getProductQuantity() <= y)).findAny()
                    .orElseThrow(()-> new ServiceGeneralException("QUANTITY MISSED MATCHED of Product " , HttpStatus.BAD_REQUEST)));
            System.out.println(quantities
                    .stream().flatMap(y->products.stream()
                            .filter(x-> y <= x.getProductQuantity())

                    ));


//            products.stream().forEach(product -> );

        }

        return products;
    }


    @Override
    public Product getRecord(Integer id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ServiceGeneralException("RECORD NOT FOUND !!!", HttpStatus.BAD_REQUEST));
    }
}
