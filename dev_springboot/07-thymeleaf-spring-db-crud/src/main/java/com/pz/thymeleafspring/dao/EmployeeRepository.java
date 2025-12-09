package com.pz.thymeleafspring.dao;

import com.pz.thymeleafspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //jpa repositor query-methods
    public List<Employee> findAllByOrderByLastNameAsc();
}
