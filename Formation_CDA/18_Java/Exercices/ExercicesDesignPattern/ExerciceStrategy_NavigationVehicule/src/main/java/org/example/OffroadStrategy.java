package org.example;

public class OffroadStrategy implements NavigationStrategy{
    @Override
    public void navigate(String destination) {
        System.out.println("Mode offroad activé pour vous rendre à " + destination + ". Roulez prudemment");
    }
}
