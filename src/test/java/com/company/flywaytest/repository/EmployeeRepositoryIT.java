package com.company.flywaytest.repository;

import com.company.flywaytest.entity.Employee;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@DataJpaTest
//@ImportAutoConfiguration(FlywayAutoConfiguration.class)
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
    //@Sql(scripts = {"/scripts/init.sql", "/scripts/course_test_data_many.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    //@Sql(scripts = "/scripts/clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getAllEmployeesWithEverythingByDepId() {
        int i = 2;
        assertEquals(i, 1);
        //Set<Employee> result = employeeRepository.getAllEmployeesWithEverything();
        //assertThat("Not the right size!", result, hasSize(3));
        // Fetched Access, Staff, Department
        /*assertTrue("Access of Course is not loaded", persistenceUnitUtil.isLoaded(course.get(), "access"));
        assertTrue("Staff of Course is not loaded", persistenceUnitUtil.isLoaded(course.get(), "staff"));
        assertTrue("User of Staff is not loaded", persistenceUnitUtil.isLoaded(course.get().getStaff(), "user"));
        assertTrue("Department of Staff is not loaded", persistenceUnitUtil.isLoaded(course.get().getStaff(), "department"));
        assertThat("Course object is not as expected", course.get(), allOf(
                hasProperty("courseId", equalTo(1L)),
                hasProperty("name", equalTo("Test LTI course #1")),
                hasProperty("created", is(notNullValue())),
                hasProperty("deleted", equalTo(false)))
        );*/
    }

}