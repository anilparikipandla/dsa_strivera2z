package com.arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] inputArr = {1,0,1,1,0,1};
        int result = maxConsecutiveOnes(inputArr);
        int result2 = secondSolution(inputArr);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int maxConsecutiveOnes(int[] nums){
        int counter = 0;
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter++;
            }
            if(i == nums.length - 1 || nums[i] == 0 ){
                if(maxSum < counter){
                    maxSum = counter;
                }
                counter = 0;
            }
        }
        return maxSum;
    }

    public static int secondSolution(int[] nums){
        int counter = 0;
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter++;
            }else{
                maxSum = Math.max(maxSum, counter);
                counter = 0;
            }
        }
        return Math.max(maxSum, counter);
    }

}
