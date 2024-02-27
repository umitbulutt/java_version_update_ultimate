package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        //ALL MATCH
        System.out.print("ALL MATCH = ");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.print(isHealthy);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegeterian)){
            System.out.println("The menu is vegeterian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(Dish-> Dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish =DishData.getAll().stream().filter(Dish::isVegeterian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2= DishData.getAll().stream().filter(Dish::isVegeterian).findFirst();
        System.out.println(dish2.get());


        //PARALLEL STREAMS(Async)

        System.out.println(IntStream.range(0,100).parallel().findAny().getAsInt());
        System.out.println(IntStream.range(0,100).parallel().findFirst().getAsInt());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.stream().parallel().filter(s-> s.startsWith("D")).findAny();
        Optional<String> findAny = list2.stream().parallel().filter(s->s.startsWith("J")).findAny();

        System.out.println("findAny = " + findAny.get());
        System.out.println("findfirst = " + findFirst.get());


        //MIN AND MAX
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

        System.out.println("dMax = " + dMax.get().getName() + " : " + dMax.get().getCalories());
        System.out.println("dMin = " + dMin.get().getName() + " : " + dMin.get().getCalories());

        //Reduce
        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int result = numbers.stream().reduce(0 , (a,b) -> a+b);
































    }
}
