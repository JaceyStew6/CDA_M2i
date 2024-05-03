package org.example;

public class Tablet implements Observer {

    @Override
    public void update(Weather weather) {
        System.out.println("Temperature récupérée par la tablette : " + weather.getTemperature());
    }
}
