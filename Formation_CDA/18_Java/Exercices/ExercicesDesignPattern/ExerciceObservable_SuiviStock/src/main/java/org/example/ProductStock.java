package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductStock implements Subject {

    private List<Observer> observers;


    public ProductStock(){
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
    public void notifyObservers(int stock) {
        observers.forEach(o -> o.update(Product.builder().stockLevel(stock).build()));
    }
}

