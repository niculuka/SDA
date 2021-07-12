package com.fundamentals.curs6_Parking;

public class BikeParkingSpot extends ParkingSpot{
    String pin;

    public BikeParkingSpot(int spotNumber, boolean status, String pin){
        super(spotNumber, status);

        this.pin = pin;
    }

    @Override
    public int discount() {
        return 50;
    }
}
