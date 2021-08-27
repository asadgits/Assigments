package com.example.pos.services;

import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ICategory {

    Category getRecord(Integer id);

    List<Category> getAllRecords();

    ResponseEntity<Category> insertRecord(CategoryDTO categoryDTO);

    Integer updateRecord(CategoryDTO categoryDTO);

    void deleteRecord(Integer id);
}
