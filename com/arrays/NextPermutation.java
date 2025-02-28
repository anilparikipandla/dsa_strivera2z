package com.arrays;

import com.commonutils.Utils;

// LC 31: Next Permutation
public class NextPermutation {

    public static void main(String[] args) {
        int[] inputArr = {1,2, 5};
        findNextPermutation(inputArr);
        Utils.printArray(inputArr);
    }

    public static void findNextPermutation(int[] nums){
        int index = -1;
        // find the point from the right of the array where its right number is greater than itself
        for(int i = nums.length-2; i > 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            int x = 0;
            int y = nums.length-1;
            while(y > x){
                Utils.swap(nums, x, y);
                x++;
                y--;
            }
            return;
        }

        // find the just greater number from the right and swap it with the index
        for(int i = nums.length - 1; i > index; i--){
            if(nums[i] > nums[index]){
                Utils.swap(nums, i, index);
            }
        }

        int x = index+1;
        int y = nums.length-1;
        while(y > x){
            Utils.swap(nums, x, y);
            x++;
            y--;
        }



    }

}
