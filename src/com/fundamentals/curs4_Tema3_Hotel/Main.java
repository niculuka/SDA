package com.fundamentals.curs4_Tema3_Hotel;
//      Tema 3 :
//        Sa se implementeze o clasa Hotel pentru care avem urmatoarele atribute :
//        - Address - obiect complex ce detine informatii despre locatia hotelului
//              - adresa
//              - oras
//              - tara
//              - coordonate geografice
//        - Rooms - lista de camere
//              - type - (single / double)
//              - booked - rezervata / nerezervata
//              - number - numarul camerei
//              - Person - persoana care a rezervat camera
//        - Person - obiect complex ce detine informatii despre persoana care a rezervat o anumita camera
//              - nume
//              - prenume
//              - ContactInfo - obiect complex care detine informatii despre modurile de contactare ale persoanei
//        - ContactInfo
//              - email
//              - numar de telefon
//        - Name - numele hotelului
//
//        Sa se implementeze o metoda prin care o anumita persoana poate rezerva o camera :
//              - bookRoom(int number, Person p) unde n este numarul camerii si p este persoana ce rezerva camera
//        Sa se implementeze o metoda prin care putem vedea toate persoanele cazate la hotel impreuna cu datele lor de contact.
//        Sa se implementeze o metoda prin care putem obtine toate detaliile legate despre hotel.
//        Sa se implementeze o metoda prin care putem obtine toate camerele care nu sunt rezervate.

public class Main {

    public static void main(String[] args) {


        Address address = new Address("Neptun 35", "Deva", "Romania", "30.505 / 25.802");
        address.getAddress();
        System.out.println("=========================================================================================");



        Person p1 = new Person("male", "0766112233", "dorel@gmail.com");
        p1.lastName = "Distrugatorul";
        p1.firstName = "Dorel";

        Person p2 = new Person("female", "0766555666", "rutina@gmail.com");
        p2.lastName = "Rutina";
        p2.firstName = "Damaskin";

        Person p3 = new Person("male", "0766111333", "vasile@gmail.com");
        p3.lastName = "Dolanescu";
        p3.firstName = "Vasile";

        Person[] person = {p1, p2, p3};
        int countPersons = 0;
        for (int i = 0; i < person.length; i++) {
            person[i].personNames();
            person[i].getPersonInfo();
            countPersons++;
            System.out.println("----------------");
        }
        System.out.println("=========================================================================================");


        ContactInfo contactInfo = new ContactInfo();
        contactInfo.contactInfoEmail = "info@yahoo.com";
        contactInfo.contactInfoPhoneNumber = "004076111222";
        contactInfo.getContactInfo();
        System.out.println("==========================================================================================");


        HotelName hotelName = new HotelName();
        hotelName.name = "SARMIS";
        hotelName.hotelName();
        System.out.println("==========================================================================================");

        String allInfo;
        allInfo = "EMAIL: " + contactInfo.contactInfoEmail +
                ", PHONE: " + contactInfo.contactInfoPhoneNumber +
                ", NAME: " + hotelName.name;
        System.out.println("Toate informatiile despre hotel: " + allInfo);
        System.out.println("==========================================================================================");





        int totalNumberRooms = 20;
        int unRentRooms = totalNumberRooms -countPersons;
        System.out.println("Numarul camerelor nerezervate este: " + unRentRooms);
        System.out.println("==========================================================================================");



        Rooms r1 = new Rooms("double", true, 1, p1);
        Rooms r2 = new Rooms("single", true, 2, p2);
        Rooms[] hotelRooms = {r1, r2};

        Hotel hotel = new Hotel(hotelRooms);
        hotel.getFreeRooms();



    }
}
