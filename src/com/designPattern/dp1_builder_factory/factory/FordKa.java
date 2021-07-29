package com.designPattern.dp1_builder_factory.factory;

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
