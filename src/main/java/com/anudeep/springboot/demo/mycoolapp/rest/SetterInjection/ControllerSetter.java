package com.anudeep.springboot.demo.mycoolapp.rest.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class ControllerSetter {
    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(@Qualifier("greetingImplementEnglish") GreetingService greetingService){
        this.greetingService=greetingService;
    }
    //setter injection
    @GetMapping("/greet")
    public String printGreet(){
        System.out.println("In Greet");
        return (greetingService.greet());
    }
}
