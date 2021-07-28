package com.designPattern.dP1.factory;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Fiesta");
        System.out.println(car.getModel());


    }
}
