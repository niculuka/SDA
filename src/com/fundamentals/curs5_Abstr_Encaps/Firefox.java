package com.fundamentals.curs5_Abstr_Encaps;

public class Firefox extends Browser{
    boolean privacy = false;

    public Firefox(int version, boolean privacy) {
        super("Firefox", version);
        this.privacy = privacy;
    }

    @Override
    public void open() {
        System.out.println("Opening with privacy" + this.version + this.privacy);
    }
}
