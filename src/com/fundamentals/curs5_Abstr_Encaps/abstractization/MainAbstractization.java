package com.fundamentals.curs5_Abstr_Encaps.abstractization;

public class MainAbstractization {

    public static void main(String[] args) {
        Browser chromeBrowser = new ChromeBrowser();

        chromeBrowser.init();

        Browser firefox = new Firefox();
        firefox.init();
    }
}
