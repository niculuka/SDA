package com.fundamentals.curs8_Vehicles;

public abstract class Vehicle {
    private int speed;
    private int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public abstract void drive();
}
