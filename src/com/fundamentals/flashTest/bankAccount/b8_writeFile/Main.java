package com.fundamentals.flashTest.bankAccount.b8_writeFile;

/** Deschideti un cont bancar cu un sold initial!
 *  Scrieti soldul intr-un fisier text!
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println(account);
        account.writeToFile("sold100.txt");
    }

}

/** PS:Daca fisierul nu e creat la momentul scrierii, se creaza acum */