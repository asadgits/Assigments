package com.example.pos.categoryMockitoTesting;

import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TestCategoryRepositoryWIthURL {

    @Autowired
    MockMvc mockMvc;

    @Mock
    CategoryRepository categoryRepository;

    @Test
    public void getAllData() throws Exception{

        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("home");

        Category category1 = new Category();
        category1.setCategoryId(2);
        category1.setCategoryName("computer");

        Mockito.when(categoryRepository.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(MockMvcRequestBuilders.get("/categoryV1/").accept(MediaType.APPLICATION_JSON)
                        );

        Mockito.verify(categoryRepository).findAll();

    }


}
