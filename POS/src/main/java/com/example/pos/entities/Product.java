package com.example.pos.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    private Integer product_id;
    private String product_name;
    private Long product_price;

    @ManyToOne
    private Brand brand_id_fk;
    @ManyToOne
    private Category category_id_fk;
}
