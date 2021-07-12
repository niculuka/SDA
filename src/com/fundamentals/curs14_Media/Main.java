package com.fundamentals.curs14_Media;

import java.time.Duration;

/**  Definim o aplicatie care sa fie un catalog pt diferite tipuri de media(video, music, carti )
 *   Video: nume, durata, gen (comedie, actiune, drama, ) - ranking
 *   Music: artist, nume, durata, ranking.
 *   Carti: autor, nume, numar de pagini, ranking.
 *   Constraint: nume unice (altfel error message);
 *   Utilizatorii pot adauga comentarii la obiecte (salvate in fisiere .txt)
 *   Utilizatorii pot cauta bazat pe nume.
 *   Utilizatorii pot vedea comentarii pt fiecatre tip de media in parte
 *   Acest ranking trebuie calculat in functie de notele date.
 */


public class Main {

    public static void main(String[] args) {
        MediaPlatform mediaPlatform = new MediaPlatform();


        Video video = new Video("Harry Potter", Duration.ofMinutes(150), VideoType.ACTION);
//        System.out.println(video);
        video.setRanking(5);
        video.setRanking(4);
        video.setRanking(3.5);
//        System.out.println(video);




        video.addComments("Cea mai tare din parcare");
        video.addComments("E de 5 stele");
//        video.displayComments();
//        System.out.println("===================================================================");

        Music music = new Music("Jon Bon Jovi", "Always", Duration.ofMinutes(5));
//        System.out.println(music);
        music.addComments("Piesa e foarte tare");
//        music.displayComments();



        Book book = new Book("George Cosbuc", "Poezii", 125);
//        System.out.println(book);

        mediaPlatform.addMedia(video);
        mediaPlatform.addMedia(music);
        mediaPlatform.addMedia(book);

        mediaPlatform.searchAndDisplay("Harry Potter");
        mediaPlatform.searchAndDisplay("Poezii");

        Video video2 = new Video("Harry Potter", Duration.ofMinutes(150), VideoType.ACTION);
        mediaPlatform.addMedia(video2);




    }
}
