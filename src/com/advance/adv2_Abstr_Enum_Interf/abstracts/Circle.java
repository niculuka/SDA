package com.advance.adv2_Abstr_Enum_Interf.abstracts;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(1);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * (Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
