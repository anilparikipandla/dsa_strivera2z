package com.arrays;

public class CheckSortedRotated {
    public static void main(String[] args) {
        int[] inputArr = {3,4,5,1,2};
        System.out.println(checkSortedAndRotated(inputArr));
    }

    public static boolean checkSortedAndRotated(int[] arr){
        // this is about circular array.
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[(i+1)%arr.length]){
                count++;
            }
            if(count > 1) return false;
        }
        return true;   
    }
}

