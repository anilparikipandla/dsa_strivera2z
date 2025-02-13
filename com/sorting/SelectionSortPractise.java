package com.sorting;

public class SelectionSortPractise {

    public static void main(String[] args) {
        int[] inArr = {10,12,9,15,21,65,72,33,12,9,15,6,1,1,0};
        int[] outArr = selectionSortPractise(inArr);
        for(int i = 0; i < outArr.length; i++){
            System.out.print(outArr[i]+" ");
        }
    }

    public static int[] selectionSortPractise(int[] arr){
        int len = arr.length;
        for(int i = 0; i <= len-2; i++){
            int min = i;
            for(int j = i+1; j <= len-1; j++){
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
