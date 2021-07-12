package com.fundamentals.curs12_BankAccount;

import java.util.Scanner;

/** Sa se implementeze un sistem care:
 * Clasa Account (Balance, AccountNumber - unic, deposit bani, scoatem bani, verificam balanta curenta)
 * Clasa Cont Economii (cu dobanda)
 * Clasa de Current Account, cu cont de debit (optiune overdraft - cu o limita)
 * Clasa de Bank (are conturi, se adauga dobanda, se poate afisa toate tranzactiile din cont)
 * Tranzatii pe un cont / Toate tranzactiile / Creare cont nou
 */

public class Main {

    public static void main(String[] args) {



        Bank bank1 = new Bank();
        Account account1 = bank1.openEconomyAccount();
        account1.deposit(200);

        Account account2 = bank1.openCurrentAccount();
        account2.deposit(500);
        account1.withdraw(1000);
        System.out.println(Account.nextValidAccountNumber);

        bank1.update();
//        bank1.readTransactions();

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Choose the operation:");
            System.out.println("   [1] List all transaction");
            System.out.println("   [2] List transaction for account");
            System.out.println("   [3] Create an account");
            System.out.println("   [4] Delete an account");
            int userChoise = scanner.nextInt();
            switch (userChoise) {
                case 1: {
                    bank1.readTransactions("test");
                }
                    break;
                case 2: {
                    System.out.println("which account do you want to see?");
                    bank1.readTransactions(scanner.next());
                }
                    break;
                case 3: {
                    bank1.openCurrentAccount();
                }
                    break;
                case 4: {
                    System.out.println("Which account to delete?");
                    userChoise = scanner.nextInt();
                    bank1.deleteAccountByNumber(userChoise);
                }
                    break;
                case 99: {
                    shouldContinue = false;
                    System.out.println("Exiting...");
                }
                    break;
            }
        }


    }
}
