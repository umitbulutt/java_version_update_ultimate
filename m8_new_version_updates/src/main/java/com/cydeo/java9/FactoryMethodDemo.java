package com.cydeo.java9;

import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        // Creating  unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","String","Agile"));
        //courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable List after Java9
        List<String> myCourses = List.of("Java","String","Agile");

        //Creating unmodifiable Set after Java9
        Set<String> myProduct = Set.of("Java","String","Agile");

        //Creating unmodifiable Map after Java9
        Map<String,Integer> myChart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );















    }
}
