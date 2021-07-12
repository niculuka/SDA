package com.fundamentals.curs8_Vehicles;

public class Boat extends Vehicle implements Float {
    private String engine;

    public Boat(int speed, int capacity) {
        super(speed, capacity);
    }


    @Override
    public void drive() {
        System.out.println("Sunt marinar - conduc barca");
    }

    @Override
    public void doFloat() {
        System.out.println("Barca pluteste pe apa");
    }
}
