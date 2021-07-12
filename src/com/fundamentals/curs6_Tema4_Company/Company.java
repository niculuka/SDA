package com.fundamentals.curs6_Tema4_Company;
//      Tema 4 :
//        Sa se implementeze o clasa “Company” care contine un array de CompanyMembers. Un company member are urmatoarele proprietati.
//        - firstNAme
//        - lastName
//        - phone
//        Sa se implementeze o metoda prin care fiecare fiecare CompanyMember poate fi platit.
//        Tip-uri de CompanyMembers:
//        - Volunteer - metoda de pay trebuie sa returneze 0
//        - Employee - metoda de pay trebuie sa returneze valoare trimisa ca parametru prin constructor
//          (in clasa employee o sa avem un atribut nou - payRate)
//        - Executive - metoda de pay trebuie sa returneze valoarea trimisa ca parametru prin constructor (payRate),
//          adunata cu atributul “bonus”, care la fel, este un atribut nou in clasa Executive
//        - HourlyEmployee - clasa de HourlyEmployee va avea un atribut  nou(hoursWorked)
//          si metoda de pay va trebui sa returneze numarul de ore lucrate inmultit cu campul de payRate.
//        - SalesEmployee - clasa SalesEmployee va primi aceeasi parametri ca si clasa de Employee,
//          plus 2 parametrii specifici : int numberOfSales, double comissionRate unde commisionRate-ul
//          este un procent din payrate-ul orar al angajatului. Metoda de pay trebuie sa ia in considerare payRate-ul
//          si sa calculeze bonusul in functie de cate sale-uri a facut utilizat
//        Metoda de payment ar trebui de asemenea sa afiseze in consola cu cat a fost platit fiecare angajat.


public class Company {
    public static void main(String[] args) {

        CompanyMembers volunteer1 = new Volunteer("DOREL", "BOMBA", "0766111222");
        CompanyMembers employee1 = new Employee("Nea", "Caisa", "0766888999", 1000);
        CompanyMembers executive1 = new Executive("Nadia", "Bolovan", "0744223388", 2000, 250);
        CompanyMembers hoursWorked1 = new HourlyEmployee("Fanel", "Neagu", "0762555444", 200, 8);
        CompanyMembers salesEmployee1 = new SalesEmployee("Liviu", "Braica", "0788446688", 3000, 10, 5, 1000);


        CompanyMembers[] companyMembers = {volunteer1, employee1, executive1, hoursWorked1, salesEmployee1};
        for (int i = 0; i < companyMembers.length; i++) {
            int pay = companyMembers[i].pay();
            System.out.println("Payment for: " + companyMembers[i].firstName + " " + companyMembers[i].lastName + " is " + pay);
        }


    }


}
