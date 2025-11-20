package com.pz.__hibernate;

import com.pz.__hibernate.dao.StudentDAO;
import com.pz.__hibernate.enitity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner -> {
//            createStudent(studentDAO);
            createMultipleStudents(studentDAO);
//                readStudent(studentDAO);
//            queryForStudents(studentDAO);
//            queryForStudentsByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.printf("Deleted %d rows", studentDAO.deleteAll());
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3;
        System.out.println("Deleting student with id: "+studentId);
        studentDAO.delete(studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 2;

        System.out.println("Getting student with id: "+studentId);
        Student newStudent = studentDAO.findById(studentId);

        System.out.println("Saving changes");
        newStudent.setFirstName("Boss");

        studentDAO.update(newStudent);
        System.out.println("Modified student: "+newStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        studentDAO.findByLastName("Cage").forEach(System.out::println);
    }

    private void queryForStudents(StudentDAO studentDAO) {
        studentDAO.findAll().forEach(System.out::println);
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating a student");
        Student student = new Student("Max", "Verstappen", "mxcver@hotmal.c");

        System.out.println("Saving student");
        studentDAO.save(student);

        System.out.println("Saved student with id: " + student.getId());

        System.out.println("Searching for student with id: "+student.getId());
        Student newStudent = studentDAO.findById(student.getId());

        System.out.println("Found student: "+newStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        Student student1 = new Student("Johnny", "Cage", "john@cage.c");
        Student student2 = new Student("Scorption", "SubZero", "mortal@kombat.s");
        Student student3 = new Student("Malicious", "Mali", "MaliMalicious@yahoo.c");

        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating a student");
        Student student = new Student("Max", "Verstappen", "mxcver@hotmal.c");

        System.out.println("Saving student");
        studentDAO.save(student);

        System.out.println("Saved student with id: " + student.getId());
    }
}
