package com.fundamentals.curs14_Media;

import java.time.Duration;

public class MediaLength extends Media{

    private Duration length;

    public MediaLength(String name, Duration length) {
        super(name);

        this.length = length;


    }

    @Override
    public String toString() {
        return "MediaLength{" +
                "length=" + length +
                super.toString() +
                '}';
    }
}
