package com.fundamentals.curs6_Parking;

// Enunt: A se modela o parcare. Vor fi 2 tipuri de locuri, unul pentru masini si unul pentru biciclete.
//        Diferenta intre cele doua, va fi discount-ul ce se aplica la pret. masina -> 10%, biciclete -> 50%
//        1.Extrage din parcare locurile libere
//        2.Genereaza ticket cu pret
//        mostenire, polimorfism si encapsulare

public class Main {

    public static void main(String[] args) {

        ParkingSpot parkingSpot = new CarParkingSpot(1,false);
        ParkingSpot parkingSpot1 = new BikeParkingSpot(20,false,"1234");
        ParkingSpot defaultParkingSpot = new DefaultParkingSpot(31, false);

        parkingSpot.setPrice(10);
        parkingSpot1.setPrice(20);
        defaultParkingSpot.setPrice(12);

        parkingSpot.generateTicket();
        parkingSpot1.generateTicket();
        defaultParkingSpot.generateTicket();

        ParkingSpot[] psArray = {parkingSpot, parkingSpot1, defaultParkingSpot};
        Parcare parcare = new Parcare("Parcare MALL","adresa",psArray);

        parcare.getFreeParkingSpots();

        System.out.println("=======================================");
        parkingSpot1.bookSpot();



    }
}
