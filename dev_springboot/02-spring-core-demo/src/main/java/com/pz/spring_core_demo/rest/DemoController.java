package com.pz.spring_core_demo.rest;

import com.pz.spring_core_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,@Qualifier("cricketCoach") Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach = anotherCoach;
        System.out.println(this.getClass().getSimpleName());
    }

    @GetMapping("/check")
    private String check(){
        return "Comparing beans: coach1 == coach2 " + (coach == anotherCoach);
        //for singleton -> true
        //for prototype -> false
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
