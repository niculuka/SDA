package com.fundamentals.flashTest.bankAccount.b4_deposit;

public class CurrentAccount {
    private float balance = 0;

    public void deposit(float sum) {
        balance = balance + sum;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + balance +
                '}';
    }
}
