package org.example.entity;

public class Smartphone extends Product{

    private int size;

    public Smartphone(SmartphoneBuilder smartphoneBuilder) {
        super(smartphoneBuilder);

        this.size = smartphoneBuilder.size;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "size=" + size +
                ", " + super.toString();
    }

    public static class SmartphoneBuilder extends AbstractProductBuilder{
        private int size;

        public SmartphoneBuilder size(int size){
            this.size = size;
            return this;
        }

        @Override
        public Product build(){
            return new Smartphone(this);
        }
    }
}
