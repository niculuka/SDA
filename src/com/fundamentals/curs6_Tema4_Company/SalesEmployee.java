package com.fundamentals.curs6_Tema4_Company;

public class SalesEmployee extends Employee{

    int numberOfSales;
    double comissionRate;
    int bonus;

    public SalesEmployee(String firstName, String lastName, String phone, int payRate, int numberOfSales,
                          double comissionRate, int bonus) {
        super(firstName, lastName, phone, payRate);
        this.numberOfSales = numberOfSales;
        this.comissionRate = comissionRate;
        this.bonus = bonus;
    }


    @Override
    public int pay() {
        double aftercomissionRate = payRate + payRate * comissionRate;
        double finalPayRate = aftercomissionRate + bonus + numberOfSales;
        return (int) finalPayRate;
    }

    public int pay(int extraBonus) {
        return pay() + extraBonus;
    }


}
