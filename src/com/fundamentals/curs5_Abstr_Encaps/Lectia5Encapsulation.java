package com.fundamentals.curs5_Abstr_Encaps;

import com.fundamentals.curs5_Abstr_Encaps.encapsulated.MasterandEncapsulated;
import com.fundamentals.curs5_Abstr_Encaps.encapsulated.StudentEncapsulated;

public class Lectia5Encapsulation {

    public static void main(String[] args) {
        StudentEncapsulated studentPerson = new StudentEncapsulated("Elon", "Musk",
                "elon-musk-cnp", "0643612512", "elon@gmail.com");
        studentPerson.setGroup("b55");
        studentPerson.setYearOfBirth(1980);
        studentPerson.getStudentInfo();


        Laborator lab = new Laborator();
        lab.setNumarDeLocuri(6);
        lab.setNumarulLaboratului(20);

        System.out.println("Numar de locuri = " + lab.getNumarDeLocuri() + " numarul laboratorului = " + lab.getNumarulLaboratului());

        MasterandEncapsulated masterandEncapsulated = new MasterandEncapsulated("Elon", "Musk",
                "elon-musk-cnp", "0643612512", "elon@gmail.com");

        masterandEncapsulated.setDegree("IT");
        masterandEncapsulated.printDetails();

        StudentEncapsulated[] array = {studentPerson, masterandEncapsulated};

        for (int i=0; i<array.length; i++) {
            System.out.println("======================" + i + "==================");
            array[i].printDetails();
        }

    }
}
