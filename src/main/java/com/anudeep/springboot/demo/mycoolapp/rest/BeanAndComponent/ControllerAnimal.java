package com.anudeep.springboot.demo.mycoolapp.rest.BeanAndComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ControllerAnimal  {
    @Autowired
    @Qualifier("dog")
    private Animal animal;
}
