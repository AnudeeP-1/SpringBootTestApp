package com.anudeep.springboot.demo.mycoolapp.rest.BeanAndComponent;

public class Dog implements Animal{
    public String sound;
    Dog(){
        System.out.println("Im dog kha");
    }
    @Override
    public void sound() {
        sound = "BOW BOW";
        System.out.println(sound);
    }

}
