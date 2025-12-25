package com.core.rivision.concepts;

public class Car {

    Engine engine;// Dependency Declaration

    public Car(Engine engine){
        this.engine = engine; // Dependency Injection via Constructor
    }

    public void startCar(){
        System.out.println("Starting Car...");
        //engine = new Engine();// Dependency Creation
        engine.startEngine();
        System.out.println("Car Started");
    }
}
