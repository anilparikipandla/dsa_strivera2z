package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 6};
        boolean elementFound = searchForElement(inputArr, 6);
        System.out.println(elementFound);
    }

    public static boolean searchForElement(int[] nums, int number){
        for(int i = 0; i < nums.length; i++){
             if(nums[i] == number)return true;
        }
        return false;
    }
}
