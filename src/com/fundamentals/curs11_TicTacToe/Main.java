package com.fundamentals.curs11_TicTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] board = new String[3][3];                                                // definire pozitii goale
        for(int i=0; i< board.length; i++){
            for(int j=0; j < board.length; j++){
                board[i][j] = "_";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        String rowString;
        String colString;
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.println("Insert X or 0 !");                                              // Citire simbol
        String symbol = sc.next();
        while (!symbol.equals("x") && !symbol.equals("X") && !symbol.equals("0")) {
            System.out.println("Invalid symbol - Insert X or 0 !");
            symbol = sc.next();
        }
        System.out.println("Row: ");                                                        // Citire row
        rowString = sc.next();
        while (!rowString.equals("0") && !rowString.equals("1") && !rowString.equals("2")) {
            System.out.println("Invalid number - Insert 0, 1, or 2 !");
            rowString = sc.next();
        }
        System.out.println("Column: ");                                                     // Citire col
        colString = sc.next();
        while (!colString.equals("0") && !colString.equals("1") && !colString.equals("2")) {
            System.out.println("Invalid number - Insert 0, 1, or 2 !");
            colString = sc.next();
        }
        board[Integer.parseInt(rowString)][Integer.parseInt(colString)] = symbol;           // Definire element matrice


        boolean win = true;
        while (win) {                                                                       // Inseare symbol in matrice
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }                                                                               // Verificare castigator
            if (board[0][0].equals(symbol) && board[0][1].equals(symbol) && board[0][2].equals(symbol) ||
                    board[1][0].equals(symbol) && board[1][1].equals(symbol) && board[1][2].equals(symbol) ||
                    board[2][0].equals(symbol) && board[2][1].equals(symbol) && board[2][2].equals(symbol) ||
                    board[0][0].equals(symbol) && board[1][0].equals(symbol) && board[2][0].equals(symbol) ||
                    board[0][1].equals(symbol) && board[1][1].equals(symbol) && board[2][1].equals(symbol) ||
                    board[0][2].equals(symbol) && board[1][2].equals(symbol) && board[2][2].equals(symbol) ||
                    board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol) ||
                    board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol)) {
                System.out.println("YOU WON !");
                win = false;
            }
            if (win) {                                                                      // Daca nu a castigat nimeni...
                System.out.println("Insert X or 0 !");                                              // Citire simbol
                symbol = sc.next();
                while (!symbol.equals("x") && !symbol.equals("X") && !symbol.equals("0")) {
                    System.out.println("Invalid symbol - Insert X or 0 !");
                    symbol = sc.next();
                }
                System.out.println("Row: ");                                                        // Citire row
                rowString = sc.next();
                while (!rowString.equals("0") && !rowString.equals("1") && !rowString.equals("2")) {
                    System.out.println("Invalid number - Insert 0, 1, or 2 !");
                    rowString = sc.next();
                }
                System.out.println("Column: ");                                                     // Citire col
                colString = sc.next();
                while (!colString.equals("0") && !colString.equals("1") && !colString.equals("2")) {
                    System.out.println("Invalid number - Insert 0, 1, or 2 !");
                    colString = sc.next();
                }                                                                            // Evitare rescriere symbol
                if (board[Integer.parseInt(rowString)][Integer.parseInt(colString)].equals("_")) {
                    board[Integer.parseInt(rowString)][Integer.parseInt(colString)] = symbol;
                }
                else {
                    System.out.println("Invalid Position - Chose another position !");
                }
            }
        }
    }
}

