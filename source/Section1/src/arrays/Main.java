package arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        initialisingArray();
        userInputtingArray();
        descendingArray();
        extendingArray();
    }

    public static void extendingArray(){

        System.out.println("\n*****");

        System.out.println("Enter " + baseData.length + " integers: ");
        getInput(baseData);
        System.out.println("\nOriginal array: ");
        printArray(baseData);


        resizeArray();
        // Initialises array with new integers by overriding old integers.
//        System.out.println("Enter " + baseData.length + " integers: ");
//        getInput(baseData);
        // Keeps the old integers and extends the array by adding new integers.
        baseData[10] = 11;
        baseData[11] = 12;
        System.out.println("\nExtended array: ");
        printArray(baseData);

    }

    public static void resizeArray(){

        // The resized array can be initialised with new integers by overriding the old ones.
        int[] original = baseData;

        baseData = new int[12];
        for(int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

    public static void descendingArray() {

        System.out.println("\n*****");

        int[] integersArray = new int[5];
        System.out.println("Enter " + integersArray.length + " integer values: ");
        getInput(integersArray);
        System.out.println("\nOriginal array:");
        printArray(integersArray);
        System.out.println("\nSorted array:");
        int[] sortedArray = sortArray(integersArray);
        printArray(sortedArray);
    }

    public static int[] sortArray(int[] array) {

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

        int[] myIntegers = new int[5];
        System.out.println("Enter " + myIntegers.length + " integer values: ");
        getInput(myIntegers);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getInput(int[] array){

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
