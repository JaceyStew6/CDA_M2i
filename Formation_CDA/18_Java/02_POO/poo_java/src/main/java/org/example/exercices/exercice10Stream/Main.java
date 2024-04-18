package org.example.exercices.exercice10Stream;

import org.example.exercices.exercice10Stream.model.Trader;
import org.example.exercices.exercice10Stream.model.Transaction;

import java.util.*;
import java.util.stream.Collectors;

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


        // Doc Comparator
        // https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
        //Question 1
        /*
        Trouvez toutes les transactions en 2011 et les trier par valeur (petite à élevée)
        stocker ces données dans une liste de transactions.
         */

        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();

        System.out.println("Question 1 :");
        System.out.println(tr2011);
        System.out.println();


        //Question 2
        /*
        Quelles sont toutes les villes uniques où les traders travaillent : stocker ses
        données dans une liste de villes (chaîne de caractères). 2 possibilités (dont
        une en utilisant les Set).
         */

        // version 1
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        // version 2
        Set<String> cities2 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());

        System.out.println("Question 2 :");
        System.out.println(cities);
        System.out.println();


        //Question 3
        /*
        En vous basant, toujours uniquement sur les transactions, renvoyez une
        chaîne de noms de tous les traders triés par ordre alphabétique
         */

        String tradeStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));

        System.out.println("Question 3 :");
        System.out.println(tradeStr);
        System.out.println();

        //Question 4
        /*
        Y a-t-il des commerçants basés à Milan ? On récupère un booléen dans les
        résultats.
         */

        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));


        System.out.println("Question 4 :");
        System.out.println(milanBased);
        System.out.println();

        //Question 5
        /*
         Quelle est la valeur la plus élevée de toutes les transactions ? (On récupère un optional d’entier).
         */

        OptionalInt highestValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max();

        Integer value = highestValue.getAsInt();

        System.out.println("Question 5 :");
        System.out.println(value);
        System.out.println();

        //Question 6
        /*
        Trouvez tous les traders de Cambridge et les triez par nom. On récupère une liste de traders.
         */

        List<Trader> traders = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .toList();

        System.out.println("Question 6 :");
        System.out.println(traders);
        System.out.println();

        //Question 7
        /*
        Trouvez toutes les valeurs des transactions des traders vivant à Cambridge :
        On récupère une liste d’entiers.
         */

        List<Integer> values = transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .toList();

        System.out.println("Question 7 :");
        System.out.println(values);
        System.out.println();

        //Question 8
        // Recherchez la transaction avec la plus petite valeur.

        Optional<Transaction> smallestTransaction = transactions.stream().min(Comparator.comparing(Transaction::getValue));

        System.out.println("Question 8 :");
        System.out.println(smallestTransaction);
        System.out.println();


        /*
        Résultats Attendus :
        Question 1 :
        [{Trader: Brian in Cambridge, year: 2011, value: 400}, {Trader: Raoul in Cambridge, year: 2011, value: 410}]

        Question 2 :
        [Cambridge, Milan]

        Question 3 :
        Alan Brian Mario Raoul

        Question 4 :
        true

        Question 5 :
        1000

        Question 6 :
        [Trader: Alan in Cambridge, Trader: Brian in Cambridge, Trader: Raoul in Cambridge]

        Question 7:
        [400, 300, 1000, 410, 950]

        Question 8:
        Optional[{Trader: Brian in Cambridge, year: 2012, value: 300}]
         */

    }




}
