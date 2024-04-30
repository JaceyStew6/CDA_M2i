package org.example.correction.correction_observable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter

public class Product implements Subject<Product> {
    private int stockLevel;
    private String name;
    List<Observer<Product>> observers;
    public void decreaseStock() {
        this.stockLevel--;
        notifyObservers(this);
    }
    @Override
    public void registerObserver(Observer<Product> observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer<Product> observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(Product element) {
        observers.forEach(o->o.update(this));
    }
}
