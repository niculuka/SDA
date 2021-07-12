package com.fundamentals.curs5_Abstr_Encaps;

public class Chrome extends Browser{
    String name = "chrome";
    String adds;

    public Chrome(int version, String adds) {
        super("chrome", version);
        this.adds = adds;
    }

    @Override
    public void open() {
        System.out.println("Opening Chrome" + this.version + " With adds" + this.adds);
    }
}
