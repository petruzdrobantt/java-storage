package com.pz.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose / to show Hello World

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a 5K";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day.";
    }
}
