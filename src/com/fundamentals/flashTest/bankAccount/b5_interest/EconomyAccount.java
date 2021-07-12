package com.fundamentals.flashTest.bankAccount.b5_interest;

public class EconomyAccount {
    private float balance;
    private float interest;
    private float sold;

    public EconomyAccount(float balance, float interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void applyInterest() {
        sold = balance + balance * interest;
    }

    @Override
    public String toString() {
        return "EconomyAccount{ " +
                "balance=" + balance +
                ", interest=" + interest +
                ", sold=" + sold +
                " }";
    }
}
