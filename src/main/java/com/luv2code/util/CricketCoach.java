package com.luv2code.util;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Used to create a new instance for each object
public class CricketCoach implements Coach {
    //define out init method

    @PostConstruct
    public void init(){
        System.out.println("Init Method Called");
    }
    //define our destroy method 
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy Method Called");
    }
    CricketCoach(){

        System.out.println("Cricket Coach Constructor"  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Cricket Practice Makes Perfect :)";
    }
    
}
