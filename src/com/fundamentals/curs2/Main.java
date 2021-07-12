package com.fundamentals.curs2;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("TEXT 111");

        getDiscountByWeekday("Luni");
        openRoom(1);
        powerOfTwo(1,10);
    }


    public static void getDiscountByWeekday(String day) {


        switch (day) {
            case "Luni":
                System.out.println("Discount 5%");
                break;
        }
    }

    public static void openRoom (int number) {
        switch (number) {
            case 1:
                System.out.println("Open door 1");
                break;
        }
        System.out.println("============================");
    }



    public static void powerOfTwo(int a, int b) {
        for (int index = a; index <= b; index ++  ) {
            System.out.println(index * index);
        }
    }


}
