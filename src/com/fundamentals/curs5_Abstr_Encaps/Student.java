package com.fundamentals.curs5_Abstr_Encaps;

public class Student extends Person{
    String group;

    public Student(String firstName, String lastName, String cnp, String group, String phoneNumber, String email) {
        super(firstName, lastName, cnp, phoneNumber, email);
        this.group = group;
        System.out.println("Student constructor called");
    }

    public void getStudentInfo() {
        getPersonInfo();
        System.out.println(" group = " + this.group);
    }

    public void printDetails() {
        System.out.println("This is a student");
    }

    public void printDetails(String nickname) {
        System.out.println("This is a student which has nickname + " + nickname);
    }
}
