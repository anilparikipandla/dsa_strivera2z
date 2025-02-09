package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        // String[] arr = {"a","c","b", "ab","ac", "bc", "abc"};
        // sortArray(arr);
        List<String> subsets = AllPossibleStrings("abc");
        System.out.println(subsets);
    }


        public static List<String> AllPossibleStrings(String s)
    {
        List<String> a = new ArrayList<String>(); 
        int len = s.length();
        for(int i = 0; i <= ((1 << len)-1); i++){
            String subset = "";
            for(int j = 0; j < len; j++){
                if((i&(1<<j)) != 0){
                    subset += s.charAt(j);
                }
            }
            if((subset != "") && (subset != null)){
                a.add(subset);
            }
        }
        a.sort(null);
        return a;
    }

    public static void sortArray(String arr[]){
        System.out.println("Given Inut Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        Arrays.sort(arr);

        System.out.println("\nSorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
