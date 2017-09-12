package com.squorpikkor.android.app.paylist.java;

/**
 * Created by Vadim on 12.09.2017.
 *
 */

public class Event {
    public String getName() {
        return name;
    }

    private String name;
    private boolean isPaid;
    private double price;

    Event(String name) {
        this.name = name;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
