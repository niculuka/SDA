package com.fundamentals.curs5_Abstr_Encaps.abstractization;

public class ChromeBrowser extends Browser {

    @Override
    public void open() {
        System.out.println("Opening Chrome browser......");
    }

    @Override
    public void navigate() {
        System.out.println("In chrome .. navigating to google");
    }
}
