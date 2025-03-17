package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {

    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4, 5, 7};
        int longestSequenceLength = findLongestSequenceLength(arr);
        System.out.println(longestSequenceLength);
    }

    public static int findLongestSequenceLength(int[] a){
        int longest = 1;
        if(a.length == 0) return 0;
        Set<Integer> data = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            data.add(a[i]);
        }

        for(int element : a){
            if(!data.contains(element-1)){
                int count = 1;
                int number = element;
                while(data.contains(number+1)){
                    count++;
                    number++;
                }
                longest = Math.max(count, longest);
            }
        }

        return longest;
    }

}
