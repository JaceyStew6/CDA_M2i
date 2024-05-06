package org.example;

public class Spectator implements Observer {
    @Override
    public void update(Race race) {
        System.out.println();
    }
}
