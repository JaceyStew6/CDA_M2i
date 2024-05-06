package org.example.entity;

public class ThermalCar extends Car{
    private String fuelType;

    public ThermalCar(ThermalCarBuilder thermalCarBuilder) {
        super(thermalCarBuilder);
        this.fuelType = thermalCarBuilder.fuelType;
    }

    @Override
    public String toString() {
        return "ThermalCar{" +
                "fuelType='" + fuelType + '\'' +
                "} " + super.toString();
    }

    public static class ThermalCarBuilder extends AbstractCarBuilder{
        private String fuelType;

        public ThermalCarBuilder fuelType (String fuelType){
            this.fuelType = fuelType;
            return this;
        }


        @Override
        public Car build() {
            return new ThermalCar(this);
        }
    }

}
