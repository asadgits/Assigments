package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrderInDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderDetailId;

    @ManyToOne
    @JoinColumn(name = "product_id_fk")
    private Product product;

}
