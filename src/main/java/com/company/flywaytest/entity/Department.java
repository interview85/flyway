package com.company.flywaytest.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    private Long depId;

    @Column(name = "name")
    private String name;
}
