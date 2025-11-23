package com.core.rivision;

public class Main {
    public static void main(String[] args) {
        System.out.println("execution start");
        Car car1= new Car(); //object creation ,automatically invokes zero parameter constructor

        car1.start();//method calling using object
        car1.display();
        car1.accelerate();

        System.out.println("-------------------");

        Car car2= new Car("blue","Audi",150); //object creation ,automatically invokes parameterized constructor
        car2.start();//method calling using object
        car2.display();
    }

}
