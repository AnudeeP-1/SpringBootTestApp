package com.anudeep.springboot.demo.mycoolapp.rest.LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("Cricket constructor invoked");
    }
    @Override
    public String exercise() {
        return "Practice batting for 20 minutes";
    }
}
