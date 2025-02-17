package com.arrays;

import com.commonutils.Utils;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        // Two Pointer Aprroach
        int[] inputArr = {0,0,1,1,1,2,2,3,3,4};
        int uniqueElements = removeDuplicatesSortedArray(inputArr);
        System.out.println(uniqueElements);
        Utils.printArray(inputArr);
    }

    public static int removeDuplicatesSortedArray(int[] nums){
        int i = 0, j = i+1;
        while (i < nums.length-1 && j < nums.length) {
            if(nums[i] < nums[j]){
                nums[i+1] = nums[j];
                i++;
            }else{
                j++;
            }
        }
        return i+1;
    }

    public static int removeDuplicatesSortedArray2(int[] nums){
        int i = 0;
        for(int j = i+1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }



    
}


