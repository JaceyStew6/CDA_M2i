package org.example;
import java.time.Instant;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercice 1

        int celcius = 20;
        System.out.println(celcius + " degrés Celcius = " + ((celcius * 9/5)+32) + " degrés Farenheit");

        int farenheit = 50;
        System.out.println(farenheit + " degrés Farenheit = " + (farenheit - 32)*5/9 + " degrés Celcius");


        //Exercice 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de bonbons");
        int nbrBonbons = scanner.nextInt();
        System.out.println("Prix par bonbon");
        float prixBonbon = scanner.nextFloat();

        float total = (nbrBonbons*prixBonbon);

        System.out.println("Coût total "+ total + "€");


        //Exercice 3

        System.out.println("Première valeur");
        int firstInput = scanner.nextInt();
        Instant start = Instant.now();

        System.out.println("Seconde valeur");
        int secondInput = scanner.nextInt();
        Instant end = Instant.now();

        Duration interval = Duration.between(start, end);

        System.out.println("Temps écoulé entre les deux entrées " + (interval.getSeconds()) + " secondes");

    }
}