package com.fundamentals.curs10_Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 definim evenimente cu nume si data lor din terminal
 vrem sa putem vedea even din trecut
 vrem sa putem vedea even din viitor
 vrem sa putem vedea even din viitor ( x zile )
 */
public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        boolean addEvents = true;

        while(addEvents) {
            System.out.println("Do you want to add event? 1-Yes 2-See past events");
            String option = sc.next();

            switch(option){
                case "1": {
                    calendar.addEvent(createEvent(sc));
                    break;
                }
                case "2": {
                    System.out.println(calendar.getPastEvents());
                    break;
                }
                case "3": {
                    System.out.println(calendar.getFutureEvents());
                    break;
                }
                case "4":{
                    System.out.println("Introduceti nr zile: ");
                    System.out.println(calendar.getFutureEventsXdays(sc.nextInt()));
                    break;
                }

            }

        }

    }

    public static Event createEvent(Scanner sc){
        System.out.println("Name: ");
        String numeEv = sc.next();
        System.out.println("Date: ");
        String dataEv = sc.next();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dataEv, dateTimeFormatter);
        Event event = new Event(numeEv, localDate);

        return event;
    }
}