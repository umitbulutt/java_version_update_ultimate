package com.cydeo.tasksOfStream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TasksDemo {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Trader> traders = new ArrayList<>(Arrays.asList(raoul,mario,alan,brian));

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        System.out.println("--Task 1----");
        List<Transaction> task1 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();

        task1.forEach(System.out::println);
        System.out.println("--Task 2----");


        List<String> uniqueCities = traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        uniqueCities.forEach(s-> System.out.println(s));

        System.out.println("--Task 3----");

        List<Trader> tradersOfCambridge = traders.stream()
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        tradersOfCambridge.forEach(s-> System.out.println(s.getName()));

        System.out.println("--Task 4----");

        List<Trader> tradersNamesAlphabeticly = traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        tradersNamesAlphabeticly.forEach(s-> System.out.println(s.getName()));


        System.out.println("--Task 5----");

        boolean basedInMilan = traders.stream()
                .anyMatch(s->s.getCity().equalsIgnoreCase("Milan") );

        if (basedInMilan==true){
            System.out.println("There are traders based in Milan");
        }else{
            System.out.println("There are no traders based in Milan");
        }

        System.out.println("--Task 6----");

        List<Integer> listOfTransactions = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());


        listOfTransactions.forEach(s-> System.out.println(s));

        System.out.println("--Task 7 and 8 ----");

        Optional<Transaction> highestValue= transactions.stream().max(Comparator.comparing(Transaction::getValue));
        Optional<Transaction> lowestValue= transactions.stream().min(Comparator.comparing(Transaction::getValue));

        System.out.println("lowestValue = " + lowestValue.get().getValue());
        System.out.println("highestValue = " + highestValue.get().getValue());










    }
}
