package com.advance.adv1_Constr_Inherit.inheritance;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        super(length * width, 2 * (length + width));
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
