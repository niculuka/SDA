package com.fundamentals.curs8_Vehicles;

public class Plain extends Vehicle implements FlyInterface {
    private int numberOfEngines;
    private int numberOfWings;
    private String model;

    public Plain(int numberOfEngines, int numberOfWings, String model, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfEngines = numberOfEngines;
        this.numberOfWings = numberOfWings;
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Sunt pilot - pilotez avionul");
    }

    @Override
    public void liftOf() {
        System.out.println("Accelereaza si se ridica");
    }

    @Override
    public void fly() {
        System.out.println("Avionul zboara");
    }
}
