package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.commonutils.Utils;

// LC 31: Next Permutation
public class NextPermutation {

    public static void main(String[] args) {
        int[] inputArr = {1,3,2};
        findNextPermutation(inputArr);
        Utils.printArray(inputArr);

        //////////////////
        // List<Integer> A = Arrays.asList(new Integer[] {1,3,2});
        // List<Integer> ans = nextGreaterPermutation(A);

        // System.out.print("The next permutation is: [");
        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }
        // System.out.println("]");
    }

    public static void findNextPermutation(int[] nums){
        int index = -1;
        // find the point from the right of the array where its right number is greater than itself
        for(int i = nums.length-2; i >= 0; i--){
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
                break;
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

    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

}
