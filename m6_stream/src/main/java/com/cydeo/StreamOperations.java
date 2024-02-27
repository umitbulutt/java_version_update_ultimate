package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,2,4));
        list.forEach(System.out::println);
        System.out.println("----");

        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("----Distinc------");

       Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();


                str.forEach(System.out::println);   //Stream is closed

        System.out.println("---Truncating a Stream----");
        System.out.println("--Limit--");

      list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);   //Stream is closed
        System.out.println("--Skipping--");

        list.stream()
                .filter(i -> i%2==0)
                .skip(1) //  will skip that number one
                .forEach(System.out::println);   //Stream is closed

        System.out.println("----Mapping-----------");

        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        numbers.stream()
                .filter(i-> i%2==0)
                .map(i-> i*3)
                .forEach(System.out::println);
















    }
}
