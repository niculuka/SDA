package com.fundamentals.curs12_BankAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

    public static void readFromFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error");;
        }
    }

    public static void createFile(String fileName) {
        File file = new File(fileName + ".txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error!");;
        }
    }

}
