package org.example;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza.PizzaBuilder().taille("moyenne").pate("classique").fromage("mozzarella").garniture("jambon").sauce("tomate").build();

        System.out.println(pizza1);

    }
}