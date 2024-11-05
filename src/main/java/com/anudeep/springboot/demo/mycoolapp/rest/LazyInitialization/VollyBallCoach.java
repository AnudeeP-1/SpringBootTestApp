package com.anudeep.springboot.demo.mycoolapp.rest.LazyInitialization;

import org.springframework.stereotype.Service;

@Service
public class VollyBallCoach implements Coach{
    public VollyBallCoach(){
        System.out.println("VollyBall constructor called");
    }
    @Override
    public String exercise() {
        return "Practice vollyball for 1hr";
    }
}
