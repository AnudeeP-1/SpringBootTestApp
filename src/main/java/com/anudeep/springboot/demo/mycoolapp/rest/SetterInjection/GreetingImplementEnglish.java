package com.anudeep.springboot.demo.mycoolapp.rest.SetterInjection;

import org.springframework.stereotype.Service;

@Service
public class GreetingImplementEnglish implements GreetingService{
    @Override
    public String greet() {
        return "Greeing in English";
    }
}
