package com.pz.spring_core_demo.config;

import com.pz.spring_core_demo.common.Coach;
import com.pz.spring_core_demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // if left blank like @Bean, qualiffier will be swimCoach
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
