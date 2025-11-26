package com.pz.cruddemo.service;

import com.pz.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    List<Employee> findByLastName(String lastName);

    void deleteById(int id);
}
