package com.fundamentals.flashTest.bankAccount.b5_interest;

/** Deschideti un cont Economy!
 *  Calculati dobanda la sold si afisati: soldul initial, dobanda si soldul final!
 */
public class Main {

    public static void main(String[] args) {
       EconomyAccount economyAccount = new EconomyAccount(100, 0.05f);
       economyAccount.applyInterest();
       System.out.println(economyAccount);
    }



}
