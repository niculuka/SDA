package com.advancedCoding.ex13;

import java.util.HashSet;
import java.util.Set;

public class CarServiceImpl implements CarService{
    private Set<Car> cars = new HashSet<>();

    @Override
    public void addCars(Set<Car> cars) {
        this.cars.addAll(cars);
    }
}
