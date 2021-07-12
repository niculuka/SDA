package com.fundamentals.curs5_Abstr_Encaps;

public class Laborator {
    private int numarDeLocuri;
    private int numarulLaboratului;

    public int getNumarDeLocuri() {
        return numarDeLocuri;
    }

    public void setNumarDeLocuri(int numarDeLocuri) {
        if (numarDeLocuri < 5) {
            System.out.println("Laboratorul ar trebui sa aiba mai mult de 5 locuri");
        } else {
            this.numarDeLocuri = numarDeLocuri;
        }
    }

    public int getNumarulLaboratului() {
        return numarulLaboratului;
    }

    public void setNumarulLaboratului(int numarulLaboratului) {
        if (numarulLaboratului != 0) {
            this.numarulLaboratului = numarulLaboratului;
        } else {
            System.out.println("Numarul laboratorului este invalid");
        }
    }
}
