/**
 Author: Cloyd Van S. Secuya
 Filename: EmployeeController.java
 Package: com.secuya.employee.controller;
 Date of Creation: September 3, 2022
 Description:
    This controller conforms to the standards of RESTful Architecture.
    It is where we can fetch, access, and use all the operations from our CRUD service
 */

// PACKAGE SECTION
package com.secuya.employee.controller;


// IMPORT SECTION
import com.secuya.employee.model.Employee;
import com.secuya.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")        // at the Root path at most
    public List<Employee> getAllEmployees() {
        /**
         * GET
         * Fetch all the resources for the entire list of Employees
         */
        return employeeService.getAllUsers();       // List all resources for Employees (users)
    }

    @RequestMapping(value="/users/{id}")
    public Employee getEmployee(@PathVariable int id) {
        /**
         * GET
         * Fetch the resource of Employee at a specified ID
         */
        return employeeService.getUser(id);         // Fetch the specified user at a specified ID
    }

    @RequestMapping(value="/add-employee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee) {
        /**
         * POST
         * Create a resource for an Employee
         */
        return employeeService.addUser(employee);
    }

    @RequestMapping(value="/update-employee", method = RequestMethod.PUT)
    public Employee updateUser(@RequestBody Employee employee) {
        /**
         * PUT
         * Update the resource of an Employee object
         */
        return employeeService.updateUser(employee);
    }

    @RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){
        /**
         * DELETE
         * Remove or delete the Employee resource at a specified ID
         */
        employeeService.deleteUser(id);
    }

}
