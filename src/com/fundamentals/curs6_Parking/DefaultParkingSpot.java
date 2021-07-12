package com.fundamentals.curs6_Parking;

public class DefaultParkingSpot extends ParkingSpot{

    public DefaultParkingSpot(int spotNumber, boolean status) {
        super(spotNumber, status);
    }

    @Override
    public int discount() {
        return 0;
    }
}
