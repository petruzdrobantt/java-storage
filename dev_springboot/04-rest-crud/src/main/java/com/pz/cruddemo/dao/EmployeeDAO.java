package com.pz.cruddemo.dao;

import com.pz.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee save(Employee employee);

    Employee findById(int id);

    List<Employee> findAll();

    List<Employee> findByLastName(String lastName);

    void deleteById(int id);

    int deleteAll();
}
