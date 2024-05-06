package org.example;

import java.util.ArrayList;
import java.util.List;

public class RacePosition implements Subject {
    private List<Observer> observers;

    public RacePosition() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(Race.builder().build()));
        //TODO modifier notifyObserver()
    }
}
