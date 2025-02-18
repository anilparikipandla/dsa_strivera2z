package com.arrays;

import com.commonutils.Utils;

// LC 75: Sort Colors
public class SortColors {
    public static void main(String[] args) {
        int[] inputArr = {2,0,2,1,1,0};
        // sortColors(inputArr);
        Utils.printArray(inputArr);
        System.out.println("=================");
        dutchNationalFlagAlgorithm(inputArr);
        Utils.printArray(inputArr);
    }

    public static void sortColors(int[] nums){
        int noOfOnes = 0;
        int noOfTwos = 0;
        int noOfZeros = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                noOfOnes++;
            }else if(nums[i] == 2){
                noOfTwos++;
            }else{
                noOfZeros++;
            }
        }
        for(int i = 0; i < noOfZeros; i++){
            nums[i] = 0;
        }
        for(int i = noOfZeros; i < noOfOnes+noOfZeros; i++){
            nums[i] = 1;
        }
        for(int i = noOfZeros+noOfOnes; i < noOfOnes+noOfZeros+noOfTwos; i++){
            nums[i] = 2;
        }
    }

    // DUTCH NATIONAL FLAG ALGORITHM
    // 0 ->   low-1   => all 0's
    // low ->   mid-1 => all 1's
    // high+1 ->  n-1 => all 2's
    public static void dutchNationalFlagAlgorithm(int[] nums){
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                Utils.swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                Utils.swap(nums, mid, high);
                high--;
            }
        }
    }

}
