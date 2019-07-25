package com.sumpoint.application.category.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "category")
public class CategoryEntity {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;
}
