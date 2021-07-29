package com.designPattern.dp2.decorator;

public class OffRoadCar implements Car{
    @Override
    public void assemble() {
        System.out.println("OffRoad car assemble...");
    }
}
