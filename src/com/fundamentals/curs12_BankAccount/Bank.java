package com.fundamentals.curs12_BankAccount;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountList = new ArrayList<>();


    public void update() {
        for (Account account : accountList) {
            account.processAccount();
        }
    }

    public Account openEconomyAccount() {
        EconomyAccount account = new EconomyAccount(0.02f);
        prepareAccount(account);
        return account;
    }

    public Account openCurrentAccount() {
        CurrentAccount account = new CurrentAccount(50);
        prepareAccount(account);
        return account;
    }

    private void prepareAccount(Account account) {
        accountList.add(account);
        FileUtils.createFile(String.valueOf(account.getAccountNumber()));
    }

    public void readTransactions(String path) {
        File file = new File(path + ".txt");
        FileUtils.readFromFile(file);

    }

    public Account findAccountByNumber(int accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deleteAccountByNumber(int accountNumber) {
        Account account = findAccountByNumber(accountNumber);
        if (account != null) {
            accountList.remove(account);
            File file = new File(accountNumber + ".txt");
            file.delete();
            System.out.println("Account removed!");
        } else {
            System.out.println("Account doesn't exist!");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountList=" + accountList +
                '}';
    }
}
