package com.stariq;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        addIntClass();
    }

    public static void addIntClass(){

        System.out.println("\n*****");

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Sam");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(16));

        Integer integer = new Integer(12);
        Double doubleValue = new Double(12.12);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }
    }
}

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}