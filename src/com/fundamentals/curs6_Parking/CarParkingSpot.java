package com.fundamentals.curs6_Parking;

public class CarParkingSpot extends ParkingSpot {
    int spotNumber;
    boolean status = false;

    public CarParkingSpot(int spotNumber, boolean status){
        super(spotNumber, status);
    }

    @Override
    public int discount() {
        return 10;
    }
}
