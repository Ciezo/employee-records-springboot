/**
 Author: Cloyd Van S. Secuya
 Filename: EmployeeRepository.java
 Package: com.secuya.employee.repository;
 Date of Creation: September 3, 2022
 Description:
    An interface to define the repository where we can store data for resources to which we can
    also utilize this for the local instance of our database on local machine
 */

// PACKAGE SECTION
package com.secuya.employee.repository;


// IMPORT SECTION
import com.secuya.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
