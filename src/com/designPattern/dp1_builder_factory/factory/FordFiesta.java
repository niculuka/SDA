package com.designPattern.dp1_builder_factory.factory;

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
