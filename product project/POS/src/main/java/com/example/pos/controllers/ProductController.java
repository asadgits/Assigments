package com.example.pos.controllers;

import com.example.pos.dto.ProductDTO;
import com.example.pos.entities.Product;
import com.example.pos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequestMapping("/product/V1/")

public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
/*

    @PostMapping("/checkData/{list}")
    public Product CheckingRecord(@PathVariable  List<Integer> list) {
        System.out.println(list);
        System.out.println("pakistan zinadabad");
        return new Product("tea");
//        return productService.checkRecord(values);
    }
*/

    @GetMapping("/checkData")
    public List<Product> CheckingRecord(@RequestParam(value = "ids") List<Integer> ids, @RequestParam(value = "quantities") List<Integer> quantities) {
        System.out.println("In to the Product API "+ids+"    "+quantities);
        return productService.checkRecord(ids , quantities);
    }

    @GetMapping(path = "/{id}")
    public Product getRecord(@PathVariable Integer id) {
        return productService.getRecord(id);
    }

    @GetMapping
    public List<Product> getAllRecords() {
        return productService.getAllRecords();
    }

    @PostMapping
    public ResponseEntity<Product> insertRecord(@Valid @RequestBody ProductDTO productDTO) {
        return productService.insertRecord(productDTO);
    }

    @PutMapping
    public Integer updateRecord(@RequestBody ProductDTO productDTO) {
        return productService.updateRecord(productDTO);
    }

    @DeleteMapping
    public void deleteRecord(@RequestParam("id") Integer id) {
        productService.deleteRecord(id);
    }
}

//    private static void accept(String key, List<String> value) {
//        LOG.info(String.format(
//                "Header '%s' = %s",
//                key,
//                value.stream().collect(Collectors.joining("|"))));
//    }
