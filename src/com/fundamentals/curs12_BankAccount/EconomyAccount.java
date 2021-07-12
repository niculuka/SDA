package com.fundamentals.curs12_BankAccount;

public class EconomyAccount extends Account{

    private float interest;

    public EconomyAccount(float interest) {
        this.interest = interest;
    }

    public void applyInterst() {
        float newBalance = super.getBalance() + super.getBalance() * interest;
        super.setBalance(newBalance);
        write("Interest applied");
    }

    public void withdraw(float sum) {
        if (sum > super.getBalance()) {
            write("The amount is too high");
        } else {
            super.setBalance(super.getBalance() - sum);
            write("Withdraw operation!");
        }
    }

    @Override
    public void processAccount() {
        applyInterst();
    }

    @Override
    public String toString() {
        return "EconomyAccount{" +
                "interest=" + interest + " " + super.toString() +
                '}';
    }



}
