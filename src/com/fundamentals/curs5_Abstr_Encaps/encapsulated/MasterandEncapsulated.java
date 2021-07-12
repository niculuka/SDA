package com.fundamentals.curs5_Abstr_Encaps.encapsulated;

public class MasterandEncapsulated extends StudentEncapsulated{

    private String degree;

    public MasterandEncapsulated(String firstName, String lastName, String cnp, String phoneNumber, String email) {
        super(firstName, lastName, cnp, phoneNumber, email);
        this.setGroup("MASTERAND_GROUP_1");
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if (degree == null) {
            System.out.println("Degree shouldn't be null");
        } else {
            this.degree = degree;
        }
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Degree " + this.degree);
    }

}
