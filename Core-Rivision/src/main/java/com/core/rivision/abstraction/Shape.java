package com.core.rivision.abstraction;

public interface Shape {
    //interface acts as a contract between server and client.
    //it is 100 percent abstract class
    //inside interface all methods are  public abstract by default
    //all variables are public static final by default

    //from java 8 onwards we can have default and static methods in interface
    //why? to provide backward compatibility
    void draw();
}
