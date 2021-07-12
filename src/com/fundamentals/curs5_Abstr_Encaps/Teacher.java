package com.fundamentals.curs5_Abstr_Encaps;

public class Teacher extends Person {
    String specialization;

    public Teacher(String firstName, String lastName, String cnp, String specialization, String phoneNumber, String email) {
        super(firstName, lastName, cnp, phoneNumber, email);
        this.specialization = specialization;
        System.out.println("Teacher constructor called");
    }

    public void getTeacherInfo() {
        getPersonInfo();
        System.out.println(" specialization = " + this.specialization);
    }

    public void printDetails() {
        System.out.println("This is a teacher");
    }
}
