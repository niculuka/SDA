package com.fundamentals.curs6_Tema4_Company;

public abstract class CompanyMembers {
    String firstName;
    String lastName;
    String phone;

    public CompanyMembers(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }



    public abstract int pay();
}
