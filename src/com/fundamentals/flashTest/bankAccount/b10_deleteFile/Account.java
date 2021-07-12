package com.fundamentals.flashTest.bankAccount.b10_deleteFile;
import java.io.File;

public class Account {

    public void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("Account removed!");
        }
        else {
            System.out.println("File not found!");
        }


    }

}
