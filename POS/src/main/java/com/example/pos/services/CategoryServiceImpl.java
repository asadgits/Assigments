package com.example.pos.services;

import com.example.pos.repositories.CategoryRepository;
import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategory {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<Category> insertRecord(CategoryDTO categoryDTO) {
        return new ResponseEntity<Category>(categoryRepository.save(modelMapper.map(categoryDTO, Category.class)) , HttpStatus.CREATED);

    }

    @Override
    public Integer updateRecord(CategoryDTO categoryDTO) {
        return categoryRepository.save(modelMapper.map(categoryDTO, Category.class)).getCategory_id();
    }

    @Override
    public void deleteRecord(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllRecords() {
        return new ArrayList<Category>(categoryRepository.findAll());
    }

    @Override
    public Category getRecord(Integer id) {
        return categoryRepository.findById(id).get();
    }


}
