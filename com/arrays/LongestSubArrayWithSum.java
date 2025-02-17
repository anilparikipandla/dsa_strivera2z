package com.arrays;

import java.util.HashMap;

// Longest Subarray with Sum K
// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
/* Can be solved with 2 approaches
1. Presum Hashing using HashMap
2. Two Pointer approach */

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int[] inputArr = {-5, 8, -14, 2, 4, 12};
        int approach1Result = approach1(inputArr, -5);
        System.out.println("approach1Result: "+approach1Result);
        int approach2Result = approach2(inputArr, -5);
        System.out.println("approach2Result: "+approach2Result);
    }

    // APPROACH 1: PRESUM HASHMAP
    public static int approach1(int[] arr, int k){
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            // calculate presum for the current element
            sum += arr[i];

            //if subarray sum matches then get the maxLength as currentIndex+1
            if (sum == k) {
                maxLength = Math.max(maxLength, i+1);
            }

            //get remainingSum
            int rem = sum - k;

            // if remainingSum is present in map then get the subArray length by subtracting current preSum subarray length minus(-) remainingSum subarray length
            if(map.containsKey(rem)){
                maxLength = Math.max(maxLength, i-map.get(rem));
            }

            // if remainingSum is not present in map then add the preSum with currentIndex
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    // APPROACH 2: TWO POINTER or DYNAMIC SIZE SLIDING WINDOW
    public static int approach2(int[] arr, int k){
        int n = arr.length;
        int start = 0, end = 0;
        int maxLength = 0;
        int sum = arr[0];
        while(end < n){
            while (start <= end && sum > k) {
                sum -= arr[start];
                start++;
            }

            if(sum == k){
                maxLength = Math.max(maxLength, end-start+1);
            }

            end++;
            if(end < n){
                sum += arr[end];
            }
        }
        return maxLength;
    }

    public static int longestSubArrayLengthWithSumK(int[] arr, int k){
        int startIndex = 0, endIndex = 0;
        int actualSum = arr[0];
        int maxLength = 0;
        while(startIndex <= endIndex && endIndex < arr.length-1){
            if(actualSum < k){
                actualSum += arr[endIndex+1];
                endIndex++;
            }else if (actualSum == k){
                maxLength = Math.max(maxLength, endIndex+1-startIndex);
                endIndex++;
            }else{
                actualSum = actualSum - arr[startIndex];
                startIndex++;
                endIndex++;
            }
        }
        return maxLength;
    }

}
