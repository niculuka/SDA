package com.fundamentals.curs3_Exercitii;

public class Ex_8_refacut {
    public static void main(String[] args) {
        String[] names = {"Dorel", "Georgel", "Nea Caisa", "Georgel", "Gica", "Mitica", "Bobita"};

        findName("Georgel", names);
        findNamePosition("Gica", names);
    }

    public static void findName(String name, String[] namesList) {
        for (int index = 0; index < namesList.length; index++) {
            if (namesList[index] == name) {
                System.out.println(namesList[index]);
            }
        }
    }

    public static void findNamePosition(String name, String[] namesList) {
        boolean foundName = false;
        int position = 0;
        for (int index = 0; index < namesList.length; index++) {
            if (namesList[index] == name) {
                foundName = true;
                position = index;

            }


        }
        if (foundName == true) {
            System.out.println(position + 1);
        }
        else {
            System.out.println("The name doesnt exist");
        }

    }
}
