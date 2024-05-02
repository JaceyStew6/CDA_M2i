package org.example;

public class Main {
    public static void main(String[] args) {
        NavigationSystem arras = NavigationSystem.builder().destination("Arras").build();
        arras.navigate(new RoadStrategy());
        arras.navigate(new OffroadStrategy());
        arras.navigate(new EconomicStrategy());
    }
}