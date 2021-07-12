package com.fundamentals.flashTest.bankAccount.b7_createFile;

/** Deschideti un cont bancar cu un sold initial!
 *  Scrieti soldul intr-un fisier text!
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(200);
        System.out.println(account);
        account.createFile("sold.txt");
    }



}
