package com.stariq;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        // This can be done without throwing the exceptions in the divide() method.
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide(){
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
        } catch(NoSuchElementException e){
            throw new NoSuchElementException("No suitable input");
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        while(true){
            try {
                return s.nextInt();
            } catch(InputMismatchException e){
                // Go around again. Read past the end of line in the input first.
                s.nextLine();
                System.out.println("Enter a number using only the digits 0 to 9");
            }
        }
    }
}
