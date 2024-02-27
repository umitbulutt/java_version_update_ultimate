package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish`s name that has less than 400 calories
        DishData.getAll().stream()
                .filter(category -> category.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("Print the length of the name of the each dish");

        DishData.getAll().stream()

                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);



        //Print three high caloric dish name(>300)

        DishData.getAll().stream()

              .filter(category -> category.getCalories()>300)
              .limit(3)
              .map(Dish::getName)
              .forEach(System.out::println);


        System.out.println("\nPrint all dish name that are below 400 calories in sorted\n");

        DishData.getAll().stream()
                .filter(category -> category.getCalories()<400)
                .sorted(comparing(Dish::getName).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);










    }
}
