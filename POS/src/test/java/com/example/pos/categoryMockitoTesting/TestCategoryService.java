package com.example.pos.categoryMockitoTesting;

import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class TestCategoryService {

//    CategoryService categoryService = Mockito.mock(CategoryServiceServiceImpl.class);
//    CategoryController categoryController = new CategoryController(categoryService);

    @InjectMocks
    CategoryRepository categoryRepository;


    @BeforeEach
    void setup(){
//        MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);
    }


    @Rule
    public MockitoRule rule = MockitoJUnit.rule();


    @Test
    void getAllDataTest() {

        List<Category> categoryList = new ArrayList<>();
        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");

        Category category1 = new Category();
        category1.setCategoryId(2);
        category1.setCategoryName("computer");

        categoryList.add(category);
        categoryList.add(category1);

        when(categoryRepository.findAll()).thenReturn(categoryList);
        assertEquals(categoryList, categoryRepository.findAll());
    }

    @Test
    void getOneRecord(){

        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");

        when(categoryRepository.findById(1)).thenReturn(Optional.of(category));
        assertEquals(Optional.of(category), categoryRepository.findById(1));

    }


}
