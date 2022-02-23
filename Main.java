package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locationMap=new HashMap<Integer,Location>();
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        locationMap.put(0,new Location(0,"you are sitting  in front of computer learning java"));
        locationMap.put(1,new Location(1,"you are standing  at the end of a road before a small bridges"));
        locationMap.put(2,new Location(2,"you are at the top of a hill"));
        locationMap.put(3,new Location(3,"you are inside the building ,well house  for a small spring"));
        locationMap.put(4,new Location(4,"you"));
        locationMap.put(5,new Location(5,"you are sitting "));

        locationMap.get(1).addExit("W",2);
        locationMap.get(1).addExit("E",3);
        locationMap.get(1).addExit("N",4);
        locationMap.get(1).addExit("S",6);
        locationMap.get(1).addExit("Q",8);

        locationMap.get(2).addExit("N",5);
        locationMap.get(2).addExit("Q",0);

        locationMap.get(3).addExit("W",1);
        locationMap.get(3).addExit("W",0);

        locationMap.get(4).addExit("N",1);
        locationMap.get(4).addExit("W",2);
        locationMap.get(4).addExit("N",1);

        int loc=1;
        while(true){
            System.out.println(locationMap.get(loc).getDescription());
            if(loc==0){
                break;
            }


            Map<String,Integer> exits=locationMap.get(loc).getExits();
            System.out.println("Available exits are");
            for(String exit:exits.keySet()){
                System.out.println(exit+",");
            }
            System.out.println();
            String direction=sc.nextLine().toUpperCase();
            if(exits.containsKey(direction)){
                loc=exits.get(direction);
            }else {
                System.out.println("you can not go in that direction");
            }
            loc=sc.nextInt();
            if(!locationMap.containsKey(loc)){
                System.out.println("you can not go in any directions");
            }
        }
    }
}
