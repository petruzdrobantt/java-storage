package com.pz.spring_core_demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play cricket for 20 minutes";
    }
}
