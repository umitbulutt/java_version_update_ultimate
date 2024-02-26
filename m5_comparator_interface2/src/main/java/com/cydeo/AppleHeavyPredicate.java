package com.cydeo;

public class AppleHeavyPredicate implements ApplePredicate {

    public boolean test(Apple apple){
        return apple.getWeight()>200;
    }
}
