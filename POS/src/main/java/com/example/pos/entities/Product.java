package com.example.pos.entities;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public Product() {

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer category_id) {
        this.productId = category_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String category_name) {
        this.productName = category_name;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category_id=" + productId +
                ", category_name='" + productName + '\'' +
                '}';
    }
}
