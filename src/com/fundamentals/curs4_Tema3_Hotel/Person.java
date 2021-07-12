package com.fundamentals.curs4_Tema3_Hotel;

public class Person {
    String lastName;
    String firstName;

    String gender;
    String phone;
    String email;



    public void personNames() {
        System.out.println("Last Name: " + this.lastName);
        System.out.println("First Name: " + this.firstName);
    }





    public Person(String gender, String phone, String email) {
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }
    public void getPersonInfo() {
        System.out.println("Gender: " + this.gender);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
    }

}
