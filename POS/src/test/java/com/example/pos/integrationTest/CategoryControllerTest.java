package com.example.pos.integrationTest;

import com.example.pos.PosApplication;
import com.example.pos.entities.Category;
import com.example.pos.repositories.CategoryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = PosApplication.class
)
@AutoConfigureMockMvc
////@TestPropertySource(locations = "classpath:posTestingProperties.properties")//first approch
@ActiveProfiles("posTestingProperties")  // second approch
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //for manage orders in junit5 tests
class CategoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    private final CategoryRepository categoryRepository;
    private static String categoryName;
    private static Integer categoryId;


    @Autowired
    CategoryControllerTest(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @ParameterizedTest
    @Order(1)
    @MethodSource
    public void insertData(Category category) throws Exception {

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .post("/category/V1/")
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
                        MockMvcResultMatchers.jsonPath("$.categoryName", is(categoryName))
                )
                .andReturn();
        System.out.println(new JSONObject(result.getResponse().getContentAsString()).get("categoryId"));
        categoryId = (Integer) new JSONObject(result.getResponse().getContentAsString()).get("categoryId");

    }


    @ParameterizedTest
    @Order(2)
    @MethodSource
    public void getData(Integer id) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/category/V1/" + id)
                        .accept(MediaType.APPLICATION_JSON))

                .andExpect(jsonPath("$.categoryId", is(id)))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    @Test
    @Order(3)
    public void getAllData() throws Exception {

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/category/V1/")
                        .accept(MediaType.APPLICATION_JSON))

                .andExpect(jsonPath("$", hasSize(Math.toIntExact(countSize()))))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

    }

    @ParameterizedTest
    @Order(4)
    @MethodSource("categoryUpdate")
    public void updateData(Category category) throws Exception {

        System.out.println(categoryId);
        mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .put("/category/V1/")
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

        deleteData();

    }


    public void deleteData() {
        categoryRepository.deleteAllInBatch(new ArrayList<Category>(categoryRepository.findAll()));
    }


    private Long countSize() {
        return categoryRepository.count();

    }

    static Stream<Arguments> insertData() {
        categoryName = String.valueOf(new Faker().cat().name());
        return Stream.of(
                arguments(categoryName)
        );
    }


    static Stream<Arguments> categoryUpdate() {

        Category category = new Category();
        category.setCategoryId(categoryId);
        category.setCategoryName("category Upadated");
        return Stream.of(
                arguments(category)
        );
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                arguments(categoryId)
        );
    }



}