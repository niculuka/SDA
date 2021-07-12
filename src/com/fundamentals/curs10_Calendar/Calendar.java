package com.fundamentals.curs10_Calendar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar{
    List<Event> events = new ArrayList<>();

    public void addEvent(Event event){
        events.add(event);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "events=" + events +
                '}';
    }

    public List<Event> getPastEvents(){
        List<Event> pastEvents = new ArrayList<>();
        for(Event event: events){
            if(event.date.isBefore(LocalDate.now())){
                pastEvents.add(event);
            }
        }
        return pastEvents;
    }

    public List<Event> getFutureEvents(){
        List<Event> futureEvents = new ArrayList<>();
        for(Event event: events){
            if(event.date.isAfter(LocalDate.now())){
                futureEvents.add(event);
            }
        }
        return futureEvents;
    }

    public List<Event> getFutureEventsXdays(int days){
        List<Event> futureEvents = new ArrayList<>();
        for(Event event: events){
            if(event.date.isBefore(LocalDate.now().plusDays(days))&&event.date.isAfter(LocalDate.now())){
                futureEvents.add(event);
            }
        }
        return futureEvents;
    }
}