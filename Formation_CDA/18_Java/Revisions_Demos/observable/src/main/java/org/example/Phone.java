package org.example;

public class Phone implements Observer {

    @Override
    public void update(Weather weather) {
        System.out.println("Temperature récupérée par le téléphone : " + weather.getTemperature());
    }
}
