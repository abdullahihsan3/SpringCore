package com.luv2code.util;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    GolfCoach(){
        System.out.println("Golf Coach Constructor"  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Golf Practice Makes Perfect :)";
    }
    
}