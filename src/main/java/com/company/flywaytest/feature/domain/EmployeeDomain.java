package com.company.flywaytest.feature.domain;

import lombok.Data;

@Data
public class EmployeeDomain {

    private Long empId;

    private String name;

    public String encodeEmployee() {
        return this.empId+":"+this.name;
    }

    public EmployeeDomain decodeEmployee(String string) {
        this.setEmpId(Long.parseLong(string.split(":")[0]));
        this.setName(string.split(":")[1]);
        return this;
    }
}
