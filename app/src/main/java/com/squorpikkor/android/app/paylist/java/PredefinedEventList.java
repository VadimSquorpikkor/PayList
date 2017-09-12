package com.squorpikkor.android.app.paylist.java;

import java.util.ArrayList;

/**
 * Created by Vadim on 12.09.2017.
 *
 */

public class PredefinedEventList {
    public ArrayList<Event> getPredefinedList() {
        return predefinedList;
    }

    private ArrayList<Event> predefinedList;

    PredefinedEventList() {
        //Constructor load data from sharedPref to list
    }

}
