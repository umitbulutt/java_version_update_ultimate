package com.cydeo.orange;

import com.cydeo.Apple;
import com.cydeo.appleTask.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, com.cydeo.orange.Color.GREEN));
        inventory.add(new Orange(100,com.cydeo.orange.Color.GREEN));
        inventory.add(new Orange(200,com.cydeo.orange.Color.GREEN));
        inventory.add(new Orange(50,com.cydeo.orange.Color.GREEN));
        
        
         OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "gr";
         prettyPrintApple(inventory,orangeLambda);
        
        prettyPrintApple(inventory,orange -> "An orange of " + orange.getWeight() + "gr");

        OrangeFormatter fancyFormatter = orange ->{
            String ch = orange.getWeight()>200 ? "Heavy": "Light";
            return "A" + ch + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory,fancyFormatter);
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter) {
        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }

}
