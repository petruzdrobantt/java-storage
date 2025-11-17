package com.pz.spring_core_demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 100 meter dashes";
    }
}



//@Primary //if we don't use @Qualifier., this one will be chosen as the primary, as long as only this one is marked as Primary