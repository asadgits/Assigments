package com.orm.practice.ormpractice.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;
    @Column
    private String teacherName;

    @OneToMany(targetEntity = Courses.class,cascade = CascadeType.ALL)
//    @OneToMany(mappedBy = "teacher")
    @JoinColumn(name = "teacher_id_fk")
    private List<Courses> courses;
}
