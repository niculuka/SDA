package com.fundamentals.curs14_Media;

import java.util.ArrayList;
import java.util.List;

public class MediaPlatform {

    List<Media> mediaList = new ArrayList<>();


    public void addMedia(Media media) {
        Media searchMedia = searchByName(media.getName());
        if (searchMedia != null) {
            System.out.println(String.format("media with name %s aready exist", media.getName()));
        } else {
            this.mediaList.add(media);
        }

    }


    public Media searchByName(String nameOfMedia) {
        for (Media media : mediaList ) {
            if (nameOfMedia.equals(media.getName())) {
                return media;
            }
        }
        return null;
    }

    public void searchAndDisplay(String name) {
        Media media = searchByName(name);
        if (media != null) {
            System.out.println(media);
        }

    }



    @Override
    public String toString() {
        return "MediaPlatform{" +
                "mediaList=" + mediaList +
                '}';
    }
}
