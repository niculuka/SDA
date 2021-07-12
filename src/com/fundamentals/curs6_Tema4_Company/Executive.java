package com.fundamentals.curs6_Tema4_Company;

public class Executive extends Employee{

    int bonus;

    public Executive(String firstName, String lastName, String phone, int payRate, int bonus) {
        super(firstName, lastName, phone, payRate);
        this.bonus = bonus;
    }


    @Override
    public int pay() {

        return this.payRate + bonus;
    }


}
