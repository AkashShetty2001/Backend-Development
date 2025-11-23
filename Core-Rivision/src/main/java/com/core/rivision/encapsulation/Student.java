package com.core.rivision.encapsulation;

public class Student {
    //encapsulation is the process of wrapping data members and methods into a single unit
    //it provides controlled access to data members using getter and setter methods
    private String name;//access specifier private is used to restrict direct access from outside the class
    private int age;

    public String getName() {//getter method means to retrieve the value of a private variable
        return name;
    }

    public void setName(String name) { //setter method means to set or update the value of a private variable
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if(name.length()<2) {
            throw new IllegalArgumentException("Name must be at least 2 characters long");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
