package com.cydeo2;
import jdk.dynalink.Operation;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDoubled(items);


        System.out.println("------------------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<SoccerPlayer> liverpool =   new Team("Liverpool");
      // liverpool.addPlayer(joe);
       //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);











    }
    private static void printDoubled(ArrayList<Integer> items){
        for (Integer i : items) {
            System.out.println(i*2);
        }
    }


    }

