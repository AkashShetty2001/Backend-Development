package com.core.rivision.abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("execution start");
        DrawShape drawShape = new DrawShape();

        Shape circle = new Circle();// at runtime, we are assigning Circle object to Shape interface reference
        drawShape.drawShape(circle); //passing Shape reference to drawShape method
        System.out.println("-------------------");
        Shape rectangle = new Rectangle();
        drawShape.drawShape(rectangle); // Drawing Rectangle

        //access specifiers - defines the visibility of class members
        /*default, public, private, protected
        default-accessible within package
        public-accessible everywhere
        private-accessible within class
        protected-accessible within package and outside package through inheritance
         */

    }
}
