package com.commonutils;

public class Utils {

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int srcIndex, int targetIndex){
        int temp = arr[srcIndex];
        arr[srcIndex] = arr[targetIndex];
        arr[targetIndex] = temp;
    }

}
