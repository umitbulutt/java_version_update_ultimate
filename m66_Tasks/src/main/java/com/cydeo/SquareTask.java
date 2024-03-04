package com.cydeo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareTask {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        numbers.stream()
                .map(eachIndex -> eachIndex*eachIndex)
                .forEach(System.out::println);
    }
}
