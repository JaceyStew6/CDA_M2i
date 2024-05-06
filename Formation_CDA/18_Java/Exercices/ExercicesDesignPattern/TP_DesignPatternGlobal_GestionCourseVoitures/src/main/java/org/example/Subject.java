package org.example;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    //TODO ajouter paramètre à notifyObserver
    public void notifyObservers();
}
