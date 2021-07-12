package com.fundamentals.flashTest.bankAccount.b6_withdraw;

/** Deschideti un cont bancar!
 *  Retragere din cont o suma de bani!
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(100);
        System.out.println(account);

        account.withdraw(50);
        System.out.println(account);
    }



}
