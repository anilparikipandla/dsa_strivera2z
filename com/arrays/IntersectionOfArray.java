package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import com.commonutils.Utils;

// LC 349: INTERSECTION OF TWO ARRAYS
// Considering the input parameters we can using Array Hashing to solve this problem. This is the best approach
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] resultArr = findIntersection(arr1, arr2);
        Utils.printArray(resultArr);
    }

    public static int[] findIntersection(int[] nums1, int[] nums2){
        int i = 0, j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resultList = new ArrayList<>();
        while(i < n1 && j < n2){
            if (nums1[i] == nums2[j]) {
                if(resultList.size() == 0 || resultList.get(resultList.size() - 1) != nums1[i])
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

}
