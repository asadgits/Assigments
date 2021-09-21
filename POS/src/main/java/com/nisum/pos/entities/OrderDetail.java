package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class OrderDetail {

    @Id
    private Integer orderDetailId;

    @Column
    private Integer categoryId;

    @Column
    private Integer productQuantity;

    @OneToMany
    @JoinColumn(name = "category_id_fk" , referencedColumnName = "categoryId")
    private List<Category> category;


}
