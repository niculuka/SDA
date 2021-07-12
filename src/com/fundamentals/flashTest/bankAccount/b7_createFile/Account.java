package com.fundamentals.flashTest.bankAccount.b7_createFile;
import java.io.File;
import java.io.IOException;

public class Account {
    private float sold;

    public Account(float sold) {
        this.sold = sold;
    }

    public void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "sold=" + sold +
                '}';
    }

}
