package org.example.entity;

public class ElectricCar extends Car{
    private double voltage;

    private ElectricCar(ElectricCarBuilder electricCarBuilder){
        super(electricCarBuilder);
        this.voltage = electricCarBuilder.voltage;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "voltage=" + voltage +
                "} " + super.toString();
    }

    public static class ElectricCarBuilder extends AbstractCarBuilder{

        public double voltage;

        public ElectricCarBuilder voltage(double voltage){
            this.voltage = voltage;
            return this;
        }

        @Override
        public Car build() {
            return new ElectricCar(this);
        }
    }

}
