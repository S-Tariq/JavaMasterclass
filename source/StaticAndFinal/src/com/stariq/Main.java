package com.stariq;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args){

       addStaticTest();
       addMultiply();
       addSomeClass();
       addPassword();
       addExtendedPassword();
       addSIBTest();
    }

    public static void addSIBTest(){
        System.out.println("\n*****");
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }

    public static void addExtendedPassword(){
        System.out.println("\n*****");
        int pw = 7564;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(34);
        password.letMeIn(7564);
    }

    public static void addPassword(){
        System.out.println("\n*****");
        int pw = 54656;
        Password password = new Password(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(3543546);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(54656);
    }

    public static void addSomeClass(){
        System.out.println("\n*****");
        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
    }

    public static void addMultiply(){
        System.out.println("\n*****");
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number){
        return number * multiplier;
    }

    public static void addStaticTest(){
        System.out.println("\n*****");
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
    }
}
