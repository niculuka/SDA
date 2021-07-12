package com.advance.adv2_abstr_enum_interf.abstracts;

public abstract class Shape {

    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int getNumSides() {
        return numSides;
    }

}
