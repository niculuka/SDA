package com.fundamentals.flashTest.bankAccount.b2_accountList;

public class Account {
    private int accountNumber;
    static int nextValidAccountNumber = 100;

    public Account() {
        accountNumber = nextValidAccountNumber++;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
