package com.fundamentals.flashTest.bankAccount.b9_readFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {

    public void readFromFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }


}
