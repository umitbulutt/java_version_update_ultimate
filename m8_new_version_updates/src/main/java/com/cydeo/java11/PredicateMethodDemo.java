package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMethodDemo {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = i -> i%2 ==0;
        Predicate<Integer>  odd = Predicate.not(even);

       // List<Integer> evenNumbers = list.stream()
       //         .filter(i-> i %2==0)
       //v  0       .collect(Collectors.toList());







    }
}
