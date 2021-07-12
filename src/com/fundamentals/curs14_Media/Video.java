package com.fundamentals.curs14_Media;

import java.time.Duration;

public class Video extends MediaLength {

    VideoType type;

    public Video(String name, Duration length, VideoType type) {
        super(name, length);

        this.type = type;
    }

    @Override
    public String toString() {
        return "Video{" +
                "type=" + type +
                super.toString() +
                '}';
    }
}
