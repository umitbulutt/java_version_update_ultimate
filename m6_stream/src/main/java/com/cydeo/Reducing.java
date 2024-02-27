package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.DishTask;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        int sum = 0;
        for (Integer number : numbers) {
            sum+= number;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);

        Optional<Integer> result2= numbers.stream().reduce((a,b)->a+b);
        System.out.println(result);


      int calTotal =   DishData.getAll().stream()
                        .map(Dish::getCalories)
                        .reduce(Integer::sum)
                        .get();

        System.out.println("calTotal = " + calTotal);


        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max =  numbers.stream().reduce(Integer::max);
        Optional<Integer> summ = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("summ = " + summ.get());

        //COUNT
        long dishCount = DishData.getAll().stream().count();
        System.out.println("dishCount = " + dishCount);

























    }
}
