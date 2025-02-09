package com.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        // int[] inputArr = {4,1,3,9,7};
        int[] inputArr = {41,9,9,48,11,2,11,12,28,10,15,4,16,48};
        for(int i = 0; i <= inputArr.length - 1; i++){
            System.out.print(inputArr[i]+ " ");
        }
        int[] outArr = bubbleSort(inputArr);
        System.out.println("");
        for(int i = 0; i <= outArr.length - 1; i++){
            System.out.print(outArr[i]+ " ");
        }
        
    }

    public static int[] bubbleSort(int[] arr){
        int len = arr.length;
        for(int i = len - 1; i >= 0; i--){
            boolean swapped = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        return arr;
    }

}
