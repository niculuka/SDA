package com.advancedCoding.ex27;

import com.advancedCoding.ex19.Computer;

import java.util.Objects;

public class Laptop_copy extends Computer_copy {
    private String battery;

    public Laptop_copy(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public Laptop_copy setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop_copy laptop = (Laptop_copy) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                "} " + super.toString();
    }
}
