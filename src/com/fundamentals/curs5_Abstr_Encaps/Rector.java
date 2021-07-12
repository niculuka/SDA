package com.fundamentals.curs5_Abstr_Encaps;

public class Rector extends Teacher{

    String managerOfDepartment;

    public Rector(String firstName, String lastName, String cnp, String phoneNumber, String email, String specialization, String managerOfDepartment) {
        super(firstName, lastName, cnp, specialization, phoneNumber, email);
        this.managerOfDepartment = managerOfDepartment;
    }

    public void getRectorInformation() {
        getTeacherInfo();
        System.out.println("Manager of department " + this.managerOfDepartment);
    }

    public void printDetails() {
        System.out.println("This is a reactor");
    }
}
