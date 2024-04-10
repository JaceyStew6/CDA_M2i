package org.example.exothermometre;

public class Thermometre {

    private double temperatureKelvin;
    private UnitTemperature unit;

    public enum UnitTemperature {
        KELVIN,
        CELSIUS,
        FAHRENHEIT,
    }

    public Thermometre(double temperatureKelvin, UnitTemperature unit) {
        this.temperatureKelvin = temperatureKelvin;
        this.unit = unit;
    }

    public double getTemperatureByUnit(){
        switch (unit){
            case KELVIN:
//                System.out.println("La température en degrés Kelvin est " + temperatureKelvin);
//                break;
                return this.temperatureKelvin;
            case CELSIUS:
                double temperatureCelsius = this.temperatureKelvin - 273.15;
//                System.out.println(temperatureKelvin + " degrés Kelvin = " + temperatureCelsius + " degrés Celsius");
//                break;
                return temperatureCelsius;
            case FAHRENHEIT:
                double temperatureFahrenheit = (this.temperatureKelvin - 273.15)* 9/5 + 32;
//                System.out.println(temperatureKelvin + " degrés Kelvin = " + temperatureFahrenheit + " degrés Fahrenheit");
//                break;
                return temperatureFahrenheit;
            default:
                break;
        }
        return this.temperatureKelvin;
    }

    public double getTemperatureKelvin() {
        return temperatureKelvin;
    }
}
