package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import com.commonutils.Utils;

// LC 350: Intersection of Two Arrays II

public class IntersectionOfArraysII {
    public static void main(String[] args) {
                int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] resultArr = findIntersectionII(arr1, arr2);
        Utils.printArray(resultArr);
    }

    public static int[] findIntersectionII(int[] nums1, int[] nums2){
        int i = 0, j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resultList = new ArrayList<>();
        while(i < n1 && j < n2){
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }
        }
        int[] resultArr = resultList.stream().mapToInt(Integer::intValue).toArray();
        return resultArr;
    }

    public static int[] bestApproach(int[] nums1, int[] nums2){
        int[] count = new int[1001];
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int n : nums1){
            count[n]++;
        }

        for(int n : nums2){
            if(count[n] > 0){
                result.add(n);
                count[n]--;
            }
        }

        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }

        return resultArr;
    }

}
