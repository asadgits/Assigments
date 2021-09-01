package com.example.pos.controllers;

import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import com.example.pos.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("categoryV1")

public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path = "/{id}")
    public Category getRecord(@PathVariable Integer id) {
        return categoryService.getRecord(id);
    }

    @GetMapping
    public List<Category> getAllRecords() {
        return categoryService.getAllRecords();
    }

    @PostMapping
    public ResponseEntity<Category> insertRecord(@Valid @RequestBody CategoryDTO categoryDTO) {
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
