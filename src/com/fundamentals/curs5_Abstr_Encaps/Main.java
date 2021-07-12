package com.fundamentals.curs5_Abstr_Encaps;

public class Main {

    public static void main(String[] args) {
	Browser chrome = new Chrome(32, "Salut");
	Browser firefox = new Firefox(62, true);

	Browser[] browsers = {chrome, firefox};

	for (int i = 0; i < browsers.length; i++) {
	    browsers[i].open();
    }
    }
}
