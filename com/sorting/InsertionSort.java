package com.sorting;

import com.commonutils.Utils;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArr = {4,1,3,9,7};
        Utils.printArray(inputArr);
        int[] outArr = insertionSort(inputArr);
        System.out.println("");
        Utils.printArray(outArr);
    }

    public static int[] insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int j = i;
            while(j > 0 && (arr[j-1] > arr[j])){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1;
            }
        }
        return arr;
    }

}
