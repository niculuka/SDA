package com.fundamentals.flashTest.bankAccount.b6_withdraw;

public class Account {
    private float sold;

    public Account(float sold) {
        this.sold = sold;
    }

    public void withdraw(int withdraw) {
        if (sold >= withdraw) {
            sold = sold - withdraw;
            System.out.println("Withdraw executed!");
        } else {
            System.out.println("Not enough money!");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "sold=" + sold +
                '}';
    }
}
