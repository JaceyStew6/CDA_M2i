package org.example.entity;

public class Computer extends Product{
    private String storageType;
    private int ram;

    private Computer(ComputerBuilder computerBuilder) {
        super(computerBuilder);
        this.storageType = computerBuilder.storageType;
        this.ram = computerBuilder.ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "storageType='" + storageType + '\'' +
                ", ram=" + ram +
                ", " + super.toString();
    }

    public static class ComputerBuilder extends AbstractProductBuilder{
        private String storageType;
        private int ram;

        public ComputerBuilder storageType(String storageType){
            this.storageType = storageType;
            return this;
        }

        public ComputerBuilder ram(int ram){
            this.ram = ram;
            return this;
        }
        
        @Override
        public Product build(){
            return new Computer(this);
        }
    }

}
