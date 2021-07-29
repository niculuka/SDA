package com.designPattern.dp2.decorator;

public class Main {
    public static void main(String[] args) {
//        Car basicCar = new BasicCar();
//        Car carDecorator = new LuxuryCar(basicCar);
//        carDecorator.assemble();

        Car car = new OffRoadCar();
        Car carDecorator = new LuxuryCar(car);
        carDecorator.assemble();
    }

}
