package com.core.rivision.concepts;

public class Engine {

    Fuel fuel;
    public Engine(Fuel fuel){
        this.fuel=fuel; // Dependency Creation
    }

   public  void startEngine(){
        fuel.useFuel();
        System.out.println("Engine Started");
    }
}
