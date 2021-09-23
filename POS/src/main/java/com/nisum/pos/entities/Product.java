package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
//@Entity
//@Table(name = "tbl_product")
public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Long productPrice;
}
