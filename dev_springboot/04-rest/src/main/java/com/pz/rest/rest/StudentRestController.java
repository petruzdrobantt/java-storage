package com.pz.rest.rest;

import com.pz.rest.entity.Student;
import com.pz.rest.exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();

        students.add(new Student("Johnny", "Cage"));
        students.add(new Student("Scorpion", "Sub Zero"));
        students.add(new Student("Nacho", "Dorito"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) throws StudentNotFoundException {
        if(studentId < 0 || studentId >= students.size())
            throw new StudentNotFoundException("Student not found " + studentId);

        return  students.get(studentId);
    }
}
