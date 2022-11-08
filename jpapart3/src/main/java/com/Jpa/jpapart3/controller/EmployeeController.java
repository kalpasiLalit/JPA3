package com.Jpa.jpapart3.controller;

import com.Jpa.jpapart3.entities.Employee;
import com.Jpa.jpapart3.repos.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping(path = "/emp")
    public List<Employee> getDetails() {
        List<Employee> employee = employeeRepository.findAll();
        LOGGER.info("get Details->>{}", employee);
        return employee;
    }

    @PostMapping(path = "/emp")
    public Employee postDetails(@RequestBody Employee employee) {
        Employee employee1=employee;
        employee1.setId(employee.getId());
        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpMail(employee.getEmpMail());
        employee1.setPassword(employee.getPassword());
        employeeRepository.save(employee1);
        return employee;
    }


}
