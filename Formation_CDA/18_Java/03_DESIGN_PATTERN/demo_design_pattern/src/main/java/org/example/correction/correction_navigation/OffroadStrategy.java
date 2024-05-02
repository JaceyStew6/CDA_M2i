package org.example.correction.correction_navigation;

public class OffroadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Offroad Strategy");
    }
}
