package com.example.pos.services;

import com.example.pos.dto.CategoryDTO;
import com.example.pos.entities.Category;
import com.example.pos.exceptionHandler.ServiceGeneralException;
import com.example.pos.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceServiceImpl  implements CategoryService {

    private final ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceServiceImpl(ModelMapper modelMapper, CategoryRepository categoryRepository) {
        this.modelMapper = modelMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<Category> insertRecord(CategoryDTO categoryDTO) {
        System.out.println(categoryDTO.getCategoryName());
        return new ResponseEntity<Category>(categoryRepository.save(modelMapper.map(categoryDTO, Category.class)) , HttpStatus.CREATED);
    }

    @Override
    public Integer updateRecord(CategoryDTO categoryDTO) {
        return categoryRepository.save(modelMapper.map(categoryDTO, Category.class)).getCategoryId();
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
        return categoryRepository.findById(id)
                .orElseThrow(() ->  new ServiceGeneralException("RECORD NOT FOUND !!!" , HttpStatus.BAD_REQUEST));
}
}
