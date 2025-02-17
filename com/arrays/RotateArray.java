package com.arrays;

import com.commonutils.Utils;

public class RotateArray {
    public static void main(String[] args) {
        int[] inputArr = {1,2,3,4,5,6,7};
        //3,99,-1,-100
        // int[] inputArr = {-1,-100,3,99};
        rotateArray(inputArr,3);
        Utils.printArray(inputArr);
    }

    public static void rotateArray(int[] nums, int k){
        int len = nums.length;
        k = k % len;
        rotate(nums, 0, len-1-k);
        rotate(nums, len-k, len-1);
        rotate(nums, 0, len-1);
    }

    public static void rotate(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
