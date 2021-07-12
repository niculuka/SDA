package com.fundamentals.curs5_Abstr_Encaps;

public class TeacherAssistant extends Teacher{

    String laborator;

    public TeacherAssistant(String firstName,
                            String lastName,
                            String cnp,
                            String specialization,
                            String phoneNumber,
                            String email,
                            String laborator) {
        super(firstName, lastName, cnp, specialization, phoneNumber, email);
        this.laborator = laborator;
    }

    public void printDetails() {
        System.out.println("This is a teacher assistant");
    }

}
