package org.example.correction.correction_navigation;

public class SystemNavigation {

    public void goToDestination(String destination, NavigationStrategy navigationStrategy) {
        navigationStrategy.navigate(destination);
    }
}
