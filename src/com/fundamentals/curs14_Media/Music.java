package com.fundamentals.curs14_Media;

import java.time.Duration;

public class Music extends MediaLength{

    String artistName;

    public Music(String artistName, String name, Duration length) {
        super(name, length);
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Music{" +
                "artistName='" + artistName + '\'' +
                super.toString() +
                '}';
    }
}
