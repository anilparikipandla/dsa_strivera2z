package com.basicRecursion;

public class Fibonacci {

    public static void main(String[] args) {
        int fibOut = fib(10);
        System.out.println(fibOut);
    }

    public static int fib(int n) {
        if(n <= 1)return n;
        int firstTerm = fib(n-1);
        int secondTerm = fib(n-2);
        return firstTerm + secondTerm;
    }

}
