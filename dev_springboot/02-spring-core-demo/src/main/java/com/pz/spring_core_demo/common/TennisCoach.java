package com.pz.spring_core_demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the tennis ball 15 times";
    }
}
