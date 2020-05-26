package com.company.flywaytest.repository;

import com.company.flywaytest.entity.Employee;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@DataJpaTest
@ImportAutoConfiguration(FlywayAutoConfiguration.class)
class EmployeeRepositoryIT {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private PersistenceUnitUtil persistenceUnitUtil;

    @BeforeTestClass
    public void setUp() {
        persistenceUnitUtil = entityManagerFactory.getPersistenceUnitUtil();
    }

    @Test
    @Disabled
    public void getAllEmployeesWithEverythingByDepId() {
        Set<Employee> result = employeeRepository.findEmployeesByDepartment_DepId(1L);
        assertThat("Not the right size!", result, hasSize(3));
    }

}