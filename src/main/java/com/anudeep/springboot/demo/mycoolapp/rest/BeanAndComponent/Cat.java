package com.anudeep.springboot.demo.mycoolapp.rest.BeanAndComponent;

public class Cat implements Animal{
    public String sound;
    @Override
    public void sound() {
       sound = "Mew mew";
    }
}
