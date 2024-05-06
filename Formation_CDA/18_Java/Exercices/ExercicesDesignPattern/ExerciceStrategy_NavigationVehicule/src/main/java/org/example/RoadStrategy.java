package org.example;

public class RoadStrategy implements NavigationStrategy {

    @Override
    public void navigate(String destination) {
        System.out.println("Mode route activé pour vous rendre à " + destination);
    }
}
