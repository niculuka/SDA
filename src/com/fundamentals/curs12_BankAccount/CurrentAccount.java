package com.fundamentals.curs12_BankAccount;

public class CurrentAccount extends Account{

    private float overdraftLimit;

    public CurrentAccount(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(float sum) {
        float currentBalance = super.getBalance();
        if (sum > overdraftLimit + currentBalance) {
            write("withdraw - insufficient funds!");
        } else {
            currentBalance = currentBalance - sum;
            super.setBalance(currentBalance);
            write("Withdraw successful");
        }
    }

    @Override
    public void processAccount() {
        if (super.getBalance() < 0) {
            notifyMessage();
        }
    }

    public void notifyMessage() {
        System.out.println("You have overdraft!");
        write("Overdraft - Notify");
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit + " " + super.toString() +
                '}';
    }


}
