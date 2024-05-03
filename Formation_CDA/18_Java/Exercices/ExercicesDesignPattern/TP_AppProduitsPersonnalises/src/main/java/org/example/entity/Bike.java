package org.example.entity;

public class Bike extends Product{
    private int size;
    private String type;

    public Bike(BikeBuilder bikeBuilder) {
        super(bikeBuilder);
        this.size = bikeBuilder.size;
        this.type = bikeBuilder.type;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", " + super.toString();
    }

    public static class BikeBuilder extends AbstractProductBuilder{
        private int size;
        private String type;

        public BikeBuilder size (int size){
            this.size = size;
            return this;
        }

        public BikeBuilder type (String type){
            this.type = type;
            return this;
        }

        @Override
        public Product build(){
            return new Bike(this);
        }

    }
}
