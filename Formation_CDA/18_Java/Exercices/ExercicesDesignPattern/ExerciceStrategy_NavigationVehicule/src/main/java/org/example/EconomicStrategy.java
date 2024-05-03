package org.example;

public class EconomicStrategy implements NavigationStrategy {
    @Override
    public void navigate(String destination) {
        System.out.println("Mode économique activé pour vous rendre à " + destination +
                ". Votre consommation sera réduite de 15% en moyenne!");
    }
}
