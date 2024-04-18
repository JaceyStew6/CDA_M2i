package org.example;
import org.example.model.Trader;
import org.example.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 410),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        System.out.println();
        //Trouvez toutes les transactions en 2011 et les trier par valeur (petite à élevée) stocker ces données dans une liste de transactions.
        System.out.println("Question 1");

        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println();

        //Quelles sont toutes les villes uniques où les traders travaillent : stocker ses données dans une liste de villes
        // (chaîne de caractères). 2 possibilités (dont une en utilisant les Set).
        System.out.println("Question 2");

        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        //En vous basant, toujours uniquement sur les transactions, renvoyez une chaîne de noms de tous les traders triés par ordre alphabétique
        System.out.println("Question 3");

        transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        //Y a-t-il des Traders basés à Milan ? On récupère un booléen dans les résultats.
        System.out.println("Question 4");

        Optional<Transaction> containsMilan = transactions.stream()
                .filter(t -> t.getTrader().getCity().contains("Milan"))
                .findFirst();

        System.out.println("Y a t'il des traders basés à Milan? " + containsMilan.isPresent());

        System.out.println();

        //Quelle est la valeur la plus élevée de toutes les transactions ? (On récupère un optional d’entier).
        System.out.println("Question 5");













    }
}