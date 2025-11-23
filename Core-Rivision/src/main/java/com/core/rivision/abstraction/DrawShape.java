package com.core.rivision.abstraction;

public class DrawShape {
    public void drawShape(Shape shape){//it takes Shape interface reference as parameter
        shape.draw();//calling draw method of Shape interface
    }
}
