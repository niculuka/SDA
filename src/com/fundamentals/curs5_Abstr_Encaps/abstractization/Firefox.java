package com.fundamentals.curs5_Abstr_Encaps.abstractization;

public class Firefox extends Browser{

    @Override
    public void open() {
        System.out.println("Opening firefox.....");
    }

    @Override
    public void navigate() {
        System.out.println("In Firefox ... navigating to duckduck");
    }
}
