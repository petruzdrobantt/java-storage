package com.pz.spring_core_demo.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 15 laps in the pool";
    }
}
