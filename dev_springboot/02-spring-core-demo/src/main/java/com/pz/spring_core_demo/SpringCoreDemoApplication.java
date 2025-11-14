package com.pz.spring_core_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages = {
//                "com.pz.spring_core_demo", -> base, default search here
//                "com.pz.util"     -> extra, needs to be added here to be used
//        }
//)
@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
