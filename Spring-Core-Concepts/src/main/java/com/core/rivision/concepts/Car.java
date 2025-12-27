package com.core.rivision.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

   @Autowired
   Engine engine;// Dependency Declaration

    public Car(Engine engine){
        this.engine = engine; // Dependency Injection via Constructor
    }

    public Car(){
        System.out.println("default constructor called by property tag will call setter method to inject dependency");
        //default constructor, used by spring container to instantiate the object, when we use property tag in xml
    }

    public void setEngine(Engine engine){
        System.out.println("Setter method called by spring container to inject dependency");
        this.engine=engine;// Dependency Injection via Setter, spring container will call this method to inject the dependency, when using xml property tag
    }

    public void startCar(){
        System.out.println("Starting Car...");
        //engine = new Engine();// Dependency Creation
        engine.startEngine();
        System.out.println("Car Started");
    }
}
