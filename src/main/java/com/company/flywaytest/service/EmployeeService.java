package com.company.flywaytest.service;

import com.company.flywaytest.entity.Employee;
import com.company.flywaytest.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Set<Employee> findAllEmployeesWithMinByDepId(@NonNull final Long depId) {
        return employeeRepository.findEmployeesWithMinByDepartment_DepId(depId);
    }

    @Transactional(readOnly = true)
    public Set<Employee> findAllEmployeesWithEverythingByDepId(@NonNull final Long depId) {
        return employeeRepository.findEmployeesWithEverythingByDepartment_DepId(depId);
    }
}
