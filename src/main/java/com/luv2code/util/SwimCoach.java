package com.luv2code.util;

public class SwimCoach implements Coach {

    SwimCoach(){
        System.out.println("Swim Coach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Coach Practice";
    }


    
}
