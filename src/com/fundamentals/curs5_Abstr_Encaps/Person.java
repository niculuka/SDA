package com.fundamentals.curs5_Abstr_Encaps;

public class Person {
    String firstName;
    String lastName;
    String cnp;
    String phoneNumber;
    String email;
    int yearOfBirth;

    public Person(String firstName, String lastName, String cnp, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println("Person constructor called");
    }

    public void getPersonInfo() {
        System.out.println("First name is = " + this.firstName +
                            " Last name is = " + this.lastName +
                            " Cnp is = " + this.cnp +
                            " Phone number is = " + this.phoneNumber +
                            " Email is = " + this.email +
                            " Birth year = " + this.yearOfBirth);
    }

    public void printDetails() {
        System.out.println("this a person");
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 2021) {
            System.out.println("The year you've introduced is in future");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

}
