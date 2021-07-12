package com.fundamentals.curs6_Tema4_Company;

public class Volunteer extends CompanyMembers{



    public Volunteer(String firstName, String lastName, String phone) {
        super(firstName, lastName, phone);
    }



    @Override
    public int pay() {
        return 0;
    }

}
