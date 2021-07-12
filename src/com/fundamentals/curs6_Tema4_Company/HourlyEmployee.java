package com.fundamentals.curs6_Tema4_Company;

public class HourlyEmployee extends Employee{

    int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String phone, int payRate, int hoursWorked) {
        super(firstName, lastName, phone, payRate);
        this.hoursWorked = hoursWorked;
    }


    @Override
    public int pay() {

        return this.payRate * hoursWorked;
    }


}
