package com.fundamentals.curs3_Exercitii;

public class Ex_8 {
    public static void main (String[] args) {
        String[] names = {"Jonny", "Java", "Nick" };
        findNameInArray("Nick", names);

    }

    public static void findNameInArray(String name, String[] nameList) {
        boolean foundName = false;
        int position = 0;

        for(int index = 0; index < nameList.length; index++) {
            if(name.equals(nameList[index])) {
                foundName = true;
                position = index;

            }
        }
        if(foundName == true) {
            System.out.println(position);
        }
        else {
            System.out.println("The name was found");
        }
    }
}
