package com.example.pos.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class ProductDTO {

    private Integer productId;

    @Size(min=2 , message = "name should have at least 2 characters")
    @NotEmpty(message = "Don't Let the name Empty")
    private String productName;
}
