package com.pz.spring_core_demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Post Construct things "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doDestroyStuff(){
        System.out.println("Pre Destroy things "+ getClass().getSimpleName());
    }

//    For "prototype" scoped beans, Spring does not call the destroy method.

    @Override
    public String getDailyWorkout() {
        return "Play cricket for 20 minutes";
    }
}
