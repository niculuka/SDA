package com.designPattern.dp2.decorator;

public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic car assemble");
    }
}
