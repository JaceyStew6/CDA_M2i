package org.example;

public class Main {
    public static void main(String[] args) {
        NavigationSystem n = NavigationSystem.builder().destination("Arras").build();
        n.navigate(new RoadStrategy());
        n.navigate(new OffroadStrategy());
        n.navigate(new EconomicStrategy());
    }
}