package com.fundamentals.curs8_Vehicles;

public class SpecialPlain extends Plain implements Float {

    public SpecialPlain(int numberOfEngines, int numberOfWings, String model, int speed, int capacity) {
        super(numberOfEngines, numberOfWings, model, speed, capacity);

    }

    @Override
    public void doFloat() {
        System.out.println("Sunt un avion special - Plutesc");
    }
}
