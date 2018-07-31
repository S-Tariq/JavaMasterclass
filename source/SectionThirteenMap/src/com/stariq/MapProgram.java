package com.stariq;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        addLanguages();
    }

    public static void addLanguages(){
        Map<String, String> languages = new HashMap<>();

        System.out.println("\n*****");
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "A compiled high-level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners All-purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Programming language");
        }

        System.out.println("\n*****");
//        languages.remove("Lisp");

        if(languages.remove("Algol","An algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","Therein lies madness","A functional programming language with imperative features" )){
            System.out.println("Lisp is replaced");
        } else {
            System.out.println("Lisp is not replaced");
        }
//        System.out.println(languages.replace("Scala", "This will not be added"));

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
