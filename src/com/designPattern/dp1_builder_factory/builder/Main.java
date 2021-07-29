package com.designPattern.dp1_builder_factory.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person.Builder(
//                "1234567890123",
//                "Manivela",
//                "Dorel",
//                new Date(),
//                "male"
//        )
//                .setReligion("Christian")
//                .setStudies("High School")
//                .build();
//
//        System.out.println(person);


        Person.Builder personBuilder = new Person.Builder(
                "1234567890123",
                "Manivela",
                "Dorel",
                new Date(),
                "male"
        )
                .setReligion("Christian")
                .setStudies("High School");

        if (args.length == 0) {
            personBuilder.setEmailAddress("dorel@yahoo.com");
        }

        System.out.println(personBuilder.build());
    }
}
