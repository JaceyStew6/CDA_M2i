package org.example;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    public void notifyObserver();
}
