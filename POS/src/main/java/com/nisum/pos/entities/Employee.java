package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer empolyeeId;
    @Column
    private String employeeName;
    @Column
    private String employeePhone;

    public Employee(Integer empolyeeId, String employeeName, String employeePhone) {
        this.empolyeeId = empolyeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }
    public Employee() {

    }

}
