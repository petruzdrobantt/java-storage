package com.pz.spring_core_demo.rest;

import com.pz.spring_core_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

//    @Autowired - constructor injection
//    public DemoController(Coach coach) {
//        this.coach = coach;
//    }

    //setter injection -> with decorator autowired you can use any method name, not necessarily setCoach
    @Autowired
    public void anyName(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }


}
