package com.advance.adv2_Abstr_Enum_Interf.abstracts;

/**1
 a. Write an abstract class Shape
 – Data members: numSides
 – Constructor: initialize numSides
 – Concrete method: get method for numSides
 – Abstract methods: getArea(), getPerimeter()
 b. Write a concrete subclass Rectangle
 – Data members: width, height
 c. Write a concrete subclass Triangle
 – Data members: width, height
 In another class, write a main method to define a Rectangle and a Triangle.
 */

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2,4);
        Shape circle = new Circle(3);

        Shape[] shapes = new Shape[] {rectangle, circle};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Sides number: " + shape.getNumSides());
        }

    }

}
