package com.pz.thymeleaf_demo.controller;

import com.pz.thymeleaf_demo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}") //from application.properties
    private List<String> countries;
    @Value("${programmingLanguages}")
    private List<String> programmingLanguages;
    @Value("${operatingSystems}")
    private List<String> operatingSystems;

    @GetMapping("/studentForm")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("programmingLanguages", programmingLanguages);
        model.addAttribute("programmingLanguages", programmingLanguages);
        model.addAttribute("operatingSystems", operatingSystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println(student);

        return "student-confirmation";
    }

}
