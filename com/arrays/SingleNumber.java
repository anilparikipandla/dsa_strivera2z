package com.arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] inputArr = {2,2,1,4,1,2,1,2,1};
        int number = findSingleNumber(inputArr);
        System.out.println(number);
    }
    public static int findSingleNumber(int[] nums){
        int len = nums.length;
        if(len % 2 == 0) return -1;
        int xorSum = 0;
        for(int i = 0; i < len; i++){
            xorSum = xorSum^nums[i];
        }
        return xorSum;
    }

}
