package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String []args){
        Map<String,String> languages=new HashMap<>();
       if(languages.containsKey("java")){
           System.out.println("java already exits");
       }else{
           languages.put("java ","a compiledhigh level,object-oriented,platform Independent languages");
           System.out.println("Java added succesfully");
       }
        languages.put("java ","a compiledhigh level,object-oriented,platform Independent languages");
        languages.put("Python","an interpreted,object-oriented,high-level programming language with dynamic  semantics");
        languages.put("ab","ABBA");
        languages.put("list","there is lies madness");

        if(languages.containsKey("java")){
            System.out.println("Java is already in Map");
        }else{
            languages.put("java","this course is about java");
        }
        System.out.println("=================================================");

        for(String key:languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
          languages.remove("List");
          if(languages.remove("Algol","a family of algorithmic languages")){
              System.out.println("Algol Removed");
          }else{
              System.out.println("Algol not removed,key/value pair not found");
          }
        System.out.println(languages.replace("list","a functional programming lanaguage  with implementation"));
        System.out.println(languages.replace("Scala","this will not added "));
    }
}
