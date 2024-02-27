package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends State{
    public static void main(String[] args) {

        List<Object> cities =  new ArrayList<>();
        cities.addAll(Arrays.asList("Miami", "Orlando", "Tampa", "Jacksonville", "Fort Lauderdale", "Tallahassee", "Key West", "Naples", "Sarasota", "Fort Myers", "St. Petersburg", "Pensacola", "Gainesville", "Daytona Beach", "West Palm Beach"));
        cities.forEach(eachCity -> System.out.println(eachCity));

    }
}