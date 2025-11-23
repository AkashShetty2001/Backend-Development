package com.core.rivision.abstraction;

public class Circle implements Shape {
    //implements keyword is used to inherit interface
    //we must provide implementation of all abstract methods of interface
    //or else class must be declared abstract
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
