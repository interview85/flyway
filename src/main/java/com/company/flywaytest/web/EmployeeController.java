package com.company.flywaytest.web;

import com.company.flywaytest.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<Integer> findAllEmployees() {
        return ResponseEntity.ok(employeeService.findAllEmployees().size());
    }

    @GetMapping("/employees-min")
    public ResponseEntity<Integer> findAllEmployeesWithMinByDepId(@RequestParam Long depId) {
        return ResponseEntity.ok(employeeService.findAllEmployeesWithMinByDepId(depId).size());
    }

    @GetMapping("/employees-everything")
    public ResponseEntity<Integer> findAllEmployeesWithEverythingByDepId(@RequestParam Long depId) {
        return ResponseEntity.ok(employeeService.findAllEmployeesWithEverythingByDepId(depId).size());
    }

}
