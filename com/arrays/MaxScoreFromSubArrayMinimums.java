package com.arrays;


// GFG: Maximum Score from Subarray Minimums
// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0

// Below explanation is from https://stackoverflow.com/questions/67948134/how-to-find-maximum-sum-of-smallest-and-second-smallest-elements-chosen-from-all
/* The question is: Why are we guaranteed to always find the maximum sum if we only look at all subarrays of length two?
To answer that question, lets assume we have some array A. Inside that array, obviously, there has to be at least one subarray S for which the smallest and second smallest elements, let's call them X and Y, sum up to our result.

If these two elements are already next to each other, this means that there is a subarray of A of length two that will contain X and Y, and thus, if we only look at all the subarrays of length two, we will find X and Y and output X+Y.

However, the question is: Is there any way for our two elements X and Y to not be "neighbors" in S? Well, if this was the case, there obviously would need to be other numbers, lets call them Z0, Z1, ..., between them.

Obviously, for all these values, it would have to hold that Zi >= X and Zi >= Y, because in S, X and Y are the smallest and second smallest elements, so there can be no other numbers smaller than X or Y.

If any of the Zi were bigger than X or Y, this would mean that there would be a subarray of A that only included this bigger Zi plus its neighbor. In this subarray, Zi and its neighbor would be the smallest and second smallest elements, and they would sum up to a larger sum than X+Y, so our subarray S would not have been the subarray giving us our solution. This is a contradiction to our definition of S, so this can not happen.

So, all the Zi can not be smaller than X or Y, and they can not be bigger than X or Y. This only leaves one possibility: For X == Y, they could all be equal. But, in this case, we obviously also have a subarray of length 2 that sums up to our correct result.

So, in all cases, we can show that there has to be a subarray of length two where both elements sum up to our result, which is why the algorithm is correct. */

public class MaxScoreFromSubArrayMinimums {

    public static void main(String[] args) {
        int[] inputArr = {5, 4, 3, 1, 6};
        int maxScore = findMaxScoreFromSubArrayMinimums(inputArr);
        System.out.println(maxScore);
    }

    public static int findMaxScoreFromSubArrayMinimums(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]+arr[i+1] > maxSum){
                maxSum = arr[i]+arr[i+1];
            }
        }
        return maxSum;
    }

}
