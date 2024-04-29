package org.example;

public class Pizza {

    private String taille, pate, fromage, garniture, sauce;

    private Pizza (PizzaBuilder builder){
        this.taille = builder.taille;
        this.pate = builder.pate;
        this.fromage = builder.fromage;
        this.garniture = builder.garniture;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Pizza " +
                "taille='" + taille + '\'' +
                ", pate='" + pate + '\'' +
                ", fromage='" + fromage + '\'' +
                ", garniture='" + garniture + '\'' +
                ", sauce='" + sauce + '\'' +
                ' ';
    }

    //Le builder possède les mêmes caractéristiques que l'objet ainsi que des méthodes qui retourneront le Builder
    public static class PizzaBuilder{
        private String taille, pate, fromage, garniture, sauce;

        public PizzaBuilder taille(String taille){
            this.taille = taille;
            return this;
        }

        public PizzaBuilder pate(String pate){
            this.pate = pate;
            return this;
        }

        public PizzaBuilder fromage(String fromage){
            this.fromage = fromage;
            return this;
        }

        public PizzaBuilder garniture(String garniture){
            this.garniture = garniture;
            return this;
        }

        public PizzaBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

}
