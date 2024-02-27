package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
public class CollectorsDemo {
    public static void main(String[] args) {

        System.out.println("\ntoCollection(Supplier");
        //toCollection(Supplier) : is used to create a Collection using the Collector

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        List<Integer> numberList = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        System.out.println("\ntoList()");
        //toList() ;  returns a Collector interface that gathers the input data into a new List

       List<Integer> numbersList2 =   numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toList());

        //toList() ;  returns a Collector interface that gathers the input data into a new Set

        Set<Integer> numbersSet2 =   numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toSet());

        System.out.println("\ntoMap(Function,Function)");
        //toMap(Function,Function) ;  returns a Collector interface that gathers the input data into a new List
        Map<String,Integer> dishMap =  DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        System.out.println("\nsummingInt(ToIntFunction)");
        //summingInt(ToIntFunction) : returns a collector that produces the sum of a Integer-valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        System.out.println("\ncounting()");
        //counting() : returns a Collector that counts the number of the elements
        Long eventCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println("eventCount = " + eventCount);

        System.out.println("\naverageInt(ToIntFunction)");
        //averageInt(ToIntFunction) :  returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("calorieAverage = " + calorieAverage);

        System.out.println("\njoining()");
        //joining() :  is used to join various elements of a charachter or string array into a single object
        //                      It turns String Array to String
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str= courses.stream()
                .collect(Collectors.joining(","));

        System.out.println("str = " + str);

        System.out.println("\npartitioningBy()");
        //partitioningBy(): is used to partition a stream of objects(or set of elements
        //                                                                    (based on given predicate))

        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegeterian));

        //groupingBy();  is used for grouping objects by some property and storing results in a Map instance
       // Map<Type,List<Dish>> dishType = DishData.getAll().stream()
         //         .collect(Collectors.groupingBy(Dish::getType));

       /// System.out.println(dishType);


















    }
}
