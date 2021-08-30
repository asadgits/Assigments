package com.example.pos.controllers;

import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import com.example.pos.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

//    @GetMapping(path = "/{id}")
//    public Category getRecord(@PathVariable Integer id) {
//        return categoryService.getRecord(id);
//    }


    @GetMapping(path = "/{id}")
    public Category getRecord(@PathVariable Integer id) {
        return categoryService.getRecord1(id);
    }


    @GetMapping(path = "/data")
    public void gettRecord(@RequestParam(value = "id") Integer id) {
        System.out.println("THIS IS REQUEST PRAM : " + id);
    }

//    @RequestHeader MultiValueMap<String, String> headers) {
//        headers.forEach((key, value) -> {
//            LOG.info(String.format(
//                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
//        });


    @GetMapping(path = "/headerdata")
    public void getHeaderData(@RequestHeader MultiValueMap<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format(
                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));});
    }
        @GetMapping
    public List<Category> getAllRecords() {
        return categoryService.getAllRecords();
    }

    @PostMapping
    public ResponseEntity<Category> insertRecord(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.insertRecord(categoryDTO);
    }

    @PutMapping
    public Integer updateRecord(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateRecord(categoryDTO);
    }

    @DeleteMapping
    public void deleteRecord(@RequestParam("id") Integer id) {
        categoryService.deleteRecord(id);
    }
}
