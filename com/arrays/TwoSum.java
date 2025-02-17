package com.arrays;

import java.util.HashMap;

import com.commonutils.Utils;

public class TwoSum {
    public static void main(String[] args) {
        int[] inputArr = {};
        int[] result = findIndicesOfSum(inputArr, 9);
        Utils.printArray(result);
    }

    public static int[] findIndicesOfSum(int[] nums, int targetSum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0; j < nums.length; j++){
            int expectedKey = targetSum - nums[j];
            if(map.containsKey(expectedKey)){
                return new int[]{map.get(expectedKey), j};
            }else{
                map.put(expectedKey, j);
            }
        }
        return new int[]{-1,-1};
    }



}
