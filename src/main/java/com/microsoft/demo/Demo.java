package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }

    public int addNumbers(int a, int b){
        int result = a+b;
        return result;
    }
}