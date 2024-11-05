package com.anudeep.springboot.demo.mycoolapp.rest.SetterInjection;

import org.springframework.stereotype.Service;

@Service
public class GreetingImplementHindi implements GreetingService{
    @Override
    public String greet(){
        return "Greeting in HINDI";
    }
}
