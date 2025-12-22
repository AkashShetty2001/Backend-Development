package com.core.rivision.practice;


//class in java -> class is a blueprint from which objects are created
//object -> object is an instance of a class

//object can hold state and behavior, basically what ut can hold and what it can do..
//hold -> variables/ properties/ attributes
//do -> behavior -> methods/ functions
public class Car {


    //instance variables -> basically variables for those value which are different for different objects
    String color; //state/ property
    String name;
    String model; //state/ property
    int speed; //state/ property


    //method -> behavior
    void accelerate(){
        System.out.println("accelerating");//behavior/ function
        speed =100;
    }

    void brake(){
        System.out.println("braking");//behavior/ function
        speed =0;
    }

}
