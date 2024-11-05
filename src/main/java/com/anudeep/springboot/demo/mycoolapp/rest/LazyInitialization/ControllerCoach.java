package com.anudeep.springboot.demo.mycoolapp.rest.LazyInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCoach {
    private final Coach coach;
    @Autowired
    public ControllerCoach(@Qualifier("vollyBallCoach") Coach coach){
        this.coach = coach;
    }
    @GetMapping("/coach")
    public String exposeOnWeb(){
        return (coach.exercise());
    }
}
