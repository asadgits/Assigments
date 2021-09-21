package com.orm.practice.ormpractice.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    @Column
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "product_id_fk")
    private Products product;


//    @ManyToOne
//    @JoinColumn(name = "Teacher_ID_FK")
//    private Teacher teacher;
}
