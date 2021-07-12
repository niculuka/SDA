package com.fundamentals.curs8_Vehicles;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("1.2", 4, 150, 4);
        car.drive();
        car.navigateOnRoad();

        SpecialPlain specialPlain = new SpecialPlain(2, 2, "WaterPlain", 250, 4);
        specialPlain.drive();
        specialPlain.fly();
        specialPlain.doFloat();
    }
}
