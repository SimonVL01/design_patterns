package com.realdolmen.ood020.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
}

