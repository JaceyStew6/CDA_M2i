package org.example.exothermometre;

public class Thermometre {

    private double temperatureKelvin;
    private UnitTemperature unit;

    public enum UnitTemperature {
        KELVIN,
        CELSIUS,
        FAHRENHEIT,
    }


//    public Thermometre(double temperature, UnitTemperature unit) {
////        this.unit = unit;
//        switch (unit){
//            case KELVIN:
//                this.temperatureKelvin = temperature;
//                break;
//            case CELSIUS:
//                this.temperatureKelvin = temperature + 273.15;
//                break;
//            case FAHRENHEIT:
//                this.temperatureKelvin = (temperature - 32) * 5/9 + 273.15;
//                break;
//            default:
//                break;
//        }
//    }
//
//    public double getTemperatureKelvin(){
//        return this.temperatureKelvin;
//    }
//     public double getTemperatureCelsius(){
//        return this.temperatureKelvin - 273.15;
//     }
//
//     public double getTemperatureFahrenheit(){
//        return (this.temperatureKelvin - 273.15)* 9/5 + 32;
//     }
//
//    public void setTemperature(double temperature, UnitTemperature unit) {
//        switch (unit) {
//            case KELVIN:
//                this.temperatureKelvin = temperature;
//                break;
//            case CELSIUS:
//                this.temperatureKelvin = temperature + 273.15;
//                break;
//            case FAHRENHEIT:
//                this.temperatureKelvin = (temperature + 459.67) * 5/9;
//                break;
//        }
//    }


    public Thermometre(double temperature, UnitTemperature unit) {
        this.temperatureKelvin = temperature;
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
