package com.cydeo;

interface Lmd{
    void write(String s);
}

public class Main2 {
    public static void main(String[] args) {

        Lmd l = (s) -> System.out.println("Welcome to Lambda" + s);
        l.write(", be ready for adventure");

    }
}
