package com.example.pos.categoryMockitoTesting;

import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class TestCategoryService {

    @Mock
    CategoryRepository categoryRepository;

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

        assertEquals(2, categoryList.size());
    }

    @Test
    void getOneRecord(){

        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");

        when(categoryRepository.findById(1)).thenReturn(Optional.of(category));

        assertEquals(Optional.of(1),Optional.of(category.getCategoryId()));
        assertEquals(Optional.of("home"),Optional.of(category.getCategoryName()));

    }

    @Test
    void insertRecord(){
        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");
        when(categoryRepository.save(category)).thenReturn(category);

        assertEquals(1,category.getCategoryId());
        assertEquals("home",category.getCategoryName());
    }

    @Test
    void updaterecord(){

//        Category category = new Category();
//        category.setCategoryId(1);
//        category.setCategoryName("Update Record");
//        Integer id = category.getCategoryId();

//        when().thenReturn(category);
//
//        assertEquals(category, categoryRepository.save(category));

    }


}
