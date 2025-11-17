package com.pz.spring_core_demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swing the bat 15 times";
    }
}
