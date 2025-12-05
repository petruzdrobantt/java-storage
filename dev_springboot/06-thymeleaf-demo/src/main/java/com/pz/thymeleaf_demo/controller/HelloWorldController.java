package com.pz.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping ("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld-hello";
    }

    @RequestMapping("/processForm2")
    public String shout(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName").toUpperCase();

        String message = "Yo! "+name;
        model.addAttribute("message", message);

        return "helloworld-hello";
    }

    @GetMapping("/processForm3")
    public String shout2(@RequestParam("studentName") String name , Model model){
        String message = "Yo! "+name.toUpperCase();
        model.addAttribute("message", message);

        return "helloworld-hello";
    }
}
