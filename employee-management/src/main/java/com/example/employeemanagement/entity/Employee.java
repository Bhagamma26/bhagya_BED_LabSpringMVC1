package com.example.employeemanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String email;
    private double salary;

    public Employee() {}

    public Employee(String name, String department, String email, double salary) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    // Getters & Setters
}
