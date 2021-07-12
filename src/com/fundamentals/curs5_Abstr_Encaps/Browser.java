package com.fundamentals.curs5_Abstr_Encaps;

public class Browser {
    String name;
    int version;

    public Browser(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public void open() {
        System.out.println("name opening" + this.name + "Name Version" + this.version);
    }
}
