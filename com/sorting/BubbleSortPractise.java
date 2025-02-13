package com.sorting;

public class BubbleSortPractise {

    public static void main(String[] args) {
        int[] inArr = {10,12,9,15,21,65,72,33,12,9,15,6,1,1,0};
        // int[] inArr = {1,2,3,4,5,6};
        int[] outArr = bubbleSortPractise(inArr);
        for(int i = 0; i < outArr.length; i++){
            System.out.print(outArr[i]+" ");
        }
    }

    public static int[] bubbleSortPractise(int[] arr){
        int len = arr.length;
        for(int i = len-1; i >= 1; i-- ){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
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


    public static int[] bubbleSortPractise2(int[] arr){
        int len = arr.length;
        for(int i = len - 1; i >= 1; i--){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
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

