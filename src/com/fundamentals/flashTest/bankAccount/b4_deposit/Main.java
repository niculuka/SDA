package com.fundamentals.flashTest.bankAccount.b4_deposit;
/** Creati o Banca!
 *  Deschideti un cont Curent prin Banca!
 *  Faceti un depozit!
 */
public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        CurrentAccount currentAccount = bank.openCurrentAccount();
        currentAccount.deposit(200);

        System.out.println(currentAccount);
    }


}
