package com.example.pos.categoryMockitoTesting;

import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class TestCategoryRepository {

    @Mock
    CategoryRepository categoryRepository;

//    @BeforeEach
//    void setup(){
//        MockitoAnnotations.initMocks(this);
//
//    }

//    @Rule
//    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void getAllDataTest() {

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
    public void getOneRecord(){

        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");

        when(categoryRepository.findById(1)).thenReturn(Optional.of(category));
        assertEquals(Optional.of(category), categoryRepository.findById(1));

    }

    @Test
    public void updateRecord(){
        Category category11 = new Category();
        category11.setCategoryId(1);
        category11.setCategoryName("home");

        when(categoryRepository.save(category11)).thenReturn(category11);
        assertEquals(category11 , categoryRepository.save(category11));
    }



}
