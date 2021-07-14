package com.advance.adv4_generics.model;

public class Car implements Identifiable {
    private String VIN;
    private String color;

    @Override
    public String getId() {
        return VIN;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
