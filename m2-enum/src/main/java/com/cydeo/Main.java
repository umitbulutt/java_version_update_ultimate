package com.cydeo;

import java.awt.desktop.AppForegroundListener;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("----------");

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();

        for (Currency value : Currency.values()) {
            System.out.println(value);
        }
        System.out.println("----------");

        System.out.println("How to switch-case enums");

        switch(Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;

        }
        System.out.println("----------");


        System.out.println("Operation Task");
        calculate(3,5,Operation.PLUS);

        System.out.println("-----------");

        System.out.println("how to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.NICKLE.ordinal());
        System.out.println(Currency.DIME.ordinal());






    }
    private static void calculate(double x, double y,Operation operation){

        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
    }
}
