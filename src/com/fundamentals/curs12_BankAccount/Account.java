package com.fundamentals.curs12_BankAccount;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Account  {
    private float balance = 0;
    private int accountNumber;
    static int nextValidAccountNumber = 100;

    public Account() {
        accountNumber = nextValidAccountNumber++;
    }


    public abstract void withdraw(float sum);
    public abstract void processAccount();

    public void write(String message) {
        writeToFile(message, "test.txt");
        writeToFile(message, accountNumber + ".txt");
    }

    public void writeToFile(String message, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.write(this + " " + message + "\n" );
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("Error");;
        }
    }

    public void deposit(float sum) {
        balance = balance + sum;
        write("Deposit made");
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
