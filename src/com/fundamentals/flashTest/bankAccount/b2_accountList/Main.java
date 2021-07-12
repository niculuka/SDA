package com.fundamentals.flashTest.bankAccount.b2_accountList;

/** Creati o Banca!
 *  Faceti o lista de minim 3 conturi, cu numar unic pentru fiecare cont!
 */
public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = bank.openCurrentAccount();
        Account account1 = bank.openCurrentAccount();
        Account account2 = bank.openCurrentAccount();

        System.out.println(account);
        System.out.println(account1);
        System.out.println(account2);
    }


}
