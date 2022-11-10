/**
 Author: Cloyd Van S. Secuya
 Filename: Employee.java
 Package: com.secuya.employee.model;
 Date of Creation: September 3, 2022
 Description:
    This is a Java source file that defines the attributes of an Employee.
 */

// PACKAGE SECTION
package com.secuya.employee.model;


// IMPORT SECTION
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@Entity(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;             // This is the ID to be used as PK in the local MySQL DB (it should be auto-gen)

    private String name;        // Assigning the name of the Employee to the database (full-name)
    private int number;         // The employee number
    private double acc_balance; // Account balance, maybe pertains to the bank status of the employee

    public Employee() {}

    public Employee(String name, int number, double acc_balance) {
        this.name = name;
        this.number = number;
        this.acc_balance = acc_balance;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        final Employee employee = (Employee) object;

        return id == employee.id && number == employee.number && Double.compare(employee.acc_balance, acc_balance) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + + Objects.hashCode(this.acc_balance);
        return hash;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number=").append(number).append('\'');
        sb.append(", account_balance=").append(acc_balance);
        sb.append('}');
        return sb.toString();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

}
