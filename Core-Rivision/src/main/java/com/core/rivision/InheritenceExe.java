package com.core.rivision;

public class InheritenceExe {
    public static void main(String[] args) {
        Dog dog1= new Dog();//tightly coupled means Dog class is dependent on Animal class
        System.out.println("Dog age: "+dog1.age); //inherited property from Animal class
        dog1.eat(); //inherited method from Animal class

        Animal animal1= new Dog();//loosely coupled means Animal class reference is used to refer Dog class object
        //also called as runtime polymorphism
        //during runtime the object will be bound by its behavior
        System.out.println("Animal age: "+animal1.age); //inherited property from Animal class
        animal1.eat(); //inherited method from Animal class
    }
}
