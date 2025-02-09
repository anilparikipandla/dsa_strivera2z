package com.basicRecursion;

public class ReverseArray {
    // reversing an array using recursion
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Input Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        int[] outarr = reverseAnArray(0,arr, arr.length);
        System.out.println("");
        System.out.println("Output Array: ");
        for(int i = 0; i < outarr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static int[] reverseAnArray(int i, int[] arr, int n){
        if(i >= n/2) return arr;
        int temp  = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        return reverseAnArray(i+1, arr, n);
    }



    // Solution 2:
    public void reverseArray(int arr[]) {
        reverseAnArray(0, arr, arr.length);
    }
    
    public int[] reverseGivenArray(int i, int arr[], int n){
        if (i >= n/2) return arr;
        swapNumbers(i, arr, n);
        return reverseGivenArray(i+1, arr, n);
    }
    
    public void swapNumbers(int a, int[] arr, int b){
        int temp = arr[a];
        arr[a] = arr[b-a-1];
        arr[b-a-1] = temp;
    }
}
