package com.fundamentals.flashTest.bankAccount.b8_writeFile;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
    private float sold;

    public Account(float sold) {
        this.sold = sold;
    }

    public void writeToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(this + "\n");
            fileWriter.close();
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
