package com.stariq;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args){

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for(int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine:");
        Set<String> firstDiff = new HashSet<>(nature);
        // Removes values from nature that are also present in divine.
        firstDiff.removeAll(divine);
        printSet(firstDiff);

        System.out.println("divine - nature:");
        Set<String> secondDiff = new HashSet<>(divine);
        // Removes values from divine that are also present in nature.
        secondDiff.removeAll(nature);
        printSet(secondDiff);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference:");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)){
            System.out.println("intersectionTest is a subset of nature");
        }

        if(divine.containsAll(intersectionTest)){
            System.out.println("intersectionTest is a subset of divine");
        }
    }

    private static void printSet(Set<String> set){
        System.out.print("\t");
        for(String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
