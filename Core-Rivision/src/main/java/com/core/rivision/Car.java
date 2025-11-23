package com.core.rivision;

public class Car {
   //properties of car
    // instance variable changes with object

   private String color;
    private String model;
    private int speed;

    //constructor actual property initialize
    //automatically called when object is created
    //zero parameter constructor if user not created jvm creates default constructor
    public Car(){
        this.color = "red";
        this.model = "BMW";
        this.speed = 100;
        //this refers to current object
    }

    //parameterized constructor
    public Car(String color,String model,int speed){
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    //behavior of car
    public void start(){
        System.out.println("car is starting");
        System.out.println(this.model+" car is starting");
    }

    public void stop(){
        System.out.println("car is stopping");
        System.out.println(this.model+" car is stopping");
    }

    public void accelerate(){
        System.out.println("car is accelerating");
        System.out.println(this.model+" car is accelerating");
    }

    public void brake(){
        System.out.println("car is braking");
        System.out.println(this.model+" car is braking");
    }

    public void display(){
        System.out.println("car color: "+this.color);
        System.out.println("car model: "+this.model);
        System.out.println("car speed: "+this.speed);
    }


}
