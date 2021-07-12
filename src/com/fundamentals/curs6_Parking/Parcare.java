package com.fundamentals.curs6_Parking;

public class Parcare {
    String name;
    String adresa;
    ParkingSpot[] parkingSpots;

    public Parcare(String name, String adresa, ParkingSpot[] parkingSpots){
        this.name = name;
        this.adresa = adresa;
        this.parkingSpots = parkingSpots;
    }

    public void getFreeParkingSpots(){
        for (int i=0; i < this.parkingSpots.length; i++){
            if(parkingSpots[i].isStatus() == false) {
                System.out.println("Locul " + this.parkingSpots[i].spotNumber + " este liber.");
            }
        }
    }
}
