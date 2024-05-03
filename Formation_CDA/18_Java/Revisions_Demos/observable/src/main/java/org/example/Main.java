package org.example;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.notifyObserver();
        Tablet tablet1 = new Tablet();
        weatherStation.registerObserver(tablet1);
        Phone phone1 = new Phone();
        weatherStation.registerObserver(phone1);
        weatherStation.notifyObserver();
        Tablet tablet2 = new Tablet();
        weatherStation.registerObserver(tablet2);
        weatherStation.notifyObserver();
        weatherStation.removeObserver(tablet1);
        weatherStation.notifyObserver();
    }
}