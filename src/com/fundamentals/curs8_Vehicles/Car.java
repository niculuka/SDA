package com.fundamentals.curs8_Vehicles;

public class Car extends Vehicle implements RoadInterface {
    private String engine;
    private int numberOfWheels;

    public Car(String engine, int numberOfWheels, int speed, int capacity) {
        super(speed, capacity);
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void drive() {
        System.out.println("Sunt sofer - conduc masina");
    }

    @Override
    public void navigateOnRoad() {
        System.out.println("Merge pe drum");
    }
}
