package com.arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] inputArr = {6,5,5};
        int result = mooresVotingAlgorithm(inputArr);
        System.out.println(result);
        
    }

    public static int mooresVotingAlgorithm(int[] nums){
        int element = nums[0];
        int len = nums.length;
        int counter = 0;
        for(int i = 0; i < len; i++){
            if(counter == 0){
                counter = 1;
                element = nums[i];
            }else if(nums[i] == element){
                counter++;
            }else{
                counter--;
            }
        }
        for(int i = 0; i < len; i++){
            if(nums[i] == element){
                counter++;
            }
        }
        return counter > len/2 ? element:0;
    }

}
