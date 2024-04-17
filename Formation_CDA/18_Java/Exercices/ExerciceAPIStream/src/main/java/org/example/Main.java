package org.example;
import org.example.model.Trader;
import org.example.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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










    }
}