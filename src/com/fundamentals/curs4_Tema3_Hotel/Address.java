package com.fundamentals.curs4_Tema3_Hotel;

public class Address {
    String address;
    String town;
    String country;
    String coordinates;

    public Address(String address, String town, String country, String coordinates) {
        this.address = address;
        this.town = town;
        this.country = country;
        this.coordinates = coordinates;
    }

    public void getAddress() {
        System.out.println("The hotel address is " + this.address );
        System.out.println("The town is " + this.town);
        System.out.println("The country is " + this.country);
        System.out.println("Here are the coordinates: " + this.coordinates);
    }

}
