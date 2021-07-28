package com.designPattern.dP1.factory;

public class FordKa implements Car{
    @Override
    public String getModel() {
        return "Ka";
    }

    @Override
    public String getEngineCapacity() {
        return "1000";
    }
}
