package com.designPattern.dP1.factory;

public class FordFiesta implements Car{
    @Override
    public String getModel() {
        return "Fiesta";
    }

    @Override
    public String getEngineCapacity() {
        return "1400";
    }


}
