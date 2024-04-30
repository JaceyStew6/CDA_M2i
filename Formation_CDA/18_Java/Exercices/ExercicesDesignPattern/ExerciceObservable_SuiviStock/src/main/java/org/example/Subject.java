package org.example;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    public void notifyObservers(int stock);
}
