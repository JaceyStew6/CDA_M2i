package org.example;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter

public class Share implements Subject<Share> {
    private String name;
    private double price;
    List <Observer<Share>> observers;
    @Override
    public void registerObserver(Observer<Share> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Share> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Share element) {
        observers.forEach(o->o.update(this));
    }

}
