package com.fundamentals.curs9_Tema5_Hangman;

//      Tema 5:
//        Sa se implementeze un joc de spanzuratoare unde :
//        - se hardcodeaza o lista de 5-10 cuvinte
//        - se alege random unul din cele 5-10 cuvinte
//        - se incepe jocul
//        - jucatorul are 3 vieti//
//        De exemplu daca cuvantul ales este browser, in terminal se va afisa :
//        - …… (cate un punct pentru fiecare litera)
//        - I se va cere jucatorul sa aleaga o litera (care este trimisa tot prin terminal)
//        - Daca utilizatorul alege litera “r”, in terminal se va afisa :
//        .r….r dupa care este ceruta o noua litera
//        - Daca noua litera este “b”, in terminal se va afisa
//        - br….r
//        In cazul in care jucatorul alege o litera care nu exista in cuvant, se va afisa un mesaj de eroare si i se va scadea o viata.
//        Cand utilizatorul ramane fara vieti, este afisat un mesaj in terminal impreuna cu cuvantul complet.
public class Main {

    public static void main(String[] args) {
        Hangman hangman = new Hangman();

        hangman.addList();                  //  Generare random de cuvinte
        hangman.getCharNumber();            //  Numarare caractere pentru cuvantul ales
        hangman.replaceCharToPoints();      //  Inserare numar de puncte pentru cuvantul ales
        hangman.replacePointsWithInput();   //  Inserare caractere in functie de litera aleasa in terminal
    }
}
