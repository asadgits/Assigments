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
    @JoinColumn(name = "category_id_fk")
    private Category category;

}
