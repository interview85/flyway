package com.company.flywaytest.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "domain")
public class Domain {
    @Id
    private Long prjId;

    @Column(name = "name")
    private String name;
}
