package org.example.exercices.exercice05Thermometre;

public class Main {
    public static void main(String[] args) {
        var t1 = new Thermometre(0);
        var t2 = new Thermometre(0, UniteTemperature.CELSIUS);
        var t3 = new Thermometre(0, UniteTemperature.FAHRENHEIT);

        System.out.println(t1.getKelvin());
        System.out.println(t1.getCelsius());
        System.out.printf("formaté : %1$,.2f \n",  t1.getFahrenheit());
        System.out.printf("formaté : %1$,.2f %n", t1.getFahrenheit());
        System.out.println("formaté : " + String.format("%1$,.2f", t1.getFahrenheit()));

        t1.setFahrenheit(123);

        System.out.println(t1.getKelvin());
        System.out.println(t1.getCelsius());
        System.out.println(t1.getFahrenheit());

        t1.setCelsius(123);

        System.out.println(t1.getKelvin());
        System.out.println(t1.getCelsius());
        System.out.println(t1.getFahrenheit());


        // Chaines formatées via printf ou String.format
        // https://www.baeldung.com/string/format
        // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html


        String chaine1 = String.format("%4$s...%3$s...%2$s...%1$s", "a", "b", "c", "d");
        System.out.println(chaine1);
        String chaine2 = String.format("%4$s...%3$1s...%2$2s...%1$3s...%1$20s", "a", "b", "c", "d");
        //                    espaces :  0
        //                            >d...c... b...  a                   a
        System.out.println(chaine2);

        System.out.printf("formaté : %1$f \n", 5000000000.4566);
        System.out.printf("formaté : %1$20.2f %n", 5000000000.4566);
        System.out.printf("formaté : %1$,.2f %n", 5000000000.4566);
        System.out.printf("formaté : %1$+,.2f %n", 5000000000.4566);

    }

}
