package com.company.flywaytest.feature.domain;

import lombok.Data;

@Data
public class EmployeeDomain {

    private Long empId;

    private String name;

    public String encodeEmployee() {
        return this.empId+":"+this.name;
    }
}
