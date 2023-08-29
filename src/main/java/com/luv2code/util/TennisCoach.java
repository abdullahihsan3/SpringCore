package com.luv2code.util;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    TennisCoach(){

        System.out.println("Tennis Coach Constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Tennis Practice Makes Perfect :)";
    }
    
}