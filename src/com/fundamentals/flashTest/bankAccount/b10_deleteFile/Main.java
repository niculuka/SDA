package com.fundamentals.flashTest.bankAccount.b10_deleteFile;


import java.io.File;

/** Stergeti un fisierul text!
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        File file = new File("sold6.txt");
        account.deleteFile(file);

    }



}
