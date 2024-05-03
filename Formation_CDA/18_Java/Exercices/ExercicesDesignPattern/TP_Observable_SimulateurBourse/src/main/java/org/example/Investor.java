package org.example;

public class Investor implements Observer<Share> {
    @Override
    public void update(Share element) {
        System.out.println("The investor got the new share market informations: \n Name :  " + element.getName() + " \n Price : " + element.getPrice());
    }
}
