package com.pz.thymeleafspring.controller;

import com.pz.thymeleafspring.entity.Employee;
import com.pz.thymeleafspring.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        List<Employee> employeeList = employeeService.findAll();

        model.addAttribute("employees", employeeList);

        return "employees/list-employees";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model model){
        model.addAttribute("employee", new Employee());

        return "employees/employee-form";
    }

    @GetMapping("/showFormUpdate")
    public String showFormUpdate(@RequestParam("employeeId") int employeeId, Model model){
        Employee employee = employeeService.findById(employeeId);

        model.addAttribute("employee", employee);

        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int employeeId){
        employeeService.deleteById(employeeId);

        return "redirect:/employees/list";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);

        //use redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }
}
