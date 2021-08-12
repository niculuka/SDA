package com.advancedCoding_Homework.implementMethods_E_;


public class Main {
    public static void main(String[] args) {
        CCCHashSet<String> set = new CCCHashSetImpl<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);
        System.out.println("=============================================");

        set.remove("ddd");
        System.out.println(set);
        System.out.println("=============================================");

        System.out.println("SIZE = " + set.size());
        System.out.println("=============================================");

        System.out.println(set.contains("bbb"));
        System.out.println("=============================================");

        set.clear();
        System.out.println(set);
        System.out.println("=============================================");
    }
}
