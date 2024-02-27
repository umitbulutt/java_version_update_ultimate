package com.cydeo;

import com.cydeo.appleTask.Color;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.getColor().equals(Color.GREEN);
    }
}
