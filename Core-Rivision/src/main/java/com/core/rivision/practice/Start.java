package com.core.rivision.practice;

public class Start {

    public static void main(String args[]){
        System.out.println("Hello World");


        Car car1 = new Car();//creating an object of Car class
        //new - > it's a keyword which is used to create an object
        // objects are created at run time in heap area , and its hashcode is returned and stored in car1 variable
        //so basically car 1 is a reference variable which is holding the hashcode of the object created in heap area
        //if car1 stop referencing the object, then that object will be eligible for garbage collection, which is done automatically by JVM.
        //instantiation of a class automatically makes a call to a constructor  Car().

        car1.name="BMW";
        car1.color="Black";
        car1.model="X5";

        car1.accelerate();
        car1.brake();

        System.out.println("Car Name: "+ car1.name+" "+"Color: "+ car1.color+" "+"Model: "+ car1.model+" Speed: "+ car1.speed);

        Car car2 = new Car();
        // so car1 and car2 are2 different instances of Car class, they have their own copy of instance variables

        car2.name="Audi";
        car2.color="White";
        car2.model="Q7";

        car2.accelerate();
        System.out.println("Car Name: "+ car2.name+" "+"Color: "+ car2.color+" "+"Model: "+ car2.model+" Speed: "+ car2.speed);


    }
}
