package com.sumpoint.application.region.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "region")
public class RegionEntity {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;
}
