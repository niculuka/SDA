package com.fundamentals.curs7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContactInfo> contactInfos = new ArrayList<>();

        System.out.println("Insert an action: [1]-addContact    [2]-See all contacts    [3]-Exit");

        int action = scanner.nextInt();
        while (action == 1 || action == 2) {
            switch (action) {
                case 1: {
                    System.out.println("Please insert your contact name: ");
                    String contactName = scanner.next();
                    System.out.println("Please insert your phone number: ");
                    String phoneNumber = scanner.next();

                    ContactInfo terminalContactInfo = new ContactInfo(contactName, phoneNumber);
                    contactInfos.add(terminalContactInfo);
                    System.out.println(terminalContactInfo);
                    break;
                    }
                case 2:
                    for (ContactInfo contactInfoAtCurrentIndex : contactInfos) {
                        System.out.println(contactInfoAtCurrentIndex);
                    }
                    System.out.println("See all contacts");
                    break;
                case 3:
                    System.out.println("Quiting program");
                    break;
                default:
                    System.out.println("Quiting program...");
                    break;
            }
            System.out.println("Insert an action: [1]-addContact    [2]-See all contacts    [3]-Exit");
            action = scanner.nextInt();
        }
    }


}
