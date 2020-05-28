package com.stariq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        addScopeCheck();
        addX();
    }

    public static void addX(){
        System.out.println("\n*****");
        X x = new X(new Scanner(System.in));
        x.x();
    }

    public static void addScopeCheck(){
        System.out.println("\n*****");
        String var4 = "this is private to main()";
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        System.out.println("scopeCheck var1 is " + scopeCheck.getVar1());
        System.out.println(var4);
        scopeCheck.timesTwo();

        System.out.println("\n*****");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("innerClass var3 is " + innerClass.var3);
        innerClass.timesTwo();
    }
}
