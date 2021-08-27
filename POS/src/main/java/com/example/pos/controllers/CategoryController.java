package com.example.pos.controllers;

import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import com.example.pos.services.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    @GetMapping(path = "/{id}")
    public Category getRecord(@PathVariable Integer id) {
        return categoryService.getRecord(id);
    }

    @GetMapping(path = "/data")
    public void gettRecord(@RequestParam(value = "id") Integer id) {
        System.out.println("THIS IS REQUEST PRAM : " + id);
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
