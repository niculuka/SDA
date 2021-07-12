package com.fundamentals.curs8_Vehicles;

public class Helicopter extends Vehicle implements FlyInterface{
    private int numberOfEngines;
    private int numberOfElice;

    public Helicopter(int numberOfEngines, int numberOfElice, int speed, int capacity) {
        super(speed, capacity);
        this.numberOfEngines = numberOfEngines;
        this.numberOfElice = numberOfElice;
    }

    @Override
    public void drive() {
        System.out.println("Sunt mare pilot - pilotez elicopterul");
    }

    @Override
    public void liftOf() {
        System.out.println("Se ridica de pe loc");
    }

    @Override
    public void fly() {
        System.out.println("Elicopterul zboara");
    }
}
