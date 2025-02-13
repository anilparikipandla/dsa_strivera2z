package com.sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] inputArr = {4,1,3,9,7};
        for(int i = 0; i <= inputArr.length - 1; i++){
            System.out.print(inputArr[i]+ " ");
        }
        int[] outArr = selectionSort(inputArr);
        System.out.println("");
        for(int i = 0; i <= outArr.length - 1; i++){
            System.out.print(outArr[i]+ " ");
        } 
    }

    public static int[] selectionSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i <= len-2; i++){
            int min = i;
            for(int j = i; j <= len-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

}
