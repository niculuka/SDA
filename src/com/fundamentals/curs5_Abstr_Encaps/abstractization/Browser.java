package com.fundamentals.curs5_Abstr_Encaps.abstractization;

public abstract class Browser {

    String version;

    public void doubleClick() {
        System.out.println("User double clicked on icon");
    }

    public void load() {
        System.out.println("Loading");
    }

    public abstract void open();

    public abstract void navigate();

    public void init() {
        doubleClick();
        load();
        open();
        navigate();
    }
}
