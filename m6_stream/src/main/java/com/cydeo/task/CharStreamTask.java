package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {

        System.out.println("------Task 1--------");
        List<String> words = Arrays.asList("Java","Apple","Honda","Developer");
        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);
















    }
}
