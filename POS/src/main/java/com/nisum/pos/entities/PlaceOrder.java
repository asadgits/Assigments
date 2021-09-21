package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class PlaceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderId;

    @Column
    private LocalDate orderDate;

    @OneToMany(targetEntity = OrderDetail.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "placeOrder_id_fk",referencedColumnName = "orderId")
    private List<OrderDetail> orderDetails;

}
