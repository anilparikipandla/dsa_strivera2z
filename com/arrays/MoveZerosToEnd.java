package com.arrays;

import com.commonutils.Utils;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] inputArr = {0,1,0,3,12};
        moveZerosToEnd(inputArr);
        Utils.printArray(inputArr);
    }

    public static void moveZerosToEnd(int[] nums){
        int i = -1;
        for(int x = 0; x < nums.length; x++){
            if(nums[x] == 0){
                i = x;
                break;
            };
        }

        if (i == -1) {
            System.out.println();
            return;
        }

        for(int j = i+1; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

}
