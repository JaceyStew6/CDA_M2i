package org.example.exothermometre;

public class main {
    public static void main(String[] args) {

        Thermometre thermometre1 = new Thermometre(2, Thermometre.UnitTemperature.KELVIN);


        System.out.println("Kelvin " + thermometre1.getTemperatureKelvin()
                + " Celsius " + thermometre1.getTemperatureCelsius()
                + " Fahrenheit " + thermometre1.getTemperatureFahrenheit());




        //----------------------------------------------------------------------------
        //AUTRE ESSAI
/*        Thermometre thermometre1 = new Thermometre(2, Thermometre.UnitTemperature.KELVIN);
        Thermometre thermometre2 = new Thermometre(300, Thermometre.UnitTemperature.CELSIUS);
        Thermometre thermometre3 = new Thermometre(50, Thermometre.UnitTemperature.FAHRENHEIT);

        System.out.println("Température initiale en Kelvin: " + thermometre2.getTemperatureKelvin() +
                " degrés. La température en degrés Celsius est " + thermometre2.getTemperatureByUnit());
        System.out.println("Température initiale en Kelvin: " + thermometre3.getTemperatureKelvin() +
                " degrés. La température en degrés Fahrenheit est " + thermometre3.getTemperatureByUnit());*/
    }
}