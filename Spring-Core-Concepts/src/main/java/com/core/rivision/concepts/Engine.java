package com.core.rivision.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    @Autowired
    Fuel fuel;// Dependency Declaration Engine is dependent on Fuel

    //Constructor Injection
    public Engine(Fuel fuel){
        this.fuel=fuel; // Dependency Creation
    }

   public  void startEngine(){
        fuel.useFuel();
        System.out.println("Engine Started");
    }
}
