package com.core.rivision;

public class Dog extends Animal{
    //extends Animal to inherit properties and behavior of Animal class
    //inheritance is a mechanism where a new class is derived from an existing class

    @Override//annotation to indicate that we are overriding the method of parent class
    public void eat(){
        System.out.println("Dog is eating");
    }

}
