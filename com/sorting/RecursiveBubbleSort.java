package com.sorting;

import com.commonutils.Utils;

public class RecursiveBubbleSort {

    public static void main(String[] args) {

        int[] inputArr = {10,12,9,15,21,65,72,33,12,9,15,6,1,1,0};
        recursiveBubbleSort(inputArr);
        Utils.printArray(inputArr);
        
    }

    public static void recursiveBubbleSort(int[] arr){
        int n = arr.length;
        sortRecursive(arr, n);

    }

    public static void sortRecursive(int[] arr, int lastIndex){
        if (lastIndex == 1) return;
        boolean swapped = false;
        for(int j = 0; j <= lastIndex - 2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped) return;
        sortRecursive(arr, lastIndex - 1);
    }

}
