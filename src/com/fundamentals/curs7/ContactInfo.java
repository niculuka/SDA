package com.fundamentals.curs7;

public class ContactInfo {

    String name;
    String phoneNumber;

    public ContactInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Name = " + this.name + ", phone number = " + this.phoneNumber;
    }




}
