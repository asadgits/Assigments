package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class OrderIdGenerate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER , orphanRemoval=true)
    @JoinColumn(name = "order_id_fk")
    private List<OrderInDetail> orderInDetailList;

}
