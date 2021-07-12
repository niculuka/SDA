package com.fundamentals.curs6_Tema4_Company;

public class Employee extends CompanyMembers{

    int payRate;

    public Employee(String firstName, String lastName, String phone, int payRate) {
        super(firstName, lastName, phone);
        this.payRate = payRate;
    }


    @Override
    public int pay() {
        return this.payRate;
    }


}
