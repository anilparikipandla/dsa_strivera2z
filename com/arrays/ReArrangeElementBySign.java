package com.arrays;

import com.commonutils.Utils;

// LC 2149: Rearrange Array Elements by Sign
public class ReArrangeElementBySign {

    public static void main(String[] args) {
        int[] inputArr = {3,1,-2,-5,2,-4};
        int[] resultArr = reArrangeElementsBySign(inputArr);
        Utils.printArray(resultArr);
    }

    // -1,-2,2,-2,-3,4,-7,-8,5,6
    // 1,-1,2,-2,-3,-7,-8,4,5,6
    // 1,-1,2,-2,
    public static int[] reArrangeElementsBySign(int[] nums){
        int n = nums.length;
        int positiveIndex = 0;
        int negativeIndex = 1;
        int[] resultArray = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                resultArray[positiveIndex] = nums[i];
                positiveIndex += 2;
            }else{
                resultArray[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return resultArray;
    }
}
