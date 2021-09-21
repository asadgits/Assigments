package com.nisum.pos.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category{

    @Id
    private Integer categoryId;

    private String categoryName;
//
//    @OneToMany(targetEntity = OrderDetail.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "Category_id_fk",referencedColumnName = "categoryId")
//    private List<Category> categories ;

    @ManyToOne
    private OrderDetail orderDetail;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer category_id) {
        this.categoryId = category_id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category_name) {
        this.categoryName = category_name;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category_id=" + categoryId +
                ", category_name='" + categoryName + '\'' +
                '}';
    }
}
