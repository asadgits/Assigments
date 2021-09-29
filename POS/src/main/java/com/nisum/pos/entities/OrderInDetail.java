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
    @JoinColumns({
            @JoinColumn(name = "product_id_fk", referencedColumnName = "productId"),
            @JoinColumn(name = "product_quantity", referencedColumnName = "productQuantity")

    })
    private Product product;

}
