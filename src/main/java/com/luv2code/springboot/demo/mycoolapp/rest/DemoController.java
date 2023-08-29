package com.luv2code.springboot.demo.mycoolapp.rest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.util.Coach;

@RestController
public class DemoController {

    private @Qualifier("aquatic") Coach coach;
    DemoController(@Qualifier("aquatic") Coach coach){
        System.out.println("In Constructor"+getClass().getSimpleName());
        this.coach = coach;
    }
    // @Autowired //Autowired allows automatic dependency injection
    // public void setCoach(@Qualifier("cricketCoach") Coach coach){
    //     this.coach = coach;
    // }
    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return coach.getDailyWorkout();
    }


    
}
