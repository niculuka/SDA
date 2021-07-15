package com.fundamentals.flashTest.test;
import java.util.Scanner;


public class Test {
    //------------------------------------------------------------------------------------------------------------------
    public void Test1() {
        String[] fruit = {"banana", "apple", "strawberry", "cherry", "apricot"};
        System.out.println("Third element: " + "\n" + fruit[2]);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test2() {
        String[] word = {"book", "pencil", "letter", "handsome", "cooperation", "train", "laptop"};
        int random = (int) (Math.random() * word.length);
        String getWord = word[random];
        System.out.println(getWord);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test3() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Insert a text: ");
        String string = scanner.next();
        System.out.println(string);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test4() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Insert a number: ");
        int number = scanner.nextInt();
        System.out.println(number);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test5() {
        String string = "1234";
        int number = Integer.parseInt(string);
        System.out.println(number);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test6() {
        int number = 520;
        String string = String.valueOf(number);
        System.out.println(string);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test7() {
        int countChar = 0;
        String string = "keyword";
        for (int i = 0; i <string.length(); i++) {
            countChar = string.length();
        }
        System.out.println(countChar);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test8() {
        String string = "characters";
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(1) + " " + string.charAt(3));
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test9() {
        String string = "bicycle";
        char[] ch = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            ch[i] = '*';
        }
        System.out.println(ch);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test10() {
        String string = "String";
        string = string.replace(string.charAt(0), '-');
        string = string.replace(string.charAt(3), '-');
        System.out.println(string);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test11() {

        String string = "elephant";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test12() {
        String string = "Capture";
        char ch = 'a';
        if (string.contains(String.valueOf(ch))) {
            string = string.replace(ch, '/');
            System.out.println(string);
        } else {
            System.out.println("Character not found");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test13() {
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
    //------------------------------------------------------------------------------------------------------------------
    public void Test14() {
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
    //------------------------------------------------------------------------------------------------------------------
    public void Test15() {
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
    //------------------------------------------------------------------------------------------------------------------
    public void Test16() {
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
    //------------------------------------------------------------------------------------------------------------------
    public void Test17() {
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
    //------------------------------------------------------------------------------------------------------------------
    public void Test18() {
        int[] numbers = {1, 53, 2, 5, 8, 9, 331, 0};
        int smallestNumber = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < smallestNumber) {
                smallestNumber = numbers[index];
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test19() {
        int[] numbers = {1, 53, 2, 5, 8, 9, 331, 0};
        int biggestNumber = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > biggestNumber) {
                biggestNumber = numbers[index];
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test20() {
        int fact = calcFact(4);
        System.out.println("The factorial is: " + fact);
    }
    public int calcFact(int number) {
        int fact = 1;
        for (int index = 1; index <= number; index++) {
            fact = fact * index;
        }
        return fact;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test21() {
        multiplyString("A", 3);
    }
    public void multiplyString(String text, int timesString) {
        String sumText = "";
        for (int index = 0; index < timesString; index ++) {
            sumText = sumText + text;
        }
        System.out.println(sumText);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test22() {
        int[] numbers = {11, 22, 33, 44};
        isNumberPartOfArray(44, numbers);
    }
    public void isNumberPartOfArray(int number, int[] numbersOfArray) {
        boolean foundNumber = false;
        for (int index = 0; index < numbersOfArray.length; index++) {
            if (number == numbersOfArray[index]) {
                foundNumber = true;
            }
        }
        if(foundNumber) {
            System.out.println("EXIST");
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test23() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index]%2 == 0) {
                System.out.println("Even numbers: " + numbers[index]);
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void Test24() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index]%2 != 0) {
                System.out.println("Odd numbers: " + numbers[index]);
            }
        }
    }


}
