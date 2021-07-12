package com.fundamentals.flashTest.bankAccount.b9_readFile;
import java.io.File;

/** Cititi soldul unui cont, dintr-un fisier text!
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        File file = new File("sold1.txt");
        account.readFromFile(file);

    }



}
