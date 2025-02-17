package com.arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] inputArr = {10, 10, 10};
        int output = secondLargestNumber(inputArr);
        System.out.println(output);
        
    }

    public static int secondLargestNumber(int[] arr){
        int max = arr[0];
        int secondMax = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

}
