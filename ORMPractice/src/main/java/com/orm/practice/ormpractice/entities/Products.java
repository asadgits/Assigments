package com.orm.practice.ormpractice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_product")
public class Products {

        @Id
        private Integer product_id;
        private String product_name;
        private Long product_price;

}
