package com.example.pos.integrationTest;

import com.example.pos.PosApplication;
import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@ExtendWith(SpringExtension.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = PosApplication.class
)
@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:posTestingProperties.properties")
@TestPropertySource(locations = "classpath:posTestingProperties.properties")
//@ContextConfiguration()
@Sql(scripts = {"classpath:query.sql"})
//@ActiveProfiles("posTestingProperties")
class CategoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    ObjectMapper objectMapper;

//    @MockBean
//    CategoryService categoryService;

    @Test
    void testCategory() throws Exception {

//        Category category = new Category();
//        category.setCategoryId(1);
//        category.setCategoryName("home");
//
//        Category category1 = new Category();
//        category1.setCategoryId(2);
//        category1.setCategoryName("kitchen");

//        Mockito.when(categoryService.getAllRecords()).thenReturn(Arrays.asList(category,category1));
//
//         MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/categoryV1/")
//                 .accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(mvcResult -> { System.out.println(MockHttpServletResponse.SC_OK);})
//                .andExpect(jsonPath("$" , hasSize(2)));
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
//

        mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .get("/categoryV1/")
                                .accept(MediaType.APPLICATION_JSON))
                .andDo(print());

    }


    public void getAllData(Integer size) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/category/V1/")
                        .accept(MediaType.APPLICATION_JSON))

                .andExpect(jsonPath("$", hasSize(size)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    public void getData(Integer id) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/categoryV1/" + id)
                        .accept(MediaType.APPLICATION_JSON))

                .andExpect(jsonPath("$.categoryName", is("home")))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    public void insertData(Category category, String name) throws Exception {
        mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .post("/categoryV1/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(category))
                )
                .andExpect(MockMvcResultMatchers.status().isCreated())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.categoryName", is(name))
                );

    }


    public void updateData(Category category) throws Exception {
        mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .put("/categoryV1/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(category))
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$", is(category.getCategoryId()))
                )
                .andDo(print());

    }

//    @BeforeEach
//    void starting(){
//        categoryRepository.deleteAll();
//    }


    @Test
    public void testingAllMethod() throws Exception {
        Category category = new Category();
///////////////////////////////////get All Data /////////////////////////////////////////////////////
        this.getAllData(0);
///////////////////////////////////Insert Data /////////////////////////////////////////////////////
       /* category.setCategoryName("newdata");

        this.insertData(category, category.getCategoryName());
// /////////////////////////////////get Data By Id /////////////////////////////////////////////////////
        this.getData(1);
/////////////////////////////////get All Data /////////////////////////////////////////////////////
        this.getAllData(1);
///////////////////////////////////get All Data /////////////////////////////////////////////////////
        category.setCategoryId(1);
        category.setCategoryName("newdata");

        this.updateData(category);
/////////////////////////////////get Data By Id /////////////////////////////////////////////////////
        this.getData(1);*/
    }
















/*
    @Test
    public void getData() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/categoryV1/{id}", 1).accept(MediaType.APPLICATION_JSON))

                .andExpect(jsonPath("$.categoryName" , is("home")))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }*/


}