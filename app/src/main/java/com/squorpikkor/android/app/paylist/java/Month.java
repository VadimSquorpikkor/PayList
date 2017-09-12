package com.squorpikkor.android.app.paylist.java;

import java.util.ArrayList;

/**
 * Created by Vadim on 12.09.2017.
 *
 */

public class Month {
    private String name;
    private ArrayList<Event> eventList;
    private PredefinedEventList predefinedEventList = new PredefinedEventList();//it will be in controller

    private double totalPrice() {
        double d = 0;
        for (Event event : eventList) {
            d+= event.getPrice();
        }
        return d;
    }

    Month(String name) {
        this.name = name;
        eventList = predefinedEventList.getPredefinedList();
    }

    void addEvent(String name) {
        eventList.add(new Event(name));
    }

    void removeEvent(String name) {
        for (int i = 0; i < eventList.size(); i++) {
            if(eventList.get(i).getName().equals(name))eventList.remove(i);
        }
    }
}
