package com.anudeep.springboot.demo.mycoolapp.rest.BeanAndComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Animal animal(){
        return new Cat();
    }
}
