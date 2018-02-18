package com.stariq;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialisingArray();
        userInputtingArray();
        descendingArray();
    }

    public static void descendingArray() {

        System.out.println("\n*****");

        int[] integersArray = getIntegers(5);
        System.out.println("Original array:");
        printArray(integersArray);
        System.out.println("Sorted array:");
        int[] sortedArray = sortIntegers(integersArray);
        printArray(sortedArray);
    }

    public static int[] sortIntegers(int[] array) {

        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        boolean order = true;
        while (order) {
            order = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                int temp;
                if (newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    order = true;
                }
            }
        }
        return newArray;
    }

    public static void userInputtingArray(){

        System.out.println("\n*****");

        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int length){

        System.out.println("Enter " + length + " integer values.\r");
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static double getAverage(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double)sum / (double)array.length;
    }

    public static void initialisingArray(){

        System.out.println("\n*****");

        int[] myIntArray = new int[25];
        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element [" + i + "] value is: " + array[i]);
        }
    }
}
