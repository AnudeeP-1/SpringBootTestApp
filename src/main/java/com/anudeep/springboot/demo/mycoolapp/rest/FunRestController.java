package com.anudeep.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${custom.property1}")
    private String property1;
    @GetMapping("/sayHello")
    public String sayHello(){
        return property1;
    }
    @GetMapping("/")
    public String homePage(){
        return "Hello, I'm hosted in github comminting to check in jenkins!";
    }
    
}
