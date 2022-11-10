/**
 Author: Cloyd Van S. Secuya
 Filename: EmployeeService.java
 Package: com.secuya.employee.services;
 Date of Creation: September 3, 2022
 Description:
    It is where the bin is generated or the XML schema file is conformed with the help of
    RESTful design pattern.
 */

// PACKAGE SECTION
package com.secuya.employee.services;


// IMPORT SECTION
import com.secuya.employee.model.Employee;
import com.secuya.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository emp_repo;

    public List<Employee> getAllUsers() {
        List<Employee> employees_records = new ArrayList<>();
        emp_repo.findAll().forEach(employees_records::add);
        return employees_records;
    }

    public Employee addUser(Employee emp) {
        return emp_repo.save(emp);
    }

    public Employee updateUser(Employee emp) {
        return emp_repo.save(emp);
    }

    public Employee getUser(int id) {
        Optional<Employee> emp = emp_repo.findById(id);
        if(emp.isPresent()) {
            return emp.get();
        }
        else
            return null;
    }

    public void deleteUser(int id) {
        Optional<Employee> emp = emp_repo.findById(id);
        if(emp.isPresent()) {
            emp_repo.delete(emp.get());
        }
    }
}
