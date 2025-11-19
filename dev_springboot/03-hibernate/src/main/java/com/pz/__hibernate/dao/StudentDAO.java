package com.pz.__hibernate.dao;

import com.pz.__hibernate.enitity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);
}
