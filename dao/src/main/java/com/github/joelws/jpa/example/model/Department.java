package com.github.joelws.jpa.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "department", orphanRemoval = true)
    private Set<Employee> employees = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}