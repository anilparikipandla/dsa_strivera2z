package com.arrays;

// LC 3: Maximum SubArray
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] inputArr = {-2,1,-3,4,-1,2,1,-5,4};
        int largestSum = kadanesAlgorithm(inputArr);
        System.out.println(largestSum);
    }

    public static int kadanesAlgorithm(int[] nums){
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = currentSum > maxSum ? currentSum : maxSum;
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum; 
    }

}
