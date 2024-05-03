package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Subject{

    private List<Observer> observers;
    private Random random;

    public WeatherStation() {
        observers = new ArrayList<>();
        random = new Random();
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
    public void notifyObserver() {
        observers.forEach(o -> o.update(Weather.builder().temperature(random.nextDouble(-50, 50)).build()));
    }
}
