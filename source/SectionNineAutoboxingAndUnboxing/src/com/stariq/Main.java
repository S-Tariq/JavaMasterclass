package com.stariq;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //addIntClass();
        addBank();
    }

    public static void addBank(){

        System.out.println("\n*****");



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

        System.out.println("Integer: ");

        // Autoboxing
        ArrayList<Integer> myIntValues = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            myIntValues.add(Integer.valueOf(i));
        }
        // Unboxing
        for(int i = 0; i <= 10; i++){
            int value = myIntValues.get(i).intValue();
            System.out.println(i + " -> " + value);
        }

        Integer myIntValue = 16; // Integer.valueOf(16);
        int myInt = myIntValue; // myIntValue.intValue();

        System.out.println("Double: ");

        // Autoboxing
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double i = 0.0; i <= 10.0; i+= 0.5){
            myDoubleValues.add(Double.valueOf(i));
        }
        // Unboxing
        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);
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