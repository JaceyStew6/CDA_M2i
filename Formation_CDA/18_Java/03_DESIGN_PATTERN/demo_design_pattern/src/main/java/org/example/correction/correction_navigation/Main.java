package org.example.correction.correction_navigation;

public class Main {
    public static void main(String[] args) {
        SystemNavigation systemNavigation = new SystemNavigation();
        systemNavigation.goToDestination("Destination 1", new OffroadStrategy());
        systemNavigation.goToDestination("Destination 1", new RoadStrategy());
        systemNavigation.goToDestination("Destination 1", new EconomicStrategy());
    }
}
