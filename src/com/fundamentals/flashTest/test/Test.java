package com.fundamentals.flashTest.test;
import java.util.Scanner;

/** 1.  Faceti un array cu 5 elemente !
 *      Printati al 3-lea element !
 *
 * 2.   Faceti un array cu 7 elemente.
 *      Extrageti random cate un element si afisati-l !
 *
 * 3.   Cititi si afisati un text de la tastatura!
 *
 * 4.   Cititi si afisati un numar de la tastatura!
 *
 * 5.   Transformati un string in integer!
 *
 * 6.   Transformati un integer in string!
 *
 * 7.   Numarati cate caractere are un cuvant!
 *
 * 8.   Afisati litera 2 si 4, impreuna si separat!
 *
 * 9.   Inlocuiti caracterele unui string cu *!
 *
 * 10.  Inlocuiti caracterul 1 si 4 al unui string, cu -!
 *
 * 11.  Afisati un string pe litere!
 *
 * 12.  Dati un string si alegeti o litera din string!
 *      Daca stringul contine litera, inlocuiti litera cu un semn, altfel afisati un mesaj de eroare
 *
 * 13.  Dati un string cu minim 10 litere!
 *      Cautati vocalele "a, e, i, o, u" in string si afisatile!
 *
 * 14.  Definit o matrice goala cu 3 linii si 3 coloanee, cu elementul din mijloc cu valuarea 1;
 *
 * 15.  Definiti o matrice goala, cu 2 randuri si 4 coloane.
 *
 * 16.  Definiti o matrice cu 3 linii, 3 coloane, cu numerele in ordine crescatoare, date de un counter!
 *
 * 17.  Cititi numele utilizatorului de la tastatura
 *      Oferiti posibilitate de corectare multipla a numelui!
 *
 * 18.  Deschideti un cont bancar cu soldul initial 0!
 *      Depozitati o suma de bani si calculati dobanda la acea suma!
 *
 * 19.  Se da un cont bancar cu soldul 100!
 *      Calculati dobanda + soldul!
 */

public class Test {
    public static void Test1() {
        String[] fruit = {"banana", "apple", "strawberry", "cherry", "apricot"};
        System.out.println("Third element: " + "\n" + fruit[2]);
    }
    public static void Test2() {
        String[] word = {"book", "pencil", "letter", "handsome", "cooperation", "train", "laptop"};
        int random = (int) (Math.random() * word.length);
        String getWord = word[random];
        System.out.println(getWord);
    }
    public static void Test3() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Insert a text: ");
        String string = scanner.next();
        System.out.println(string);
    }
    public static void Test4() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Insert a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
    }
    public static void Test5() {
        String string = "1234";
        int number = Integer.parseInt(string);
        System.out.println(number);
    }
    public static void Test6() {
        int number = 520;
        String string = String.valueOf(number);
        System.out.println(string);
    }
    public static void Test7() {
        int countChar = 0;
        String string = "keyword";
        for (int i = 0; i <string.length(); i++) {
            countChar = string.length();
        }
        System.out.println(countChar);
    }
    public static void Test8() {
        String string = "characters";
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(1) + " " + string.charAt(3));
    }
    public static void Test9() {
        String string = "bicycle";
        char[] ch = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            ch[i] = '*';
        }
        System.out.println(ch);
    }
    public static void Test10() {
        String string = "String";
        string = string.replace(string.charAt(0), '-');
        string = string.replace(string.charAt(3), '-');
        System.out.println(string);
    }
    public static void Test11() {

        String string = "elephant";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
    public static void Test12() {
        String string = "Capture";
        char ch = 'a';
        if (string.contains(String.valueOf(ch))) {
            string = string.replace(ch, '/');
            System.out.println(string);
        } else {
            System.out.println("Character not found");
        }
    }
    public static void Test13() {
        String string = "Helicopter";
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < ch.length; j ++) {
                if (string.charAt(i) == ch[j]) {
                    System.out.println(ch[j]);
                }
            }
        }
    }
    public static void Test14() {
        String[][] board = new String[3][3];
        for(int i=0; i< board.length; i++){
            for(int j=0; j < board.length; j++){
                board[i][j] = "_";
                board[1][1] = "1";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Test15() {
        int row = 2;
        int col = 4;
        String[][] board = new String[row][col];
        for(int i=0; i< row; i++){
            for(int j=0; j < col; j++){
                board[i][j] = "_";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Test16() {
        int counter = 1;
        int[][] matrix = new int[3][3];
        for(int i=0; i< 3; i++){
            for(int j=0; j < 3; j++){
                matrix[i][j] = counter++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Test17() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Introduceti numele dvs!");
        while (true) {
            String name = scanner.next();
            System.out.println("Numele dvs este: " + name);
            System.out.println("Daca numele dvs e corect, apasati [1]");
            System.out.println("Daca vreti sa modificati, apasati [2]");
            int userName = scanner.nextInt();
            switch (userName) {
                case 1: {
                    System.out.println("NUME: " + name);
                    return;
                }
                case 2: {
                    System.out.println("Noul nume este:");
                }
                break;
            }
        }
    }
    public void Test18() {

    }







}
