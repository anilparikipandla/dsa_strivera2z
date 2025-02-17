package com.arrays;

import java.util.ArrayList;

// GFG https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
public class UnionOfSortedArrays {

    public static void main(String[] args) {
        int[] firstArr = {-8,-3,-3,-2,0,1,2,2,6};
        int[] secondArr = {-9,-9,0};
        // int[] firstArr = {1,3,4,5,6};
        // int[] secondArr = {1,2,2};
        ArrayList<Integer> resultList = unionOfTwoArrays(firstArr, secondArr);
        System.out.println(resultList);
    }

    // as the problem is expecting arrayList we are using Arraylist here.
    public static ArrayList<Integer> unionOfTwoArrays(int[] a, int[] b){
        int i = 0, j = 0;
        int firstArrLen = a.length;
        int secondArrLen = b.length;
        // int lengthDifference = ;
        ArrayList<Integer> result = new ArrayList<>();
        // 1,1,3,5
        // 1,1,2,4
        while (i < a.length && j < b.length) {
            if(a[i] == b[j]){
                if(result.size() == 0 || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                if(result.size() == 0 || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
                i++;
            }else if(a[i] > b[j]){
                if(result.size() == 0 || result.get(result.size() - 1) != b[j])
                result.add(b[j]);
                j++;
            }
        }

        while (i < firstArrLen) {
            if(result.indexOf(a[i]) < 0) result.add(a[i]);
            i++;
        }

        while(j < secondArrLen){
            if(result.indexOf(b[j]) < 0 )result.add(b[j]);
            j++;
        }
        result.sort(null);
        return result;
    }
}
