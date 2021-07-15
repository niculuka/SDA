package com.advance.adv1_Constr_Inherit.inheritance;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius, 2 * Math.PI * radius);
        this.radius = radius;
    }

    public double getRadius()    {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Circle{" +
                "radius=" + radius +
                '}';
    }
}
