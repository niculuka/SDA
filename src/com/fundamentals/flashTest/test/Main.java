package com.fundamentals.flashTest.test;

public class Main {
    private float balance = 100;
    public static void main(String[] args) {
        Main account = new Main();
        System.out.println("Initial sold: " + account.balance);
        account.deposit(200);

        System.out.println("Final sold: " + account.balance);
    }
    public void deposit(float depositedSum) {
        balance = balance + depositedSum;
        System.out.println("Deposited sum: " + depositedSum);
    }

}
