package com.fundamentals.flashTest.bankAccount.b3_deleteAccount;

import java.util.ArrayList;
import java.util.List;

/** Faceti o lista de conturi cu numar unic!
 *  Stergeti unul dintre conturi, dupa numarul unic!
 */
public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(500);
        Account account2 = new Account(700);
        Account account3 = new Account(900);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        System.out.println(accountList);

        Account account = new Account();
        account.findAccountByNumber(accountList, 3);
        account.removeAccount(accountList);
        System.out.println(accountList);

    }






}
