package com.example.pos.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CategoryDTO {

    private Integer category_id;

    @Size(min=2 , message = "name should have at least 2 characters")
    @NotEmpty(message = "test")
    private String category_name;
}
