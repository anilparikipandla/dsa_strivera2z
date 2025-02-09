package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        List<Integer> output = frequencyCount(arr);
        System.out.println(output);
        // int[] output = frequencyCount(arr);
        // for(int i = 0; i < output.length; i++){
        //     System.out.println(i+1 + " is repeated "+output[i] + " times.");
        // }
    }

    public static List<Integer> frequencyCount(int[] arr){
        List<Integer> counter = new ArrayList<Integer>();
        int[] counterArray = frequencyCounter(arr);
        for(int eachFrequency: counterArray){
            counter.add(eachFrequency);
        }
        return counter;
    }

    public static int[] frequencyCounter(int[] arr){
        int[] dic = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            dic[arr[i]-1] = dic[arr[i]-1]+1;
        }
        return dic;
    }

}
