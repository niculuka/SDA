package com.fundamentals.curs5_Abstr_Encaps.encapsulated;

import com.fundamentals.curs5_Abstr_Encaps.Person;

public class StudentEncapsulated extends Person {
    private String group;

    public StudentEncapsulated(String firstName, String lastName, String cnp, String phoneNumber, String email) {
        super(firstName, lastName, cnp, phoneNumber, email);
        System.out.println("Student constructor called");
    }

    public void getStudentInfo() {
        showDetails();
        getPersonInfo();
        System.out.println(" group = " + this.group);
    }

    public void printDetails() {
        getStudentInfo();
    }

    public void printDetails(String nickname) {
        System.out.println("This is a student which has nickname + " + nickname);
    }

    public void setGroup(String groupValue) {
        if (groupValue == null) {
            System.out.println("Please insert a valid value, otherwise group is default");
            this.group = "default";
        } else if (groupValue.equals("")) {
            System.out.println("Empty value is not accepted, falling back on default value");
            this.group = "default";
        } else {
            this.group = groupValue;
        }
    }

    public String getGroup() {
        return this.group;
    }

    private void showDetails() {
        System.out.println("show-details-method");
    }
}
