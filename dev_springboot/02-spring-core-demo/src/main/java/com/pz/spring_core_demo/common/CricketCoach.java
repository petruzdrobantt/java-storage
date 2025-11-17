package com.pz.spring_core_demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Play cricket for 20 minutes";
    }
}
