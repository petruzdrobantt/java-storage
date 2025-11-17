package com.pz.spring_core_demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Play cricket for 20 minutes";
    }
}
