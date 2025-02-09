package com.basicRecursion;

public class Factorial {

    // solve factorial using recursion

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    public static Long findFactorial(int n){
        if(n == 1)return (long) 1;
        return n * findFactorial(n-1);
    }
    
}