package com.fundamentals.flashTest.bankAccount.b3_deleteAccount;

import java.util.List;

public class Account {
    private int accountNumber;
    static int nextValidAccountNumber = 1;
    private float balance;
    Account findAccount = null;


    public Account() {}
    public Account(float balance) {
        accountNumber = nextValidAccountNumber++;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account findAccountByNumber(List<Account> accountList, int accountToDelete) {
        for (Account account : accountList) {
            if (account.getAccountNumber()==accountToDelete) {
                findAccount = account;
            }
        }
        return findAccount;
    }

    public void removeAccount(List<Account> accountList) {
        accountList.remove(findAccount);
        System.out.println("Account " + findAccount.accountNumber + " is removed!");
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
