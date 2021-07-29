package com.designPattern.dp1_builder_factory.factory;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Fiesta");
        System.out.println(car.getModel());


    }
}
