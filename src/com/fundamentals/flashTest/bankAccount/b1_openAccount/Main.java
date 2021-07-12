package com.fundamentals.flashTest.bankAccount.b1_openAccount;

/** Creati o Banca!
 *  Deschideti un cont prin Banca, cu sold initial 0!
 */
public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = bank.openAccount();


        System.out.println(account);
    }


}
